BASE_NAME=applicative-functor

all: $(BASE_NAME).html $(BASE_NAME).pdf $(BASE_NAME).xml $(BASE_NAME).docx $(BASE_NAME).epub slides.html

slides.html: prepare
	pandoc -t slidy -s slides.md -o output/slides.html

$(BASE_NAME).html: prepare
	asciidoctor $(BASE_NAME).adoc -o output/$(BASE_NAME).html

# https://github.com/asciidoctor/asciidoctor-pdf
$(BASE_NAME).pdf: prepare
	asciidoctor -r asciidoctor-pdf -b pdf $(BASE_NAME).adoc -o output/$(BASE_NAME).pdf

$(BASE_NAME).epub: $(BASE_NAME).xml
	pandoc -f docbook -t epub3 output/$(BASE_NAME).xml -o output/$(BASE_NAME).epub

$(BASE_NAME).docx: $(BASE_NAME).xml
	pandoc -f docbook -t docx output/$(BASE_NAME).xml -o output/$(BASE_NAME).docx

$(BASE_NAME).xml: prepare
	asciidoctor -b docbook5 -d article $(BASE_NAME).adoc -o output/$(BASE_NAME).xml

prepare:
	mkdir -p output

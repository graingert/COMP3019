COMP3019
========

Part 1
------

1. The program available [here](https://github.com/graingert/COMP3019/blob/master/mgrid-wordcount/src/uk/co/graingert/mgrid/lettercount/LetterCountingMGridApplet.java) should analyse the textfile and output how many times the character appears in the textfile.
2. The applet launched a "Job Results" window with a JTextArea set to the value of 31
3.
    1. A parameters file is written containing only the letter 'a'
    2. [lettercount.jar](https://github.com/downloads/graingert/COMP3019/lettercount.jar) and the parameters file is uploaded to the M-Grid system
    3. The LetterCountingMGridApplet is then selected
    4. This applet is then downloaded an executed by any "processing nodes" volunteering their CPU time using a browser

Part 2
------

```$ ./GridSAMExampleRun
Run the GridSAM client example...
Creating a new client Job Manager...
urn:gridsam:18cec70a375a316601375bc968340188
urn:gridsam:18cec70a375a316601375bc96d31018f
urn:gridsam:18cec70a375a316601375bc9720b0196
urn:gridsam:18cec70a375a316601375bc97663019d
{/home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file1.txt=4, /home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file3.txt=4, /home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file2.txt=1}```
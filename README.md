COMP3019
========

Part 1
------
1. The program available
    [here](https://github.com/graingert/COMP3019/blob/master/mgrid-wordcount/src/uk/co/graingert/mgrid/lettercount/LetterCountingMGridApplet.java)
    should analyse the textfile and output how many times the character
    appears in the textfile.
2. The applet launched a "Job Results" window with a JTextArea set to
    the value of 31
3. Single Letter MGrid
    1. A parameters file is written containing only the letter 'a'
    2. [lettercount.jar](https://github.com/downloads/graingert/COMP3019/lettercount.jar) and the parameters file is uploaded to the M-Grid system
    3. The LetterCountingMGridApplet.class is then selected
    4. This applet is then downloaded and executed by any
    "processing nodes" volunteering their CPU time using a browser at http://example.com/mgrid/JobRequest
    5. The job can be monitored by viewing
    http://example.com/mgrid/ViewJobs
4. Multiple Letter M-Grid
    1. A [parameters.txt](https://github.com/graingert/COMP3019/blob/master/mgrid-wordcount/parameters.txt)
    file is written containing a list of new line delimeted parameters:
    The letters a-z "." and " ".
    2. [lettercount.jar](https://github.com/downloads/graingert/COMP3019/lettercount.jar)
    and the parameters file is uploaded to the M-Grid system
    3. The LetterCountingMGridApplet.class is then selected
    4. This applet is then downloaded and executed by any
    "processing nodes" volunteering their CPU time using a browser at
    http://example.com/mgrid/JobRequest Each (job,parameter) is
    distributed among the "processing nodes"
    5. The job can be monitored by viewing
    http://example.com/mgrid/ViewJobs
    6. This page will show which paramaters have been "UPLOADED",
    "ALLOCATED" and "COMPLETED"
    7. Once the (job,parameter) is in the "COMPLETED" state the results
    can be obtained through
    http://example.com/mgrid/ViewJobs?results=true with the jobNum
    and paramNum GET parameters filled in as appropriate
5. Errors
    1. Require submit jobs individually, manually compare for
    differences.
    2. Allocate each (job,parameter) pair to multiple "processing nodes"
    and compare the differences in ouput
    
Part 2
------
1. The code for this implimentation is available at
[GridSAMExample.java](https://github.com/graingert/gridsam/blob/b6ac5fac7c3ab8bb8df42837172cd775b019b435/GridSAMExample.java)
    1. A JSDL file is created that describes the job to be submitted.
    This file is dispatched to the GridSAM server.
    2. Once this JSDL file has been dispatched the JobID can be
    obtained. Using this JobID the job can be monitored.
    3. To monitor the job my code prints out any new stages that the job
    has been through while waiting for the job to be in a terminal
    state.
2. Map reduce
    1. The psuedo-code is available at 
    [mapreduce.pc](https://github.com/graingert/gridsam/blob/master/mapreduce.pc)
    2. The implimented code is available at
    [GridSAMExample.java](https://github.com/graingert/gridsam/blob/master/GridSAMExample.java)
    3. The output of the code:

            $ ./GridSAMExampleRun
            Run the GridSAM client example...
            Creating a new client Job Manager...
            urn:gridsam:18cec70a375a316601375bc968340188
            urn:gridsam:18cec70a375a316601375bc96d31018f
            urn:gridsam:18cec70a375a316601375bc9720b0196
            urn:gridsam:18cec70a375a316601375bc97663019d
            {/home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file1.txt=4, /home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file3.txt=4, /home/tag1g09/projects/lsds/gridsam-2.3.0-client/cw-file2.txt=1}
    This code shows the JobIDs created, and once finished a mapping of
    filename to wordcount.

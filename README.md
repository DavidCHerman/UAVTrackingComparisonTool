# UAVTrackingComparisonTool
The purpose of this project is to create a program that will apply several different object tracking algorithms to a library of UAV videos.

## MILESTONES:

### Milestone #1: March 11th, 2019
Have all algorithms trained and functioning

### Milestone #2: March 27th, 2019
Create a user I/O with a functional video player

### Milestone #3: April 10th, 2019
Have the algorithms functioning in the program and playing side by side.

## Project Journal

### February 11th, 2019

Hello friends! Welcome to my blundering journey through this project that I am assured is not above my capabilities. Though I'm certain my ideas for this project will change with time, I think it's still important to establish what my intentions are right now. That way months from now I can look back at all of this and laugh at how naive, hopeful, and full of life I used to be.

The primary objective:
To create a desktop application that implements several different object detection algorithms simultaneously on a single UAV video. 

The secondary objectives: 
- to enable users to select different algorithms to use
- to enable users to upload their videos and store them
- to enable users to further train the algorithms with their uploaded videos.

I'm certain this will change as I learn more about what will be required for each of these steps, but the heart of the primary goal will remain this same. The entire point of this is to create a platform for comparing multiple object detection algorithms to determine how they perform compared to one another.

Today though, I'm just going to be writing this little introduction so that I'll have a place to launch from in the coming weeks. For the sake of context though, let me inform the reader about myself and my level of expertise. I'm most fluent in Java, but I'm also comfortable with C, Javascript, Lisp, and Prolog. I've done enough research at this point to know that Python seems to be the language of choice for many of these algorithms and tutorial implementations. However, in terms of my familiarity with Python, I probably know more about the snake than I do about the programming language, so that'll be something to work around.

My knowledge about object detection is also dismal. I could probably get my friends and parents excited about the idea of object detection, but if anyone asked me how any of it worked I'd probably quickly change the subject and tell them a few facts about large amazonian snakes. Also, I just looked it up, and apparently I'm thinking of anacondas. I know things about anacondas. It seems that pythons don't live in the amazon. Apparently I know nothing about pythons. And yet I still feel more confident talking about pythons than I do about the Python programming language or how object detection works.

So suffice to say, this will be an uphill climb. I'd consider this a good thing though since I'd hardly learn anything if I was working a project that I already knew how to do. It seems I won't be able to spend a single day on this project without learning something. The only question is will I actually be able to get anything substantial done. I certainly hope so.


### February 17, 2019

Today my goal was to pick out a few object tracking algorithms to use for this project. Instead what I learned was that the world of object tracking is more complicated than I thought. I did find several different possibilities, but as I read more about the different algorithms I became confused. It seems that some of these programs utilized several different algorithms together. Other algorithms I thought I found, were object detection supplements, things like code that helped to make the information easier to read. 

OpenCV I discovered isn't actually an algorithm, but rather, it contains a bunch of different algorithms. It also seems to be one of the most popular in terms of tutorials, so I tried to look into it more. I've been digging into what exactly OpenCV is, and honestly I'm still a bit stumped. It claims that it's: "a common infrastructure for computer vision applications..." and that does sound like exactly what I would need. So really, I suppose it's an interface and a library. The problem here is that I'm not 100% sure what I would want to use in that library. However, it seems that for a lot of good leads I've found I'll need to utilize OpenCV to implement them.

Also, it seems that most of these tutorials are Python based and many of the algorithms seem to also be in python. So the question is, would I rather program in Java and try to find ways to bridge the gap between Java and Python, or should I try to learn a bit of Python and hope that I can gather enough about it so that I can pump out this program. It's not a super complicated program, and I do want to learn Python eventually. Maybe I should give Python a try. I think that'll be my goal next session. I'll try to learn a bit of python, and if I can, maybe try to take myself through an OpenCV Python tutorial.


### February 21, 2019
Oh dear god why did I think I could learn Python in a day? This is a programming language, it's not something that's meant to be learned in a day. I spent hours looking through various Python tutorials, and while I can confidently make a screen print "Hello world" my understanding doesn't begin to cover any of the more useful subjects such as system hierarchy, UI, file handling, or implementation of external libraries. I mean, I'm sure a few of those things would be easy enough, but this project's confusing enough as is without me trying to learn it all in another language. It's like trying to learn about French History from a professor who only speaks French. It's one of those ideas that sounds good until you think about it for more than a couple of seconds. No, I need to do this in Java if I'm going to understand how any of this works. I can't get by just copying and pasting from various step by step Python tutorials. I want this code to be something that I actually understand and created.

So we'll just chalk this day up to a lesson well learned, and an introductory Python excursion that hopefully I'll reap the benefits of later when I give learning Python a proper go.


### February 26, 2019
I was able to find a useful OpenCV Java tutorial, and I think it'll be as good a step forward as I'm going to find. It's been a couple of weeks now and I have nothing tangible to show for it. Using the tutorial I was able to gather all of the libraries and resources that I needed. I'll be using Eclipse and JavaFX for the UI.

Today I haven't quite reached the object detection portion of the tutorial, but that's because I'm mostly trying to learn how to use JavaFX. It's a wonderfully useful software platform, and I'm finding that it has everything I think I'll need for my UI purposes. It's also quite intuitive and has several tools that make design a lot easier and more visual. I've been familiarizing myself with JavaFX Scene Builder, which can be used to plot out various buttons, windows, and other objects, and then it writes the code needed to create it automatically when you save it. I've also looked up a tutorial for file loading in JavaFX and it seems it has all the tools I need to allow for the uploading of videos.

The OpenCV Java tutorial culminates in the user using the webcam as an input for object detection, but I'll want to replace that with playing a video file, I think that'll be easy enough to change. I think these are the two things I should be focusing on. It's the bare minimum for what this project can be. I just need a way to load a video, a space to play the video, and a way to implement an object tracking algorithm on the video being played. It seems simple enough. And once I have it working on a single algorithm I can work on finding a few other algorithms and see what it takes to make each of them function in that environment. From there, I can work on other features such as the side by side comparison and the file management.


### March 2, 2019

After consulting with my professors I decided that it would be better for me to work on the UI later. Right now I need to focus on finding the algorithms I want to use and figuring out how to train them. After all, my milestone of March 11th is fast approaching, and if I don't have something to show for it I'm going to be in big trouble. So far I've just been learning various things about making programs and how to code basic things in Python. I've completely glossed over object detection, which is the primary focus of this assignment. 

Also, I've been forgetting that this isn't just about object detection, this is about UAV video object detection. How is this program even remotely related to UAV videos if I just implement a bunch of pre-trained algorithms? It's a weird and arbitrary constraint on the user to say this is for UAV videos. The entire purpose of this program is to find a bunch of algorithms and train them on a large database of UAV videos which can then be used for the purpose of UAV video object detection. The training is what I need to focus on, not the implementation.

So for the next few days I'm going to try to do some research on how to train algorithms and which algorithms I'll want to utilize. Then hopefully, before March 6th I'll have made a little solid headway on getting some algorithm training started.


### March 5th, 2019

So here's what I've compiled over the last few days...

- Today I learned about fourier transform. I read a lot about it, eventually learning the most important aspect of fourier transform, which was that I didn't need to learn about this for this project. I know that this is used widely for object detection, but the algorithms I'm looking at already put this to use. I'm not looking to create a new algorithm or even to better understand the ones that I'll be using. I just want to find out which algorithms I want to use.

- Every time I revisit this project and do some research I'm finding that my ideas of how any of these things work together are incomplete. Of course, perhaps this is because I'm trying to involve myself with a massive and complicated aspect of the computer science world. So YOLO seems to be exactly what I would want to run, and the implementation seems incredibly simple. In fact, it seems far too simple. It seems that practically all of the work has been done and this has been set up for anyone to simply plug and play. The problem with this is that if all the implementation is done for me, I'm not sure how deep I'm going to have to dig into this to be able to implement YOLO as a single option in a larger application. However, the instructions for training YOLO seem rather clear, and this is as good a starting point as any and one of the most user friendly it seems.

- Something I'm picking up is that object detection is computationally demanding and the more videos I play together, the lower the quality will be for each. I wonder if I should have each algorithm work individually, and if I could save the output, I could play them all simultaneously with maybe some statistics on how long each one took and how accurate they believe themselves to be. In fact, those runtime statistics could be just as important if not more important than actually watching the compiled videos.

#### NEW SECONDARY OBJECTIVE:
Accumulate interesting data on processed UAV videos and how quickly the algorithm runs, and how certain the algorithm is (if that data is available). Charts would be nice, but let's add that as a tertiary objective if this project somehow takes off in a much more productive way.

- So from what I've gathered, these algorithms would ideally be run on a computer with a powerful GPU, that means I'll probably want to use my Windows desktop back home. Also, in order to properly utilize my GPU, all signs on the internet point me towards using CUDA, which is an NVIDIA toolkit that utilizes GPUs and is compatible with things like OpenCV. And looking here on the page, it seems to want me to choose between implementing this either on Windows, Linux or MacOSX. This is actually the first time I've worked on something complicated enough that it required me to choose between a Mac or a PC OS. Now, it's most convenient for me to program on my Mac because I can take it somewhere I can program and study without distractions. However, it seems that if I want this to run well, I'll need to write it for my PC. I'm certain this is a problem a lot of programmers have faced, but it's one that will take a bit of time for me to work out. I believe the right way to go about this would be for me to create a windows virtual machine for testing on my mac. I wonder if this is the sort of thing Docker would be useful for. Of course that would be just one more thing I would have to learn about and implement. It would be useful for me career-wise to learn how to use docker for testing though, so maybe I should dig a bit into this to see exactly how much time this would take and if this is what I'm looking for.

- Alright, I've done some research and I've determined that docker would probably be helpful in this respect. From what I've seen though, it might take a day's work to figure out how to properly implement this. I think it's worth it, but I would need to know that I can dedicate more time to this project. I started working on this about a month ago and I still have nothing tangible to show for it except for a basic understanding of object detection, JavaFX, and a few of the finer details of the more popular object detection algorithms. 

- I also discovered that if I use object detection and object tracking interchangeably, people who know more about this subject than me get visibly irritated.

I don't have time tonight to really do much else, so it seems I'll be walking in to class with nothing solid to show for myself, but I do feel like I have more direction, and at least I have these journal entries to show for my weeks of work.


### March 11th, 2019

  I think I'll change up the format of these entries a little bit. First off I need to present more of the resources I'm using and when available, include screen shots of the work I've done so far. I also need to bite the bullet and upload some of my code. Right now my code's a bit scattered, with working examples of various elements here and there. I need to start the actual project and start making code commits.

  Secondly, I've spoken to my professors about my lack of progress and they've given me a good suggestion as to how I can maybe cut back on my goals in a reasonable way. I've been focusing for a while now on how to get the various tracking algorithms working, and only recently realized that I would also need to spend a lot of time learning to train the algorithms to work with UAV videos. While this was a main component of the project, it would take a long time, and the main focus of this project should be on making a program. Training algorithms is nice and if I have time I'd love to get to that, but I can always train algorithms later after I have a functional program that I can show off. After all, a program using pre-trained algorithms can still be used to sample those algorithms, but a collection of trained algorithms without a program to view them makes for a poor presentation.

  So my Milestone 1 presentation should reflect this change. That presentation will be happening on March 13th. In the meantime, I need to build something I can show off. Let me list the requirements for my first prototype:

1. Home page has a button that allows a user to upload a video file.
2. Program runs the video through a single algorithm, then presents the video with object tracking overlay.

  That's the only two things I need for this first part. File upload, algorithm runs on the file, file is displayed. I can build off of that, but this is the bare bones version of things. Tonight I'll try to get a scene with a file button that uploads a file. If that doesn't take too long, I'll start up on getting an algorithm set up in my program. Here I go...

### March 13th
  It seems the first step towards getting this all set up is gaining an understanding of JavaFX. Once I have that, this whole UI step should be rather simple. The OpenCV Java tutorial is a bit skimpy on JavaFX, only going so far as to briefly cover the step by step process, but not going into the kind of detail I'd need to get the kinds of controls I'd want. Also, I think it'd be good to have a deeper understanding of JavaFX since I don't really have a good foundation in UI programming. This might take a bit longer than anticipated, but I think the investment will be worth it. I'll be using the JavaFX 2 Oracle Tutorial found at https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm

### March 14th
  Eclipse is proving to be something of a problem. I've done a lot of research into JavaFX and FXML, but Eclipse claims it's missing JavaFX resources. This appears to be a common problem with a number of workarounds, but after attempting several of them for an entire day, I decided that it would be better just to try another IDE. I've gone with NetBeans and found that it works perfectly well with all of my required elements, and after setting up all my libraries, I believe this will be perfectly functional. I was rewarded with a very simple but beautiful display:

-----

It took me 30 seconds to make, but that's because I've made this a dozen times in Eclipse already. Now that I know JavaFX can function I'm a bit relieved. I'll work on getting myself caught up to where I was in Eclipse next time.

### March 17th
  Today I completed the rest of my JavaFX tutorials and I feel like I have a decent enough understanding of how it works. I figure I can use these basic tutorials to get file chooser working, then once I have that in hand, I'll work on the media player a bit.

-----

  I've run into a bit of trouble again. It seems that my situation is complicated a bit due to my usage of FXML. I'd like to keep this in my project since it's a useful tool for creating UI, something that I'm always loath to do. It also seems like it'll save me days worth of work when it comes down to editing the minor aspects of UI design. However, I'm having a hard time distinguishing what parts of the program go into the FXML Controller, and which parts should be controlled by the main part of the application. What's more, I don't know how the two communicate. For instance, if I gather something from the user in FXML Controller, how do I use that new data in Main? I'm tempted to just put everything into the FXML Controller, or just find a way to abandon the FXML Controller entirely and just work with Main. Can I ditch the Controller without losing Scene Builder? I'll work on these questions more another day.

### March 17th
  I'm going to get to the bottom of my FXML Controller mystery and hopefully make enough headway to have a bit more to show for my efforts. Since I didn't make much headway last time I worked I want to just dive right into things.

-----

  So from what I've read, it seems that Main has a minimal role in all of this, and I could potentially just run most of my operations through the FXML Controller. There was some talk of using multiple FXML Controllers, but I don't think my program is complicated enough to merit that yet, and I don't want to dive into areas that would complicate this further. My main issue with using FXML Controllers was that I didn't know how to switch between scenes, but I'm going to see if I can't just live with what I've got. For my current goals a single scene should be enough, and there is a risk of including too many scenes.

-----

  Alright, things are moving forward. I've implemented File Chooser, and it can indicate what file was chosen, or point out that no file has been chosen. I'll have some time to work on this tomorrow, and I'll get working on the video player.

### March 19th
Today's the day when I get this video player working. If I can get this functional, I think I can actually call this a real application. Not a good application, but it has a practical use, which is nice.

-----

  Good news and bad news: The chosen file is clearly being used by the application, but only the sound is playing. I'm using JavaFX's MediaPlayer and MediaView, I'll do some troubleshooting and figure this out right quick, but it's getting late and I have time to do this later in the week.

### March 20th
  It's time to troubleshoot the Media player troubles, and if I can get all of my media trouble sorted out today I think I should still be on schedule.

-----

  Success! Albeit, the video is quite tiny, it's clearly playing. I don't have any control over it yet other than opening a file and auto-playing it, but I can sort that out later once I have multiple videos. I could be wrong, but I feel like linking multiple videos up to the same controller might be a bit tricky, so I'd rather not learn how to link up a single player just in case the route I need to take is completely different, which would mean my single video player controller would be a waste of time.

-----

  I've adjusted the application so that it's considerably bigger so that the video isn't quite so tiny. It's a good size for a single video. I'll have to take into consideration video sizing. If the video being used has a lot of detail having multiple players going on at once might make it impossible to get a good idea of how well the algorithms are working. I think this is something I'll have to look into later, so I'm adding this to my major objectives:

- Troubleshoot video sizing issues.

### April 4th
  This project's taken a bit of a back seat and I think I'm a bit behind schedule. I have little idea how difficult applying the object detection algorithms will be, so I need to get started on that right away. If I can get the chosen video processed and applied to a single algorithm, I should be able to program my way into processing the video through multiple algorithms. From there, I can work on a controller for multiple videos, which I think could prove to be a bit challenging. Anyway, for today's purposes, I need to look into YOLO, which I've decided is my best bet for my first algorithm. Today's unlikely to see any coding progress. It'll be mostly digging today.
  This is all so complicated! Dear god I feel so out of my depth. I was kind of hoping this would all be more or less plug and play, where I find an algorithm I like, and then just send it a video file and it would send me back a new video. It doesn't seem like this is the case. In most cases, the examples and the APIs revolve around python. I already knew this, but I was under the impression that I could find some Java substitutes. Of the Java based object detection tutorials I found, it seems to focus mainly on either the very basic object detection algorithms, or only covers object detection on a single image. Also, in many of these cases, I'm required to input a lot of data that I simply don't understand because my knowledge of computer vision is insufficient. I've stared at these tutorials for hours now and I can't seem to grasp anything that would be very helpful. I need to take a break. I'll revisit this soon. I need to get on top of this.

### April 10nd
Alright, after a bunch of work I managed to get OpenCV working in a java application on a single image. The problem with this is that by following the tutorial I found I wasn't able to really understand why I was doing what I was doing. So I can't adjust much of this program since I don't know what does what. On top of all this, having a program that can perform object detection on a single image would only be useful to me if I could also create a program that would break up a video file into individual frames, perform object detection on those frames, and then recompile those new frames into a new video at the same speed as the original. That seems like it would be an awful lot of work. Perhaps I could find a program that could do that for me, but it still seems like this could be very expensive computationally and lead to a very slow program.
	The thing is...if I knew Python I would have so many more options. I'm not even sure if I can find more than a couple decent Object Detection models that are adapted to Java. Even if I could, I still have that problem I stated above regarding converting single image detection to video detection. And I've already made enough progress with Java that I don't think my schedule could bear the brunt of starting all over. So it seems I only have two options, I can find something that can rip a video apart into multiple individual frames and put it back together again, or I can look for python solutions.
	Honestly, I think the only reasonable option is to find some python solutions to my video detection problems, and if I find something decent enough, then I can work towards finding a way to using python in my project. My Java portion can stand on its own two feet and it's rather simple in its design. It can output a file location, send it to a Python program, and then if the Python program can create a processed video file, it can send the file location back to the java program which can play it with its video player.
	Another issue here is that since my Python knowledge is so limited, I'll only be able to utilize tutorials so detailed that I'll essentially be copying working code from another project. I'll need to look into how to properly attribute other people's work. It's something I was going to have to do anyway since I'm not making my own object detection algorithms, so this isn't too big an ask. Anyway, I'll explore these options next week.
	

April 12th
	Judgement day is fast arriving, and I'll need to make major strides this week if I have any hope of achieving my goals. My first goal today is to search for Python solutions to my object detection algorithm problems. I'll need something that processes video files, and I'll need solutions for multiple algorithms. I'm certain this exists out there. Live object detection is the holy grail of object detection, but video processing should be the intermediate step. Off I go. --
	Okay! I think I've got something. The whole world opened up as soon as I stopped asking for Java solutions. It seems if I ever hope to have anything to do with Computer Vision I'll need to learn Python. There are APIs and tutorials in OpenCV where I can get a video output. I can also use Tensorflow. I also found a detailed tutorial that uses YOLO in OpenCV. I also found something called ImageAI. I haven't found much about it other than a couple of fluff articles. However, it offers a simple API that would allow for the usage of YOLOv3, TinyYOLO, and RetinaNet. It has a lot of thorough documentation, so I think this could be easy enough to try out.
	Now...having found some real options, I also looked up some methods for using Python code in a Java program. The first real option I found is something called Jython, which seems to be a sort of bridge that integrates python with the java platform. It's impressive and certainly would solve my problems. 
	I also found another option that seems to be a lot more straightforward. From Java, I could just insert a command to run a python program and take the output. In terms of simplicity, I don't think this can be beat. I just have to follow the python tutorials, make the python programs, and then my java program can call them and run their files. Though this probably shouldn't be my end game, this is an elegant solution. I think this is the one I'll pursue first.

April 14th/15th
	It's been a very long day, but I've made a lot of progress. I found a program where an individual has utilized yolo with openCV to input videos and output videos. I've taken the source code from https://www.pyimagesearch.com/2018/11/12/yolo-object-detection-with-opencv/ and I've managed to get it to function when running it through a ProcessBuilder in my program. I ran into several issues. First, I went through a bunch of different routines to get ProcessBuilder to work. I started off with running it through a runtime.exec() command, but that didn't seem to work out. Long story short, I had to mess around with the location of the python source code and figure out how to access it properly and how to find the locations of all the different files, but in the end, I've managed to get it working. As it is, when you upload a video file, the program calls the python code, inputs the chosen file, and then retrieves the output YOLO file and plays it. 
	Another problem I ran into was that the python code output .avi files, which apparently aren't compatible with the javaFX Media Player. So I had to do some digging and adjust the python code so that it would output .mp4's instead. There was a lot of chatter online about how this was a bit unstable and .mp4's might not be output on different systems, but it works for now and this is something I can look into later. For now, I'm just happy to have something that functions.
	I also have a problem when it comes to finding the python2 source. Apparently when I call the python code in my process builder, I need to call it from its source or else it lacks one or more modules. So I have to use the command "which python2" to find the file path for python2. But for some reason, when I try to use this command through java I get a null response, both from Process Building it or using a runtime.exec(). Weirdly, if I try the command "which python" or "which java" i get the proper response. But somehow using a number messes the whole thing up. I'll look into this later. For now I'll just insert the path in the code manually. This means I'll need to change it if I move to a different operating system or one that has python2 in a different location.
	Another problem I've run into is that the python code outputs a lot of useful information, such as the number of frames, the time to process a single frame, and the estimated time to complete all frames. If I could pull this information before the long processing time takes place, I could give the user a bunch of information, and possible give an estimated process timer. However, it seems as soon as I get locked down in the python code, my program locks up as well. It's possible this has to do with my own code, because it would be nice if I could do something while the python code is running. --
	I've found a possible solution to my program freezing up while the python code is executing. I don't know much about running processes on different threads, but I think it might be relevant to what I'm trying to do. This does seem a bit complicated however, and while it would improve the quality of my program significantly, I think I need to focus on getting multiple object detection algorithm videos playing at the same time, even if it means my program appears to be very nearly broken while the user waits for his videos to process. The point of this entire project is the comparison of different algorithms, and I'd like to have some rough version of that by the time I have to present my work. I've found resources though when I'd like to come back to this. I'll leave the links here for when I have time to return to them:
https://stackoverflow.com/questions/25174673/how-to-run-process-builder-command-as-thread-in-java
https://stackoverflow.com/questions/39628739/java-application-to-start-a-process-and-get-a-callback-when-events-occurred-in-p

April 16th
	My next goal is to find another model to use. I've got it set up so that I'm pretty sure I can get it working easily, assuming that I can get a video output like before. If I can find this, then I can work on running multiple videos at the same time, and I'll finally have a barebones version of what I had intended. Also, I think I'd like to implement a textflow box to list all of the details of each model for the user to view. Seeing all of the videos playing won't mean much if they can't see how long it took to process, how sure the algorithm was, and how many frames it chose to measure. But anyway, today the goal is to find other models I can use. --
	So I've found this thing called ImageAI, I believe I mentioned it before. I spent the day trying to get it working, and honestly it was quite straightforward and seemed to offer everything I could possibly want. It gives me a way to input and output video for RetinaNet, Yolo v3, and Tiny-Yolo. Really, it seems like this is all I need to have a halfway decent project ready. I think this might be the key to getting it done on time.

April 17th
	I think I have to abandon ImageAI. I did a lot of thinking about it today and I think while it would make my project look better right now, it would be a dead end in the long run. ImageAI has three object detection models it can work with, and these are built into the program. The program has methods where you specify which of these three models you plan on using. If I stick with ImageAI, then I can't use any different models unless the developers program that compatibility into the program. That means if I wanted to implement any new models, I'd need to go with a completely different Python program and I'd likely need to recode my own work in order to make anything new work. 
	Essentially, I'd work for days to make this look pretty and I'd probably come out with something that looks halfway decent. I could probably even program that cool little tool where I could control three synchronized videos with a single controller. The problem is, in order to ever improve on that, I'd need to disassemble most of what makes this code work in order to pursue another python program that I probably wouldn't understand at all. I'd need to put so much work into this in order to get back to the same state that I think I would probably just abandon this project completely. 
	If I want this project to actually become something useful, I need to look for different tools, and I think that tool is OpenCV. I've read up on it and it seems that it's got some useful APIs and it works to be compatible with many different object detection models. I'm not too knowledgeable on its capabilities yet, or on compatibilities, but this is as good a lead as I think I'm going to get. I know this looks like a step back, but I'm starting to feel confident about my decisions. I think I'm starting to get a better idea about the big picture.

April 21st
	I've only got three days left before my presentation, and I'm getting a bit worried. I'm going to work hard today and tomorrow to try to get this a bit more presentable, but I'm afraid that most of what I have to present isn't code, but lessons about this entire experience. I hope that'll be enough. I have two days, and then I need to dedicated April 23rd to writing up my presentation. I would've liked to have it done by today, but I'm not confident enough with this project to present it quite yet.
	Today I'll be working on getting the YOLO algorithm to work properly and maybe start work on a text display and a media controller. --
	Not a good day's work I'd say. I've got the output working reliably, but with a few test runs I discovered that YOLO doesn't fire off if there are any spaces in the input video file name. I feel like this is something I could solve relatively easily, but I just don't have time to dive into that right now. I need things to show for my work for the presentation tomorrow, and if it works under most circumstances I think that's enough for now.
	I moved on to the media controller, and to be honest, I thought that was going to be a walk in the park. I kinda thought that it might even be a drag and drop option in SceneBuilder. I was quite wrong. It seems that building a media controller is almost like an entire week long project on its own. Each button and slider needs to be programmed and set up. The tutorials I found detailed an entire hierarchy of tools and controls that would bind together into a single tool. It looks like controlling multiple videos should be possible, which is the bright spot in how complicated this is, but this will take a while to set up properly. Copying someone else's source code isn't an option due to the customization I need.

April 22nd
	Last day and I'm afraid I don't have that much time left in the day. The best I can do at this point I think is organize my documentation and get my github up and running. I can't believe it's taken me this long. At least I kept a journal of all this, so that's something. After all, this is the only way I can show what I accomplished since my code is so dismal. I need to work on my presentation. I don't think I can take any action in a single day that'll make this look significantly better. I'd best put my efforts where they'll show the most.


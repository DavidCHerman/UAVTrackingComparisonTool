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

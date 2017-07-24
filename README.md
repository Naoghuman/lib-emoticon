Lib-Emoticon
===



Intention
---

`Lib-Emoticon` is a multi [Maven] project written in [JavaFX] and [NetBeans IDE] 
and provides the functionalities to use and handle easily [Emoticon]s in your 
JavaFX application.

_Image:_ Demo v0.1.0-SNAPSHOT  
![demo-v0.1.0-SNAPSHOT.png][demo-v0.1.0-SNAPSHOT]

The current `version` is `0.1.0-SNAPSHOT` (MM.dd.2017 / MM.dd.yyyy).



Content
---

* [Demo](#Demo)
* [Libraries](#Libraries)
    - [Lib-Emoticon-Core](#LiEmCo)
    - [Lib-Emoticon-Emoji](#LiEmEm)
    - [Lib-Emoticon-Emoji-Images](#LiEmEmIm)
* [Download](#Download)
* [Requirements](#Requirements)
* [Installation](#Installation)
* [Contribution](#Contribution)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



Demo<a name="Demo" />
---

The application [Lib-Emoticon-Demo] shows a `demonstration` how to use and 
handle the features from the libraries in the project `Lib-Emoticon`. 

_Image:_ Demo application v0.1.0-SNAPSHOT  
![demo-application-v0.1.0-SNAPSHOT.png][demo-application-v0.1.0-SNAPSHOT]

Momentary following features are shown in the demo application:
* How to load with an [EmoticonLoader] different sublists from an [EmoticonSet].
* How to load all images from the [EmojiEmoticonSet].
    * See [Emoji cheat sheet] for the original source - big thanks for the great 
      work :bowtie: .
* How to show a `Can't load image` [Image] if the emoticon image can't loaded.

For more informations and examples plz see the [ReadMe from Lib-Emoticon-Demo].



Libraries<a name="Libraries" />
---

Like I said before `Lib-Emoticon` is a multi [Maven] project which contains different 
`sub-libraries`. Which sub-libraries are the best for you depends from your 
requirements in your project.

To use `Lib-Emoticon` in your project you need minimal the library `Lib-Emoticon-Core` 
plus a concrete implementation from an [EmoticonLoader] which loads your own [Emoticon]s 
images. How that work will be explained in the sub-project [Lib-Emoticon-Demo](#LiEmDe).

Natural you can use additional libraries which contains predefined `Emoticon Sets`. 
Currently supported is [Emoji cheat sheet] with the libraries [Lib-Emoticon-Emoji](#LiEmEm) 
and [Lib-Emoticon-Emoji-Images](#LiEmEmIm).


### Lib-Emoticon-Core<a name="LiEmCo" />

The library `Lib-Emoticon-Core` provides the API to load an [Emoticon] as 
an [Image] with a concrete implementation from an [EmoticonLoader].

For more informations and examples plz see the [ReadMe from Lib-Emoticon-Core].


### Lib-Emoticon-Emoji<a name="LiEmEm" />

With the library `Lib-Emoticon-Emoji` the developer have access to the 
emoticonset [Emoji cheat sheet] through the class [EmojiEmoticonSet]. Momentary 
that are `882` [Emoticon]s.

For more informations and examples plz see the [ReadMe from Lib-Emoticon-Emoji].


### Lib-Emoticon-Emoji-Images<a name="LiEmEmIm" />

The library `Lib-Emoticon-Emoji-Images` contains all images from the 
emoticonset [Emoji cheat sheet]. Currently that are `882` images.

For more informations and examples plz see the [ReadMe from Lib-Emoticon-Emoji-Images].



Download<a name="Download" />
---

There are different `zip` files as download available. Plz choose the right one 
in dependency from your necessities:
* TODO 

Access to the downloads are here: [Download Lib-Tile]


Requirements<a name="Requirements" />
---

* On your system you need [JRE 8] or [JDK 8] installed.



Installation<a name="Installation" />
---

Depends on your necessities you have different options like in the section 
[Download](#Download) is shown. Download the right `zip` file, extract it and 
include the jar file&#040;s&#041; into your project. That was it :smile: .



Documentation<a name="Documentation" />
---

TODO rewrite
In general `Lib-Emoticon` and `Lib-Emoticon-Demo` haven't an official documentation. But 
you can
* read the `README.md` from every project and
* read the [JavaDoc] in the project and libraries.

where `examples` and the `api` are shown and explained.



Contribution<a name="Contribution" />
---

* If you find a `Bug` I will be glad if you could report an [Issue].
* If you want to `contribute` to the project plz fork the project and do a [Pull Request].



License<a name="License" />
---

The project `Lib-Emoticon` and all sub-projects are licensed under [General Public License 3.0].



Autor<a name="Autor" />
---

The project `Lib-Emoticon` and all sub-projects are maintained by me, Peter Rogge. See [Contact](#Contact).



Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)
[demo-application-v0.1.0-SNAPSHOT]:https://cloud.githubusercontent.com/assets/8161815/23338535/c417558c-fc0d-11e6-9338-8622dfcc74d7.png
[demo-v0.1.0-SNAPSHOT]:https://cloud.githubusercontent.com/assets/8161815/23338494/fcc31886-fc0c-11e6-9980-1f57722c4417.png



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[Emoji cheat sheet]:http://www.webpagefx.com/tools/emoji-cheat-sheet/
[EmojiEmoticonSet]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Emoji/src/main/java/com/github/naoghuman/lib/emoticon/emoji/EmojiEmoticonSet.java
[Emoticon]:https://en.wikipedia.org/wiki/List_of_emoticons
[EmoticonLoader]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Core/src/main/java/com/github/naoghuman/lib/emoticon/core/EmoticonLoader.java
[EmoticonSet]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Core/src/main/java/com/github/naoghuman/lib/emoticon/core/EmoticonSet.java
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[JavaFX]:http://docs.oracle.com/javase/8/javase-clienttechnologies.htm
[JDK 8]:http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[JRE 8]:http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
[Lib-Emoticon-Demo]:https://github.com/Naoghuman/lib-emoticon/tree/master/Lib-Emoticon-Demo
[Maven]:http://maven.apache.org/
[NetBeans IDE]:https://netbeans.org/
[ReadMe from Lib-Emoticon-Core]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Core/README.md
[ReadMe from Lib-Emoticon-Demo]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Demo/README.md
[ReadMe from Lib-Emoticon-Emoji]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Emoji/README.md
[ReadMe from Lib-Emoticon-Emoji-Images]:https://github.com/Naoghuman/lib-emoticon/blob/master/Lib-Emoticon-Emoji-Images/README.md

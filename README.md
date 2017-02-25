Lib-Emoticon
===



<br />
Intention
---

TODO
Lib-Emoticon is a multi Maven project written in JavaFX and NetBeans IDE 8 and provides the 
functionalities to use and handle easily Emoticons in your JavaFX application. 

The current `version` is `0.1.0` from MM.dd.2017.

<br />
_Image:_ TODO image name

> __Hint__  
> a
> b

![image-name.png][image-name]



<br />
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



<br />
Demo<a name="Demo" />
---

The application [Lib-Emoticon-Demo] shows a `demonstration` how to use and 
handle the features from the libraries in the project `Lib-Emoticon`. 

<br />
_Image:_ Default demo application
![demo-application-default.png][demo-application-default]

<br />
Momentary the developer have following features during the demo application:
* TODO add feature description
* TODO add feature description
* TODO add feature description

<br />
For more informations and examples plz see the [ReadMe from Lib-Emoticon-Demo].



<br />
Libraries<a name="Libraries" />
---

Like I said before `Lib-Emoticon` is a multi [Maven] project which contains different 
`sub-libraries`. Which sub-libraries are the best for you depends from your 
requirements in your project.

To use `Lib-Emoticon` in your project you need minimal the library `Lib-Emoticon-Core` 
plus a concrete implementation from an [EmoticonLoader] which loads your own [Emoticon]s 
images. How that work will be explained in the sub-project [Lib-Emoticon-Demo](#LiEmDe).

Natural you can use additional libraries which contains predefined `Emoticon Sets`. 
Currently supported is [Emoji] with the libraries [Lib-Emoticon-Emoji](#LiEmEm) 
and [Lib-Emoticon-Emoji-Images](#LiEmEmIm).


<br />
### Lib-Emoticon-Core<a name="LiEmCo" />

The library `Lib-Emoticon-Core` provides the API to load an [Emoticon] as 
an [Image] with a concrete implementation from a [EmoticonLoader].

TODO hint additional informatin in sub-project
TODO link to sub-library


<br />
### Lib-Emoticon-Emoji<a name="LiEmEm" />

With the library `Lib-Emoticon-TransparentTextures` the developer have access to the 
tileset `Emoji` from the internet page https://www.transparenttextures.com/ TODO
through the enum `TransparentTexturesTile`. Momentary that are `396` [Tile]s.

TODO hint additional informatin in sub-project
TODO link to sub-library


<br />
### Lib-Emoticon-Emoji-Images<a name="LiEmEmIm" />

The library `Lib-Emoticon-Emoji-Images` contains all images from the 
tileset `Emoji`.

TODO hint additional informatin in sub-project
TODO link to sub-library



<br />
Download<a name="Download" />
---

There are different `zip` files as download available. Plz choose the right one 
in dependency from your necessities:
* Download Lib-Tile-Core-0.1.0.zip
    * Contains only the library lib-tile-core-0.1.0.jar.
    * You need to define your own [TileLoader] and your own [Tile]s images in 
      your application.
* Download Lib-Tile-Core-And-TransparentTextures-0.1.0.zip
    * Contains the libraries lib-tile-core-0.1.0.jar, lib-tile-transparenttextures-0.1.0.jar, 
      lib-tile-transparenttextures-images-0.1.0.jar.
    * You can use the predefined tileset `Transparent Textures` in your application.
* Download Lib-Tile-Demo-0.1.0-SNAPSHOT.zip
    * Contains the library lib-tile-demo-0.1.0-SNAPSHOT.jar as an executable jar 
      with included libraries lib-tile-core-0.1.0.jar, lib-tile-transparenttextures-0.1.0.jar, 
      lib-tile-transparenttextures-images-0.1.0.jar.
    * Use the demo application as a preview how the chosen [Tile]s will be looks 
      over your chosen background image/-color.

Access to the downloads are here: [Download Lib-Tile]


<br />
Requirements<a name="Requirements" />
---

* On your system you need [JRE 8] or [JDK 8] installed.



<br />
Installation<a name="Installation" />
---

Depends on your necessities you have different options like in the section 
[Download](#Download) is shown. Download the right `zip` file, extract it and 
include the jar file&#040;s&#041; into your project. That was it :smile: .



<br />
Documentation<a name="Documentation" />
---

TODO rewrite
In general `Lib-Emoticon` and `Lib-Emoticon-Demo` haven't an official documentation. But 
you can
* read the `README.md` from every project and
* read the [JavaDoc] in the project and libraries.

where `examples` and the `api` are shown and explained.



<br />
Contribution<a name="Contribution" />
---

* If you find a `Bug` I will be glad if you could report an [Issue].
* If you want to `contribute` to the project plz fork the project and do a [Pull Request].



<br />
License<a name="License" />
---

The project `Lib-Emoticon` and all sub-projects are licensed under [General Public License 3.0].



<br />
Autor<a name="Autor" />
---

The project `Lib-Emoticon` and all sub-projects are maintained by me, Peter Rogge. See [Contact](#Contact).



<br />
Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)
[demo-application-default]:https://cloud.githubusercontent.com/assets/8161815/17342760/efe5803c-58fa-11e6-905b-f8a0d8ff856d.png



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html

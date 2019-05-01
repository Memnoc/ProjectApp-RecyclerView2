# ProjectApp-RecyclerView2

This implementation of the RecyclerView aims to show a different, more articulated way to use the traditional pattern (available herefor reference: )
It uses external libraries such as [Glide](https://github.com/bumptech/glide), [CircleImageView](https://github.com/hdodenhof/CircleImageView) and [CardView](https://developer.android.com/reference/androidx/cardview/widget/CardView.html) for some nicer visual effects, and be able to retrieve the images
in form of Strings URL's.

The architectural pattern used is MVP - [Model-View-Presenter](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) intended as separation of concerns in between the classes and interchangability.

The single entries in the list are clickable, and they open up in a new activiy carryiongover a bigger versin of the image in the first record,
plus the title.

![alt text](https://i.imgur.com/ThXqSCM.png)
![alt text](https://i.imgur.com/yBqF2RB.png)

Credits and inspiration for this implementation to [michtabian](https://github.com/mitchtabian) and [Coding in Flow](https://codinginflow.com/tutorials/android/recyclerview-cardview/part-4-onitemclicklistener)

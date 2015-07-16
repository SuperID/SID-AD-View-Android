SID-AD-View
==============

An advertisement View for developers that cooperated with SuperID. 

![image](img/AD_Img.png)

## Usage
There is a demo project included that shows how to use the SID-AD-View.

- add the class "View_Active.java" and resource "res" into your project.
- using the following code to show the view:

```
//获取布局根节点
RelativeLayout rlLayout =(RelativeLayout)findViewById(R.id.contain);
View_Active view_Active = new View_Active(this); 
//人脸data数据可以在刷脸登录后获得：String data = Cache.getCached(context, SDKConfig.KEY_APPINFO);
String data = "{\"gender\":\"male\",\"persona\":{\"tags\":[\"goodLooking\",\"eyeglasses\",\"mustache\"],\"gender\":\"male\",\"generation\":\"90s\",\"character\":\"reserved\"}}";
view_Active.setTitle(data);
rlLayout.addView(view_Active);                             
```




# FanaticsKit SDK 1.0.0

*Last updated March 28, 2019*

The FanaticsKit SDK enables your iPhone apps to start up and show a customized Fanatics Store, using a Fanatics-supplied team or league **Partner Token**

### **About Partner Tokens**

A different **Partner Token** is required for each team or league app you build.

The **Partner Token** encapsulates information required to start up a Fanatics Store for a particular team or league.



### **Requirements**

- Xcode 10.1 and iOS 11.0 SDK or higher
- iOS 11.0 or later deployment target
- **Partner Token** for each team or league app, obtained from Fanatics



### Packaging

FanaticsKit SDK is an iOS dynamic framework.  We deliver it as a gzipped .tar archive, identifying major version(1.0) and build number (1) as in this example:

```bash
iOS.SDK.Fanatics.1.0.RC.1.tar.gz
```



### Device, Simulator, and Bitcode Compatible

FanaticsKit SDK ships as a universal dynamic framework, containing all architectures needed to run on iOS Devices or in the Xcode Simulator.

It also contains bitcode slices for building your app with bitcode enabled.



### 1. Initial Installation

After unpacking the FanaticsKit archive you will have a folder named **FANKit-Universal-Release** with the `FANKit.framework` inside.

Move the **FANKit-Universal-Release** directory to a convenient location in your source tree. 



### 2. Installation per App Target

#### Embed FanaticsKit and Add Run Script Build Phase

1. Go to your app target's **General** settings. Drag ***FANKit.framework*** to the ***Embedded Binaries*** section. Check copy items if you prefer, then click Finish.

2. In your unit test target’s ***Build Settings***, add the parent path to ***FANKit.framework*** in the ***Framework Search Paths*** section.

3. In your app target's ***Build Phases*** settings, add a ***New Run Script Phase***, name it ***Strip Embedded Frameworks***, and insert the script below:

```bash
bash "${BUILT_PRODUCTS_DIR}/${FRAMEWORKS_FOLDER_PATH}/FANKit.framework/strip-frameworks.sh"
```

This run script, packaged with FanaticsKit, will remove unnecessary architectures from the built app.  This last step is currently required for apps containing FanaticsKit to be submitted to the App Store.

Note that if you remove and replace the SDK from the ***Embedded Binaries*** section, Xcode may add it back as a final step. In that case you will need to move the ***Strip Embedded Frameworks*** build phase after the framework is embedded, otherwise the build will fail.



#### Important Note About Uploading to iTunesConnect

Although you can successfully build and install apps on devices without adding the ***Strip Embedded Frameworks*** build phase above, iTunes Connect will reject your app for containing unnecessary architectures.  The error messages will differ depending on whether or not you are attempting to enable bitcode.

If you are supporting multiple targets, remember to add the ***Strip Embedded Frameworks*** build phase to each target.



### 3. Initialize Fanatics Store

When you are ready to display the Fanatics store, initialize Fanatics with the team or league ***Partner Token*** obtained from Fanatics. There are two convenient initializers depending on if you want to present the store via a Fanatics provided navigation controller, or if you want to push the store onto your own navigation stack. 

```objective-c
[Fanatics presentAppToken:@"YOUR_APP_TOKEN" success:^(UINavigationController * _Nonnull navigationController) {
[self presentViewController:navigationController animated:YES completion:nil];
} failure:^(NSError * _Nullable error) {
// Handle error
}];

```



```objective-c
[Fanatics pushAppToken:@"YOUR_APP_TOKEN" success:^(UIViewController * _Nonnull viewController) {
[self.navigationController pushViewController:viewController animated:YES];
} failure:^(NSError * _Nullable error) {
// Handle error
}];
```



### 4. Diagnostic Information

There is a method available on the Fanatics class that provides detailed build information on the Fanatics SDK.

```
+ NSString *FANKitSDKVersionBuildNumber();
```


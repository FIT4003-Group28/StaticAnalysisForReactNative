package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
@com.facebook.react.d0.a.a(name = RNCWebViewModule.MODULE_NAME)
/* loaded from: classes.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;
    private f webviewFileDownloaderPermissionListener;

    /* loaded from: classes.dex */
    class a implements f {
        a() {
        }

        @Override // com.facebook.react.modules.core.f
        public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9834a = new int[c.values().length];

        static {
            try {
                f9834a[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9834a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");
        

        /* renamed from: b  reason: collision with root package name */
        private final String f9839b;

        c(String str) {
            this.f9839b = str;
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.webviewFileDownloaderPermissionListener = new a();
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f9839b));
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, c.DEFAULT.f9839b).booleanValue() || arrayContainsString(acceptedMimeType, c.IMAGE.f9839b).booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        if (str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f9839b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private Boolean acceptsVideo(String[] strArr) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        if (arrayContainsString(acceptedMimeType, c.DEFAULT.f9839b).booleanValue() || arrayContainsString(acceptedMimeType, c.VIDEO.f9839b).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f9839b};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i] = mimeTypeFromExtension;
                } else {
                    strArr2[i] = str;
                }
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private File getCapturedFile(c cVar) {
        String str;
        String str2;
        int i = b.f9834a[cVar.ordinal()];
        String str3 = "";
        if (i == 1) {
            str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i != 2) {
            str = str3;
            str2 = str;
        } else {
            str3 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        return Build.VERSION.SDK_INT < 23 ? new File(Environment.getExternalStoragePublicDirectory(str3), str + String.valueOf(System.currentTimeMillis()) + str2) : File.createTempFile(str, str2, getReactApplicationContext().getExternalFilesDir(null));
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? c.DEFAULT.f9839b : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f9839b);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return a.g.e.c.a(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof e)) {
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
            return (e) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Uri outputUri;
        try {
            this.outputImage = getCapturedFile(c.IMAGE);
            outputUri = getOutputUri(this.outputImage);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException | IllegalArgumentException e3) {
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() != null && i == -1 && Build.VERSION.SDK_INT >= 21) {
                return WebChromeClient.FileChooserParams.parseResult(i, intent);
            }
            return null;
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i2 = 0; i2 < itemCount; i2++) {
            uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
        }
        return uriArr;
    }

    private Intent getVideoIntent() {
        Intent intent;
        Uri outputUri;
        try {
            this.outputVideo = getCapturedFile(c.VIDEO);
            outputUri = getOutputUri(this.outputVideo);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        try {
            intent.putExtra("output", outputUri);
        } catch (IOException | IllegalArgumentException e3) {
            e = e3;
            Log.e("CREATE FILE", "Error occurred while creating the File", e);
            e.printStackTrace();
            return intent;
        }
        return intent;
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        boolean z = true;
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0] == null || strArr[0].length() != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        Toast.makeText(getCurrentActivity().getApplicationContext(), "Downloading", 1).show();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions() {
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z = a.g.e.b.a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z && Build.VERSION.SDK_INT >= 23) {
            getPermissionAwareActivity().a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, this.webviewFileDownloaderPermissionListener);
        }
        return z;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean bool = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            bool = true;
        }
        if (i >= 16 && i <= 18) {
            bool = true;
        }
        promise.resolve(bool);
    }

    protected boolean needsCameraPermission() {
        try {
            if (Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (a.g.e.b.a(getCurrentActivity(), "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        if (r9 != null) goto L23;
     */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(android.app.Activity r8, int r9, int r10, android.content.Intent r11) {
        /*
            r7 = this;
            android.webkit.ValueCallback<android.net.Uri[]> r8 = r7.filePathCallback
            if (r8 != 0) goto L9
            android.webkit.ValueCallback<android.net.Uri> r8 = r7.filePathCallbackLegacy
            if (r8 != 0) goto L9
            return
        L9:
            java.io.File r8 = r7.outputImage
            r0 = 0
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L1b
            long r4 = r8.length()
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L1b
            r8 = 1
            goto L1c
        L1b:
            r8 = 0
        L1c:
            java.io.File r4 = r7.outputVideo
            if (r4 == 0) goto L2a
            long r4 = r4.length()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            r1 = -1
            r4 = 0
            if (r9 == r3) goto L5d
            r2 = 3
            if (r9 == r2) goto L33
            goto L8d
        L33:
            if (r10 == r1) goto L3b
            android.webkit.ValueCallback<android.net.Uri> r9 = r7.filePathCallbackLegacy
        L37:
            r9.onReceiveValue(r4)
            goto L8d
        L3b:
            android.webkit.ValueCallback<android.net.Uri> r9 = r7.filePathCallbackLegacy
            if (r8 == 0) goto L49
            java.io.File r10 = r7.outputImage
            android.net.Uri r10 = r7.getOutputUri(r10)
            r9.onReceiveValue(r10)
            goto L8d
        L49:
            if (r0 == 0) goto L55
            java.io.File r10 = r7.outputVideo
            android.net.Uri r10 = r7.getOutputUri(r10)
            r9.onReceiveValue(r10)
            goto L8d
        L55:
            android.net.Uri r10 = r11.getData()
            r9.onReceiveValue(r10)
            goto L8d
        L5d:
            if (r10 == r1) goto L64
            android.webkit.ValueCallback<android.net.Uri[]> r9 = r7.filePathCallback
            if (r9 == 0) goto L8d
            goto L37
        L64:
            android.webkit.ValueCallback<android.net.Uri[]> r9 = r7.filePathCallback
            if (r8 == 0) goto L76
            android.net.Uri[] r10 = new android.net.Uri[r3]
            java.io.File r11 = r7.outputImage
            android.net.Uri r11 = r7.getOutputUri(r11)
            r10[r2] = r11
            r9.onReceiveValue(r10)
            goto L8d
        L76:
            if (r0 == 0) goto L86
            android.net.Uri[] r10 = new android.net.Uri[r3]
            java.io.File r11 = r7.outputVideo
            android.net.Uri r11 = r7.getOutputUri(r11)
            r10[r2] = r11
            r9.onReceiveValue(r10)
            goto L8d
        L86:
            android.net.Uri[] r10 = r7.getSelectedFiles(r11, r10)
            r9.onReceiveValue(r10)
        L8d:
            java.io.File r9 = r7.outputImage
            if (r9 == 0) goto L96
            if (r8 != 0) goto L96
            r9.delete()
        L96:
            java.io.File r8 = r7.outputVideo
            if (r8 == 0) goto L9f
            if (r0 != 0) goto L9f
            r8.delete()
        L9f:
            r7.filePathCallback = r4
            r7.filePathCallbackLegacy = r4
            r7.outputImage = r4
            r7.outputVideo = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
        return true;
    }
}

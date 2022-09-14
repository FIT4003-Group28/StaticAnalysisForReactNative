package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.scroll.h;
import com.facebook.react.views.scroll.i;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@com.facebook.react.d0.a.a(name = "RNCWebView")
/* loaded from: classes.dex */
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected boolean mAllowsFullscreenVideo;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected e mWebChromeClient;
    protected com.reactnativecommunity.webview.b mWebViewConfig;

    /* loaded from: classes.dex */
    class a implements com.reactnativecommunity.webview.b {
        a(RNCWebViewManager rNCWebViewManager) {
        }

        @Override // com.reactnativecommunity.webview.b
        public void a(WebView webView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f9808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0 f9809b;

        b(RNCWebViewManager rNCWebViewManager, f fVar, k0 k0Var) {
            this.f9808a = fVar;
            this.f9809b = k0Var;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.f9808a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f9809b);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            String guessFileName = URLUtil.guessFileName(str, str3, str4);
            String str5 = "Downloading " + guessFileName;
            try {
                URL url = new URL(str);
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e2) {
                System.out.println("Error getting cookie for DownloadManager: " + e2.toString());
                e2.printStackTrace();
            }
            request.addRequestHeader("User-Agent", str2);
            request.setTitle(guessFileName);
            request.setDescription(str5);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
            module.setDownloadRequest(request);
            if (module.grantFileDownloaderPermissions()) {
                module.downloadFile();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends e {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f9810h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView, int i) {
            super(reactContext, webView);
            this.f9810h = i;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            View view = this.f9814d;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            a().removeView(this.f9814d);
            this.f9815e.onCustomViewHidden();
            this.f9814d = null;
            this.f9815e = null;
            this.f9813c.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f9812b.getCurrentActivity().getWindow().clearFlags(512);
            }
            this.f9812b.getCurrentActivity().setRequestedOrientation(this.f9810h);
            this.f9812b.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f9814d != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f9814d = view;
            this.f9815e = customViewCallback;
            this.f9812b.getCurrentActivity().setRequestedOrientation(-1);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f9814d.setSystemUiVisibility(7942);
                this.f9812b.getCurrentActivity().getWindow().setFlags(512, 512);
            }
            this.f9814d.setBackgroundColor(-16777216);
            a().addView(this.f9814d, e.f9811g);
            this.f9813c.setVisibility(8);
            this.f9812b.addLifecycleEventListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends e {
        d(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class e extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: g  reason: collision with root package name */
        protected static final FrameLayout.LayoutParams f9811g = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: b  reason: collision with root package name */
        protected ReactContext f9812b;

        /* renamed from: c  reason: collision with root package name */
        protected View f9813c;

        /* renamed from: d  reason: collision with root package name */
        protected View f9814d;

        /* renamed from: e  reason: collision with root package name */
        protected WebChromeClient.CustomViewCallback f9815e;

        /* renamed from: f  reason: collision with root package name */
        protected f.b f9816f = null;

        public e(ReactContext reactContext, WebView webView) {
            this.f9812b = reactContext;
            this.f9813c = webView;
        }

        protected ViewGroup a() {
            return (ViewGroup) this.f9812b.getCurrentActivity().findViewById(16908290);
        }

        public void a(f.b bVar) {
            this.f9816f = bVar;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT < 19 || (view = this.f9814d) == null || view.getSystemUiVisibility() == 7942) {
                return;
            }
            this.f9814d.setSystemUiVisibility(7942);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String[] resources = permissionRequest.getResources();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < resources.length; i++) {
                if (resources[i].equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                } else if (resources[i].equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (a.g.e.b.a(this.f9812b, (String) arrayList.get(i2)) == 0) {
                    if (((String) arrayList.get(i2)).equals("android.permission.RECORD_AUDIO")) {
                        arrayList2.add("android.webkit.resource.AUDIO_CAPTURE");
                    } else if (((String) arrayList.get(i2)).equals("android.permission.CAMERA")) {
                        arrayList2.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                permissionRequest.deny();
            } else {
                permissionRequest.grant((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (this.f9816f.a()) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("title", webView.getTitle());
            createMap.putString("url", url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble("progress", i / 100.0f);
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.d(webView.getId(), createMap));
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.f9812b).startPhotoPickerIntent(valueCallback, acceptTypes, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class f extends WebView implements LifecycleEventListener {

        /* renamed from: b  reason: collision with root package name */
        protected String f9817b;

        /* renamed from: c  reason: collision with root package name */
        protected String f9818c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f9819d;

        /* renamed from: e  reason: collision with root package name */
        protected String f9820e;

        /* renamed from: f  reason: collision with root package name */
        protected g f9821f;

        /* renamed from: g  reason: collision with root package name */
        protected CatalystInstance f9822g;

        /* renamed from: h  reason: collision with root package name */
        protected boolean f9823h;
        private com.facebook.react.views.scroll.b i;
        protected boolean j;
        protected b k;
        WebChromeClient l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ WebView f9824b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f9825c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f9826d;

            a(WebView webView, String str, f fVar) {
                this.f9824b = webView;
                this.f9825c = str;
                this.f9826d = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = f.this.f9821f;
                if (gVar == null) {
                    return;
                }
                WebView webView = this.f9824b;
                WritableMap a2 = gVar.a(webView, webView.getUrl());
                a2.putString("data", this.f9825c);
                if (f.this.f9822g != null) {
                    this.f9826d.a(a2);
                    return;
                }
                WebView webView2 = this.f9824b;
                RNCWebViewManager.dispatchEvent(webView2, new com.reactnativecommunity.webview.c.f(webView2.getId(), a2));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            private boolean f9828a = false;

            protected b() {
            }

            public void a(boolean z) {
                this.f9828a = z;
            }

            public boolean a() {
                return this.f9828a;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public class c {

            /* renamed from: a  reason: collision with root package name */
            f f9829a;

            c(f fVar, f fVar2) {
                this.f9829a = fVar2;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f9829a.b(str);
            }
        }

        public f(k0 k0Var) {
            super(k0Var);
            this.f9819d = false;
            this.f9823h = false;
            this.j = false;
            this.k = new b();
        }

        protected c a(f fVar) {
            return new c(this, fVar);
        }

        public void a() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f9817b) == null || TextUtils.isEmpty(str)) {
                return;
            }
            a("(function() {\n" + this.f9817b + ";\n})();");
        }

        protected void a(WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.f9822g.callFunction(this.f9820e, "onMessage", writableNativeArray);
        }

        protected void a(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, RNCWebViewManager.HTML_ENCODING));
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void b() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.f9818c) == null || TextUtils.isEmpty(str)) {
                return;
            }
            a("(function() {\n" + this.f9818c + ";\n})();");
        }

        public void b(String str) {
            ReactContext reactContext = (ReactContext) getContext();
            if (this.f9821f != null) {
                post(new a(this, str, this));
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            if (this.f9822g != null) {
                a(createMap);
            } else {
                RNCWebViewManager.dispatchEvent(this, new com.reactnativecommunity.webview.c.f(getId(), createMap));
            }
        }

        protected void c() {
            setWebViewClient(null);
            destroy();
        }

        protected void d() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.f9822g = reactContext.getCatalystInstance();
            }
        }

        @Override // android.webkit.WebView
        public void destroy() {
            WebChromeClient webChromeClient = this.l;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        public g getRNCWebViewClient() {
            return this.f9821f;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            c();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (!this.j) {
                return;
            }
            if (this.i == null) {
                this.i = new com.facebook.react.views.scroll.b();
            }
            if (!this.i.a(i, i2)) {
                return;
            }
            RNCWebViewManager.dispatchEvent(this, h.b(getId(), i.SCROLL, i, i2, this.i.a(), this.i.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.f9823h) {
                RNCWebViewManager.dispatchEvent(this, new com.facebook.react.uimanager.events.b(getId(), i, i2));
            }
        }

        public void setHasScrollEvent(boolean z) {
            this.j = z;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.f9821f.a(str);
        }

        public void setInjectedJavaScript(String str) {
            this.f9817b = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f9818c = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z) {
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z) {
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.f9819d == z) {
                return;
            }
            this.f9819d = z;
            if (!z) {
                removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
                return;
            }
            addJavascriptInterface(a(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
            d();
        }

        public void setMessagingModuleName(String str) {
            this.f9820e = str;
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.f9823h = z;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.l = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof e) {
                ((e) webChromeClient).a(this.k);
            }
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof g) {
                this.f9821f = (g) webViewClient;
                this.f9821f.a(this.k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class g extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f9830a = false;

        /* renamed from: b  reason: collision with root package name */
        protected f.b f9831b = null;

        /* renamed from: c  reason: collision with root package name */
        protected String f9832c = null;

        protected g() {
        }

        protected WritableMap a(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", webView.getId());
            createMap.putString("url", str);
            createMap.putBoolean("loading", !this.f9830a && webView.getProgress() != 100);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public void a(ReadableArray readableArray) {
        }

        public void a(f.b bVar) {
            this.f9831b = bVar;
        }

        public void a(String str) {
            this.f9832c = str;
        }

        protected void b(WebView webView, String str) {
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.c(webView.getId(), a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f9830a) {
                ((f) webView).a();
                b(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f9830a = false;
            ((f) webView).b();
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.e(webView.getId(), a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = this.f9832c;
            if (str3 != null && str2.equals(str3) && i == -1 && str.equals("net::ERR_FAILED")) {
                a((String) null);
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            this.f9830a = true;
            b(webView, str2);
            WritableMap a2 = a(webView, str2);
            a2.putDouble("code", i);
            a2.putString("description", str);
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.b(webView.getId(), a2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap a2 = a(webView, webResourceRequest.getUrl().toString());
                a2.putInt("statusCode", webResourceResponse.getStatusCode());
                a2.putString("description", webResourceResponse.getReasonPhrase());
                RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.a(webView.getId(), a2));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            int primaryError = sslError.getPrimaryError();
            String url = sslError.getUrl();
            String str = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
            onReceivedError(webView, primaryError, "SSL error: " + str, url);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            if (renderProcessGoneDetail.didCrash()) {
                Log.e("RNCWebViewManager", "The WebView rendering process crashed.");
            } else {
                Log.w("RNCWebViewManager", "The WebView rendering process was killed by the system.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap a2 = a(webView, webView.getUrl());
            a2.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.g(webView.getId(), a2));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f9831b.a(true);
            RNCWebViewManager.dispatchEvent(webView, new com.reactnativecommunity.webview.c.h(webView.getId(), a(webView, str)));
            return true;
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = new a(this);
    }

    public RNCWebViewManager(com.reactnativecommunity.webview.b bVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mWebViewConfig = bVar;
    }

    protected static void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.c cVar) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(cVar);
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, WebView webView) {
        webView.setWebViewClient(new g());
    }

    protected f createRNCWebViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public WebView mo345createViewInstance(k0 k0Var) {
        f createRNCWebViewInstance = createRNCWebViewInstance(k0Var);
        setupWebChromeClient(k0Var, createRNCWebViewInstance);
        k0Var.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, "never");
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new b(this, createRNCWebViewInstance, k0Var));
        return createRNCWebViewInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("goBack", 1);
        a2.a("goForward", 2);
        a2.a("reload", 3);
        a2.a("stopLoading", 4);
        a2.a("postMessage", 5);
        a2.a("injectJavaScript", 6);
        a2.a("loadUrl", 7);
        a2.a("requestFocus", 8);
        a2.a("clearFormData", Integer.valueOf((int) COMMAND_CLEAR_FORM_DATA));
        a2.a("clearCache", Integer.valueOf((int) COMMAND_CLEAR_CACHE));
        a2.a("clearHistory", Integer.valueOf((int) COMMAND_CLEAR_HISTORY));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = com.facebook.react.common.f.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", com.facebook.react.common.f.a("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", com.facebook.react.common.f.a("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(i.a(i.SCROLL), com.facebook.react.common.f.a("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", com.facebook.react.common.f.a("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", com.facebook.react.common.f.a("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((RNCWebViewManager) webView);
        f fVar = (f) webView;
        ((k0) webView.getContext()).removeLifecycleEventListener(fVar);
        fVar.c();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, ReadableArray readableArray) {
        boolean z = false;
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((f) webView).a("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                ((f) webView).a(readableArray.getString(0));
                return;
            case 7:
                if (readableArray == null) {
                    throw new RuntimeException("Arguments for loading an url are null!");
                }
                ((f) webView).k.a(false);
                webView.loadUrl(readableArray.getString(0));
                return;
            case 8:
                webView.requestFocus();
                return;
            default:
                switch (i) {
                    case COMMAND_CLEAR_FORM_DATA /* 1000 */:
                        webView.clearFormData();
                        return;
                    case COMMAND_CLEAR_CACHE /* 1001 */:
                        if (readableArray != null && readableArray.getBoolean(0)) {
                            z = true;
                        }
                        webView.clearCache(z);
                        return;
                    case COMMAND_CLEAR_HISTORY /* 1002 */:
                        webView.clearHistory();
                        return;
                    default:
                        return;
                }
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @com.facebook.react.uimanager.e1.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        String str2;
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                str2 = WebSettings.getDefaultUserAgent(webView.getContext()) + " " + str;
            }
            setUserAgentString(webView);
        }
        str2 = null;
        this.mUserAgentWithApplicationName = str2;
        setUserAgentString(webView);
    }

    @com.facebook.react.uimanager.e1.a(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z) {
        WebSettings settings;
        boolean z2;
        if (z) {
            Context context = webView.getContext();
            if (context == null) {
                return;
            }
            webView.getSettings().setAppCachePath(context.getCacheDir().getAbsolutePath());
            webView.getSettings().setCacheMode(-1);
            settings = webView.getSettings();
            z2 = true;
        } else {
            webView.getSettings().setCacheMode(2);
            settings = webView.getSettings();
            z2 = false;
        }
        settings.setAppCacheEnabled(z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @com.facebook.react.uimanager.e1.a(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        char c2;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        webView.getSettings().setCacheMode((c2 != 0 ? c2 != 1 ? c2 != 2 ? -1 : 2 : 1 : 3).intValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z) {
        if (z) {
            webView.setLayerType(1, null);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "incognito")
    public void setIncognito(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
        webView.getSettings().setCacheMode(2);
        webView.getSettings().setAppCacheEnabled(!z);
        webView.clearHistory();
        webView.clearCache(z);
        webView.clearFormData();
        webView.getSettings().setSavePassword(!z);
        webView.getSettings().setSaveFormData(!z);
    }

    @com.facebook.react.uimanager.e1.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((f) webView).setInjectedJavaScript(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, String str) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView webView, boolean z) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(WebView webView, boolean z) {
        ((f) webView).setInjectedJavaScriptForMainFrameOnly(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((f) webView).setMessagingEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "messagingModuleName")
    public void setMessagingModuleName(WebView webView, String str) {
        ((f) webView).setMessagingModuleName(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        WebSettings settings;
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                settings = webView.getSettings();
                i = 1;
            } else if ("always".equals(str)) {
                settings = webView.getSettings();
                i = 0;
            } else if (!"compatibility".equals(str)) {
                return;
            } else {
                settings = webView.getSettings();
                i = 2;
            }
            settings.setMixedContentMode(i);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        ((f) webView).setSendContentSizeChangeEvents(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z) {
        ((f) webView).setHasScrollEvent(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "overScrollMode")
    public void setOverScrollMode(WebView webView, String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == -1414557169) {
            if (str.equals("always")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 104712844) {
            if (hashCode == 951530617 && str.equals("content")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("never")) {
                c2 = 0;
            }
            c2 = 65535;
        }
        webView.setOverScrollMode((c2 != 0 ? c2 != 1 ? 0 : 1 : 2).intValue());
    }

    @com.facebook.react.uimanager.e1.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @com.facebook.react.uimanager.e1.a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setLoadWithOverviewMode(z);
        webView.getSettings().setUseWideViewPort(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z) {
        webView.setHorizontalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z) {
        webView.setVerticalScrollBarEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString("html"), HTML_MIME_TYPE, HTML_ENCODING, null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url != null && url.equals(string)) {
                    return;
                }
                if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                    byte[] bArr = null;
                    if (readableMap.hasKey("body")) {
                        String string2 = readableMap.getString("body");
                        try {
                            bArr = string2.getBytes(HTML_ENCODING);
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string2.getBytes();
                        }
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    webView.postUrl(string, bArr);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (readableMap.hasKey("headers")) {
                    ReadableMap mo210getMap = readableMap.mo210getMap("headers");
                    ReadableMapKeySetIterator keySetIterator = mo210getMap.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                            hashMap.put(nextKey, mo210getMap.getString(nextKey));
                        } else if (webView.getSettings() != null) {
                            webView.getSettings().setUserAgentString(mo210getMap.getString(nextKey));
                        }
                    }
                }
                webView.loadUrl(string, hashMap);
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @com.facebook.react.uimanager.e1.a(name = "textZoom")
    public void setTextZoom(WebView webView, int i) {
        webView.getSettings().setTextZoom(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        g rNCWebViewClient = ((f) webView).getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.a(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str == null) {
            str = null;
        }
        this.mUserAgent = str;
        setUserAgentString(webView);
    }

    protected void setUserAgentString(WebView webView) {
        WebSettings settings;
        String str;
        if (this.mUserAgent != null) {
            settings = webView.getSettings();
            str = this.mUserAgent;
        } else if (this.mUserAgentWithApplicationName == null) {
            if (Build.VERSION.SDK_INT < 17) {
                return;
            }
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
            return;
        } else {
            settings = webView.getSettings();
            str = this.mUserAgentWithApplicationName;
        }
        settings.setUserAgentString(str);
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        if (this.mAllowsFullscreenVideo) {
            this.mWebChromeClient = new c(this, reactContext, webView, reactContext.getCurrentActivity().getRequestedOrientation());
        } else {
            e eVar = this.mWebChromeClient;
            if (eVar != null) {
                eVar.onHideCustomView();
            }
            this.mWebChromeClient = new d(this, reactContext, webView);
        }
        webView.setWebChromeClient(this.mWebChromeClient);
    }
}

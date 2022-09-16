package com.facebook.react.views.webview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.b.f;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.x;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.facebook.react.views.webview.a.c;
import com.facebook.react.views.webview.a.d;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.CrashUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ReactWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    protected static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String REACT_CLASS = "RCTWebView";
    protected WebView.PictureListener mPictureListener;
    protected com.facebook.react.views.webview.a mWebViewConfig;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f4213a = false;

        /* renamed from: b  reason: collision with root package name */
        protected am f4214b;

        protected b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f4213a) {
                a aVar = (a) webView;
                aVar.a();
                aVar.b();
                a(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f4213a = false;
            ReactWebViewManager.dispatchEvent(webView, new c(webView.getId(), b(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z;
            if (this.f4214b != null && this.f4214b.size() > 0) {
                Iterator<Object> it = this.f4214b.a().iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z || (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file://") && !str.equals(ReactWebViewManager.BLANK_URL))) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(CrashUtils.ErrorDialogData.BINDER_CRASH);
                    webView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    com.facebook.common.e.a.a("ReactNative", "activity not found to handle uri scheme for: " + str, e);
                }
                return true;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f4213a = true;
            a(webView, str2);
            ar b2 = b(webView, str2);
            b2.putDouble("code", i);
            b2.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new com.facebook.react.views.webview.a.a(webView.getId(), b2));
        }

        protected void a(WebView webView, String str) {
            ReactWebViewManager.dispatchEvent(webView, new com.facebook.react.views.webview.a.b(webView.getId(), b(webView, str)));
        }

        protected ar b(WebView webView, String str) {
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putDouble("target", webView.getId());
            b2.putString(ImagesContract.URL, str);
            b2.putBoolean("loading", !this.f4213a && webView.getProgress() != 100);
            b2.putString("title", webView.getTitle());
            b2.putBoolean("canGoBack", webView.canGoBack());
            b2.putBoolean("canGoForward", webView.canGoForward());
            return b2;
        }

        public void a(am amVar) {
            this.f4214b = amVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class a extends WebView implements x {

        /* renamed from: a  reason: collision with root package name */
        protected String f4208a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f4209b;

        /* renamed from: c  reason: collision with root package name */
        protected b f4210c;

        @Override // com.facebook.react.bridge.x
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.x
        public void onHostResume() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: com.facebook.react.views.webview.ReactWebViewManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0075a {

            /* renamed from: a  reason: collision with root package name */
            a f4211a;

            C0075a(a aVar) {
                this.f4211a = aVar;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f4211a.a(str);
            }
        }

        public a(af afVar) {
            super(afVar);
            this.f4209b = false;
        }

        @Override // com.facebook.react.bridge.x
        public void onHostDestroy() {
            c();
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f4210c = (b) webViewClient;
        }

        public b getReactWebViewClient() {
            return this.f4210c;
        }

        public void setInjectedJavaScript(String str) {
            this.f4208a = str;
        }

        protected C0075a a(a aVar) {
            return new C0075a(aVar);
        }

        public void setMessagingEnabled(boolean z) {
            if (this.f4209b == z) {
                return;
            }
            this.f4209b = z;
            if (z) {
                addJavascriptInterface(a(this), ReactWebViewManager.BRIDGE_NAME);
                b();
                return;
            }
            removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
        }

        public void a() {
            if (!getSettings().getJavaScriptEnabled() || this.f4208a == null || TextUtils.isEmpty(this.f4208a)) {
                return;
            }
            loadUrl("javascript:(function() {\n" + this.f4208a + ";\n})();");
        }

        public void b() {
            if (this.f4209b) {
                loadUrl("javascript:(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
        }

        public void a(String str) {
            ReactWebViewManager.dispatchEvent(this, new d(getId(), str));
        }

        protected void c() {
            setWebViewClient(null);
            destroy();
        }
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new com.facebook.react.views.webview.a() { // from class: com.facebook.react.views.webview.ReactWebViewManager.1
            @Override // com.facebook.react.views.webview.a
            public void a(WebView webView) {
            }
        };
    }

    public ReactWebViewManager(com.facebook.react.views.webview.a aVar) {
        this.mWebViewConfig = aVar;
    }

    protected a createReactWebViewInstance(af afVar) {
        return new a(afVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public WebView mo170createViewInstance(af afVar) {
        a createReactWebViewInstance = createReactWebViewInstance(afVar);
        createReactWebViewInstance.setWebChromeClient(new WebChromeClient() { // from class: com.facebook.react.views.webview.ReactWebViewManager.2
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                callback.invoke(str, true, false);
            }
        });
        afVar.a(createReactWebViewInstance);
        this.mWebViewConfig.a(createReactWebViewInstance);
        createReactWebViewInstance.getSettings().setBuiltInZoomControls(true);
        createReactWebViewInstance.getSettings().setDisplayZoomControls(false);
        createReactWebViewInstance.getSettings().setDomStorageEnabled(true);
        createReactWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return createReactWebViewInstance;
    }

    @com.facebook.react.uimanager.a.a(a = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @com.facebook.react.uimanager.a.a(a = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @com.facebook.react.uimanager.a.a(a = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @com.facebook.react.uimanager.a.a(a = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @com.facebook.react.uimanager.a.a(a = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((a) webView).setInjectedJavaScript(str);
    }

    @com.facebook.react.uimanager.a.a(a = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((a) webView).setMessagingEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "source")
    public void setSource(WebView webView, an anVar) {
        if (anVar != null) {
            if (anVar.hasKey("html")) {
                String string = anVar.getString("html");
                if (anVar.hasKey("baseUrl")) {
                    webView.loadDataWithBaseURL(anVar.getString("baseUrl"), string, HTML_MIME_TYPE, HTML_ENCODING, null);
                    return;
                } else {
                    webView.loadData(string, HTML_MIME_TYPE, HTML_ENCODING);
                    return;
                }
            } else if (anVar.hasKey("uri")) {
                String string2 = anVar.getString("uri");
                String url = webView.getUrl();
                if (url != null && url.equals(string2)) {
                    return;
                }
                if (anVar.hasKey("method") && anVar.getString("method").equals(HTTP_METHOD_POST)) {
                    byte[] bArr = null;
                    if (anVar.hasKey("body")) {
                        String string3 = anVar.getString("body");
                        try {
                            bArr = string3.getBytes(HTML_ENCODING);
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string3.getBytes();
                        }
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    webView.postUrl(string2, bArr);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (anVar.hasKey("headers")) {
                    an d2 = anVar.d("headers");
                    ReadableMapKeySetIterator a2 = d2.a();
                    while (a2.hasNextKey()) {
                        String nextKey = a2.nextKey();
                        if ("user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                            if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(d2.getString(nextKey));
                            }
                        } else {
                            hashMap.put(nextKey, d2.getString(nextKey));
                        }
                    }
                }
                webView.loadUrl(string2, hashMap);
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @com.facebook.react.uimanager.a.a(a = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        if (z) {
            webView.setPictureListener(getPictureListener());
        } else {
            webView.setPictureListener(null);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                webView.getSettings().setMixedContentMode(1);
            } else if ("always".equals(str)) {
                webView.getSettings().setMixedContentMode(0);
            } else if (!"compatibility".equals(str)) {
            } else {
                webView.getSettings().setMixedContentMode(2);
            }
        }
    }

    @com.facebook.react.uimanager.a.a(a = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, am amVar) {
        b reactWebViewClient = ((a) webView).getReactWebViewClient();
        if (reactWebViewClient == null || amVar == null) {
            return;
        }
        reactWebViewClient.a(amVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(af afVar, WebView webView) {
        webView.setWebViewClient(new b());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("goBack", 1, "goForward", 2, "reload", 3, "stopLoading", 4, "postMessage", 5, "injectJavaScript", 6);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, int i, am amVar) {
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
                    jSONObject.put(DataBufferSafeParcelable.DATA_FIELD, amVar.getString(0));
                    webView.loadUrl("javascript:(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 6:
                webView.loadUrl("javascript:" + amVar.getString(0));
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((ReactWebViewManager) webView);
        a aVar = (a) webView;
        ((af) webView.getContext()).b(aVar);
        aVar.c();
    }

    protected WebView.PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new WebView.PictureListener() { // from class: com.facebook.react.views.webview.ReactWebViewManager.3
                @Override // android.webkit.WebView.PictureListener
                public void onNewPicture(WebView webView, Picture picture) {
                    ReactWebViewManager.dispatchEvent(webView, new com.facebook.react.uimanager.events.a(webView.getId(), webView.getWidth(), webView.getContentHeight()));
                }
            };
        }
        return this.mPictureListener;
    }

    protected static void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.b bVar) {
        ((UIManagerModule) ((aj) webView.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(bVar);
    }
}

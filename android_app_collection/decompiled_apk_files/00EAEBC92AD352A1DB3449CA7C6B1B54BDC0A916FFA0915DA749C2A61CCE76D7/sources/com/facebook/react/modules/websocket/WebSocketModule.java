package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import com.horcrux.svg.BuildConfig;
import h.f;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
@com.facebook.react.d0.a.a(hasConstants = BuildConfig.DEBUG, name = "WebSocketModule")
/* loaded from: classes.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final String NAME = "WebSocketModule";
    public static final String TAG = "WebSocketModule";
    private final Map<Integer, b> mContentHandlers;
    private c mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* loaded from: classes.dex */
    class a extends WebSocketListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5799a;

        a(int i) {
            this.f5799a = i;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f5799a);
            createMap.putInt("code", i);
            createMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            webSocket.close(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            WebSocketModule.this.notifyWebSocketFailed(this.f5799a, th.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, f fVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f5799a);
            createMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f5799a));
            if (bVar != null) {
                bVar.a(fVar, createMap);
            } else {
                createMap.putString("data", fVar.a());
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f5799a);
            createMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f5799a));
            if (bVar != null) {
                bVar.a(str, createMap);
            } else {
                createMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f5799a), webSocket);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f5799a);
            createMap.putString("protocol", response.header("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", createMap);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(f fVar, WritableMap writableMap);

        void a(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new c(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: URISyntaxException -> 0x00b8, TryCatch #0 {URISyntaxException -> 0x00b8, blocks: (B:2:0x0000, B:12:0x002c, B:34:0x0086, B:36:0x008c, B:37:0x00a7, B:30:0x005a, B:31:0x0069, B:32:0x006e, B:33:0x007a, B:15:0x0034, B:18:0x003c, B:21:0x0046), top: B:41:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[Catch: URISyntaxException -> 0x00b8, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x00b8, blocks: (B:2:0x0000, B:12:0x002c, B:34:0x0086, B:36:0x008c, B:37:0x00a7, B:30:0x005a, B:31:0x0069, B:32:0x006e, B:33:0x007a, B:15:0x0034, B:18:0x003c, B:21:0x0046), top: B:41:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r12) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> Lb8
            r1.<init>(r12)     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> Lb8
            int r3 = r2.hashCode()     // Catch: java.net.URISyntaxException -> Lb8
            r4 = 3804(0xedc, float:5.33E-42)
            java.lang.String r5 = "https"
            java.lang.String r6 = "http"
            r7 = -1
            r8 = 0
            r9 = 3
            r10 = 2
            r11 = 1
            if (r3 == r4) goto L46
            r4 = 118039(0x1cd17, float:1.65408E-40)
            if (r3 == r4) goto L3c
            r4 = 3213448(0x310888, float:4.503E-39)
            if (r3 == r4) goto L34
            r4 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r4) goto L2c
            goto L50
        L2c:
            boolean r2 = r2.equals(r5)     // Catch: java.net.URISyntaxException -> Lb8
            if (r2 == 0) goto L50
            r2 = 3
            goto L51
        L34:
            boolean r2 = r2.equals(r6)     // Catch: java.net.URISyntaxException -> Lb8
            if (r2 == 0) goto L50
            r2 = 2
            goto L51
        L3c:
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lb8
            if (r2 == 0) goto L50
            r2 = 0
            goto L51
        L46:
            java.lang.String r3 = "ws"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lb8
            if (r2 == 0) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = -1
        L51:
            if (r2 == 0) goto L7a
            if (r2 == r11) goto L6e
            if (r2 == r10) goto L5a
            if (r2 == r9) goto L5a
            goto L86
        L5a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lb8
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r0 = r1.getScheme()     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lb8
        L69:
            java.lang.String r0 = r2.toString()     // Catch: java.net.URISyntaxException -> Lb8
            goto L86
        L6e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lb8
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r6)     // Catch: java.net.URISyntaxException -> Lb8
            goto L69
        L7a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lb8
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lb8
            r2.append(r5)     // Catch: java.net.URISyntaxException -> Lb8
            goto L69
        L86:
            int r2 = r1.getPort()     // Catch: java.net.URISyntaxException -> Lb8
            if (r2 == r7) goto La7
            java.lang.String r2 = "%s://%s:%s"
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch: java.net.URISyntaxException -> Lb8
            r3[r8] = r0     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> Lb8
            r3[r11] = r0     // Catch: java.net.URISyntaxException -> Lb8
            int r0 = r1.getPort()     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.net.URISyntaxException -> Lb8
            r3[r10] = r0     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r12 = java.lang.String.format(r2, r3)     // Catch: java.net.URISyntaxException -> Lb8
            goto Lb7
        La7:
            java.lang.String r2 = "%s://%s"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch: java.net.URISyntaxException -> Lb8
            r3[r8] = r0     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> Lb8
            r3[r11] = r0     // Catch: java.net.URISyntaxException -> Lb8
            java.lang.String r12 = java.lang.String.format(r2, r3)     // Catch: java.net.URISyntaxException -> Lb8
        Lb7:
            return r12
        Lb8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to set "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = " as default origin header"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d2, String str, double d3) {
        int i = (int) d3;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d2, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
        } catch (Exception e2) {
            c.d.d.e.a.b("ReactNative", "Could not close WebSocket connection for id " + i, e2);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d2) {
        int i = (int) d2;
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader("Cookie", cookie);
        }
        if (readableMap == null || !readableMap.hasKey("headers") || !readableMap.getType("headers").equals(ReadableType.Map)) {
            url.addHeader("origin", getDefaultOrigin(str));
        } else {
            ReadableMap mo210getMap = readableMap.mo210getMap("headers");
            ReadableMapKeySetIterator keySetIterator = mo210getMap.keySetIterator();
            if (!mo210getMap.hasKey("origin")) {
                url.addHeader("origin", getDefaultOrigin(str));
            }
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(mo210getMap.getType(nextKey))) {
                    url.addHeader(nextKey, mo210getMap.getString(nextKey));
                } else {
                    c.d.d.e.a.d("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb.append(trim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                url.addHeader("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        build.newWebSocket(url.build(), new a(i));
        build.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(f.f10145f);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d2) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(str);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void sendBinary(f fVar, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(fVar);
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(f.a(str));
                return;
            } catch (Exception e2) {
                notifyWebSocketFailed(i, e2.getMessage());
                return;
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", "client is null");
        sendEvent("websocketFailed", createMap);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("id", i);
        createMap2.putInt("code", 0);
        createMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", createMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void setContentHandler(int i, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }
}

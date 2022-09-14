package com.facebook.react.modules.websocket;

import c.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.b;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public final class WebSocketModule extends ReactContextBaseJavaModule {
    private final Map<Integer, a> mContentHandlers;
    private b mCookieHandler;
    private aj mReactContext;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* loaded from: classes.dex */
    public interface a {
        void a(f fVar, ar arVar);

        void a(String str, ar arVar);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    public WebSocketModule(ah ahVar) {
        super(ahVar);
        this.mWebSocketConnections = new HashMap();
        this.mContentHandlers = new HashMap();
        this.mReactContext = ahVar;
        this.mCookieHandler = new b(ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, ar arVar) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, arVar);
    }

    public void setContentHandler(int i, a aVar) {
        if (aVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), aVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    @al
    public void connect(String str, am amVar, an anVar, final int i) {
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader("Cookie", cookie);
        }
        if (anVar != null && anVar.hasKey("headers") && anVar.getType("headers").equals(ReadableType.Map)) {
            an d2 = anVar.d("headers");
            ReadableMapKeySetIterator a2 = d2.a();
            if (!d2.hasKey("origin")) {
                url.addHeader("origin", getDefaultOrigin(str));
            }
            while (a2.hasNextKey()) {
                String nextKey = a2.nextKey();
                if (ReadableType.String.equals(d2.getType(nextKey))) {
                    url.addHeader(nextKey, d2.getString(nextKey));
                } else {
                    com.facebook.common.e.a.c("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            url.addHeader("origin", getDefaultOrigin(str));
        }
        if (amVar != null && amVar.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < amVar.size(); i2++) {
                String trim = amVar.getString(i2).trim();
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
        build.newWebSocket(url.build(), new WebSocketListener() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            @Override // okhttp3.WebSocketListener
            public void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putInt("id", i);
                WebSocketModule.this.sendEvent("websocketOpen", b2);
            }

            @Override // okhttp3.WebSocketListener
            public void onClosed(WebSocket webSocket, int i3, String str2) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putInt("id", i);
                b2.putInt("code", i3);
                b2.putString("reason", str2);
                WebSocketModule.this.sendEvent("websocketClosed", b2);
            }

            @Override // okhttp3.WebSocketListener
            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, String str2) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putInt("id", i);
                b2.putString("type", TextBundle.TEXT_ENTRY);
                a aVar = (a) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.a(str2, b2);
                } else {
                    b2.putString(DataBufferSafeParcelable.DATA_FIELD, str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", b2);
            }

            @Override // okhttp3.WebSocketListener
            public void onMessage(WebSocket webSocket, f fVar) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putInt("id", i);
                b2.putString("type", "binary");
                a aVar = (a) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.a(fVar, b2);
                } else {
                    b2.putString(DataBufferSafeParcelable.DATA_FIELD, fVar.b());
                }
                WebSocketModule.this.sendEvent("websocketMessage", b2);
            }
        });
        build.dispatcher().executorService().shutdown();
    }

    @al
    public void close(int i, String str, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close(i, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i2));
            this.mContentHandlers.remove(Integer.valueOf(i2));
        } catch (Exception e) {
            com.facebook.common.e.a.b("ReactNative", "Could not close WebSocket connection for id " + i2, e);
        }
    }

    @al
    public void send(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            throw new RuntimeException("Cannot send a message. Unknown WebSocket id " + i);
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @al
    public void sendBinary(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            throw new RuntimeException("Cannot send a message. Unknown WebSocket id " + i);
        }
        try {
            webSocket.send(f.b(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void sendBinary(f fVar, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            throw new RuntimeException("Cannot send a message. Unknown WebSocket id " + i);
        }
        try {
            webSocket.send(fVar);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @al
    public void ping(int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            throw new RuntimeException("Cannot send a message. Unknown WebSocket id " + i);
        }
        try {
            webSocket.send(f.f1286b);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("id", i);
        b2.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str);
        sendEvent("websocketFailed", b2);
    }

    private static String getDefaultOrigin(String str) {
        try {
            String str2 = "";
            URI uri = new URI(str);
            if (uri.getScheme().equals("wss")) {
                str2 = str2 + "https";
            } else if (uri.getScheme().equals("ws")) {
                str2 = str2 + "http";
            } else if (uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                str2 = str2 + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s/", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
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
}

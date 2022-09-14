package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
@com.facebook.react.d0.a.a(name = NetworkingModule.NAME)
/* loaded from: classes.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static e customClientBuilder;
    private final OkHttpClient mClient;
    private final com.facebook.react.modules.network.c mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<g> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<h> mUriHandlers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f5688b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5689c;

        /* renamed from: com.facebook.react.modules.network.NetworkingModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0129a implements com.facebook.react.modules.network.h {

            /* renamed from: a  reason: collision with root package name */
            long f5690a = System.nanoTime();

            C0129a() {
            }

            @Override // com.facebook.react.modules.network.h
            public void a(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(nanoTime, this.f5690a)) && !a.this.f5687a.equals("text")) {
                    a aVar = a.this;
                    n.a(aVar.f5688b, aVar.f5689c, j, j2);
                    this.f5690a = nanoTime;
                }
            }
        }

        a(NetworkingModule networkingModule, String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f5687a = str;
            this.f5688b = rCTDeviceEventEmitter;
            this.f5689c = i;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new j(proceed.body(), new C0129a())).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f5693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5695d;

        b(int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
            this.f5692a = i;
            this.f5693b = rCTDeviceEventEmitter;
            this.f5694c = str;
            this.f5695d = z;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String str;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f5692a);
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
            } else {
                str = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            n.a(this.f5693b, this.f5692a, str, iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f5692a);
            n.a(this.f5693b, this.f5692a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
            try {
                ResponseBody body = response.body();
                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                    h.j jVar = new h.j(body.source());
                    String header = response.header("Content-Type");
                    body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1L, h.l.a(jVar));
                }
                for (g gVar : NetworkingModule.this.mResponseHandlers) {
                    if (gVar.a(this.f5694c)) {
                        n.a(this.f5693b, this.f5692a, gVar.a(body));
                        n.a(this.f5693b, this.f5692a);
                        return;
                    }
                }
                if (this.f5695d && this.f5694c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f5693b, this.f5692a, body);
                    n.a(this.f5693b, this.f5692a);
                    return;
                }
                String str = "";
                if (this.f5694c.equals("text")) {
                    try {
                        str = body.string();
                    } catch (IOException e2) {
                        if (!response.request().method().equalsIgnoreCase("HEAD")) {
                            n.a(this.f5693b, this.f5692a, e2.getMessage(), e2);
                        }
                    }
                } else if (this.f5694c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    str = Base64.encodeToString(body.bytes(), 2);
                }
                n.a(this.f5693b, this.f5692a, str);
                n.a(this.f5693b, this.f5692a);
            } catch (IOException e3) {
                n.a(this.f5693b, this.f5692a, e3.getMessage(), e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements com.facebook.react.modules.network.h {

        /* renamed from: a  reason: collision with root package name */
        long f5697a = System.nanoTime();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f5698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5699c;

        c(NetworkingModule networkingModule, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f5698b = rCTDeviceEventEmitter;
            this.f5699c = i;
        }

        @Override // com.facebook.react.modules.network.h
        public void a(long j, long j2, boolean z) {
            long nanoTime = System.nanoTime();
            if (z || NetworkingModule.shouldDispatch(nanoTime, this.f5697a)) {
                n.b(this.f5698b, this.f5699c, j, j2);
                this.f5697a = nanoTime;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i) {
            super(reactContext);
            this.f5700a = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            com.facebook.react.common.j.a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f5700a));
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(OkHttpClient.Builder builder);
    }

    /* loaded from: classes.dex */
    public interface f {
        RequestBody a(ReadableMap readableMap, String str);

        boolean a(ReadableMap readableMap);
    }

    /* loaded from: classes.dex */
    public interface g {
        WritableMap a(ResponseBody responseBody);

        boolean a(String str);
    }

    /* loaded from: classes.dex */
    public interface h {
        WritableMap a(Uri uri);

        boolean a(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.a(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, com.facebook.react.modules.network.g.a(reactApplicationContext), null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<com.facebook.react.modules.network.e> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (com.facebook.react.modules.network.e eVar : list) {
                newBuilder.addNetworkInterceptor(eVar.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new com.facebook.react.modules.network.c(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<com.facebook.react.modules.network.e> list) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.a(reactApplicationContext), list);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        e eVar = customClientBuilder;
        if (eVar != null) {
            eVar.a(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i) {
        new d(getReactApplicationContext(), i).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        String str2;
        MediaType mediaType;
        RequestBody a2;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap mo209getMap = readableArray.mo209getMap(i2);
            Headers extractHeaders = extractHeaders(mo209getMap.getArray("headers"), null);
            if (extractHeaders == null) {
                str2 = "Missing or invalid header format for FormData part.";
            } else {
                String str3 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                if (str3 != null) {
                    mediaType = MediaType.parse(str3);
                    extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
                } else {
                    mediaType = null;
                }
                if (mo209getMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                    a2 = RequestBody.create(mediaType, mo209getMap.getString(REQUEST_BODY_KEY_STRING));
                } else if (!mo209getMap.hasKey(REQUEST_BODY_KEY_URI)) {
                    n.a(eventEmitter, i, "Unrecognized FormData part.", (Throwable) null);
                } else if (mediaType == null) {
                    str2 = "Binary FormData part needs a content-type header.";
                } else {
                    String string = mo209getMap.getString(REQUEST_BODY_KEY_URI);
                    InputStream a3 = m.a(getReactApplicationContext(), string);
                    if (a3 == null) {
                        str2 = "Could not retrieve file for uri " + string;
                    } else {
                        a2 = m.a(mediaType, a3);
                    }
                }
                builder.addPart(extractHeaders, a2);
            }
            n.a(eventEmitter, i, str2, (Throwable) null);
            return null;
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray mo208getArray = readableArray.mo208getArray(i);
            if (mo208getArray != null && mo208getArray.size() == 2) {
                String a2 = com.facebook.react.modules.network.d.a(mo208getArray.getString(0));
                String b2 = com.facebook.react.modules.network.d.b(mo208getArray.getString(1));
                if (a2 != null && b2 != null) {
                    builder.add(a2, b2);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        long j2 = -1;
        try {
            j jVar = (j) responseBody;
            j = jVar.a();
            try {
                j2 = jVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        k kVar = new k(responseBody.contentType() == null ? com.facebook.react.common.h.f5457a : responseBody.contentType().charset(com.facebook.react.common.h.f5457a));
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    return;
                }
                n.a(rCTDeviceEventEmitter, i, kVar.a(bArr, read), j, j2);
            }
        } finally {
            byteStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static void setCustomClientBuilder(e eVar) {
        customClientBuilder = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            bundle.putString(name, bundle.containsKey(name) ? bundle.getString(name) + ", " + headers.value(i) : headers.value(i));
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        if (requestBody == null) {
            return null;
        }
        return m.a(requestBody, new c(this, rCTDeviceEventEmitter, i));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d2) {
        int i = (int) d2;
        cancelRequest(i);
        removeRequest(i);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.a(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.a(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.a();
        this.mCookieJarContainer.a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d2) {
    }

    public void removeRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, double d3, boolean z2) {
        int i = (int) d2;
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, (int) d3, z2);
        } catch (Throwable th) {
            c.d.d.e.a.b(TAG, "Failed to send url request: " + str2, th);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter == null) {
                return;
            }
            n.a(eventEmitter, i, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        f fVar;
        RequestBody a2;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (h hVar : this.mUriHandlers) {
                if (hVar.a(parse, str3)) {
                    n.a(eventEmitter, i, hVar.a(parse));
                    n.a(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                applyCustomBuilder(newBuilder);
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new a(this, str3, eventEmitter, i));
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout(i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    n.a(eventEmitter, i, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String str4 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<f> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        fVar = it.next();
                        if (fVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap != null && !str.toLowerCase().equals("get") && !str.toLowerCase().equals("head")) {
                    if (fVar != null) {
                        a2 = fVar.a(readableMap, str4);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                        if (str4 == null) {
                            n.a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                        MediaType parse2 = MediaType.parse(str4);
                        if (m.b(str5)) {
                            a2 = m.a(parse2, string);
                            if (a2 == null) {
                                n.a(eventEmitter, i, "Failed to gzip request body", (Throwable) null);
                                return;
                            }
                        } else {
                            Charset charset = com.facebook.react.common.h.f5457a;
                            if (parse2 != null) {
                                charset = parse2.charset(charset);
                            }
                            a2 = RequestBody.create(parse2, string.getBytes(charset));
                        }
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                        if (str4 == null) {
                            n.a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        a2 = RequestBody.create(MediaType.parse(str4), h.f.a(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                        if (str4 == null) {
                            n.a(eventEmitter, i, "Payload is set but no content-type header specified", (Throwable) null);
                            return;
                        }
                        String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                        InputStream a3 = m.a(getReactApplicationContext(), string2);
                        if (a3 == null) {
                            n.a(eventEmitter, i, "Could not retrieve file for uri " + string2, (Throwable) null);
                            return;
                        }
                        a2 = m.a(MediaType.parse(str4), a3);
                    } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                        if (str4 == null) {
                            str4 = "multipart/form-data";
                        }
                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i);
                        if (constructMultipartBody == null) {
                            return;
                        }
                        a2 = constructMultipartBody.build();
                    }
                    url.method(str, wrapRequestBodyWithProgressEmitter(a2, eventEmitter, i));
                    addRequest(i);
                    build.newCall(url.build()).enqueue(new b(i, eventEmitter, str3, z));
                }
                a2 = m.a(str);
                url.method(str, wrapRequestBodyWithProgressEmitter(a2, eventEmitter, i));
                addRequest(i);
                build.newCall(url.build()).enqueue(new b(i, eventEmitter, str3, z));
            } catch (Exception e2) {
                n.a(eventEmitter, i, e2.getMessage(), (Throwable) null);
            }
        } catch (IOException e3) {
            n.a(eventEmitter, i, e3.getMessage(), e3);
        }
    }
}

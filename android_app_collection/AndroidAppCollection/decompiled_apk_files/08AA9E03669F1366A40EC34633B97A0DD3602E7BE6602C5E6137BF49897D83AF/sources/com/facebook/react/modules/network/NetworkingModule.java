package com.facebook.react.modules.network;

import android.util.Base64;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashSet;
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
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    protected static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private final OkHttpClient mClient;
    private final b mCookieHandler;
    private final a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final Set<Integer> mRequestIds;
    private boolean mShuttingDown;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    NetworkingModule(ah ahVar, String str, OkHttpClient okHttpClient, List<c> list) {
        super(ahVar);
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (c cVar : list) {
                newBuilder.addNetworkInterceptor(cVar.a());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new b(ahVar);
        this.mCookieJarContainer = (a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetworkingModule(ah ahVar, String str, OkHttpClient okHttpClient) {
        this(ahVar, str, okHttpClient, null);
    }

    public NetworkingModule(ah ahVar) {
        this(ahVar, null, e.a(), null);
    }

    public NetworkingModule(ah ahVar, List<c> list) {
        this(ahVar, null, e.a(), list);
    }

    public NetworkingModule(ah ahVar, String str) {
        this(ahVar, str, e.a(), null);
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
    }

    @al
    public void sendRequest(String str, String str2, final int i, am amVar, an anVar, String str3, final boolean z, int i2, boolean z2) {
        final String str4;
        Request.Builder url = new Request.Builder().url(str2);
        if (i != 0) {
            url.tag(Integer.valueOf(i));
        }
        final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
        if (!z2) {
            newBuilder.cookieJar(CookieJar.NO_COOKIES);
        }
        if (z) {
            str4 = str3;
            newBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule.1
                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) {
                    Response proceed = chain.proceed(chain.request());
                    return proceed.newBuilder().body(new h(proceed.body(), new f() { // from class: com.facebook.react.modules.network.NetworkingModule.1.1

                        /* renamed from: a  reason: collision with root package name */
                        long f3601a = System.nanoTime();

                        @Override // com.facebook.react.modules.network.f
                        public void a(long j, long j2, boolean z3) {
                            long nanoTime = System.nanoTime();
                            if ((z3 || NetworkingModule.shouldDispatch(nanoTime, this.f3601a)) && !str4.equals(TextBundle.TEXT_ENTRY)) {
                                k.b(eventEmitter, i, j, j2);
                                this.f3601a = nanoTime;
                            }
                        }
                    })).build();
                }
            });
        } else {
            str4 = str3;
        }
        if (i2 != this.mClient.connectTimeoutMillis()) {
            newBuilder.readTimeout(i2, TimeUnit.MILLISECONDS);
        }
        OkHttpClient build = newBuilder.build();
        Headers extractHeaders = extractHeaders(amVar, anVar);
        if (extractHeaders == null) {
            k.a(eventEmitter, i, "Unrecognized headers format", (IOException) null);
            return;
        }
        String str5 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
        String str6 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
        url.headers(extractHeaders);
        if (anVar == null) {
            url.method(str, j.b(str));
        } else if (anVar.hasKey(REQUEST_BODY_KEY_STRING)) {
            if (str5 == null) {
                k.a(eventEmitter, i, "Payload is set but no content-type header specified", (IOException) null);
                return;
            }
            String string = anVar.getString(REQUEST_BODY_KEY_STRING);
            MediaType parse = MediaType.parse(str5);
            if (j.a(str6)) {
                RequestBody a2 = j.a(parse, string);
                if (a2 == null) {
                    k.a(eventEmitter, i, "Failed to gzip request body", (IOException) null);
                    return;
                }
                url.method(str, a2);
            } else {
                url.method(str, RequestBody.create(parse, string));
            }
        } else if (anVar.hasKey(REQUEST_BODY_KEY_BASE64)) {
            if (str5 == null) {
                k.a(eventEmitter, i, "Payload is set but no content-type header specified", (IOException) null);
                return;
            } else {
                url.method(str, RequestBody.create(MediaType.parse(str5), c.f.b(anVar.getString(REQUEST_BODY_KEY_BASE64))));
            }
        } else if (anVar.hasKey(REQUEST_BODY_KEY_URI)) {
            if (str5 == null) {
                k.a(eventEmitter, i, "Payload is set but no content-type header specified", (IOException) null);
                return;
            }
            String string2 = anVar.getString(REQUEST_BODY_KEY_URI);
            InputStream a3 = j.a(getReactApplicationContext(), string2);
            if (a3 == null) {
                k.a(eventEmitter, i, "Could not retrieve file for uri " + string2, (IOException) null);
                return;
            }
            url.method(str, j.a(MediaType.parse(str5), a3));
        } else if (anVar.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
            if (str5 == null) {
                str5 = "multipart/form-data";
            }
            MultipartBody.Builder constructMultipartBody = constructMultipartBody(anVar.e(REQUEST_BODY_KEY_FORMDATA), str5, i);
            if (constructMultipartBody == null) {
                return;
            }
            url.method(str, j.a(constructMultipartBody.build(), new f() { // from class: com.facebook.react.modules.network.NetworkingModule.2

                /* renamed from: a  reason: collision with root package name */
                long f3603a = System.nanoTime();

                @Override // com.facebook.react.modules.network.f
                public void a(long j, long j2, boolean z3) {
                    long nanoTime = System.nanoTime();
                    if (z3 || NetworkingModule.shouldDispatch(nanoTime, this.f3603a)) {
                        k.a(eventEmitter, i, j, j2);
                        this.f3603a = nanoTime;
                    }
                }
            }));
        } else {
            url.method(str, j.b(str));
        }
        addRequest(i);
        final String str7 = str4;
        build.newCall(url.build()).enqueue(new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                String str8;
                if (NetworkingModule.this.mShuttingDown) {
                    return;
                }
                NetworkingModule.this.removeRequest(i);
                if (iOException.getMessage() != null) {
                    str8 = iOException.getMessage();
                } else {
                    str8 = "Error while executing request: " + iOException.getClass().getSimpleName();
                }
                k.a(eventEmitter, i, str8, iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (NetworkingModule.this.mShuttingDown) {
                    return;
                }
                NetworkingModule.this.removeRequest(i);
                k.a(eventEmitter, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                ResponseBody body = response.body();
                try {
                    if (z && str7.equals(TextBundle.TEXT_ENTRY)) {
                        NetworkingModule.this.readWithProgress(eventEmitter, i, body);
                        k.a(eventEmitter, i);
                        return;
                    }
                    String str8 = "";
                    if (str7.equals(TextBundle.TEXT_ENTRY)) {
                        try {
                            str8 = body.string();
                        } catch (IOException e) {
                            if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                k.a(eventEmitter, i, e.getMessage(), e);
                            }
                        }
                    } else if (str7.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                        str8 = Base64.encodeToString(body.bytes(), 2);
                    }
                    k.a(eventEmitter, i, str8);
                    k.a(eventEmitter, i);
                } catch (IOException e2) {
                    k.a(eventEmitter, i, e2.getMessage(), e2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        long j2 = -1;
        try {
            h hVar = (h) responseBody;
            j = hVar.a();
            try {
                j2 = hVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        Reader charStream = responseBody.charStream();
        try {
            char[] cArr = new char[8192];
            while (true) {
                int read = charStream.read(cArr);
                if (read == -1) {
                    return;
                }
                k.a(rCTDeviceEventEmitter, i, new String(cArr, 0, read), j, j2);
            }
        } finally {
            charStream.close();
        }
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ar translateHeaders(Headers headers) {
        ar b2 = com.facebook.react.bridge.b.b();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (b2.hasKey(name)) {
                b2.putString(name, b2.getString(name) + ", " + headers.value(i));
            } else {
                b2.putString(name, headers.value(i));
            }
        }
        return b2;
    }

    @al
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.network.NetworkingModule$4] */
    private void cancelRequest(final int i) {
        new com.facebook.react.bridge.j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                com.facebook.react.b.b.a.a(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    @al
    public void clearCookies(com.facebook.react.bridge.d dVar) {
        this.mCookieHandler.a(dVar);
    }

    private MultipartBody.Builder constructMultipartBody(am amVar, String str, int i) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = amVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            an c2 = amVar.c(i2);
            Headers extractHeaders = extractHeaders(c2.e("headers"), null);
            if (extractHeaders == null) {
                k.a(eventEmitter, i, "Missing or invalid header format for FormData part.", (IOException) null);
                return null;
            }
            String str2 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (c2.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, c2.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!c2.hasKey(REQUEST_BODY_KEY_URI)) {
                k.a(eventEmitter, i, "Unrecognized FormData part.", (IOException) null);
            } else if (mediaType == null) {
                k.a(eventEmitter, i, "Binary FormData part needs a content-type header.", (IOException) null);
                return null;
            } else {
                String string = c2.getString(REQUEST_BODY_KEY_URI);
                InputStream a2 = j.a(getReactApplicationContext(), string);
                if (a2 == null) {
                    k.a(eventEmitter, i, "Could not retrieve file for uri " + string, (IOException) null);
                    return null;
                }
                builder.addPart(extractHeaders, j.a(mediaType, a2));
            }
        }
        return builder;
    }

    private Headers extractHeaders(am amVar, an anVar) {
        if (amVar == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = amVar.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            am d2 = amVar.d(i);
            if (d2 == null || d2.size() != 2) {
                return null;
            }
            String string = d2.getString(0);
            String string2 = d2.getString(1);
            if (string == null || string2 == null) {
                return null;
            }
            builder.add(string, string2);
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && this.mDefaultUserAgent != null) {
            builder.add(USER_AGENT_HEADER_NAME, this.mDefaultUserAgent);
        }
        if (anVar != null && anVar.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }
}

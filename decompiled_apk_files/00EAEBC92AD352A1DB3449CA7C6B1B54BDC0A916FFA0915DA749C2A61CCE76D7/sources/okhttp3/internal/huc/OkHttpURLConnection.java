package okhttp3.internal.huc;

import h.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.URLFilter;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
/* loaded from: classes.dex */
public final class OkHttpURLConnection extends HttpURLConnection implements Callback {
    Call call;
    private Throwable callFailure;
    OkHttpClient client;
    boolean connectPending;
    private boolean executed;
    private long fixedContentLength;
    Handshake handshake;
    private final Object lock;
    private final NetworkInterceptor networkInterceptor;
    Response networkResponse;
    Proxy proxy;
    private Headers.Builder requestHeaders;
    private Response response;
    private Headers responseHeaders;
    URLFilter urlFilter;
    public static final String SELECTED_PROTOCOL = Platform.get().getPrefix() + "-Selected-Protocol";
    public static final String RESPONSE_SOURCE = Platform.get().getPrefix() + "-Response-Source";
    private static final Set<String> METHODS = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class NetworkInterceptor implements Interceptor {
        private boolean proceed;

        NetworkInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            URLFilter uRLFilter = OkHttpURLConnection.this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(request.url().url());
            }
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection.this.connectPending = false;
                OkHttpURLConnection.this.proxy = chain.connection().route().proxy();
                OkHttpURLConnection.this.handshake = chain.connection().handshake();
                OkHttpURLConnection.this.lock.notifyAll();
                while (!this.proceed) {
                    try {
                        OkHttpURLConnection.this.lock.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
            }
            if (request.body() instanceof OutputStreamRequestBody) {
                request = ((OutputStreamRequestBody) request.body()).prepareToSendRequest(request);
            }
            Response proceed = chain.proceed(request);
            synchronized (OkHttpURLConnection.this.lock) {
                OkHttpURLConnection.this.networkResponse = proceed;
                ((HttpURLConnection) OkHttpURLConnection.this).url = proceed.request().url().url();
            }
            return proceed;
        }

        public void proceed() {
            synchronized (OkHttpURLConnection.this.lock) {
                this.proceed = true;
                OkHttpURLConnection.this.lock.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class UnexpectedException extends IOException {
        static final Interceptor INTERCEPTOR = new Interceptor() { // from class: okhttp3.internal.huc.OkHttpURLConnection.UnexpectedException.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                try {
                    return chain.proceed(chain.request());
                } catch (Error | RuntimeException e2) {
                    throw new UnexpectedException(e2);
                }
            }
        };

        UnexpectedException(Throwable th) {
            super(th);
        }
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.networkInterceptor = new NetworkInterceptor();
        this.requestHeaders = new Headers.Builder();
        this.fixedContentLength = -1L;
        this.lock = new Object();
        this.connectPending = true;
        this.client = okHttpClient;
    }

    public OkHttpURLConnection(URL url, OkHttpClient okHttpClient, URLFilter uRLFilter) {
        this(url, okHttpClient);
        this.urlFilter = uRLFilter;
    }

    private Call buildCall() {
        OutputStreamRequestBody outputStreamRequestBody;
        Call call = this.call;
        if (call != null) {
            return call;
        }
        boolean z = true;
        ((HttpURLConnection) this).connected = true;
        if (((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).method.equals("GET")) {
                ((HttpURLConnection) this).method = "POST";
            } else if (!HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
                throw new ProtocolException(((HttpURLConnection) this).method + " does not support writing");
            }
        }
        if (this.requestHeaders.get("User-Agent") == null) {
            this.requestHeaders.add("User-Agent", defaultUserAgent());
        }
        if (HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
            if (this.requestHeaders.get("Content-Type") == null) {
                this.requestHeaders.add("Content-Type", "application/x-www-form-urlencoded");
            }
            long j = -1;
            if (this.fixedContentLength == -1 && ((HttpURLConnection) this).chunkLength <= 0) {
                z = false;
            }
            String str = this.requestHeaders.get("Content-Length");
            long j2 = this.fixedContentLength;
            if (j2 != -1) {
                j = j2;
            } else if (str != null) {
                j = Long.parseLong(str);
            }
            outputStreamRequestBody = z ? new StreamedRequestBody(j) : new BufferedRequestBody(j);
            outputStreamRequestBody.timeout().timeout(this.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        } else {
            outputStreamRequestBody = null;
        }
        try {
            Request build = new Request.Builder().url(HttpUrl.get(getURL().toString())).headers(this.requestHeaders.build()).method(((HttpURLConnection) this).method, outputStreamRequestBody).build();
            URLFilter uRLFilter = this.urlFilter;
            if (uRLFilter != null) {
                uRLFilter.checkURLPermitted(build.url().url());
            }
            OkHttpClient.Builder newBuilder = this.client.newBuilder();
            newBuilder.interceptors().clear();
            newBuilder.interceptors().add(UnexpectedException.INTERCEPTOR);
            newBuilder.networkInterceptors().clear();
            newBuilder.networkInterceptors().add(this.networkInterceptor);
            newBuilder.dispatcher(new Dispatcher(this.client.dispatcher().executorService()));
            if (!getUseCaches()) {
                newBuilder.cache(null);
            }
            Call newCall = newBuilder.build().newCall(build);
            this.call = newCall;
            return newCall;
        } catch (IllegalArgumentException e2) {
            if (Internal.instance.isInvalidHttpUrlHost(e2)) {
                UnknownHostException unknownHostException = new UnknownHostException();
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e2);
            throw malformedURLException;
        }
    }

    private String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        return property != null ? toHumanReadableAscii(property) : Version.userAgent();
    }

    private Headers getHeaders() {
        if (this.responseHeaders == null) {
            Response response = getResponse(true);
            this.responseHeaders = response.headers().newBuilder().add(SELECTED_PROTOCOL, response.protocol().toString()).add(RESPONSE_SOURCE, responseSourceHeader(response)).build();
        }
        return this.responseHeaders;
    }

    private Response getResponse(boolean z) {
        synchronized (this.lock) {
            if (this.response != null) {
                return this.response;
            } else if (this.callFailure != null) {
                if (!z || this.networkResponse == null) {
                    throw propagate(this.callFailure);
                }
                return this.networkResponse;
            } else {
                Call buildCall = buildCall();
                this.networkInterceptor.proceed();
                OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall.request().body();
                if (outputStreamRequestBody != null) {
                    outputStreamRequestBody.outputStream().close();
                }
                if (this.executed) {
                    synchronized (this.lock) {
                        while (this.response == null && this.callFailure == null) {
                            try {
                                try {
                                    this.lock.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            } finally {
                            }
                        }
                    }
                } else {
                    this.executed = true;
                    try {
                        onResponse(buildCall, buildCall.execute());
                    } catch (IOException e2) {
                        onFailure(buildCall, e2);
                    }
                }
                synchronized (this.lock) {
                    if (this.callFailure != null) {
                        throw propagate(this.callFailure);
                    }
                    if (this.response == null) {
                        throw new AssertionError();
                    }
                    return this.response;
                }
            }
        }
    }

    private static IOException propagate(Throwable th) {
        if (!(th instanceof IOException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw new AssertionError();
            }
            throw ((RuntimeException) th);
        }
        throw ((IOException) th);
    }

    private static String responseSourceHeader(Response response) {
        StringBuilder sb;
        String str;
        if (response.networkResponse() == null) {
            if (response.cacheResponse() == null) {
                return "NONE";
            }
            sb = new StringBuilder();
            str = "CACHE ";
        } else if (response.cacheResponse() != null) {
            sb = new StringBuilder();
            sb.append("CONDITIONAL_CACHE ");
            response = response.networkResponse();
            sb.append(response.code());
            return sb.toString();
        } else {
            sb = new StringBuilder();
            str = "NETWORK ";
        }
        sb.append(str);
        sb.append(response.code());
        return sb.toString();
    }

    private static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                c cVar = new c();
                cVar.mo332a(str, 0, i);
                cVar.c(63);
                while (true) {
                    i += Character.charCount(codePointAt);
                    if (i >= length) {
                        return cVar.d();
                    }
                    codePointAt = str.codePointAt(i);
                    cVar.c((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                }
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        return str;
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        if (!((HttpURLConnection) this).connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 != null) {
                this.requestHeaders.add(str, str2);
                return;
            }
            Platform platform = Platform.get();
            platform.log(5, "Ignoring header " + str + " because its value was null.", null);
            return;
        }
        throw new IllegalStateException("Cannot add request property after connection is made");
    }

    @Override // java.net.URLConnection
    public void connect() {
        if (this.executed) {
            return;
        }
        Call buildCall = buildCall();
        this.executed = true;
        buildCall.enqueue(this);
        synchronized (this.lock) {
            while (this.connectPending && this.response == null && this.callFailure == null) {
                try {
                    this.lock.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            if (this.callFailure != null) {
                throw propagate(this.callFailure);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        if (this.call == null) {
            return;
        }
        this.networkInterceptor.proceed();
        this.call.cancel();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.client.connectTimeoutMillis();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        try {
            Response response = getResponse(true);
            if (HttpHeaders.hasBody(response) && response.code() >= 400) {
                return response.body().byteStream();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0 && i < headers.size()) {
                return headers.value(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        try {
            return str == null ? StatusLine.get(getResponse(true)).toString() : getHeaders().get(str);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        try {
            Headers headers = getHeaders();
            if (i >= 0 && i < headers.size()) {
                return headers.name(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        try {
            return JavaNetHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        if (((HttpURLConnection) this).doInput) {
            Response response = getResponse(false);
            if (response.code() >= 400) {
                throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
            }
            return response.body().byteStream();
        }
        throw new ProtocolException("This protocol does not support input");
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.client.followRedirects();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody) buildCall().request().body();
        if (outputStreamRequestBody == null) {
            throw new ProtocolException("method does not support a request body: " + ((HttpURLConnection) this).method);
        }
        if (outputStreamRequestBody instanceof StreamedRequestBody) {
            connect();
            this.networkInterceptor.proceed();
        }
        if (outputStreamRequestBody.isClosed()) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return outputStreamRequestBody.outputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        URL url = getURL();
        String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : HttpUrl.defaultPort(url.getProtocol());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.proxy().address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + port, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.client.readTimeoutMillis();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        if (!((HttpURLConnection) this).connected) {
            return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.requestHeaders.get(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return getResponse(true).code();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return getResponse(true).message();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        synchronized (this.lock) {
            boolean z = iOException instanceof UnexpectedException;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.callFailure = th;
            this.lock.notifyAll();
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        synchronized (this.lock) {
            this.response = response;
            this.handshake = response.handshake();
            ((HttpURLConnection) this).url = response.request().url().url();
            this.lock.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.client = this.client.newBuilder().connectTimeout(i, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        if (!((HttpURLConnection) this).connected) {
            if (((HttpURLConnection) this).chunkLength > 0) {
                throw new IllegalStateException("Already in chunked mode");
            }
            if (j < 0) {
                throw new IllegalArgumentException("contentLength < 0");
            }
            this.fixedContentLength = j;
            ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j, 2147483647L);
            return;
        }
        throw new IllegalStateException("Already connected");
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        int i = (((HttpURLConnection) this).ifModifiedSince > 0L ? 1 : (((HttpURLConnection) this).ifModifiedSince == 0L ? 0 : -1));
        Headers.Builder builder = this.requestHeaders;
        if (i != 0) {
            builder.set("If-Modified-Since", HttpDate.format(new Date(((HttpURLConnection) this).ifModifiedSince)));
        } else {
            builder.removeAll("If-Modified-Since");
        }
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.client = this.client.newBuilder().followRedirects(z).build();
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.client = this.client.newBuilder().readTimeout(i, TimeUnit.MILLISECONDS).build();
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        if (METHODS.contains(str)) {
            ((HttpURLConnection) this).method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + METHODS + " but was " + str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        if (!((HttpURLConnection) this).connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 != null) {
                this.requestHeaders.set(str, str2);
                return;
            }
            Platform platform = Platform.get();
            platform.log(5, "Ignoring header " + str + " because its value was null.", null);
            return;
        }
        throw new IllegalStateException("Cannot set request property after connection is made");
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        if (this.proxy != null) {
            return true;
        }
        Proxy proxy = this.client.proxy();
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }
}

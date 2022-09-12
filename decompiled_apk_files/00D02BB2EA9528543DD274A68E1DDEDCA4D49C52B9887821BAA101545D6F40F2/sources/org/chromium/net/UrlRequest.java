package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class UrlRequest {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class Builder {
        public static final int REQUEST_PRIORITY_HIGHEST = 4;
        public static final int REQUEST_PRIORITY_IDLE = 0;
        public static final int REQUEST_PRIORITY_LOW = 2;
        public static final int REQUEST_PRIORITY_LOWEST = 1;
        public static final int REQUEST_PRIORITY_MEDIUM = 3;

        /* renamed from: addHeader */
        public abstract Builder mo41addHeader(String str, String str2);

        /* renamed from: allowDirectExecutor */
        public abstract Builder mo42allowDirectExecutor();

        /* renamed from: build */
        public abstract UrlRequest mo43build();

        /* renamed from: disableCache */
        public abstract Builder mo44disableCache();

        /* renamed from: setHttpMethod */
        public abstract Builder mo45setHttpMethod(String str);

        /* renamed from: setPriority */
        public abstract Builder mo46setPriority(int i);

        /* renamed from: setUploadDataProvider */
        public abstract Builder mo47setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class Callback {
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public abstract void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer);

        public abstract void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str);

        public abstract void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo);

        public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo);
    }

    /* compiled from: PG */
    /* loaded from: classes7.dex */
    public class Status {
        public static final int CONNECTING = 10;
        public static final int DOWNLOADING_PAC_FILE = 5;
        public static final int ESTABLISHING_PROXY_TUNNEL = 8;
        public static final int IDLE = 0;
        public static final int INVALID = -1;
        public static final int READING_RESPONSE = 14;
        public static final int RESOLVING_HOST = 9;
        public static final int RESOLVING_HOST_IN_PAC_FILE = 7;
        public static final int RESOLVING_PROXY_FOR_URL = 6;
        public static final int SENDING_REQUEST = 12;
        public static final int SSL_HANDSHAKE = 11;
        public static final int WAITING_FOR_AVAILABLE_SOCKET = 2;
        public static final int WAITING_FOR_CACHE = 4;
        public static final int WAITING_FOR_DELEGATE = 3;
        public static final int WAITING_FOR_RESPONSE = 13;
        public static final int WAITING_FOR_STALLED_SOCKET_POOL = 1;

        private Status() {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class StatusListener {
        public abstract void onStatus(int i);
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract void getStatus(StatusListener statusListener);

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public abstract void start();
}

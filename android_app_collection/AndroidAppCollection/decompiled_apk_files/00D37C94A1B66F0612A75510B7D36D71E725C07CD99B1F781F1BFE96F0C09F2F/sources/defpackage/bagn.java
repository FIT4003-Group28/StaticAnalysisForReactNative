package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: bagn  reason: default package */
/* loaded from: classes2.dex */
public final class bagn extends ExperimentalUrlRequest.Builder {
    private static final String a = "bagn";
    private final baei b;
    private final String c;
    private final UrlRequest.Callback d;
    private final Executor e;
    private String f;
    private boolean h;
    private boolean i;
    private Collection k;
    private UploadDataProvider l;
    private Executor m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;
    private RequestFinishedInfo.Listener s;
    private final ArrayList g = new ArrayList();
    private int j = 3;
    private int t = 0;

    public bagn(String str, UrlRequest.Callback callback, Executor executor, baei baeiVar) {
        if (str != null) {
            if (callback == null) {
                throw new NullPointerException("Callback is required.");
            }
            if (executor != null) {
                this.c = str;
                this.d = callback;
                this.e = executor;
                this.b = baeiVar;
                return;
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: a */
    public final bagm mo565build() {
        bagm b = this.b.b(this.c, this.d, this.e, this.j, this.k, this.h, this.i, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
        String str = this.f;
        if (str != null) {
            b.g(str);
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            b.a((String) pair.first, (String) pair.second);
        }
        UploadDataProvider uploadDataProvider = this.l;
        if (uploadDataProvider != null) {
            b.h(uploadDataProvider, this.m);
        }
        return b;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo563addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo564allowDirectExecutor() {
        c();
        return this;
    }

    public final void c() {
        this.n = true;
    }

    public final void d() {
        this.h = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo566disableCache() {
        d();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        this.i = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod */
    public final ExperimentalUrlRequest.Builder mo567setHttpMethod(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        this.t = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo568setPriority(int i) {
        this.j = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo568setPriority(int i) {
        this.j = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.s = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.o = true;
        this.p = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.q = true;
        this.r = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo569setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        e(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo563addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo564allowDirectExecutor() {
        c();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo566disableCache() {
        d();
        return this;
    }

    public final void e(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider != null) {
            if (executor != null) {
                if (this.f == null) {
                    this.f = "POST";
                }
                this.l = uploadDataProvider;
                this.m = executor;
                return;
            }
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo567setHttpMethod(String str) {
        mo567setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo569setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        e(uploadDataProvider, executor);
        return this;
    }

    public final void b(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new NullPointerException("Invalid header value.");
            }
            if ("Accept-Encoding".equalsIgnoreCase(str)) {
                Log.w(a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
                return;
            } else {
                this.g.add(Pair.create(str, str2));
                return;
            }
        }
        throw new NullPointerException("Invalid header name.");
    }
}

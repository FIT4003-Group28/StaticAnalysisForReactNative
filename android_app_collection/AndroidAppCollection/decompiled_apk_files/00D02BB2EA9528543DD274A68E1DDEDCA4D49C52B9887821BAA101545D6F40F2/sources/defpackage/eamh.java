package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: eamh  reason: default package */
/* loaded from: classes6.dex */
public final class eamh extends ExperimentalUrlRequest.Builder {
    private final eakj a;
    private final String b;
    private final UrlRequest.Callback c;
    private final Executor d;
    private String e;
    private final ArrayList<Pair<String, String>> f = new ArrayList<>();
    private Collection<Object> g;
    private UploadDataProvider h;
    private Executor i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;

    public eamh(String str, UrlRequest.Callback callback, Executor executor, eakj eakjVar) {
        if (str != null) {
            if (callback == null) {
                throw new NullPointerException("Callback is required.");
            }
            if (executor != null) {
                this.b = str;
                this.c = callback;
                this.d = executor;
                this.a = eakjVar;
                return;
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: a */
    public final eamg mo43build() {
        eamg a = this.a.a(this.b, this.c, this.d, this.j, this.k, this.l, this.m, this.n);
        String str = this.e;
        if (str != null) {
            a.a(str);
        }
        ArrayList<Pair<String, String>> arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair<String, String> pair = arrayList.get(i);
            a.b((String) pair.first, (String) pair.second);
        }
        UploadDataProvider uploadDataProvider = this.h;
        if (uploadDataProvider != null) {
            a.c(uploadDataProvider, this.i);
        }
        return a;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo41addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: addHeader  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo41addHeader(String str, String str2) {
        b(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo42allowDirectExecutor() {
        c();
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: allowDirectExecutor  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo42allowDirectExecutor() {
        c();
        return this;
    }

    public final void c() {
        this.j = true;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo44disableCache() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: disableCache  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo44disableCache() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod */
    public final ExperimentalUrlRequest.Builder mo45setHttpMethod(String str) {
        if (str != null) {
            this.e = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setHttpMethod  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo45setHttpMethod(String str) {
        mo45setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo46setPriority(int i) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setPriority  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo46setPriority(int i) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.k = true;
        this.l = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider */
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder mo47setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        d(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: setUploadDataProvider  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ UrlRequest.Builder mo47setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        d(uploadDataProvider, executor);
        return this;
    }

    public final void b(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                if ("Accept-Encoding".equalsIgnoreCase(str)) {
                    new Exception();
                    return;
                } else {
                    this.f.add(Pair.create(str, str2));
                    return;
                }
            }
            throw new NullPointerException("Invalid header value.");
        }
        throw new NullPointerException("Invalid header name.");
    }

    public final void d(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider != null) {
            if (executor != null) {
                if (this.e == null) {
                    this.e = "POST";
                }
                this.h = uploadDataProvider;
                this.i = executor;
                return;
            }
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }
}

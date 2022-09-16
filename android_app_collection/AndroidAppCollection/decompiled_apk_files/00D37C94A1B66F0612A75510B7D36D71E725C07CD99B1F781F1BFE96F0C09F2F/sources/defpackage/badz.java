package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
/* compiled from: PG */
/* renamed from: badz  reason: default package */
/* loaded from: classes2.dex */
public final class badz extends ExperimentalBidirectionalStream.Builder {
    private final baei a;
    private final String b;
    private final BidirectionalStream.Callback c;
    private final Executor d;
    private final ArrayList e = new ArrayList();
    private String f = "POST";
    private int g = 3;
    private boolean h;
    private Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public badz(String str, BidirectionalStream.Callback callback, Executor executor, baei baeiVar) {
        if (str != null) {
            if (callback == null) {
                throw new NullPointerException("Callback is required.");
            }
            if (executor != null) {
                this.b = str;
                this.c = callback;
                this.d = executor;
                this.a = baeiVar;
                return;
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: addHeader */
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder mo546addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: delayRequestHeadersUntilFirstFlush */
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder mo548delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: delayRequestHeadersUntilFirstFlush  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder mo548delayRequestHeadersUntilFirstFlush(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: setHttpMethod */
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder mo549setHttpMethod(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: setPriority */
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder mo550setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: setPriority  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder mo550setPriority(int i) {
        this.g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.j = true;
        this.k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.l = true;
        this.m = i;
        return this;
    }

    public final void a(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new NullPointerException("Invalid header value.");
            }
            this.e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            return;
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: addHeader  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder mo546addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: build  reason: collision with other method in class */
    public final ExperimentalBidirectionalStream mo547build() {
        return this.a.a(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    /* renamed from: setHttpMethod  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder mo549setHttpMethod(String str) {
        b(str);
        return this;
    }
}

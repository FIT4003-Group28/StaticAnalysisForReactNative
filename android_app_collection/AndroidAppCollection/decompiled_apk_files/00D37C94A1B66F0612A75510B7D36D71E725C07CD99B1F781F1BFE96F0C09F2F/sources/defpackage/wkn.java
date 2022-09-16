package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wkn  reason: default package */
/* loaded from: classes4.dex */
public final class wkn {
    public static final long a = TimeUnit.MINUTES.toMillis(7);
    public static final long b = TimeUnit.MINUTES.toMillis(15);
    public static final long c = TimeUnit.SECONDS.toMillis(15);
    public static final long d = TimeUnit.SECONDS.toMillis(15);
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    private final long o;
    private final long p;
    private final long q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;

    public wkn() {
    }

    public wkn(String str, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i) {
        this.e = str;
        this.o = j;
        this.p = j2;
        this.f = j3;
        this.q = j4;
        this.g = j5;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.r = z4;
        this.s = z5;
        this.k = z6;
        this.t = z7;
        this.l = z8;
        this.u = z9;
        this.m = z10;
        this.n = i;
    }

    public static wkm a(String str) {
        wkm wkmVar = new wkm();
        if (str != null) {
            wkmVar.a = str;
            wkmVar.b = Long.valueOf(a);
            wkmVar.c = Long.valueOf(b);
            wkmVar.d = Long.valueOf(c);
            wkmVar.e = 0L;
            wkmVar.f = Long.valueOf(d);
            wkmVar.f(false);
            wkmVar.b(false);
            wkmVar.c(false);
            wkmVar.e(false);
            wkmVar.d(false);
            wkmVar.g = false;
            wkmVar.h = false;
            wkmVar.i = false;
            wkmVar.j = false;
            wkmVar.k = true;
            wkmVar.l = 1000;
            return wkmVar;
        }
        throw new NullPointerException("Null getAppVersionForAds");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wkn) {
            wkn wknVar = (wkn) obj;
            if (this.e.equals(wknVar.e) && this.o == wknVar.o && this.p == wknVar.p && this.f == wknVar.f && this.q == wknVar.q && this.g == wknVar.g && this.h == wknVar.h && this.i == wknVar.i && this.j == wknVar.j && this.r == wknVar.r && this.s == wknVar.s && this.k == wknVar.k && this.t == wknVar.t && this.l == wknVar.l && this.u == wknVar.u && this.m == wknVar.m && this.n == wknVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        long j = this.o;
        long j2 = this.p;
        long j3 = this.f;
        long j4 = this.q;
        long j5 = this.g;
        int i = 1237;
        int i2 = (((((((((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003;
        if (true == this.m) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.n;
    }

    public final String toString() {
        String str = this.e;
        long j = this.o;
        long j2 = this.p;
        long j3 = this.f;
        long j4 = this.q;
        long j5 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.r;
        boolean z5 = this.s;
        boolean z6 = this.k;
        boolean z7 = this.t;
        boolean z8 = this.l;
        boolean z9 = this.u;
        boolean z10 = this.m;
        int i = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 653);
        sb.append("AdsModuleConfig{getAppVersionForAds=");
        sb.append(str);
        sb.append(", getMidrollAdsFreqCapMillis=");
        sb.append(j);
        sb.append(", getImmediateAdExpireTimeMillis=");
        sb.append(j2);
        sb.append(", getAdsTimeoutMillis=");
        sb.append(j3);
        sb.append(", getAdWarningMillis=");
        sb.append(j4);
        sb.append(", getMidrollPrefetchMillis=");
        sb.append(j5);
        sb.append(", trackUserPresence=");
        sb.append(z);
        sb.append(", shouldAllowInnertubeCaching=");
        sb.append(z2);
        sb.append(", shouldEmitAdClickthroughReportedEvent=");
        sb.append(z3);
        sb.append(", shouldPreventYoutubeHeaders=");
        sb.append(z4);
        sb.append(", shouldPreventAdsHeaders=");
        sb.append(z5);
        sb.append(", shouldBlockAds=");
        sb.append(z6);
        sb.append(", shouldBlockOfflineAds=");
        sb.append(z7);
        sb.append(", shouldGenerateDebugSlotIds=");
        sb.append(z8);
        sb.append(", shouldGenerateDebugLayoutIds=");
        sb.append(z9);
        sb.append(", shouldSendAdsClientMonitoringLogsAsync=");
        sb.append(z10);
        sb.append(", getAdsClientMonitoringDelayLogMs=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: crpm  reason: default package */
/* loaded from: classes5.dex */
public final class crpm {
    public final ddww a;
    public final long b;
    public final long c;
    @dzsi
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final long k;
    public boolean l = true;
    public final dcdc<String> m = dcdc.e();
    private final String n;
    private final String o;
    private final String p;
    private final List<Integer> q;

    public crpm(ddww ddwwVar, long j, long j2, @dzsi String str, int i, int i2, String str2, String str3, String str4, String str5, List<Integer> list, boolean z, boolean z2, long j3, long j4) {
        this.a = ddwwVar;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.n = str2;
        this.o = str3;
        this.p = str4;
        this.g = str5;
        this.q = list;
        this.h = z;
        this.i = z2;
        this.j = j3;
        this.k = j4;
    }

    public final long a() {
        if (this.l) {
            return this.b;
        }
        return 0L;
    }

    public final String toString() {
        return String.format("sessionId: 0x%016x, sessionNonce: 0x%016x, extendedSessionId: %s, startScrubbingDistanceM: %d, endScrubbingDistanceM: %d, softwareVersion: %s, platformId: %s, applicationName: %s, referrerName: %s, experimentIds: {%s}, disableScrubbing: %b, isThirdParty: %b", Long.valueOf(this.b), Long.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.n, this.o, this.p, this.g, dbrz.e(", ").g(this.q), Boolean.valueOf(this.h), Boolean.valueOf(this.i));
    }
}

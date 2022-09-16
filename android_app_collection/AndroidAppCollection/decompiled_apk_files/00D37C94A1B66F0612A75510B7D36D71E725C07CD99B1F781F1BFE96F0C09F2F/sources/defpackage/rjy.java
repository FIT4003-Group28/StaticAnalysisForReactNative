package defpackage;
/* compiled from: PG */
/* renamed from: rjy  reason: default package */
/* loaded from: classes4.dex */
final class rjy {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    public rjy(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        qnm.l(str);
        qnm.l(str2);
        boolean z = true;
        qnm.c(j >= 0);
        qnm.c(j2 >= 0);
        qnm.c(j3 >= 0);
        qnm.c(j5 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rjy a(Long l, Long l2, Boolean bool) {
        return new rjy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rjy b(long j, long j2) {
        return new rjy(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rjy c(long j) {
        return new rjy(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public rjy(String str, String str2, long j) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }
}

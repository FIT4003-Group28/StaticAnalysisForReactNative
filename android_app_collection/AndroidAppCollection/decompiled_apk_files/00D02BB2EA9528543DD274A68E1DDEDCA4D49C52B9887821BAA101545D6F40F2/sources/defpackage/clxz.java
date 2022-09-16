package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clxz  reason: default package */
/* loaded from: classes5.dex */
public final class clxz implements clyg {
    public final long a;
    public final long b;
    public final clyk c;
    public long d;
    private final clyf e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public clxz(clyk clykVar, long j, long j2, long j3, long j4, boolean z) {
        cmmn.a(j >= 0 && j2 > j);
        this.c = clykVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new clyf();
    }

    @Override // defpackage.clyg
    public final void a(long j) {
        this.h = cmny.C(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }

    @Override // defpackage.clyg
    public final /* bridge */ /* synthetic */ clvg b() {
        if (this.d != 0) {
            return new clxy(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    @Override // defpackage.clyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.cluk r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxz.c(cluk):long");
    }
}

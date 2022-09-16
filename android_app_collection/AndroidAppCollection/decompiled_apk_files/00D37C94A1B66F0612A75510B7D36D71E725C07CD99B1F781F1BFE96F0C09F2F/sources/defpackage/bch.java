package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bch  reason: default package */
/* loaded from: classes2.dex */
public final class bch implements bcn {
    public final long a;
    public final long b;
    public final bcr c;
    public long d;
    private final bcm e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public bch(bcr bcrVar, long j, long j2, long j3, long j4, boolean z) {
        ptx.c(j >= 0 && j2 > j);
        this.c = bcrVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new bcm();
    }

    @Override // defpackage.bcn
    public final /* bridge */ /* synthetic */ azy b() {
        if (this.d != 0) {
            return new bcg(this);
        }
        return null;
    }

    @Override // defpackage.bcn
    public final void c(long j) {
        this.h = pxi.j(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // defpackage.bcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.azf r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bch.a(azf):long");
    }
}

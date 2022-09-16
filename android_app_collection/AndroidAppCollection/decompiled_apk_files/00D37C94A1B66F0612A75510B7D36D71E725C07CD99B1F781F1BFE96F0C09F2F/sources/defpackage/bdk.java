package defpackage;
/* compiled from: PG */
/* renamed from: bdk  reason: default package */
/* loaded from: classes2.dex */
public final class bdk implements bdd {
    private final bdz a;
    private long e;
    private String g;
    private bab h;
    private bdj i;
    private boolean j;
    private long k;
    private boolean l;
    private final boolean[] f = new boolean[3];
    private final bdq b = new bdq(7);
    private final bdq c = new bdq(8);
    private final bdq d = new bdq(6);
    private final pwu m = new pwu();

    public bdk(bdz bdzVar) {
        this.a = bdzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af  */
    @Override // defpackage.bdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pwu r26) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdk.a(pwu):void");
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.g = befVar.b();
        this.h = azhVar.pT(befVar.a(), 2);
        this.i = new bdj(this.h);
        this.a.b(azhVar, befVar);
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.k = j;
        this.l |= (i & 2) != 0;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.e = 0L;
        this.l = false;
        pwo.d(this.f);
        this.b.b();
        this.c.b();
        this.d.b();
        bdj bdjVar = this.i;
        if (bdjVar != null) {
            bdjVar.c();
        }
    }

    private final void f(byte[] bArr, int i, int i2) {
        if (this.j) {
            boolean z = this.i.c;
        } else {
            this.b.a(bArr, i, i2);
            this.c.a(bArr, i, i2);
        }
        this.d.a(bArr, i, i2);
        boolean z2 = this.i.g;
    }
}

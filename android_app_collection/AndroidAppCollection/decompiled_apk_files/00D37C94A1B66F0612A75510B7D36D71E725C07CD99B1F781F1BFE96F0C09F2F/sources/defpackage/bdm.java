package defpackage;
/* compiled from: PG */
/* renamed from: bdm  reason: default package */
/* loaded from: classes2.dex */
public final class bdm implements bdd {
    private final bdz a;
    private String b;
    private bab c;
    private bdl d;
    private boolean e;
    private long l;
    private long m;
    private final boolean[] f = new boolean[3];
    private final bdq g = new bdq(32);
    private final bdq h = new bdq(33);
    private final bdq i = new bdq(34);
    private final bdq j = new bdq(39);
    private final bdq k = new bdq(40);
    private final pwu n = new pwu();

    public bdm(bdz bdzVar) {
        this.a = bdzVar;
    }

    private final void f(byte[] bArr, int i, int i2) {
        bdl bdlVar = this.d;
        if (bdlVar.e) {
            int i3 = bdlVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                bdlVar.f = (bArr[i4] & 128) != 0;
                bdlVar.e = false;
            } else {
                bdlVar.c = i3 + (i2 - i);
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    @Override // defpackage.bdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pwu r29) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdm.a(pwu):void");
    }

    @Override // defpackage.bdd
    public final void b(azh azhVar, bef befVar) {
        befVar.c();
        this.b = befVar.b();
        this.c = azhVar.pT(befVar.a(), 2);
        this.d = new bdl(this.c);
        this.a.b(azhVar, befVar);
    }

    @Override // defpackage.bdd
    public final void c() {
    }

    @Override // defpackage.bdd
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.bdd
    public final void e() {
        this.l = 0L;
        pwo.d(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        bdl bdlVar = this.d;
        if (bdlVar != null) {
            bdlVar.e = false;
            bdlVar.f = false;
            bdlVar.g = false;
            bdlVar.h = false;
            bdlVar.i = false;
        }
    }
}

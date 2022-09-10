package defpackage;
/* compiled from: PG */
/* renamed from: awik  reason: default package */
/* loaded from: classes3.dex */
final class awik {
    public final awij a;
    public dkrl b;
    public long c = -1;
    public long d = 0;

    public awik(awij awijVar) {
        this.a = awijVar;
        this.b = awijVar.b;
    }

    public final void a(bvjj bvjjVar) {
        awih bZ = awii.f.bZ();
        String str = this.b.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        awii awiiVar = (awii) bZ.b;
        str.getClass();
        int i = awiiVar.a | 2;
        awiiVar.a = i;
        awiiVar.c = str;
        String str2 = this.a.a;
        str2.getClass();
        int i2 = i | 1;
        awiiVar.a = i2;
        awiiVar.b = str2;
        long j = this.d;
        int i3 = i2 | 4;
        awiiVar.a = i3;
        awiiVar.d = j;
        long j2 = this.c;
        if (j2 >= 0) {
            awiiVar.a = i3 | 8;
            awiiVar.e = j2;
        }
        bvjjVar.al(bvjk.bE, bZ.bK());
    }

    public final String b() {
        return this.b.b;
    }

    public final void c(dkrl dkrlVar, long j) {
        this.b = dkrlVar;
        this.c = -1L;
        this.d = j;
    }
}

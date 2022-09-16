package defpackage;
/* compiled from: PG */
/* renamed from: pag  reason: default package */
/* loaded from: classes4.dex */
final class pag extends pab {
    private boolean a;
    private final pap c;
    private final boolean[] d;
    private final paf e;
    private final pal f;
    private final pal g;
    private final pal h;
    private long i;
    private long j;
    private final pct k;

    public pag(oyf oyfVar, pap papVar) {
        super(oyfVar);
        this.c = papVar;
        this.d = new boolean[3];
        this.e = new paf(oyfVar);
        this.f = new pal(7);
        this.g = new pal(8);
        this.h = new pal(6);
        this.k = new pct();
    }

    private static pcs e(pal palVar) {
        pcs pcsVar = new pcs(palVar.b, pcr.b(palVar.b, palVar.c));
        pcsVar.e(32);
        return pcsVar;
    }

    private final void f(byte[] bArr, int i, int i2) {
        if (!this.a) {
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0195  */
    @Override // defpackage.pab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pct r26) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.a(pct):void");
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.j = j;
    }

    @Override // defpackage.pab
    public final void d() {
        pcr.d(this.d);
        this.f.b();
        this.g.b();
        this.h.b();
        this.e.b();
        this.i = 0L;
    }
}

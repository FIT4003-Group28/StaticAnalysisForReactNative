package defpackage;
/* compiled from: PG */
/* renamed from: pai  reason: default package */
/* loaded from: classes4.dex */
final class pai extends pab {
    private boolean a;
    private final pap c;
    private final boolean[] d;
    private final pal e;
    private final pal f;
    private final pal g;
    private final pal h;
    private final pal i;
    private final pah j;
    private long k;
    private long l;
    private final pct m;

    public pai(oyf oyfVar, pap papVar) {
        super(oyfVar);
        this.c = papVar;
        this.d = new boolean[3];
        this.e = new pal(32);
        this.f = new pal(33);
        this.g = new pal(34);
        this.h = new pal(39);
        this.i = new pal(40);
        this.j = new pah(oyfVar);
        this.m = new pct();
    }

    private final void e(byte[] bArr, int i, int i2) {
        if (this.a) {
            pah pahVar = this.j;
            if (pahVar.e) {
                int i3 = pahVar.c;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    pahVar.f = (bArr[i4] & 128) != 0;
                    pahVar.e = false;
                } else {
                    pahVar.c = i3 + (i2 - i);
                }
            }
        } else {
            this.e.a(bArr, i, i2);
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
        this.i.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    @Override // defpackage.pab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pct r32) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pai.a(pct):void");
    }

    @Override // defpackage.pab
    public final void b() {
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        this.l = j;
    }

    @Override // defpackage.pab
    public final void d() {
        pcr.d(this.d);
        this.e.b();
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        pah pahVar = this.j;
        pahVar.e = false;
        pahVar.f = false;
        pahVar.g = false;
        pahVar.h = false;
        pahVar.i = false;
        this.k = 0L;
    }
}

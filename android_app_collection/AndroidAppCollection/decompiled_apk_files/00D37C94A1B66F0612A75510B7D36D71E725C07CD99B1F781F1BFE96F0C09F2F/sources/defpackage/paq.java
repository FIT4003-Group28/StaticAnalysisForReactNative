package defpackage;
/* compiled from: PG */
/* renamed from: paq  reason: default package */
/* loaded from: classes4.dex */
final class paq extends pat {
    final /* synthetic */ pau a;
    private final pct b = new pct();
    private final pcs c = new pcs(new byte[4]);
    private int d;
    private int e;
    private int f;

    public paq(pau pauVar) {
        this.a = pauVar;
    }

    @Override // defpackage.pat
    public final void a(pct pctVar, boolean z, oxr oxrVar) {
        if (z) {
            pctVar.A(pctVar.h());
            pctVar.t(this.c, 3);
            this.c.e(12);
            this.d = this.c.a(12);
            this.e = 0;
            this.f = pcx.t(this.c.a, 3, -1);
            this.b.w(this.d);
        }
        int min = Math.min(pctVar.a(), this.d - this.e);
        pctVar.u(this.b.a, this.e, min);
        int i = this.e + min;
        this.e = i;
        int i2 = this.d;
        if (i >= i2 && pcx.t(this.b.a, i2, this.f) == 0) {
            this.b.A(5);
            int i3 = (this.d - 9) / 4;
            for (int i4 = 0; i4 < i3; i4++) {
                this.b.t(this.c, 4);
                int a = this.c.a(16);
                this.c.e(3);
                if (a == 0) {
                    this.c.e(13);
                } else {
                    int a2 = this.c.a(13);
                    pau pauVar = this.a;
                    pauVar.e.put(a2, new pas(pauVar, a2));
                }
            }
        }
    }

    @Override // defpackage.pat
    public final void b() {
    }
}

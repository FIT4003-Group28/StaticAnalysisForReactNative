package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nth  reason: default package */
/* loaded from: classes3.dex */
public final class nth implements nsk {
    public final azpb a;
    public final azpb b;
    public int c;
    public Rect d;
    private final aynx e;
    private final aynx f;
    private final nzy g;

    public nth(nzy nzyVar, ghs ghsVar) {
        this.g = nzyVar;
        azpb ax = azpa.ar().ax();
        this.a = ax;
        azpb ax2 = azpa.ar().ax();
        this.b = ax2;
        this.e = ax2.A().h(nps.k);
        this.f = aynx.e(ax, aynx.B(false).j(ghsVar.a), nti.b).h(nps.k);
    }

    @Override // defpackage.nsk
    public final int a() {
        return this.c;
    }

    @Override // defpackage.nsk
    public final Rect b() {
        return this.d;
    }

    @Override // defpackage.nsk
    public final aynx c() {
        return this.e;
    }

    @Override // defpackage.nsk
    public final aynx d() {
        return this.f;
    }

    @Override // defpackage.nsk
    public final void e() {
        nxe c = this.g.c();
        this.a.c(Integer.valueOf(c.t().height()));
        this.b.c(c.r());
        this.g.e(new nxd() { // from class: ntf
            @Override // defpackage.nxd
            public final void ph(nxe nxeVar) {
                nth nthVar = nth.this;
                nthVar.a.c(Integer.valueOf(nxeVar.t().height()));
                nthVar.b.c(nxeVar.r());
            }
        });
        this.f.Z(new ntg(this));
        this.e.Z(new ntg(this, 1));
    }
}

package defpackage;

import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mxo  reason: default package */
/* loaded from: classes7.dex */
public final class mxo implements noq {
    private final not a;
    private final btrm b;
    private final kdg c;
    private final mxq d;
    private final vxo e;
    private final mxs f;
    private final mxu g;
    private final kxs h;
    private final myf i;
    private final cqkf<myd> j;
    private final boolean k;

    public mxo(cqkj cqkjVar, not notVar, noo nooVar, btrm btrmVar, kdg kdgVar, kxu kxuVar, vxa vxaVar, vxo vxoVar, mxs mxsVar, mxu mxuVar, boolean z) {
        dwao c;
        this.a = notVar;
        this.b = btrmVar;
        this.c = kdgVar;
        this.e = vxoVar;
        this.f = mxsVar;
        this.g = mxuVar;
        this.k = z;
        if (z) {
            c = vxaVar.c(dqvj.DRIVE, 3, vul.DIRECTIONS_UI);
        } else {
            c = vxaVar.c(dqvj.DRIVE, 3, vul.NAVIGATION_ONLY);
        }
        mxq mxqVar = new mxq(vxi.d(c));
        this.d = mxqVar;
        cqkf<myd> d = cqkjVar.d(new myc(), notVar.a(), false);
        this.j = d;
        this.i = new myf(cqkjVar.d, mxqVar, nooVar);
        View c2 = d.c();
        kxn k = kxo.k();
        k.k();
        this.h = new kxs(c2, k, kxuVar);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
        this.i.g();
        this.j.e(this.i);
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        this.h.a();
        if (this.k) {
            this.c.f(kdc.MAP_INTERACTION_DISABLED);
            this.f.a();
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        vup i = this.i.i();
        if (!i.equals(this.d.a())) {
            this.e.f(i.a);
            this.b.b(sri.a(i.a));
            this.g.a(i);
        }
        if (this.k) {
            this.c.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
            this.f.b();
        }
        this.h.b();
    }

    @Override // defpackage.non
    public final void f() {
        this.j.e(null);
        this.i.h();
    }

    @Override // defpackage.non
    public final String g() {
        return "RouteOptionsOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.a.b(noeVar, this.j.c());
    }
}

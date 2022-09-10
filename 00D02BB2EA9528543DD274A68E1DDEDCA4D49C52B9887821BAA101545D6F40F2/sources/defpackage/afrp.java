package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: afrp  reason: default package */
/* loaded from: classes.dex */
public final class afrp extends itb implements afwp {
    public final afov a;
    @dzsi
    afpb b;
    private final cqkj c;
    private final btrm d;
    private final afpc e;
    private cqkf<jar> f;
    private final afro g = new afro(this);

    public afrp(cqkj cqkjVar, btrm btrmVar, afpc afpcVar, afov afovVar) {
        this.c = cqkjVar;
        this.d = btrmVar;
        this.e = afpcVar;
        this.a = afovVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        cqkf<jar> c = this.c.c(new afoz(), null);
        this.f = c;
        View a = cqhu.a(c.c(), gwu.a);
        if (a != null) {
            a.addOnLayoutChangeListener(new afrn(this));
            afpc afpcVar = this.e;
            Activity activity = (Activity) ((dxjd) afpcVar.a).a;
            afpc.a(activity, 1);
            cqkj a2 = afpcVar.b.a();
            afpc.a(a2, 2);
            dxio a3 = ((dxjh) afpcVar.c).a();
            afpc.a(a3, 3);
            dxio a4 = ((dxjh) afpcVar.d).a();
            afpc.a(a4, 4);
            dxio a5 = ((dxjh) afpcVar.e).a();
            afpc.a(a5, 5);
            dxio a6 = ((dxjh) afpcVar.f).a();
            afpc.a(a6, 6);
            dxio a7 = ((dxjh) afpcVar.g).a();
            afpc.a(a7, 7);
            bvjj a8 = afpcVar.h.a();
            afpc.a(a8, 8);
            cqhn a9 = afpcVar.i.a();
            afpc.a(a9, 9);
            btvo a10 = afpcVar.j.a();
            afpc.a(a10, 10);
            afpc.a(a, 11);
            this.b = new afpb(activity, a2, a3, a4, a5, a6, a7, a8, a9, a10, a);
        }
    }

    @Override // defpackage.itb
    public final void Nt() {
        afpb afpbVar;
        super.Nt();
        cqkf<jar> cqkfVar = this.f;
        if (cqkfVar != null && (afpbVar = this.b) != null) {
            cqkfVar.e(afpbVar);
        }
        btrm btrmVar = this.d;
        afro afroVar = this.g;
        dceq a = dcet.a();
        a.b(afwq.class, new afrq(afwq.class, afroVar, bvrj.UI_THREAD));
        btrmVar.g(afroVar, a.a());
    }

    @Override // defpackage.itb
    public final void Po() {
        this.d.a(this.g);
        cqkf<jar> cqkfVar = this.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Po();
    }

    @Override // defpackage.afwp
    @dzsi
    public final View e() {
        if (this.f == null) {
            return null;
        }
        afpb afpbVar = this.b;
        if (afpbVar != null) {
            afpbVar.i(false);
        }
        return this.f.c();
    }

    @Override // defpackage.afwp
    @dzsi
    public final View f() {
        if (this.f == null) {
            return null;
        }
        afpb afpbVar = this.b;
        if (afpbVar != null) {
            afpbVar.i(true);
        }
        return this.f.c();
    }

    @Override // defpackage.afwp
    @dzsi
    public final View i() {
        afpb afpbVar;
        View e = e();
        if (e == null || (afpbVar = this.b) == null) {
            return null;
        }
        return e.findViewById(afpbVar.C().intValue());
    }
}

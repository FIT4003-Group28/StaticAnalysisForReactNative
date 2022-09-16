package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: odl  reason: default package */
/* loaded from: classes3.dex */
public final class odl extends ajwd implements frq, ajxy {
    public final aafo a;
    public final frr b;
    public final auxn c;
    public final ajsm d;
    public final List e;
    public boolean f;
    public boolean g;
    public boolean h;
    public awbf i;
    public awbn j;
    private final Context k;
    private final oet l;
    private final ajrj m = new ajrj();
    private Configuration n;
    private aypg o;
    private aypg p;

    public odl(Context context, aafo aafoVar, frr frrVar, oet oetVar, akab akabVar, odk odkVar, ajin ajinVar, ntt nttVar, aadd aaddVar, aagi aagiVar, auxn auxnVar) {
        this.a = aafoVar;
        this.b = frrVar;
        this.l = oetVar;
        this.c = auxnVar;
        this.k = context;
        ajsm ajsmVar = new ajsm();
        this.d = ajsmVar;
        this.e = new ArrayList();
        this.f = ((Boolean) auxnVar.qm(auxh.b)).booleanValue() || auxnVar.h;
        akabVar.b(odkVar);
        akabVar.b(ajinVar);
        ajsmVar.addAll(akabVar.a(auxnVar.c));
        ajsmVar.mG(new ajyl(this));
        ajsmVar.mG(new kxi());
        this.n = context.getResources().getConfiguration();
        this.o = nttVar.a.C(oav.e).n().Z(new odi(this));
        if (eog.P(aaddVar)) {
            this.p = aagiVar.c().h(aakj.f(194, auxnVar.d), true).I(noc.j).V(oav.f).k(awbn.class).X(aypa.a()).as(new odi(this, 1));
        }
        h();
    }

    public final String c() {
        return this.c.d;
    }

    @Override // defpackage.frq
    public final void d(String str, awbf awbfVar) {
        if (!akzj.f(this.c.d, str)) {
            return;
        }
        this.i = awbfVar;
        for (odj odjVar : this.e) {
            odjVar.oU();
        }
    }

    public final void h() {
        if (this.h || this.n.orientation != 2 || !zew.y(this.k) || this.c.h) {
            if (!this.m.isEmpty()) {
                return;
            }
            this.m.m(this.d);
            return;
        }
        this.m.t();
    }

    @Override // defpackage.ajwd, defpackage.zdx
    public final void j() {
        this.f = false;
        this.g = false;
        this.i = null;
        this.n = null;
        this.j = null;
        aypg aypgVar = this.o;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.o = null;
        }
        aypg aypgVar2 = this.p;
        if (aypgVar2 != null) {
            ayqi.c((AtomicReference) aypgVar2);
            this.p = null;
        }
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.m;
    }

    @Override // defpackage.ajwd, defpackage.ajyj
    public final void lC(Configuration configuration) {
        this.n = configuration;
        h();
    }

    @Override // defpackage.ajxy
    public final String lv() {
        return this.c.f;
    }

    public final void f() {
        oeu oeuVar;
        nun nunVar;
        boolean z = !this.f;
        this.f = z;
        if (z && (oeuVar = this.l.a) != null && (nunVar = ((DefaultWatchPanelViewController) oeuVar).h) != null) {
            nunVar.g(1, true);
        }
        for (odj odjVar : this.e) {
            odjVar.oT();
        }
    }
}

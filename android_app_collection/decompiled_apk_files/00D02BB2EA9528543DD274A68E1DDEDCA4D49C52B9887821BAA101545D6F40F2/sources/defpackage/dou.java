package defpackage;

import android.os.Bundle;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dou  reason: default package */
/* loaded from: classes6.dex */
public final class dou implements czl<drq> {
    public final czkm<dsw> a;
    public final Executor b;
    private final dbsg<dap> c;
    private final dxio<czj> d;
    private final gga e;
    private final bwqv f;
    private final dbsg<diw> g;

    public dou(dbsg<dap> dbsgVar, dxio<czj> dxioVar, gga ggaVar, bwqv bwqvVar, czkm<dsw> czkmVar, Executor executor, btvo btvoVar, dix dixVar) {
        this.c = dbsgVar;
        this.d = dxioVar;
        this.e = ggaVar;
        this.f = bwqvVar;
        this.a = czkmVar;
        this.b = executor;
        dknv dknvVar = btvoVar.getAugmentedRealityParameters().a;
        int i = (dknvVar == null ? dknv.v : dknvVar).i;
        this.g = i <= 0 ? dbpy.a : dbsg.i(dixVar.a(dbsgVar, czh.LIGHTHOUSE, i));
    }

    @Override // defpackage.czl
    public final void f() {
        deha.q(this.a.c(doo.a, this.b), new dot(), this.b);
    }

    @Override // defpackage.czl
    public final dehn<Map<String, String>> g() {
        return deew.h(this.a.b(), dop.a, this.b);
    }

    @Override // defpackage.czl
    public final dehn<Boolean> l() {
        return deha.a(true);
    }

    @Override // defpackage.czl
    public final void m() {
        this.e.g().h(dpn.a, 1);
        this.d.a().b(czh.LIGHTHOUSE, true, this.c.b().a.b(), new dos(this));
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void n(Bundle bundle, drq drqVar) {
        this.f.c(bundle, "arlh_target", drqVar);
    }

    @Override // defpackage.czl
    @dzsi
    public final /* bridge */ /* synthetic */ drq o(Bundle bundle) {
        if (!bundle.containsKey("arlh_target")) {
            return null;
        }
        try {
            return drq.f(bundle, "arlh_target", this.f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.czl
    public final /* bridge */ /* synthetic */ void p(drq drqVar) {
        bwqv bwqvVar = this.f;
        dpn dpnVar = new dpn();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "target_arg", drqVar);
        dpnVar.B(bundle);
        if (this.g.a()) {
            this.g.b().a(dpnVar);
        }
        this.e.D(dpnVar);
    }
}

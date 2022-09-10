package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: bsnh  reason: default package */
/* loaded from: classes4.dex */
public final class bsnh implements egq {
    private final ckcw a;
    private final cjqy b;
    private final brpm c;
    @dzsi
    private final Bundle d;
    private final gga e;
    private final gek f;
    @dzsi
    private final View g;
    private final jkf h;
    private final brcj i;
    private final brlk j;
    private final cklq k;
    private final ckmp l;
    private final ckml m;

    public bsnh(ckcw ckcwVar, cjqy cjqyVar, cklq cklqVar, ckmp ckmpVar, ckml ckmlVar, brpm brpmVar, brlk brlkVar, @dzsi Bundle bundle, gga ggaVar, gek gekVar, @dzsi View view, jkf jkfVar, brcj brcjVar) {
        this.a = ckcwVar;
        this.b = cjqyVar;
        this.k = cklqVar;
        this.l = ckmpVar;
        this.m = ckmlVar;
        this.c = brpmVar;
        this.d = bundle;
        this.e = ggaVar;
        this.f = gekVar;
        this.g = view;
        this.h = jkfVar;
        this.i = brcjVar;
        this.j = brlkVar;
    }

    private final void b(ckhf ckhfVar, boolean z) {
        if (z) {
            ((ckhe) this.a.a(ckhfVar)).c();
        } else {
            ((ckhe) this.a.a(ckhfVar)).e();
        }
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.e.g().J()) {
            brlu e = this.j.e();
            dbsk.s(e);
            boolean z = e.d;
            b(ckjw.y, z);
            b(ckjw.w, z);
            boolean z2 = true;
            boolean z3 = !z;
            b(ckjw.x, z3);
            b(ckjw.v, z3);
            b(ckjw.ag, false);
            b(ckjw.ah, false);
            b(ckjw.ap, false);
            b(ckjw.aq, false);
            this.l.c(ckmk.SEARCH_TO_LIST, ckmo.OK);
            brpm brpmVar = this.c;
            brlu e2 = this.j.e();
            dbsk.s(e2);
            brpmVar.a(e2);
            jjn L = this.h.l().L();
            ddqc bZ = ddqk.h.bZ();
            int s = cjqg.s(L);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddqk ddqkVar = (ddqk) bZ.b;
            ddqkVar.d = s - 1;
            ddqkVar.a |= 4;
            ddqk bK = bZ.bK();
            View j = this.h.l().j();
            ExtendedFloatingActionButton extendedFloatingActionButton = null;
            cjql e3 = j == null ? null : cjqg.e(j);
            if (e3 != null) {
                cjqy cjqyVar = this.b;
                cjte cjteVar = new cjte(deaf.AUTOMATED);
                cjta b = cjtd.b();
                b.d = dtyb.aN;
                b.n(bK);
                cjqyVar.n(e3, cjteVar, b.a());
            }
            this.f.c = L;
            brcj brcjVar = this.i;
            Bundle bundle = this.d;
            if (bundle != null && (!bundle.getBoolean("searchResultViewPortMoved") || L == jjn.EXPANDED)) {
                brcjVar.h(L == jjn.EXPANDED, false);
                bundle.putBoolean("searchResultViewPortMoved", true);
            }
            brcj brcjVar2 = this.i;
            if (brcjVar2.k() && !brcjVar2.g) {
                if (L != jjn.EXPANDED) {
                    z2 = false;
                }
                brcjVar2.j(z2, false);
            }
            this.i.d();
            View view = this.g;
            if (view != null) {
                extendedFloatingActionButton = (ExtendedFloatingActionButton) cqkx.e(view, brhz.a, ExtendedFloatingActionButton.class);
            }
            if (!brla.c(extendedFloatingActionButton)) {
                dbsk.s(extendedFloatingActionButton);
                cqkp i = cqkx.i(extendedFloatingActionButton);
                if (i != null) {
                    cqkx.p(i);
                }
            }
            if (!this.j.f()) {
                this.k.c(cklt.CATEGORICAL_RESULTS_LIST);
            }
            this.m.e(ckoi.SEARCH_LIST);
            this.l.c(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_COLLAPSED_RESULTS_LIST, ckmo.INTERNAL);
            this.l.c(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_CATEGORICAL_RESULTS_LIST, ckmo.INTERNAL);
        }
    }
}

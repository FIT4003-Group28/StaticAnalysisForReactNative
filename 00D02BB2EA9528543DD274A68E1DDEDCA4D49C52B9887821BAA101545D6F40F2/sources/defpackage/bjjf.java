package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bjjf  reason: default package */
/* loaded from: classes3.dex */
public final class bjjf extends bjfk<bjjm> implements bjjc {
    private static final dcqe an = dcqe.c("bjjf");
    public cqhu a;
    public boolean ak;
    public boolean al;
    public dqcj am = dqcj.UNKNOWN_PLACE_QA_ENTRY_POINT;
    private djao ao;
    private bjfd ap;
    private boolean aq;
    @dzsi
    private View ar;
    @dzsi
    private View as;
    public bjjx b;
    public btrm c;
    public bjgu d;
    public boolean e;

    private final void q() {
        ff J = J();
        if (J == null) {
            bvoo.i(new NullPointerException("Activity is null."));
        } else {
            ((InputMethodManager) J.getSystemService("input_method")).toggleSoftInput(2, 1);
        }
    }

    private final void w() {
        ff J = J();
        if (J == null) {
            bvoo.i(new NullPointerException("Activity is null."));
        } else {
            jmw.d(J, null);
        }
    }

    @Override // defpackage.bjjc
    public final void a() {
        View view = this.ar;
        if (view != null) {
            view.requestFocus();
        }
        q();
    }

    @Override // defpackage.bjfi, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        if (ag != null) {
            dbsk.s(this.a);
            this.ar = cqhu.a(ag, bjiw.a);
            this.as = cqhu.a(ag, bjvq.a);
        }
        return ag;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        bjjm bjjmVar = (bjjm) this.ag;
        dbsk.s(bjjmVar);
        bjjmVar.QW();
        if (this.e) {
            a();
        }
        if (this.aq) {
            View view = this.as;
            if (view != null) {
                view.requestFocus();
            }
            q();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        View view;
        View view2;
        boolean b = jmw.b(J());
        boolean z = true;
        this.e = b && (view2 = this.ar) != null && view2.hasFocus();
        if (!b || (view = this.as) == null || !view.hasFocus()) {
            z = false;
        }
        this.aq = z;
        if (this.e) {
            b();
        } else if (z) {
            w();
            View view3 = this.as;
            if (view3 != null) {
                view3.clearFocus();
            }
        }
        super.al();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        btrm btrmVar = this.c;
        dbsk.s(btrmVar);
        bjfd bjfdVar = this.ap;
        dbsk.s(bjfdVar);
        bjfe.b(btrmVar, bjfdVar);
        super.am();
    }

    @Override // defpackage.bjjc
    public final void b() {
        w();
        View view = this.ar;
        if (view != null) {
            view.clearFocus();
        }
    }

    @Override // defpackage.bjfi
    protected final cqiw<bjjm> g() {
        dbsk.s(this.d);
        return new bjjl();
    }

    @Override // defpackage.bjfk
    protected final /* bridge */ /* synthetic */ bjjm i(ilo iloVar) {
        bjjx bjjxVar = this.b;
        dbsk.s(bjjxVar);
        bwrs a = bwrs.a(iloVar);
        djao djaoVar = this.ao;
        dbsk.s(djaoVar);
        boolean z = this.ak;
        boolean z2 = this.al;
        dqcj dqcjVar = this.am;
        gga a2 = bjjxVar.a.a();
        bjjx.a(a2, 1);
        bjjx.a(bjjxVar.b.a(), 2);
        bjgu a3 = bjjxVar.c.a();
        bjjx.a(a3, 3);
        bjzo a4 = bjjxVar.d.a();
        bjjx.a(a4, 4);
        bjxm a5 = bjjxVar.e.a();
        bjjx.a(a5, 5);
        bjxq a6 = bjjxVar.f.a();
        bjjx.a(a6, 6);
        bjje a7 = bjjxVar.g.a();
        bjjx.a(a7, 7);
        bjhs a8 = bjjxVar.h.a();
        bjjx.a(a8, 8);
        bjgi a9 = bjjxVar.i.a();
        bjjx.a(a9, 9);
        bjze a10 = bjjxVar.j.a();
        bjjx.a(a10, 10);
        bjjx.a(bjjxVar.k.a(), 11);
        bjjx.a(bjjxVar.l.a(), 12);
        bjjx.a(bjjxVar.m.a(), 13);
        bjjx.a(this, 14);
        bjjx.a(this, 15);
        bjjx.a(this, 16);
        bjjx.a(a, 17);
        bjjx.a(djaoVar, 18);
        bjjx.a(dqcjVar, 21);
        return new bjjw(a2, a3, a4, a5, a6, a7, a8, a9, a10, this, this, a, djaoVar, z, z2, dqcjVar);
    }

    @Override // defpackage.bjfk, defpackage.bjfi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        djao djaoVar = (djao) bvrs.e(this.o, djao.class, (dssr) djao.i.cu(7));
        if (djaoVar != null) {
            this.ao = djaoVar;
        } else {
            bvoo.h("Unable to get questionBundle from saved bundle.", new Object[0]);
        }
        this.e = this.o.getBoolean("enable_answer_input");
        this.ak = this.o.getBoolean("skip_post_contribution_thanks_page");
        this.al = this.o.getBoolean("close_after_answering_question");
        this.am = (dqcj) dbsg.j(dqcj.b(this.o.getInt("entry_point"))).c(dqcj.UNKNOWN_PLACE_QA_ENTRY_POINT);
        super.l(bundle);
        bjjm bjjmVar = (bjjm) this.ag;
        dbsk.s(bjjmVar);
        this.ap = new bjfd(bjjmVar);
        btrm btrmVar = this.c;
        dbsk.s(btrmVar);
        bjfe.c(btrmVar, this.ap);
    }

    @Override // defpackage.ges
    public final ddho p() {
        ilo iloVar = this.ai;
        dbsk.s(iloVar);
        djai djaiVar = iloVar.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        int a = dqct.a(dqcuVar.b);
        return (a != 0 && a == 3) ? dtxl.X : dtxy.gq;
    }
}

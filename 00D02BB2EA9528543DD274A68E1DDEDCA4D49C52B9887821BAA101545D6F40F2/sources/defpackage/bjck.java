package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjck  reason: default package */
/* loaded from: classes3.dex */
public final class bjck extends bjfk<bjda> {
    public bjdj a;
    private List<dqcq> ak;
    @dzsi
    private djao al;
    @dzsi
    private bjea am;
    public bjeb b;
    public bjgb c;
    public bjgu d;
    public cqhu e;

    public static bjck q(bwqv bwqvVar, bwrs<ilo> bwrsVar) {
        bjck bjckVar = new bjck();
        bjckVar.B(aJ(bwqvVar, bwrsVar));
        return bjckVar;
    }

    public static bjck w(bwqv bwqvVar, bwrs<ilo> bwrsVar, djao djaoVar) {
        bjck q = q(bwqvVar, bwrsVar);
        bvrs.l(q.o, djaoVar);
        return q;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof djao) {
            this.ak = dcdc.r(((djao) obj).h);
            bjea bjeaVar = this.am;
            dbsk.s(bjeaVar);
            bjeaVar.f(this.ak);
            bjda bjdaVar = (bjda) this.ag;
            dbsk.s(bjdaVar);
            boolean isEmpty = this.ak.isEmpty();
            djao djaoVar = this.al;
            boolean z = true;
            if (djaoVar != null && djaoVar.h.equals(this.ak)) {
                z = false;
            }
            bjdaVar.k(isEmpty, z);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        View view = this.P;
        if (view != null) {
            dbsk.s(this.e);
            View a = cqhu.a(view, bjcz.a);
            if (a == null) {
                return;
            }
            bjda bjdaVar = (bjda) this.ag;
            dbsk.s(bjdaVar);
            bjwz o = bjdaVar.o();
            if (o != null && !o.b().isEmpty()) {
                return;
            }
            a.requestFocus();
            ((InputMethodManager) J().getSystemService("input_method")).toggleSoftInput(2, 1);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        jmw.d(J(), null);
        super.al();
    }

    @Override // defpackage.bjfi
    protected final cqiw<bjda> g() {
        dbsk.s(this.d);
        return new bjcz();
    }

    @Override // defpackage.bjfk
    protected final /* bridge */ /* synthetic */ bjda i(ilo iloVar) {
        bjea bjeaVar;
        djai djaiVar = iloVar.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dsrj<dqcq> dsrjVar = djaiVar.e;
        dbsk.s(this.c);
        djam djamVar = null;
        if (!bjgb.a(iloVar) || dsrjVar.isEmpty()) {
            bjeaVar = null;
        } else {
            bjeb bjebVar = this.b;
            dbsk.s(bjebVar);
            List<dqcq> list = this.ak;
            dbsk.s(list);
            bjeb.a(bjebVar.a.a(), 1);
            bjeb.a(iloVar, 2);
            bjeb.a(dsrjVar, 3);
            bjeb.a(list, 4);
            bjeb.a(this, 5);
            bjeaVar = new bjea(iloVar, dsrjVar, list, this);
        }
        this.am = bjeaVar;
        T t = this.ag;
        if (t instanceof bjdi) {
            this.Z.b(((bjdi) t).c);
        }
        bjdj bjdjVar = this.a;
        dbsk.s(bjdjVar);
        bjea bjeaVar2 = this.am;
        djao djaoVar = this.al;
        if (djaoVar != null && (djamVar = djaoVar.b) == null) {
            djamVar = djam.m;
        }
        djam djamVar2 = djamVar;
        gga a = bjdjVar.a.a();
        bjdj.a(a, 1);
        bjdj.a(bjdjVar.b.a(), 2);
        bjhc a2 = bjdjVar.c.a();
        bjdj.a(a2, 3);
        gdc a3 = bjdjVar.d.a();
        bjdj.a(a3, 4);
        bjdj.a(bjdjVar.e.a(), 5);
        bvfk a4 = bjdjVar.f.a();
        bjdj.a(a4, 6);
        btrm a5 = bjdjVar.g.a();
        bjdj.a(a5, 7);
        bjgi a6 = bjdjVar.h.a();
        bjdj.a(a6, 8);
        chhr a7 = bjdjVar.i.a();
        bjdj.a(a7, 9);
        chht a8 = bjdjVar.j.a();
        bjdj.a(a8, 10);
        bkag a9 = bjdjVar.k.a();
        bjdj.a(a9, 11);
        bjdj.a(bjdjVar.l.a(), 12);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl a10 = bjdjVar.m.a();
        bjdj.a(a10, 13);
        bjdj.a(this, 14);
        bjdj.a(iloVar, 15);
        bjdj.a(dsrjVar, 16);
        bjdi bjdiVar = new bjdi(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, iloVar, dsrjVar, bjeaVar2, djamVar2);
        this.Z.a(bjdiVar.c);
        return bjdiVar;
    }

    @Override // defpackage.bjfk, defpackage.bjfi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        List<dqcq> list;
        djao djaoVar = (djao) bvrs.e(this.o, djao.class, (dssr) djao.i.cu(7));
        this.al = djaoVar;
        if (djaoVar == null) {
            list = dcdc.e();
        } else {
            list = djaoVar.h;
        }
        this.ak = list;
        super.l(bundle);
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
        return (a != 0 && a == 3) ? dtxl.M : dtxy.fT;
    }
}

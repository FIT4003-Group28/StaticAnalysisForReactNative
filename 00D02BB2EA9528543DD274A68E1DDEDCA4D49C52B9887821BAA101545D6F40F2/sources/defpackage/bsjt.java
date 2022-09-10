package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsjt  reason: default package */
/* loaded from: classes4.dex */
public class bsjt implements bsjq {
    public static final boolean a;
    public final btvo b;
    public final aeqi c;
    public bsjm d;
    public aehu f;
    public aehu g;
    private final Activity h;
    private final aehr i;
    private final cqkj j;
    private final ddho k;
    private final aeol l;
    private gdf n;
    @dzsi
    private bsks o;
    private final aeoj m = new bsjs(this);
    public int e = 0;

    static {
        a = Build.VERSION.SDK_INT < 22;
    }

    public bsjt(Activity activity, aehr aehrVar, aeol aeolVar, cqkj cqkjVar, aeqi aeqiVar, btvo btvoVar, bsjm bsjmVar, bskq bskqVar, aehu aehuVar) {
        this.h = activity;
        this.b = btvoVar;
        this.i = aehrVar;
        this.l = aeolVar;
        this.c = aeqiVar;
        this.j = cqkjVar;
        this.d = bsjmVar;
        this.f = aehuVar;
        this.g = aehuVar;
        this.k = bskqVar.c();
    }

    @Override // defpackage.bskm
    public String a() {
        return this.f.b(this.h);
    }

    @Override // defpackage.bskm
    public String b() {
        aehu aehuVar = this.f;
        Activity activity = this.h;
        long j = aehuVar.e;
        long j2 = aehuVar.f;
        return activity.getString(R.string.RESTRICTION_HOTEL_DATEPICKER_PIVOT_TITLE_DESCRIPTION, new Object[]{aehu.c(activity, j, j, true), aehu.c(activity, j2, j2, true)});
    }

    @Override // defpackage.bskm
    public Boolean c() {
        return true;
    }

    @Override // defpackage.bskm
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bskm
    public cqkl e(cjqm cjqmVar) {
        r();
        return cqkl.a;
    }

    @Override // defpackage.bskm
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = this.k;
        ddes bZ = ddet.D.bZ();
        ddfp bZ2 = ddfq.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddfq ddfqVar = (ddfq) bZ2.b;
        ddfqVar.a |= 2;
        ddfqVar.b = 14;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddfq bK = bZ2.bK();
        bK.getClass();
        ddetVar.u = bK;
        ddetVar.a |= 8388608;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.bskm
    @dzsi
    public cqtd g() {
        return cqrt.g(2131232656, cqrt.c(R.color.google_blue600));
    }

    @Override // defpackage.bskm
    public View.OnClickListener h() {
        return bskj.a(this);
    }

    @Override // defpackage.bskm
    public Boolean i() {
        return true;
    }

    @Override // defpackage.bskm
    public cqfc j() {
        return new cqfc(this) { // from class: bsjr
            private final bsjt a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                bsjt bsjtVar = this.a;
                if (!z || !bsjtVar.b.getCategoricalSearchParameters().j() || bsjtVar.d.n() == null) {
                    return;
                }
                dnnn n = bsjtVar.d.n();
                dbsk.s(n);
                dqxa dqxaVar = n.d;
                if (dqxaVar == null) {
                    dqxaVar = dqxa.f;
                }
                if (!aeqi.g(dqxaVar)) {
                    return;
                }
                aeqi aeqiVar = bsjtVar.c;
                aeqiVar.b = view;
                aeqiVar.h();
            }
        };
    }

    @Override // defpackage.bsjq
    public void k(@dzsi bsks bsksVar) {
        this.o = bsksVar;
    }

    @Override // defpackage.bsjq
    public djmk l() {
        return djmk.SHOW_AS_VALUE_SELECTOR;
    }

    @Override // defpackage.bsjq
    public void m(boolean z) {
        throw null;
    }

    @Override // defpackage.bsjq
    public void n() {
        q();
    }

    public void o(bsjm bsjmVar) {
        dnnn n = bsjmVar.n();
        if (!aehr.c(n)) {
            return;
        }
        this.d = bsjmVar;
        dbsk.s(n);
        aehu d = aehr.d(n);
        this.f = d;
        this.g = d;
        cqkx.p(this);
    }

    public final void p(aehu aehuVar) {
        if (aehuVar.equals(this.g)) {
            return;
        }
        this.f = aehuVar;
        this.g = aehuVar;
        bsjm bsjmVar = this.d;
        bsjmVar.p(this.i.f(aehuVar.c, aehuVar.d));
        bsks bsksVar = this.o;
        if (bsksVar == null) {
            return;
        }
        bsksVar.h(bsjmVar, cjqm.a);
    }

    public final void q() {
        gdf gdfVar = this.n;
        if (gdfVar != null) {
            gdfVar.dismiss();
        }
    }

    public final void r() {
        cqiw aelrVar;
        gdf gdfVar = new gdf(this.h, 16974132);
        this.n = gdfVar;
        aeol aeolVar = this.l;
        aeoj aeojVar = this.m;
        aehu aehuVar = this.f;
        aeok a2 = aeolVar.a(aeojVar, aehuVar.c, aehuVar.d, this.e);
        cqkj cqkjVar = this.j;
        if (!a) {
            aelrVar = new aelr();
        } else {
            eapg eapgVar = this.e == 0 ? this.f.c : this.f.d;
            aelrVar = new aema(eapgVar.r(), eapgVar.s() - 1, eapgVar.t());
        }
        cqkf c = cqkjVar.c(aelrVar, null);
        c.e(a2);
        gdfVar.setContentView(c.c());
        this.n.show();
    }
}

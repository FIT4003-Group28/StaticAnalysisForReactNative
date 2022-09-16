package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxzk  reason: default package */
/* loaded from: classes4.dex */
public class bxzk implements bxxt {
    public final btrm a;
    public final dxio<ckcw> b;
    public final String c;
    @dzsi
    public final akqi d;
    public boolean e;
    private final dxio<nut> f;
    private final String g;
    private final String h;
    private final String i;
    private final jic j;
    private final cqss k;
    private final acmv l;
    private final cys m;
    private final cjtd n;
    private final cvv o;

    public bxzk(dqig dqigVar, btrm btrmVar, cvv cvvVar, dxio<nut> dxioVar, dxio<ckcw> dxioVar2, btvo btvoVar, Activity activity, cyt cytVar) {
        akqi akqiVar;
        acmw b;
        this.a = btrmVar;
        this.f = dxioVar;
        this.b = dxioVar2;
        this.g = dqigVar.d;
        this.h = dqigVar.b == 3 ? (String) dqigVar.c : "";
        try {
            akqiVar = akqi.b(dqigVar.h);
        } catch (IllegalArgumentException unused) {
            akqiVar = null;
        }
        this.d = akqiVar;
        dpll dpllVar = dqigVar.f;
        this.c = (dpllVar == null ? dpll.c : dpllVar).a;
        dpll dpllVar2 = dqigVar.f;
        this.i = (dpllVar2 == null ? dpll.c : dpllVar2).b;
        this.j = bxnv.g(dqigVar.e);
        this.k = iva.b(ibl.a(), ibl.a());
        if (btvoVar.getAdsParameters().l) {
            String string = activity.getString(R.string.AD);
            activity.getResources();
            b = acpd.a(string);
        } else {
            b = acpd.b(activity.getString(R.string.AD), 4, activity.getResources());
        }
        this.l = b;
        this.o = cvvVar;
        this.e = true;
        cys a = cytVar.a();
        a.g(ibl.p());
        if ((dqigVar.a & 32) != 0) {
            dqmr dqmrVar = dqigVar.g;
            a.f(dqmrVar == null ? dqmr.h : dqmrVar);
        }
        this.m = a;
        cjta b2 = cjtd.b();
        b2.d = dtyb.bF;
        if (akqiVar != null) {
            b2.g = decs.a(akqiVar.c);
            ddes bZ = ddet.D.bZ();
            ddeo bZ2 = ddep.f.bZ();
            dtbk g = akqiVar.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddep ddepVar = (ddep) bZ2.b;
            g.getClass();
            ddepVar.b = g;
            int i = ddepVar.a | 1;
            ddepVar.a = i;
            ddepVar.a = i | 2;
            ddepVar.c = false;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = bZ2.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a = 1 | ddetVar.a;
            b2.s(bZ.bK());
        } else {
            b2.g = null;
        }
        this.n = b2.a();
        ((ckcn) dxioVar2.a().a(ckke.h)).a();
    }

    @Override // defpackage.bxxt
    public CharSequence a() {
        return this.g;
    }

    @Override // defpackage.bxxt
    public CharSequence b() {
        return this.h;
    }

    @Override // defpackage.bxxt
    public jic c() {
        return this.j;
    }

    @Override // defpackage.bxxt
    public cqss d() {
        return this.k;
    }

    @Override // defpackage.bxxt
    public acmv e() {
        return this.l;
    }

    @Override // defpackage.bxxt
    public cyg f() {
        return this.m;
    }

    @Override // defpackage.bxxt
    public cqkl g(cjqm cjqmVar) {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.ay.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            doeh bZ2 = doei.d.bZ();
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            bK.getClass();
            dnqhVar3.m = bK;
            dnqhVar3.a |= 262144;
        }
        this.o.c(this.i, 79444, 41);
        ((ckcn) this.b.a().a(ckke.f)).a();
        nxb f = this.f.a().f();
        String str = this.g;
        f.f(str, this.d, str, 0, bZ.bK(), true, false, false, false, null);
        return cqkl.a;
    }

    @Override // defpackage.bxxt
    public cjtd h() {
        return this.n;
    }

    @Override // defpackage.bxxt
    public View.OnLayoutChangeListener i() {
        return new View.OnLayoutChangeListener(this) { // from class: bxzj
            private final bxzk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                bxzk bxzkVar = this.a;
                if (bxzkVar.e) {
                    bxzkVar.e = false;
                    if (bxzkVar.d == null) {
                        return;
                    }
                    bxzkVar.a.b(new becx(bxzkVar.c, 7));
                    ((ckcn) bxzkVar.b.a().a(ckke.d)).a();
                }
            }
        };
    }
}

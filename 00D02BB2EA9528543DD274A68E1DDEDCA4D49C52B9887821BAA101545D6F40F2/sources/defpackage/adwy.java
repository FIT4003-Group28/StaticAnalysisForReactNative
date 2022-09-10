package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adwy  reason: default package */
/* loaded from: classes2.dex */
public class adwy implements jbj {
    public final Executor a;
    public final bnoq b;
    public final bvan c;
    public final btlu d;
    public final dggg e;
    public final String f;
    public final long g;
    public dqjc h;
    private final Activity i;
    private final akfc j;
    private final String k;
    private final String l;

    public adwy(Activity activity, cqhn cqhnVar, Executor executor, akfc akfcVar, bnoq bnoqVar, bvan bvanVar, btlu btluVar, dwfl dwflVar, String str) {
        this.i = activity;
        this.a = executor;
        this.j = akfcVar;
        this.b = bnoqVar;
        this.c = bvanVar;
        this.d = btluVar;
        dizh dizhVar = dwflVar.p;
        dggg dgggVar = (dizhVar == null ? dizh.j : dizhVar).b;
        dgggVar = dgggVar == null ? dggg.d : dgggVar;
        this.e = dgggVar;
        dpsn dpsnVar = dwflVar.t;
        long j = (dpsnVar == null ? dpsn.d : dpsnVar).b;
        dpsn dpsnVar2 = dwflVar.t;
        this.f = new akqi(j, (dpsnVar2 == null ? dpsn.d : dpsnVar2).c).o();
        dpsn dpsnVar3 = dwflVar.t;
        long j2 = (dpsnVar3 == null ? dpsn.d : dpsnVar3).c;
        this.g = j2;
        dqjc dqjcVar = dwflVar.s;
        dqjh b = dqjh.b((dqjcVar == null ? dqjc.d : dqjcVar).c);
        b = b == null ? dqjh.UNKNOWN_VOTE_TYPE : b;
        bnop d = bnop.d(btluVar, j2, dgggVar);
        dqjh a = bnoqVar.a.a(d);
        if (a != null) {
            b = a;
        } else {
            bnoqVar.a.Pz(d, b);
        }
        dqjc dqjcVar2 = dwflVar.s;
        this.h = a(dqjcVar2 == null ? dqjc.d : dqjcVar2, b);
        Object[] objArr = new Object[2];
        objArr[0] = str;
        dwfh dwfhVar = dwflVar.k;
        dnpq dnpqVar = (dwfhVar == null ? dwfh.d : dwfhVar).c;
        objArr[1] = (dnpqVar == null ? dnpq.g : dnpqVar).d;
        this.k = activity.getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_PHOTO_THUMBS_UP_CONTEXT, objArr);
        this.l = dwflVar.c;
    }

    public static dqjc a(dqjc dqjcVar, dqjh dqjhVar) {
        dqjh b = dqjh.b(dqjcVar.c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (!n(b) || n(dqjhVar)) {
            dqjh b2 = dqjh.b(dqjcVar.c);
            if (b2 == null) {
                b2 = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (n(b2) || !n(dqjhVar)) {
                return dqjcVar;
            }
            dsqp dsqpVar = (dsqp) dqjcVar.cu(5);
            dsqpVar.bC(dqjcVar);
            dqjb dqjbVar = (dqjb) dsqpVar;
            if (dqjbVar.c) {
                dqjbVar.bF();
                dqjbVar.c = false;
            }
            dqjc dqjcVar2 = (dqjc) dqjbVar.b;
            dqjcVar2.c = dqjhVar.e;
            int i = dqjcVar2.a | 8;
            dqjcVar2.a = i;
            int i2 = dqjcVar.b;
            dqjcVar2.a = i | 1;
            dqjcVar2.b = i2 + 1;
            return dqjbVar.bK();
        }
        dsqp dsqpVar2 = (dsqp) dqjcVar.cu(5);
        dsqpVar2.bC(dqjcVar);
        dqjb dqjbVar2 = (dqjb) dsqpVar2;
        if (dqjbVar2.c) {
            dqjbVar2.bF();
            dqjbVar2.c = false;
        }
        dqjc dqjcVar3 = (dqjc) dqjbVar2.b;
        dqjcVar3.c = dqjhVar.e;
        int i3 = dqjcVar3.a | 8;
        dqjcVar3.a = i3;
        int i4 = dqjcVar.b;
        dqjcVar3.a = i3 | 1;
        dqjcVar3.b = i4 - 1;
        return dqjbVar2.bK();
    }

    private static boolean n(dqjh dqjhVar) {
        return dqjhVar == dqjh.THUMBS_UP;
    }

    @Override // defpackage.jbj
    public String b() {
        return this.h.b > 0 ? NumberFormat.getInstance(akr.a(this.i.getResources().getConfiguration()).d()).format(this.h.b) : "";
    }

    @Override // defpackage.jbj
    public Boolean c() {
        dqjh b = dqjh.b(this.h.c);
        if (b == null) {
            b = dqjh.UNKNOWN_VOTE_TYPE;
        }
        return Boolean.valueOf(n(b));
    }

    @Override // defpackage.jbj
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jbj
    public CharSequence e() {
        String quantityString;
        int i = this.h.b;
        if (c().booleanValue()) {
            quantityString = this.i.getResources().getQuantityString(R.plurals.PHOTO_ACCESSIBILITY_THUMBS_UP_CHECKED_DESCRIPTION, i, Integer.valueOf(i));
        } else {
            quantityString = this.i.getResources().getQuantityString(R.plurals.PHOTO_ACCESSIBILITY_THUMBS_UP_UNCHECKED_DESCRIPTION, i, Integer.valueOf(i));
        }
        return TextUtils.concat(this.k, ", ", quantityString);
    }

    @Override // defpackage.jbj
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence g() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.jbj
    public CharSequence j() {
        return "";
    }

    @Override // defpackage.jbj
    public Boolean k() {
        return true;
    }

    @Override // defpackage.jbj
    public cqkl l() {
        this.j.a(akeu.j(new akeo(this) { // from class: adww
            private final adwy a;

            {
                this.a = this;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                adwy adwyVar = this.a;
                dqjh dqjhVar = adwyVar.c().booleanValue() ? dqjh.THUMBS_VOTE_NONE : dqjh.THUMBS_UP;
                dqjc dqjcVar = adwyVar.h;
                adwyVar.h = adwy.a(dqjcVar, dqjhVar);
                bvan bvanVar = adwyVar.c;
                dizq bZ = dizr.f.bZ();
                String str = adwyVar.f;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dizr dizrVar = (dizr) bZ.b;
                str.getClass();
                int i = dizrVar.a | 8;
                dizrVar.a = i;
                dizrVar.e = str;
                dggg dgggVar = adwyVar.e;
                dgggVar.getClass();
                dizrVar.b = dgggVar;
                int i2 = i | 1;
                dizrVar.a = i2;
                int i3 = i2 | 2;
                dizrVar.a = i3;
                dizrVar.c = 0;
                dizrVar.d = dqjhVar.e;
                dizrVar.a = i3 | 4;
                bvanVar.b(bZ.bK(), new adwx(adwyVar, dqjhVar, dqjcVar), adwyVar.a);
                cqkx.p(adwyVar);
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
        return cqkl.a;
    }

    @Override // defpackage.jbj
    public cqkl m() {
        return cqkl.a;
    }

    @Override // defpackage.jbj
    public cqtd q() {
        return null;
    }

    @Override // defpackage.jbj
    public cqtd r() {
        return null;
    }

    @Override // defpackage.jbj
    public cjtd s() {
        deaa deaaVar;
        cjta b = cjtd.b();
        b.d = dtxr.bR;
        ddzy bZ = deab.c.bZ();
        if (c().booleanValue()) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.g(this.l);
        return b.a();
    }

    @Override // defpackage.jbj
    public cjtd t() {
        return null;
    }

    @Override // defpackage.jbj
    public CharSequence u() {
        return "";
    }

    @Override // defpackage.jbj
    public void v(int i) {
    }
}

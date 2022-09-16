package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahfn  reason: default package */
/* loaded from: classes2.dex */
public class ahfn implements agwu, agbt {
    private final gga a;
    private final agaw b;
    private final dehq c;
    private final dehq d;
    private final ilo e;
    @dzsi
    private final jic f;
    private final dcdc<agwt> g;
    private final decs h;
    private final cjta i;
    private final agww j;
    private final boolean k;
    @dzsi
    private CharSequence l;

    public ahfn(cqhn cqhnVar, gga ggaVar, akfa akfaVar, ahha ahhaVar, agaw agawVar, ania aniaVar, dehq dehqVar, dehq dehqVar2, agbv<akqi> agbvVar, dlcx dlcxVar, int i, ddzg ddzgVar, @dzsi List<dwfl> list, boolean z) {
        dwfl bJ;
        dcdc<agwt> f;
        List<dwfl> list2 = list;
        this.a = ggaVar;
        this.b = agawVar;
        this.c = dehqVar;
        this.d = dehqVar2;
        ily ilyVar = new ily();
        dvyw dvywVar = dlcxVar.c;
        ilyVar.E(dvywVar == null ? dvyw.bv : dvywVar);
        ilo d = ilyVar.d();
        this.e = d;
        this.k = z;
        if (list2 == null || list.isEmpty()) {
            bJ = d.bJ();
        } else {
            bJ = list2.get(0);
        }
        this.f = agxk.g(bJ);
        dccx F = dcdc.F();
        boolean z2 = false;
        for (dwfl dwflVar : (list2 == null || list.isEmpty()) ? d.aE() : list2) {
            jic g = agxk.g(dwflVar);
            if (g != null) {
                F.g(ahdh.b(g));
                z2 = true;
            }
        }
        if (z2) {
            f = F.f();
        } else {
            f = dcdc.f(ahdh.b(agxk.i(this.f)));
        }
        this.g = f;
        decs a = decs.a(this.e.ai().c);
        this.h = a;
        cjta b = cjtd.b();
        b.g(dlcxVar.b);
        b.i(i);
        b.g = a;
        b.r(ddzgVar);
        this.i = b;
        if (aniaVar.b(akfaVar.j())) {
            ddes bZ = ddet.D.bZ();
            ddeo bZ2 = ddep.f.bZ();
            dtbk g2 = this.e.ai().g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddep ddepVar = (ddep) bZ2.b;
            g2.getClass();
            ddepVar.b = g2;
            ddepVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddep bK = bZ2.bK();
            bK.getClass();
            ddetVar.c = bK;
            ddetVar.a |= 1;
            b.s(bZ.bK());
        }
        ilo iloVar = this.e;
        cqhn a2 = ahhaVar.a.a();
        ahha.a(a2, 1);
        gga a3 = ahhaVar.b.a();
        ahha.a(a3, 2);
        agaw a4 = ahhaVar.c.a();
        ahha.a(a4, 3);
        dehq a5 = ahhaVar.d.a();
        ahha.a(a5, 4);
        dehq a6 = ahhaVar.e.a();
        ahha.a(a6, 5);
        agbv<akqi> a7 = ahhaVar.f.a();
        ahha.a(a7, 6);
        ahha.a(iloVar, 7);
        ahha.a(b, 8);
        this.j = new ahgz(a2, a3, a4, a5, a6, a7, iloVar, b);
        agbvVar.a(this.e.ai(), this);
    }

    @Override // defpackage.agwu
    public ilo b() {
        return this.e;
    }

    @Override // defpackage.agwu
    public CharSequence c() {
        return this.e.n();
    }

    @Override // defpackage.agwu
    @dzsi
    public jic d() {
        return this.f;
    }

    @Override // defpackage.agwu
    public jic e() {
        return agxk.i(d());
    }

    @Override // defpackage.agwu
    public List<agwt> f() {
        return this.g;
    }

    @Override // defpackage.agwu
    @dzsi
    public Float g() {
        float af = this.e.af();
        if (Float.isNaN(af)) {
            return null;
        }
        return Float.valueOf(af);
    }

    @Override // defpackage.agwu
    @dzsi
    public CharSequence h() {
        Float g = g();
        if (g != null) {
            return String.format(Locale.getDefault(), "%.1f", g);
        }
        return null;
    }

    @Override // defpackage.agwu
    @dzsi
    public CharSequence i() {
        Float g = g();
        int X = this.e.X();
        return X > 0 ? this.a.getResources().getQuantityString(g != null ? R.plurals.REVIEW_COUNT_SHORT : R.plurals.REVIEW_COUNT_LONG, X, Integer.valueOf(X)) : this.a.getString(R.string.REVIEW_COUNT_ZERO);
    }

    @Override // defpackage.agwu
    @dzsi
    public CharSequence j() {
        int X = this.e.X();
        if (g() == null) {
            return null;
        }
        return this.a.getResources().getQuantityString(R.plurals.REVIEW_COUNT_LONG, X, Integer.valueOf(X));
    }

    @Override // defpackage.agwu
    public CharSequence k() {
        return this.e.bD();
    }

    @Override // defpackage.agwu
    @dzsi
    public CharSequence m() {
        return this.l;
    }

    @Override // defpackage.agwu
    public agww n() {
        return this.j;
    }

    @Override // defpackage.agwu
    public cqkl o() {
        this.b.a(this.e, null, jjn.EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.agwu
    public cjtd p(ddho ddhoVar) {
        return this.i.b(ddhoVar);
    }

    @Override // defpackage.agwu
    public Boolean q() {
        dcep<baab> dcepVar;
        azwv b = this.b.b(this.e);
        if (b == null) {
            dcepVar = dcmr.a;
        } else {
            dcepVar = b.r();
        }
        return Boolean.valueOf(dcepVar.contains(baab.LOCAL_FOLLOWING_STARRED_PLACES));
    }

    public void r(@dzsi CharSequence charSequence) {
        this.l = charSequence;
    }

    @Override // defpackage.agbt
    /* renamed from: s */
    public void a(akqi akqiVar) {
        bvqd.a(this.c.d(new Runnable(this) { // from class: ahfm
            private final ahfn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        }, 225L, TimeUnit.MILLISECONDS), this.d);
    }

    @Override // defpackage.agwu
    public CharSequence l() {
        String str;
        if (!this.k) {
            ArrayList arrayList = new ArrayList();
            if (!dbsj.d(this.e.av())) {
                str = this.e.av();
            } else {
                dvxz dvxzVar = this.e.h().s;
                if (dvxzVar == null) {
                    dvxzVar = dvxz.h;
                }
                str = dvxzVar.d;
            }
            arrayList.add(str);
            arrayList.add(this.e.ar());
            arrayList.add(this.e.Y());
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                if (!dbsj.d(str2)) {
                    if (sb.length() != 0) {
                        sb.append(" · ");
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }
        return this.e.bC();
    }
}

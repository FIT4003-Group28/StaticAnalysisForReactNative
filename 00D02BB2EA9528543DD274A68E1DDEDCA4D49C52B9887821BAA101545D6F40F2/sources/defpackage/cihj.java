package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cihj  reason: default package */
/* loaded from: classes4.dex */
public class cihj extends cibj implements cihf, chyv {
    public final chrx a;
    public final chxl b;
    public final baad c;
    private final gga d;
    private final aymh e;
    private final dcdc<cqix<? extends cqkp>> f;
    private final List<chyv> g;

    public cihj(gga ggaVar, aymh aymhVar, axwi axwiVar, chrx chrxVar, chxl chxlVar, dcdc<cqix<? extends cqkp>> dcdcVar) {
        super(chxlVar);
        this.d = ggaVar;
        this.e = aymhVar;
        this.a = chrxVar;
        this.b = chxlVar;
        dpot dpotVar = chxlVar.e;
        this.c = axwiVar.c(dpotVar == null ? dpot.m : dpotVar);
        this.f = dcdcVar;
        this.g = dchl.k(dcdcVar, cihg.a);
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List<? extends chyv> d() {
        return this.g;
    }

    @Override // defpackage.cihf
    public cqtd e() {
        baab baabVar = baab.FAVORITES;
        int ordinal = this.c.o().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return cqrt.f(2131231794);
            }
            return cqrt.f(2131231790);
        }
        return cqrt.f(2131231791);
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof cihj) {
            cihj cihjVar = (cihj) obj;
            return this.b.equals(cihjVar.b) && dchl.m(this.f, cihjVar.f);
        }
        return false;
    }

    @Override // defpackage.cihf
    public CharSequence f() {
        return this.c.E(this.d);
    }

    @Override // defpackage.cihf
    public CharSequence g() {
        int i;
        aymh aymhVar = this.e;
        baad baadVar = this.c;
        int k = baadVar.k();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        azed azedVar = aymhVar.b;
        baac t = baadVar.t();
        baac baacVar = baac.PRIVATE;
        drcs drcsVar = drcs.UNKNOWN_SHARING_STATE;
        int ordinal = t.ordinal();
        if (ordinal == 0) {
            i = R.string.YOUR_PRIVATE_LIST;
        } else if (ordinal == 1) {
            i = R.string.YOUR_SHARED_LIST;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                String valueOf = String.valueOf(t);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Illegal sharing state - ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new AssertionError(t);
        } else {
            i = R.string.YOUR_PUBLIC_LIST;
        }
        return spannableStringBuilder.append((CharSequence) new SpannableStringBuilder().append(azedVar.a.getResources().getText(i))).append((CharSequence) " · ").append((CharSequence) aymhVar.a.getResources().getQuantityString(aymh.i(baadVar), k, Integer.valueOf(k)));
    }

    @Override // defpackage.cihf
    @dzsi
    public jic h() {
        String str;
        chxp chxpVar = this.b.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        if (!chxpVar.j) {
            dnwl I = this.c.I();
            if (I == null || (I.a & 8192) == 0) {
                str = null;
            } else {
                dnwr dnwrVar = I.e;
                if (dnwrVar == null) {
                    dnwrVar = dnwr.c;
                }
                str = dnwrVar.b;
            }
            if (str == null) {
                return null;
            }
            return new jic(str, ckqc.FIFE_MERGE, iup.e(R.raw.editorial_list), 250);
        }
        return null;
    }

    public int hashCode() {
        chxr chxrVar = this.b.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        int i = chxrVar.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(chxrVar).c(chxrVar);
        chxrVar.bC = c;
        return c;
    }

    @Override // defpackage.cihf
    public CharSequence i() {
        return this.c.G();
    }

    @Override // defpackage.cihf
    public List<cqix<?>> j() {
        return this.f;
    }

    @Override // defpackage.cihf
    public cqkl k() {
        this.a.u(this.b);
        return cqkl.a;
    }

    @Override // defpackage.cihf
    public jht l() {
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.DISMISS_FROM_TODO_LIST;
        jhmVar.a = this.d.getString(R.string.DISMISS_FROM_TODO_LIST);
        jhmVar.b = this.d.getString(R.string.DISMISS_FROM_TODO_LIST);
        jhmVar.g = new jhn(this) { // from class: cihh
            private final cihj a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                cihj cihjVar = this.a;
                chrx chrxVar = cihjVar.a;
                chxr chxrVar = cihjVar.b.b;
                if (chxrVar == null) {
                    chxrVar = chxr.e;
                }
                chrxVar.z(chxrVar);
            }
        };
        jhmVar.f = s(dtxl.hs);
        jho c = jhmVar.c();
        jhm jhmVar2 = new jhm();
        jhmVar2.l = R.string.EDIT_LIST;
        jhmVar2.a = this.d.getString(R.string.EDIT_LIST);
        jhmVar2.b = this.d.getString(R.string.EDIT_LIST);
        jhmVar2.f = s(dtxl.hn);
        jhmVar2.g = new jhn(this) { // from class: cihi
            private final cihj a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                cihj cihjVar = this.a;
                cihjVar.a.T(cihjVar.c);
            }
        };
        jho c2 = jhmVar2.c();
        jhu h = jhv.h();
        h.d(c2);
        h.d(c);
        ((jhi) h).e = this.d.getString(R.string.PLACE_MENU_BUTTON_DESCRIPTION_WITH_PLACE, new Object[]{f()});
        return h.b();
    }
}

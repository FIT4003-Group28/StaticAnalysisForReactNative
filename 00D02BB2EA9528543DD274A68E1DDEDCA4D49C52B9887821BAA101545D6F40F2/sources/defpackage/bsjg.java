package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsjg  reason: default package */
/* loaded from: classes4.dex */
public class bsjg implements bsgz, bsgt {
    private dcdc<djkt> a;
    private int b;
    private int c;
    private final String d;
    private final djkt e;
    private final Activity f;

    public bsjg(Activity activity, cqhn cqhnVar) {
        this.f = activity;
        this.d = activity.getString(R.string.RESTRICTION_VISIT_HISTORY_TITLE);
        djks bZ = djkt.e.bZ();
        String string = activity.getString(R.string.RESTRICTION_VISIT_HISTORY_ANY);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkt djktVar = (djkt) bZ.b;
        string.getClass();
        djktVar.a |= 1;
        djktVar.b = string;
        this.e = bZ.bK();
        this.a = dcdc.e();
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.a.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        boolean z = false;
        if (i < 0 || i >= c().intValue()) {
            return false;
        }
        if (i == this.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return (i < 0 || i >= c().intValue()) ? "" : this.a.get(i).b;
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (i >= 0 && i < c().intValue()) {
            this.c = i;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= 0 && i < c().intValue()) {
            if (i == 0) {
                return cjtd.a(dtxp.ab);
            }
            djmv djmvVar = (djmv) bvrs.c(this.a.get(i).c, (dssr) djmv.c.cu(7));
            if (djmvVar != null && djmvVar.a == 12) {
                int a = djod.a(((djoe) djmvVar.b).b);
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 1) {
                    return cjtd.a(dtxp.ad);
                }
                if (i2 == 2) {
                    return cjtd.a(dtxp.ac);
                }
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.d;
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        String string;
        if (e(i) == "") {
            return "";
        }
        if (d(i).booleanValue()) {
            string = this.f.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.f.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.f.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, new Object[]{e(i), string});
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        List<djkt> v = bsjmVar.v(17);
        int i = 1;
        int min = Math.min(v.size() + 1, 3);
        dccx F = dcdc.F();
        F.g(this.e);
        for (int i2 = 1; i2 < min; i2++) {
            F.g(v.get(i2 - 1));
        }
        this.a = F.f();
        this.b = 0;
        Set<dspd> c = bsjmVar.c(16);
        if (c.size() == 1) {
            dspd next = c.iterator().next();
            while (true) {
                if (i >= this.a.size()) {
                    break;
                } else if (next.equals(this.a.get(i).c)) {
                    this.b = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.c = this.b;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        int i = this.c;
        if (i == this.b) {
            return;
        }
        if (i == 0) {
            bsjmVar.e(16);
        } else {
            bsjmVar.u(16, this.a.get(i).c, 2);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (c().intValue() <= 1) {
            return;
        }
        cqivVar.a(new bsfy(), this);
    }
}

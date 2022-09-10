package defpackage;

import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cbaq  reason: default package */
/* loaded from: classes4.dex */
class cbaq implements bsgz {
    final /* synthetic */ cbar a;
    private final dcdc<String> b;
    private final Set<Integer> c = new HashSet();

    public cbaq(cbar cbarVar) {
        this.a = cbarVar;
        for (Integer num : cbarVar.d.d.get(0).d) {
            this.c.add(Integer.valueOf(num.intValue() - 1));
        }
        this.b = dcdc.j(cbarVar.b.getString(R.string.MONTHLY_REPEATING_EVENT_FIRST_WEEK_OF_MONTH_TOGGLE), cbarVar.b.getString(R.string.MONTHLY_REPEATING_EVENT_SECOND_WEEK_OF_MONTH_TOGGLE), cbarVar.b.getString(R.string.MONTHLY_REPEATING_EVENT_THIRD_WEEK_OF_MONTH_TOGGLE), cbarVar.b.getString(R.string.MONTHLY_REPEATING_EVENT_FOURTH_WEEK_OF_MONTH_TOGGLE), cbarVar.b.getString(R.string.MONTHLY_REPEATING_EVENT_FIFTH_WEEK_OF_MONTH_TOGGLE));
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(!this.b.get(i).isEmpty());
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.b.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(this.c.contains(Integer.valueOf(i)));
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (d(i).booleanValue()) {
            if (this.c.size() == 1) {
                return cqkl.a;
            }
            this.c.remove(Integer.valueOf(i));
        } else {
            this.c.add(Integer.valueOf(i));
        }
        dccx dccxVar = new dccx();
        for (Integer num : this.c) {
            dccxVar.g(Integer.valueOf(num.intValue() + 1));
        }
        dpyf dpyfVar = this.a.d.d.get(0);
        dsqp dsqpVar = (dsqp) dpyfVar.cu(5);
        dsqpVar.bC(dpyfVar);
        dpye dpyeVar = (dpye) dsqpVar;
        if (dpyeVar.c) {
            dpyeVar.bF();
            dpyeVar.c = false;
        }
        dsrg<Integer, dpol> dsrgVar = dpyf.c;
        ((dpyf) dpyeVar.b).d = dpyf.cf();
        dcdc f = dccxVar.f();
        if (dpyeVar.c) {
            dpyeVar.bF();
            dpyeVar.c = false;
        }
        dpyf dpyfVar2 = (dpyf) dpyeVar.b;
        dpyfVar2.b();
        dsod.bv(f, dpyfVar2.d);
        dpyf bK = dpyeVar.bK();
        cbar cbarVar = this.a;
        dpsd dpsdVar = cbarVar.d;
        dsqp dsqpVar2 = (dsqp) dpsdVar.cu(5);
        dsqpVar2.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar2;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        ((dpsd) dpscVar.b).d = dpsd.ck();
        dpscVar.b(bK);
        cbarVar.d = dpscVar.bK();
        cbar cbarVar2 = this.a;
        cbarVar2.a.d(cbarVar2.d);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.jab
    public cjtd g(int i) {
        return cjtd.b;
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.a.b.getString(R.string.MONTHLY_REPEATING_EVENT_WEEK_OF_MONTH_INPUT_TITLE);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        return d(i).booleanValue() ? this.a.b.getString(R.string.ACCESSIBILITY_SELECTED_TOGGLE, new Object[]{e(i)}) : e(i);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }
}

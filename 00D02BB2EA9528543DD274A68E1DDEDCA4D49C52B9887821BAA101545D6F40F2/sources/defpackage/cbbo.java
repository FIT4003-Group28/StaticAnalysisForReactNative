package defpackage;

import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cbbo  reason: default package */
/* loaded from: classes4.dex */
class cbbo implements bsgz {
    final /* synthetic */ cbbq a;
    private final dcdc<String> b;
    private final Set<Integer> d = new HashSet();
    private final dcdc<dpol> c = cbpy.f();

    public cbbo(cbbq cbbqVar) {
        this.a = cbbqVar;
        for (dpol dpolVar : new dsrh(cbbqVar.c.c.get(0).c, dqmn.d)) {
            this.d.add(Integer.valueOf(this.c.indexOf(dpolVar)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.getDefault());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Calendar calendar = Calendar.getInstance();
        dcdc<dpol> dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            Integer e = cbpy.e(dcdcVar.get(i));
            if (e != null) {
                calendar.set(7, e.intValue());
                linkedHashMap.put(e, simpleDateFormat.format(calendar.getTime()));
            }
        }
        this.b = dcdc.r(linkedHashMap.values());
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
        return Boolean.valueOf(this.d.contains(Integer.valueOf(i)));
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        if (d(i).booleanValue()) {
            if (this.d.size() == 1) {
                return cqkl.a;
            }
            this.d.remove(Integer.valueOf(i));
        } else {
            this.d.add(Integer.valueOf(i));
        }
        dccx dccxVar = new dccx();
        for (Integer num : this.d) {
            dccxVar.g(this.c.get(num.intValue()));
        }
        dqmn dqmnVar = this.a.c.c.get(0);
        dsqp dsqpVar = (dsqp) dqmnVar.cu(5);
        dsqpVar.bC(dqmnVar);
        dqmm dqmmVar = (dqmm) dsqpVar;
        if (dqmmVar.c) {
            dqmmVar.bF();
            dqmmVar.c = false;
        }
        dsrg<Integer, dpol> dsrgVar = dqmn.d;
        ((dqmn) dqmmVar.b).c = dqmn.cf();
        dcdc<dpol> f = dccxVar.f();
        if (dqmmVar.c) {
            dqmmVar.bF();
            dqmmVar.c = false;
        }
        dqmn dqmnVar2 = (dqmn) dqmmVar.b;
        dqmnVar2.b();
        for (dpol dpolVar : f) {
            dqmnVar2.c.h(dpolVar.i);
        }
        dqmn bK = dqmmVar.bK();
        cbbq cbbqVar = this.a;
        dpsd dpsdVar = cbbqVar.c;
        dsqp dsqpVar2 = (dsqp) dpsdVar.cu(5);
        dsqpVar2.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar2;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        ((dpsd) dpscVar.b).c = dpsd.ck();
        dpscVar.d(bK);
        cbbqVar.c = dpscVar.bK();
        cbbq cbbqVar2 = this.a;
        cbbqVar2.a.d(cbbqVar2.c);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.jab
    public cjtd g(int i) {
        return cjtd.b;
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.a.b.getString(R.string.WEEKLY_REPEATING_EVENT_DAY_OF_WEEK_INPUT_TITLE);
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

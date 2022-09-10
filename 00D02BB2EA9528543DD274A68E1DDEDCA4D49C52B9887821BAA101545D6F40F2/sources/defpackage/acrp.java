package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/* compiled from: PG */
/* renamed from: acrp  reason: default package */
/* loaded from: classes2.dex */
public class acrp implements acqy {
    public final cjqy a;
    public int b;
    public acrk d;
    private final cqkj e;
    private final cqhn f;
    private final Activity g;
    private final boolean i;
    private final gce j;
    private dpol l;
    @dzsi
    private Integer m;
    private final acpa n;
    @dzsi
    private dvvs p;
    private final List<acqw> k = dchl.a();
    List<dvvq> c = new ArrayList();
    private String o = "";
    private final bbb q = new acrn(this);
    private final acrj r = new acro(this);
    private final Calendar h = Calendar.getInstance();

    public acrp(cqkj cqkjVar, cqhn cqhnVar, Activity activity, cjqy cjqyVar, gce gceVar, boolean z) {
        this.e = cqkjVar;
        this.f = cqhnVar;
        this.g = activity;
        this.a = cjqyVar;
        this.n = new acpc(activity.getText(R.string.BUSYNESS_BASED_ON_VISITS), activity.getText(R.string.BUSYNESS_A11Y_INFO_BUTTON_CLICK));
        this.i = z;
        this.j = gceVar;
    }

    private final int a() {
        for (int i = 0; i < this.c.size(); i++) {
            dpol b = dpol.b(this.c.get(i).b);
            if (b == null) {
                b = dpol.DAY_OF_WEEK_UNSPECIFIED;
            }
            if (b == this.l) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.acqy
    public bbb b() {
        return this.q;
    }

    @Override // defpackage.acqy
    public List<acqw> c() {
        if (this.k.isEmpty()) {
            int a = a();
            int i = 0;
            while (i < this.c.size()) {
                dvvq dvvqVar = this.c.get(i);
                List<acqw> list = this.k;
                cqkj cqkjVar = this.e;
                cqhn cqhnVar = this.f;
                Activity activity = this.g;
                dvvs dvvsVar = null;
                Integer num = a == i ? this.m : null;
                String str = a == i ? this.o : "";
                if (a == i) {
                    dvvsVar = this.p;
                }
                list.add(new acrg(cqkjVar, cqhnVar, activity, dvvqVar, num, str, dvvsVar));
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.acqy
    public acpa d() {
        return this.n;
    }

    @Override // defpackage.acqy
    @dzsi
    public acmi e() {
        return this.d;
    }

    @Override // defpackage.acqy
    public Integer f() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.acqy
    @dzsi
    public CharSequence h() {
        int i = this.b;
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        dgly dglyVar = this.c.get(this.b).e;
        if (dglyVar == null) {
            dglyVar = dgly.c;
        }
        return acls.a(dglyVar);
    }

    public void i(dvvo dvvoVar, dpol dpolVar, @dzsi Integer num) {
        dpol dpolVar2;
        switch (this.h.getFirstDayOfWeek()) {
            case 1:
                dpolVar2 = dpol.SUNDAY;
                break;
            case 2:
                dpolVar2 = dpol.MONDAY;
                break;
            case 3:
                dpolVar2 = dpol.TUESDAY;
                break;
            case 4:
                dpolVar2 = dpol.WEDNESDAY;
                break;
            case 5:
                dpolVar2 = dpol.THURSDAY;
                break;
            case 6:
                dpolVar2 = dpol.FRIDAY;
                break;
            case 7:
                dpolVar2 = dpol.SATURDAY;
                break;
            default:
                dpolVar2 = dpol.DAY_OF_WEEK_UNSPECIFIED;
                break;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (dvvq dvvqVar : dvvoVar.b) {
            dpol b = dpol.b(dvvqVar.b);
            if (b == null) {
                b = dpol.DAY_OF_WEEK_UNSPECIFIED;
            }
            z |= !(b != dpolVar2);
            if (z) {
                arrayList.add(dvvqVar);
            } else {
                arrayList2.add(dvvqVar);
            }
        }
        arrayList.addAll(arrayList2);
        this.c = arrayList;
        this.o = dvvoVar.c;
        this.l = dpolVar;
        this.m = num;
        this.b = a();
        if (this.i && (dvvoVar.a & 2) != 0) {
            dvvs dvvsVar = dvvoVar.d;
            if (dvvsVar == null) {
                dvvsVar = dvvs.g;
            }
            this.p = dvvsVar;
        }
        if (this.d == null) {
            this.d = new acrk(this.g, this.a, this.j, this.r);
        }
        this.d.e(dcdc.r(this.c), this.b);
        this.k.clear();
    }

    public final boolean j(int i) {
        if (i == this.b) {
            return false;
        }
        this.b = i;
        cqkx.p(this);
        return true;
    }

    @Override // defpackage.acqy
    public acli g() {
        dvvs dvvsVar;
        if (!this.i || (dvvsVar = this.p) == null || (dvvsVar.a & 2) == 0) {
            return acli.a(dtxk.U);
        }
        return acli.a(dtxu.G);
    }
}

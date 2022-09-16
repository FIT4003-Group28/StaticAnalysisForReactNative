package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bshs  reason: default package */
/* loaded from: classes4.dex */
public class bshs implements bsgt, bsgu, bsha {
    public final Activity a;
    private final djkt b;
    private final List<djkt> c;
    private djkt d;
    private djkt e;
    private djkt f;
    @dzsi
    private final bshr g;

    public bshs(Activity activity) {
        this(activity, null);
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        return this.a.getString(R.string.EXPERIENCE_TIME_FILTER_BOTTOM_SHEET_TITLE);
    }

    @Override // defpackage.bsgu
    public List<? extends jae> b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.c.size(); i++) {
            arrayList.add(new bshq(this, this.c.get(i), i));
        }
        return arrayList;
    }

    public void c(cjqm cjqmVar, int i) {
        this.e = this.c.get(i);
        cqkx.p(this);
        bshr bshrVar = this.g;
        if (bshrVar != null) {
            ((bsaf) bshrVar).a.a(cjqmVar);
        }
    }

    public boolean d(int i) {
        return this.e.equals(this.c.get(i));
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.d = this.b;
        List<djkt> v = bsjmVar.v(34);
        Set<dspd> c = bsjmVar.c(33);
        if (c.size() == 1) {
            dspd next = c.iterator().next();
            Iterator<djkt> it = v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                djkt next2 = it.next();
                if (next2.c.equals(next)) {
                    this.d = next2;
                    break;
                }
            }
        }
        djkt djktVar = this.d;
        this.e = djktVar;
        this.f = djktVar;
        this.c.clear();
        this.c.add(this.b);
        this.c.addAll(bsjmVar.v(34));
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        djkt djktVar = this.e;
        this.f = djktVar;
        dbsk.s(djktVar);
        if (djktVar.equals(this.d)) {
            return;
        }
        djkt djktVar2 = this.e;
        dbsk.s(djktVar2);
        if (djktVar2.equals(this.b)) {
            bsjmVar.e(33);
            return;
        }
        djkt djktVar3 = this.e;
        if (djktVar3 == null) {
            return;
        }
        bsjmVar.u(33, djktVar3.c, 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.c.size() <= 1) {
            return;
        }
        cqivVar.a(new bscn(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        return t() ? this.f.b : this.a.getString(R.string.EXPERIENCE_TIME_FILTER_BOTTOM_SHEET_TITLE);
    }

    @Override // defpackage.bsha
    public String r() {
        return this.a.getString(R.string.EXPERIENCE_TIME_FILTER_BOTTOM_SHEET_TITLE);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return !this.f.equals(this.b);
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        o(cqivVar);
    }

    public bshs(Activity activity, @dzsi bshr bshrVar) {
        this.c = new ArrayList();
        this.a = activity;
        this.g = bshrVar;
        djks bZ = djkt.e.bZ();
        String string = activity.getString(R.string.EXPERIENCE_TIME_OF_DAY_FILTER_ANY_TIME);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkt djktVar = (djkt) bZ.b;
        string.getClass();
        djktVar.a |= 1;
        djktVar.b = string;
        djkt bK = bZ.bK();
        this.b = bK;
        this.d = bK;
        this.e = bK;
        this.f = bK;
    }
}

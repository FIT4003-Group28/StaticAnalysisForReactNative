package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsho  reason: default package */
/* loaded from: classes4.dex */
public class bsho implements bsgt, bsgu, bsha {
    public final Activity a;
    private final djkt b;
    private final dbsg<djkt> c;
    private final List<djkt> d;
    private djkt e;
    private djkt f;
    private djkt g;
    @dzsi
    private final bshn h;
    @dzsi
    private final bshn i;
    private final bshm j;

    public bsho(Activity activity) {
        this(activity, null, null, bshm.PILL);
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        if (this.j == bshm.LIST) {
            return this.a.getString(aaai.EXPERIENCE_DATE_FILTER_BOTTOM_SHEET_TITLE);
        }
        return this.a.getString(R.string.EXPERIENCE_TIME_FRAME_PIVOT_PANEL_TITLE);
    }

    @Override // defpackage.bsgu
    public List<? extends jae> b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.d.size(); i++) {
            arrayList.add(new bshl(this, this.d.get(i), i));
        }
        return arrayList;
    }

    public void c(cjqm cjqmVar, int i) {
        djkt djktVar = this.d.get(i);
        if (this.c.a() && dbsd.a(djktVar, this.c.b())) {
            bshn bshnVar = this.i;
            if (bshnVar == null) {
                return;
            }
            ((bsae) bshnVar).a.aT(new bshk());
            return;
        }
        this.f = djktVar;
        cqkx.p(this);
        bshn bshnVar2 = this.h;
        if (bshnVar2 == null) {
            return;
        }
        ((bsad) bshnVar2).a.a(cjqmVar);
    }

    public boolean d(int i) {
        return this.f.equals(this.d.get(i));
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.e = this.b;
        List<djkt> v = bsjmVar.v(24);
        Set<dspd> c = bsjmVar.c(23);
        if (c.size() == 1) {
            dspd next = c.iterator().next();
            Iterator<djkt> it = v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                djkt next2 = it.next();
                if (next2.c.equals(next)) {
                    this.e = next2;
                    break;
                }
            }
        }
        djkt djktVar = this.e;
        this.f = djktVar;
        this.g = djktVar;
        this.d.clear();
        this.d.add(this.b);
        this.d.addAll(bsjmVar.v(24));
        if (this.c.a()) {
            this.d.add(this.c.b());
        }
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        djkt djktVar = this.f;
        this.g = djktVar;
        dbsk.s(djktVar);
        if (djktVar.equals(this.e)) {
            return;
        }
        djkt djktVar2 = this.f;
        dbsk.s(djktVar2);
        if (djktVar2.equals(this.b)) {
            bsjmVar.e(23);
            return;
        }
        djkt djktVar3 = this.f;
        if (djktVar3 == null) {
            return;
        }
        bsjmVar.u(23, djktVar3.c, 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.d.size() <= 1) {
            return;
        }
        if (this.j == bshm.LIST) {
            cqivVar.a(new bscn(), this);
        } else {
            cqivVar.a(new bscv(), this);
        }
    }

    @Override // defpackage.bsha
    public String q() {
        return t() ? this.g.b : this.a.getString(R.string.EXPERIENCE_TIME_FRAME_FILTER_TITLE);
    }

    @Override // defpackage.bsha
    public String r() {
        return this.a.getString(R.string.EXPERIENCE_TIME_FRAME_FILTER_TITLE);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return !this.g.equals(this.b);
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        o(cqivVar);
    }

    public bsho(Activity activity, @dzsi bshn bshnVar, @dzsi bshn bshnVar2, bshm bshmVar) {
        dbsg<djkt> dbsgVar;
        this.d = new ArrayList();
        this.a = activity;
        this.h = bshnVar;
        this.i = bshnVar2;
        this.j = bshmVar;
        djks bZ = djkt.e.bZ();
        String string = activity.getString(R.string.EXPERIENCE_TIME_FRAME_FILTER_UPCOMING);
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
        if (bshmVar == bshm.LIST) {
            djks bZ2 = djkt.e.bZ();
            String string2 = activity.getString(aaai.EXPERIENCE_TIME_FRAME_FILTER_CHOOSE_DATES);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djkt djktVar2 = (djkt) bZ2.b;
            string2.getClass();
            djktVar2.a |= 1;
            djktVar2.b = string2;
            dbsgVar = dbsg.i(bZ2.bK());
        } else {
            dbsgVar = dbpy.a;
        }
        this.c = dbsgVar;
        this.e = bK;
        this.f = bK;
        this.g = bK;
    }
}

package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bshy  reason: default package */
/* loaded from: classes4.dex */
public class bshy implements bsgt, bsgu, bsha {
    public static final dcdn<dspd, Integer> b;
    public final Resources a;
    private final List<djkt> d = new ArrayList();
    public final Set<djkt> c = new LinkedHashSet();
    private final Set<djkt> e = new LinkedHashSet();

    static {
        dcdg p = dcdn.p();
        p.f(d(2), 2131232127);
        p.f(d(4), 2131232203);
        p.f(d(8), 2131232279);
        p.f(d(5), 2131232280);
        p.f(d(3), 2131232319);
        p.f(d(6), 2131232331);
        p.f(d(9), 2131232386);
        p.f(d(10), 2131232393);
        p.f(d(11), 2131232403);
        p.f(d(7), 2131232466);
        b = p.b();
    }

    public bshy(cqhn cqhnVar, Resources resources) {
        this.a = resources;
    }

    private static dspd d(int i) {
        djmu bZ = djmv.c.bZ();
        djkw bZ2 = djky.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djky djkyVar = (djky) bZ2.b;
        djkyVar.b = i - 1;
        djkyVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djky bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 24;
        return bZ.bK().bR();
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        return this.a.getString(R.string.RESTRICTION_HOTEL_AMENITIES);
    }

    @Override // defpackage.bsgu
    public List<? extends jae> b() {
        ArrayList arrayList = new ArrayList();
        for (djkt djktVar : this.d) {
            arrayList.add(new bshx(this, djktVar));
        }
        return arrayList;
    }

    public final boolean c(djkt djktVar) {
        return this.c.contains(djktVar);
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.d.clear();
        this.c.clear();
        this.e.clear();
        this.d.addAll(bsjmVar.v(11));
        Set<dspd> c = bsjmVar.c(10);
        for (djkt djktVar : this.d) {
            if (c.contains(djktVar.c)) {
                this.c.add(djktVar);
            }
        }
        this.e.addAll(this.c);
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        if (this.c.equals(this.e)) {
            return;
        }
        this.e.clear();
        this.e.addAll(this.c);
        bsjmVar.e(10);
        for (djkt djktVar : this.c) {
            bsjmVar.u(10, djktVar.c, 3);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.d.isEmpty()) {
            return;
        }
        cqivVar.a(new bsds(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        if (this.e.isEmpty()) {
            return h();
        }
        String str = this.e.iterator().next().b;
        if (this.e.size() == 1) {
            return str;
        }
        return this.a.getQuantityString(R.plurals.RESTRICTION_HOTEL_AMENITIES_MULTIPLE_SELECTED, this.e.size() - 1, str, Integer.valueOf(this.e.size() - 1));
    }

    @Override // defpackage.bsha
    public String r() {
        return this.a.getString(R.string.RESTRICTION_HOTEL_AMENITIES);
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return !this.e.isEmpty();
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        if (this.d.isEmpty()) {
            return;
        }
        cqivVar.a(new bscx(), this);
    }
}

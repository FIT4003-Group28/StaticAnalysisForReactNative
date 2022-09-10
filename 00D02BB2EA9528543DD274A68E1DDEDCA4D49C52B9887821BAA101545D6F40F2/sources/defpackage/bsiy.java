package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsiy  reason: default package */
/* loaded from: classes4.dex */
public class bsiy implements bsgu, bsgt {
    private final Resources a;
    private Set<djkt> b = new HashSet();
    private Set<djkt> c = new HashSet();
    private List<djkt> d = dcdc.e();

    public bsiy(cqhn cqhnVar, Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.bsgu
    public String a() {
        return this.a.getString(R.string.RESTRICTION_MORE_FILTERS_TITLE);
    }

    @Override // defpackage.bsgu
    public List<? extends jae> b() {
        dccx F = dcdc.F();
        for (int i = 0; i < this.d.size(); i++) {
            F.g(new bsix(this, this.d.get(i), i));
        }
        return F.f();
    }

    public void c(int i, cjqm cjqmVar) {
        if (!this.c.remove(this.d.get(i))) {
            this.c.add(this.d.get(i));
        }
        cqkx.p(this);
    }

    public boolean d(int i) {
        return this.c.contains(this.d.get(i));
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.d = dcdc.r(bsjmVar.v(16));
        this.c = new HashSet();
        this.b = new HashSet();
        Set<dspd> c = bsjmVar.c(15);
        if (c.isEmpty()) {
            return;
        }
        for (djkt djktVar : this.d) {
            if (c.contains(djktVar.c)) {
                this.b.add(djktVar);
                this.c.add(djktVar);
            }
        }
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        if (this.c.isEmpty()) {
            bsjmVar.e(15);
        }
        for (djkt djktVar : this.c) {
            bsjmVar.u(15, djktVar.c, 3);
        }
        for (djkt djktVar2 : this.b) {
            if (!this.c.contains(djktVar2)) {
                bsjmVar.d(15, djktVar2.c);
            }
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        cqivVar.a(new bsfk(), this);
    }
}

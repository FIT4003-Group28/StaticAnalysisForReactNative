package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bshw  reason: default package */
/* loaded from: classes4.dex */
abstract class bshw implements bsgt, bsgu, bsha {
    public final djkt a;
    public djkt b;
    public final Activity c;
    private final List<djkt> d = new ArrayList();
    private djkt e;
    private djkt f;
    @dzsi
    private final bshv g;

    public bshw(Activity activity, @dzsi bshv bshvVar) {
        this.c = activity;
        this.g = bshvVar;
        djks bZ = djkt.e.bZ();
        String string = activity.getString(R.string.RESTRICTION_FILTER_ANY);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkt djktVar = (djkt) bZ.b;
        string.getClass();
        djktVar.a |= 1;
        djktVar.b = string;
        djkt bK = bZ.bK();
        this.a = bK;
        this.e = bK;
        this.f = bK;
        this.b = bK;
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        return this.c.getString(c());
    }

    public List<? extends jae> b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.d.size(); i++) {
            arrayList.add(new bshu(this, this.d.get(i), i));
        }
        return arrayList;
    }

    public abstract int c();

    public abstract int d();

    public abstract ddho e();

    public abstract ddho f();

    public boolean g(int i) {
        return this.b.equals(this.d.get(i));
    }

    public void i(int i, cjqm cjqmVar) {
        this.b = this.d.get(i);
        cqkx.p(this);
        bshv bshvVar = this.g;
        if (bshvVar != null) {
            bshvVar.a(cjqmVar);
        }
    }

    public abstract int j();

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.e = this.a;
        List<djkt> v = bsjmVar.v(j());
        int j = j();
        int i = j - 1;
        if (j != 0) {
            Set<dspd> c = bsjmVar.c(i);
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
            this.b = djktVar;
            this.f = djktVar;
            this.d.clear();
            this.d.add(this.a);
            this.d.addAll(bsjmVar.v(j()));
            return;
        }
        throw null;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        djkt djktVar = this.b;
        this.f = djktVar;
        if (djktVar.equals(this.e)) {
            return;
        }
        if (this.b.equals(this.a)) {
            int j = j();
            int i = j - 1;
            if (j == 0) {
                throw null;
            }
            bsjmVar.e(i);
            return;
        }
        int j2 = j();
        int i2 = j2 - 1;
        if (j2 == 0) {
            throw null;
        }
        bsjmVar.u(i2, this.b.c, 2);
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.d.size() <= 1) {
            return;
        }
        cqivVar.a(new bsds(), this);
    }

    public String q() {
        return t() ? this.f.b : this.c.getString(c());
    }

    public String r() {
        return this.c.getString(c());
    }

    @dzsi
    public cqtd s() {
        return null;
    }

    public boolean t() {
        return !this.f.equals(this.a);
    }

    public void u(cqiv cqivVar) {
        if (this.d.size() > 1) {
            cqivVar.a(new bscx(), this);
        }
    }
}

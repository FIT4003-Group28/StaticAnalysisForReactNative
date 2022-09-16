package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bgtm  reason: default package */
/* loaded from: classes3.dex */
public class bgtm implements bgsk {
    public final bgsh a;
    public final begg c;
    public final bnjv d;
    public final brwl e;
    public final cjqy f;
    public String g;
    @dzsi
    public bgrc h;
    @dzsi
    public cqkp i;
    private final Activity l;
    private final bgrd m;
    private final bgsy n;
    private final bgsi o;
    private final List<bgsj> q;
    private dhnk r;
    private boolean s;
    @dzsi
    private bwrs<ilo> t;
    protected final bgrb j = new bgtg(this);
    protected final bgsg k = new bgth(this);
    private final bnij u = new bgti(this);
    private final cqqw v = new bgtj(this);
    private final cqrh w = new bgtk(this);
    public final Map<String, brve> b = new HashMap();
    private final List<String> p = new ArrayList();

    public bgtm(Activity activity, bgrd bgrdVar, bgsy bgsyVar, bgte bgteVar, bgst bgstVar, begg beggVar, bnjv bnjvVar, brwl brwlVar, cjqy cjqyVar) {
        this.l = activity;
        this.m = bgrdVar;
        this.n = bgsyVar;
        this.o = bgteVar;
        this.a = bgstVar;
        this.c = beggVar;
        this.d = bnjvVar;
        this.e = brwlVar;
        this.f = cjqyVar;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = dhnk.c;
        this.g = "";
        this.s = false;
        arrayList.add(bgteVar);
        arrayList.add(bgsyVar);
        arrayList.add(bgstVar);
    }

    private final List<String> o() {
        ArrayList arrayList = new ArrayList();
        for (dhnj dhnjVar : this.r.b) {
            arrayList.add(dhnjVar.a);
        }
        return arrayList;
    }

    private final List<String> p() {
        dwca b;
        ArrayList arrayList = new ArrayList();
        bwrs<ilo> bwrsVar = this.t;
        if (bwrsVar != null && (b = bgsf.b(bwrsVar)) != null) {
            for (dwcg dwcgVar : b.a) {
                if (bgsf.d(dwcgVar.d).contains(bgsf.d(this.g))) {
                    arrayList.add(dwcgVar.e);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.bgsk
    public String a() {
        return this.l.getString(R.string.MALLS_DIRECTORY_TITLE);
    }

    @Override // defpackage.bgsk
    public bgsi b() {
        return this.o;
    }

    @Override // defpackage.bgsk
    public List<brve> c() {
        ArrayList arrayList = new ArrayList();
        for (String str : n()) {
            if (this.b.get(str) == null) {
                break;
            }
            arrayList.add(this.b.get(str));
        }
        return arrayList;
    }

    @Override // defpackage.bgsk
    public bnik d() {
        return this.n;
    }

    @Override // defpackage.bgsk
    public bgsh e() {
        return this.a;
    }

    @Override // defpackage.bgsk
    @dzsi
    public cqkp f() {
        bgrc bgrcVar;
        int size = c().size();
        int size2 = n().size();
        bgtl bgtlVar = null;
        if (this.s && (bgrcVar = this.h) != null && size != size2 && !bgrcVar.c.isEmpty()) {
            bgtlVar = new bgtl();
        }
        this.i = bgtlVar;
        return bgtlVar;
    }

    @Override // defpackage.bgsk
    public void g(@dzsi String str) {
        dhnk f = this.a.f(str);
        this.r = f;
        bgrc bgrcVar = this.h;
        if (bgrcVar != null) {
            bgrcVar.e(f.equals(dhnk.c) ? this.p : o());
        }
    }

    @Override // defpackage.bgsk
    public void h(bwrs<ilo> bwrsVar) {
        if (!bgsf.c(bwrsVar)) {
            return;
        }
        this.t = bwrsVar;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxn.eE;
        this.n.p(c.a());
        this.a.h(dtxn.ex);
        for (bgsj bgsjVar : this.q) {
            bgsjVar.k();
            bgsjVar.j(bwrsVar);
        }
        dwca b = bgsf.b(bwrsVar);
        if (b != null) {
            for (dwcg dwcgVar : b.a) {
                this.p.add(dwcgVar.e);
            }
            this.h = this.m.a(this.j, this.r.equals(dhnk.c) ? this.p : o(), iloVar.n(), this.p);
        }
        this.a.d(this.k);
        this.a.g(this.r.a);
        this.n.n(this.u);
        this.n.q(this.g);
    }

    @Override // defpackage.bgsk
    public void i() {
        if (this.t != null) {
            this.b.clear();
            this.p.clear();
        }
        bwrs<ilo> bwrsVar = this.t;
        if (bwrsVar != null) {
            h(bwrsVar);
            m(true);
        }
    }

    @Override // defpackage.bgsk
    public void j(String str) {
        this.g = str;
        this.n.q(str);
        bgrc bgrcVar = this.h;
        if (bgrcVar != null) {
            bgrcVar.e(str.isEmpty() ? this.p : p());
        }
    }

    @Override // defpackage.bgsk
    public cqqw k() {
        return this.v;
    }

    @Override // defpackage.bgsk
    public cqrh l() {
        return this.w;
    }

    @Override // defpackage.bgsk
    public void m(boolean z) {
        this.s = z;
        cqkx.p(this);
    }

    final List<String> n() {
        List<String> arrayList = this.g.isEmpty() ? new ArrayList<>(this.p) : p();
        List<String> o = o();
        if (!o.isEmpty()) {
            arrayList.retainAll(o);
        }
        return arrayList;
    }
}

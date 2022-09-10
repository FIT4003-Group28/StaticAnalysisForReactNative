package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgtp  reason: default package */
/* loaded from: classes3.dex */
public class bgtp implements bgsl {
    public final begg b;
    public final bwqv c;
    @dzsi
    public bwrs<ilo> d;
    protected final bgsg e = new bgtn(this);
    protected final bnij f = new bgto(this);
    private final bgsp g;
    private final bgsy h;
    private final bgsi i;
    private final bgsh j;
    private final List<bgsj> k;
    private final bgse l;
    private final ckcw m;
    private final ahjq n;
    private boolean o;
    private boolean p;

    public bgtp(bgsp bgspVar, bgsy bgsyVar, bgte bgteVar, bgst bgstVar, begg beggVar, bwqv bwqvVar, bgse bgseVar, ckcw ckcwVar, ahjq ahjqVar) {
        this.g = bgspVar;
        this.h = bgsyVar;
        this.i = bgteVar;
        this.j = bgstVar;
        this.b = beggVar;
        this.c = bwqvVar;
        this.l = bgseVar;
        this.m = ckcwVar;
        this.n = ahjqVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        arrayList.add(bgteVar);
        if (bgseVar.a()) {
            arrayList.add(bgspVar);
            arrayList.add(bgsyVar);
            arrayList.add(bgstVar);
        }
    }

    @Override // defpackage.bgsl
    public bnia a() {
        return this.g;
    }

    @Override // defpackage.bgsl
    public bgsi b() {
        return this.i;
    }

    @Override // defpackage.bgsl
    public bnik c() {
        return this.h;
    }

    @Override // defpackage.bgsl
    public bgsh d() {
        return this.j;
    }

    @Override // defpackage.bgsl
    public Boolean e() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bgsl
    public Boolean f() {
        return Boolean.valueOf(this.l.a());
    }

    @Override // defpackage.bgsl
    public cjtd g() {
        ilo c;
        cjta b = cjtd.b();
        b.d = dtxn.eA;
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar != null && bwrsVar.c() != null && (c = this.d.c()) != null && (c.h().a & 8388608) != 0) {
            dpmx dpmxVar = c.h().C;
            if (dpmxVar == null) {
                dpmxVar = dpmx.c;
            }
            if ((dpmxVar.a & 2) != 0) {
                dpmx dpmxVar2 = c.h().C;
                if (dpmxVar2 == null) {
                    dpmxVar2 = dpmx.c;
                }
                b.g(dpmxVar2.b);
            }
        }
        return b.a();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
        ilo c = bwrsVar.c();
        if (c != null) {
            cjta c2 = cjtd.c(c.bZ());
            c2.d = dtxn.eD;
            this.h.p(c2.a());
            this.j.h(dtxn.eC);
        }
        this.o = bgsf.a(bwrsVar);
        this.p = bgsf.c(bwrsVar);
        this.i.j(bwrsVar);
        if (!this.p) {
            return;
        }
        for (bgsj bgsjVar : this.k) {
            if (!bgsjVar.equals(this.i)) {
                bgsjVar.j(bwrsVar);
            }
        }
        this.j.d(this.e);
        int i = 1;
        this.j.e(true);
        this.h.n(this.f);
        if (c == null || !this.o || !this.p || !this.l.a()) {
            return;
        }
        ckco ckcoVar = (ckco) this.m.a(cked.a);
        GmmLocation a = this.n.a();
        Float f = null;
        if (a != null && c.aj() != null) {
            akqq aj = c.aj();
            f = Float.valueOf(a.D(new akql(anae.a(aj.a), anae.a(aj.b))));
        }
        if (f != null) {
            i = f.floatValue() < 1000.0f ? 2 : f.floatValue() < 10000.0f ? 3 : f.floatValue() < 50000.0f ? 4 : 5;
        }
        ckcoVar.a(i - 1);
    }

    @Override // defpackage.bega
    public void u() {
        this.o = false;
        this.p = false;
        for (bgsj bgsjVar : this.k) {
            bgsjVar.k();
        }
    }

    @Override // defpackage.bega
    public Boolean w() {
        if (this.o) {
            for (bgsj bgsjVar : this.k) {
                if (bgsjVar.i()) {
                    return true;
                }
            }
        }
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mgw  reason: default package */
/* loaded from: classes7.dex */
public final class mgw extends nor {
    private static final cjsz m = new cjsz(dtxm.dC);
    public final noo a;
    public final ntc b;
    public final Context c;
    public final axwi d;
    public final axxb e;
    public final ldm f;
    public final Executor g;
    public final ckcw h;
    public final btrm i;
    public final mhm j;
    public List<mhn> k;
    public final mhl l;
    private final cqkf<mhm> n;
    private final kxs o;
    private final not p;
    private final hwe q;
    private final Executor r;
    private final cov s;

    public mgw(Context context, cqkj cqkjVar, not notVar, kxu kxuVar, noo nooVar, cjqy cjqyVar, cjqq cjqqVar, axxb axxbVar, axwi axwiVar, ldm ldmVar, hwe hweVar, cqhn cqhnVar, Executor executor, Executor executor2, ckcw ckcwVar, btrm btrmVar) {
        super(cjqyVar, cjqqVar);
        mgt mgtVar = new mgt(this);
        this.l = mgtVar;
        this.c = context;
        this.p = notVar;
        this.a = nooVar;
        this.b = new ntc(cqkjVar, dbsg.i(10));
        this.d = axwiVar;
        this.e = axxbVar;
        this.f = ldmVar;
        this.q = hweVar;
        this.r = executor;
        this.g = executor2;
        this.h = ckcwVar;
        this.i = btrmVar;
        cqkf<mhm> d = cqkjVar.d(new mhi(), ((npb) notVar).b, false);
        this.n = d;
        View c = d.c();
        kxn k = kxo.k();
        k.k();
        this.o = new kxs(c, k, kxuVar);
        this.s = (cov) d.c().findViewById(mhi.a);
        this.j = new mho(context, mgtVar, cqhnVar);
        this.k = new CopyOnWriteArrayList();
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        akqq akqqVar;
        akqi akqiVar;
        this.n.e(this.j);
        this.s.a.setClipChildren(false);
        this.s.setAdapter(this.b);
        ilo iloVar = this.f.d;
        if (iloVar != null && iloVar.aj() != null) {
            akqqVar = iloVar.aj();
            akqiVar = iloVar.ai();
        } else {
            amvh amvhVar = this.f.h;
            akqqVar = amvhVar.e;
            akqiVar = amvhVar.d;
        }
        if (akqqVar != null) {
            this.q.a(akqiVar, akra.f(akqqVar));
        }
        final mgs mgsVar = new mgs(this);
        bvqj.e(deew.h(this.d.f(), new dbrn(this, mgsVar) { // from class: mgq
            private final mgw a;
            private final mhj b;

            {
                this.a = this;
                this.b = mgsVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                mgw mgwVar = this.a;
                mhj mhjVar = this.b;
                dcdc dcdcVar = (dcdc) obj;
                mgwVar.k.clear();
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    baad baadVar = (baad) dcdcVar.get(i);
                    if (baadVar.y() && baadVar.o() != baab.CUSTOM) {
                        mgwVar.k.add(new mhn(mgwVar.c, baadVar.o(), mhjVar, mgwVar.l(baadVar), baadVar.E(mgwVar.c), baadVar.l(), Long.valueOf(baadVar.ah()), mgwVar.h));
                    }
                }
                mgwVar.k.add(new mhn(mgwVar.c, baab.STARRED_PLACES, mhjVar, mgwVar.k(), "", "", (Long) deha.s(mgwVar.e.f()), mgwVar.h));
                mgwVar.k = dclu.d(new mgu()).h(new mgv()).o(mgwVar.k);
                return true;
            }
        }, this.g), new bvqg(this) { // from class: mgp
            private final mgw a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                mgw mgwVar = this.a;
                Boolean bool = (Boolean) obj;
                mgwVar.b.b(new mhd(), dcdc.r(mgwVar.k));
                mgwVar.j.d();
                cqkx.p(mgwVar.j);
            }
        }, this.r);
    }

    @Override // defpackage.non
    public final noq b() {
        s(m);
        this.o.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.n.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.o.b();
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.n.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "PersonalPlacesOptionsOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.p.b(noeVar, this.n.c());
    }

    public final Boolean k() {
        ilo iloVar = this.f.d;
        boolean z = false;
        if (iloVar != null) {
            try {
                z = this.e.a(iloVar);
            } catch (axxc unused) {
            }
        }
        return Boolean.valueOf(z);
    }

    public final Boolean l(baad baadVar) {
        ilo iloVar = this.f.d;
        if (iloVar == null) {
            return false;
        }
        return Boolean.valueOf(baadVar.h(azxb.f(iloVar.ai(), iloVar.aj())));
    }
}

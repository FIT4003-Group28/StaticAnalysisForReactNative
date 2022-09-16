package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdex  reason: default package */
/* loaded from: classes4.dex */
public class cdex implements cdei, cdff, btzi {
    private static final dcqe f = dcqe.c("cdex");
    public final gga a;
    public final cdbb b;
    public final cdbf c;
    public cdew d;
    public boolean e;
    private final dxio<cafi> g;
    private final cdfx h;
    private final cdfh i;
    private final btvo j;
    private final ckcw k;
    private final aujx l;
    private final cdai m;
    private final buqs n;
    private final chhs o;
    private final crzm<btlu> p;
    private final jam q = new cdet();
    private final dcdc<cdfb> r;
    private final cdeh s;

    public cdex(cdbf cdbfVar, cdbb cdbbVar, cdew cdewVar, Context context, boolean z, cdai cdaiVar, gga ggaVar, Executor executor, cqhn cqhnVar, dxio<cafi> dxioVar, cdfx cdfxVar, cdfh cdfhVar, cklf cklfVar, btvo btvoVar, bvjj bvjjVar, akfa akfaVar, cjqy cjqyVar, ckcw ckcwVar, aujx aujxVar, buqs buqsVar, chht chhtVar) {
        this.c = cdbfVar;
        this.b = cdbbVar;
        this.d = cdewVar;
        this.e = z;
        this.a = ggaVar;
        this.g = dxioVar;
        this.h = cdfxVar;
        this.i = cdfhVar;
        this.j = btvoVar;
        this.k = ckcwVar;
        this.l = aujxVar;
        this.m = cdaiVar;
        this.n = buqsVar;
        this.o = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.p = akfaVar.C();
        dccx F = dcdc.F();
        for (cdfa cdfaVar : cdbfVar.b) {
            cdfh cdfhVar2 = this.i;
            int a = cdfaVar.a();
            cdbf cdbfVar2 = this.c;
            cdbb cdbbVar2 = this.b;
            cdfh.a(cdbfVar2, 2);
            cdfh.a(this, 3);
            cdfh.a(cdbbVar2, 4);
            gga a2 = cdfhVar2.a.a();
            cdfh.a(a2, 5);
            cdfh.a(cdfhVar2.b.a(), 6);
            bmdv a3 = cdfhVar2.c.a();
            cdfh.a(a3, 7);
            cdfm a4 = cdfhVar2.d.a();
            cdfh.a(a4, 8);
            cdfh.a(cdfhVar2.e.a(), 9);
            cdfh.a(cdfhVar2.f.a(), 10);
            gdc a5 = cdfhVar2.g.a();
            cdfh.a(a5, 11);
            cpv a6 = cdfhVar2.h.a();
            cdfh.a(a6, 12);
            F.g(new cdfg(a, cdbfVar2, this, cdbbVar2, a2, a3, a4, a5, a6));
        }
        this.r = F.f();
        this.p.a(new crzp(this) { // from class: cden
            private final cdex a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                cqkx.p(this.a);
            }
        }, executor);
        this.s = new cdes(this, ggaVar, cklfVar);
    }

    private final void C(int i, List<String> list) {
        this.h.o(i, list, new cdfu(this) { // from class: cdeo
            private final cdex a;

            {
                this.a = this;
            }

            @Override // defpackage.cdfu
            public final void a(boolean z) {
                cdex cdexVar = this.a;
                if (!z) {
                    gga ggaVar = cdexVar.a;
                    Toast.makeText(ggaVar, ggaVar.getString(R.string.DATA_REQUEST_ERROR), 1).show();
                }
            }
        });
    }

    @Override // defpackage.cdff
    public void A(int i) {
        if (!this.j.getContributionsPageParameters().c) {
            ilo d = this.c.d(i);
            cdbf cdbfVar = this.c;
            akqi ai = d.ai();
            dcen dcenVar = new dcen();
            ArrayList<cdfa> arrayList = cdbfVar.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cdfa cdfaVar = arrayList.get(i2);
                if (cdfaVar.b().ai().equals(ai)) {
                    dcdc<dwfl> k = cdfaVar.k();
                    int size2 = k.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        dcenVar.b(k.get(i3).d);
                    }
                }
            }
            final dcep f2 = dcenVar.f();
            this.h.l(d, new cdfu(this, f2) { // from class: cder
                private final cdex a;
                private final dcep b;

                {
                    this.a = this;
                    this.b = f2;
                }

                @Override // defpackage.cdfu
                public final void a(boolean z) {
                    cdex cdexVar = this.a;
                    dcep dcepVar = this.b;
                    if (z) {
                        if (cdexVar.c.j(dcepVar) == 1) {
                            cdexVar.b.i();
                        }
                        cqkx.p(cdexVar);
                        return;
                    }
                    gga ggaVar = cdexVar.a;
                    Toast.makeText(ggaVar, ggaVar.getString(R.string.DATA_REQUEST_ERROR), 1).show();
                }
            });
            return;
        }
        C(3, dcbg.b(this.c.e(i)).s(cdeq.a).z());
    }

    public final boolean B() {
        int a = dvlx.a(this.j.getPhotoUploadParameters().f);
        if (a == 0) {
            a = 2;
        }
        return a == 4 || a == 3 || a == 5;
    }

    @Override // defpackage.btzi
    public void QY(btzr<djhq> btzrVar, btzy btzyVar) {
        this.m.g(false);
    }

    @Override // defpackage.cdei
    public Boolean c() {
        return Boolean.valueOf(this.d == cdew.ERROR);
    }

    @Override // defpackage.cdei
    public Boolean d() {
        return Boolean.valueOf(dcft.k(this.c.b, cdbd.a));
    }

    @Override // defpackage.cdei
    public List<cdfb> e() {
        return this.r;
    }

    @Override // defpackage.cdei
    public Boolean f() {
        return false;
    }

    @Override // defpackage.cdei
    public void g(int i) {
        if (i == -1) {
            this.e = true;
        }
    }

    @Override // defpackage.cdei
    public jam h() {
        return this.q;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    @Override // defpackage.cdei
    public CharSequence i() {
        btlu l = this.p.l();
        return l == null ? "" : dbsj.e(l.v());
    }

    @Override // defpackage.cdei
    public jic j() {
        btlu l = this.p.l();
        return new jic(l == null ? null : l.i, ckqc.FIFE, 0);
    }

    @Override // defpackage.cdei
    public cqkl k() {
        this.b.e();
        return cqkl.a;
    }

    @Override // defpackage.cdei
    public cqkl l() {
        if (!this.g.a().e()) {
            this.g.a().k(null, null);
        }
        return cqkl.a;
    }

    @Override // defpackage.cdei
    public cqkl m() {
        this.d = cdew.FETCHING;
        this.b.i();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.cdei
    @dzsi
    public cqqw n() {
        return new cdeu(this);
    }

    @Override // defpackage.cdei
    @dzsi
    public cjtd o() {
        cjta b = cjtd.b();
        b.b = w();
        b.d = dtxy.oM;
        return b.a();
    }

    @Override // defpackage.cdei
    public cjtd p() {
        cjta b = cjtd.b();
        b.b = w();
        b.d = dtxy.oS;
        return b.a();
    }

    @Override // defpackage.cdei
    public cjtd q() {
        cjta b = cjtd.b();
        b.b = w();
        b.d = dtxy.pc;
        return b.a();
    }

    @Override // defpackage.cdei
    public Integer r() {
        int i;
        cdew cdewVar = cdew.FETCHING;
        int ordinal = this.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
                i = 4;
            }
            return 8;
        }
        i = 0;
        return Integer.valueOf(i);
    }

    @Override // defpackage.cdei
    public cdai s() {
        return this.m;
    }

    @Override // defpackage.cdei
    @dzsi
    public cdeh t() {
        return this.s;
    }

    @Deprecated
    public void u(int i, cdhl cdhlVar) {
        this.r.get(i).p(cdhlVar);
    }

    public void v(int i, aeuf aeufVar) {
        this.r.get(i).q(aeufVar);
    }

    public String w() {
        return this.c.a;
    }

    @Override // defpackage.cdff
    public void x(cdfg cdfgVar) {
        cqkx.p(this);
    }

    @Override // defpackage.cdff
    public void y(cjqm cjqmVar, dcep<String> dcepVar, int i) {
        this.m.g(true);
        int size = dcepVar.size();
        ((ckcp) this.k.a(ckdz.Z)).a(1L);
        ((ckcp) this.k.a(ckdz.aa)).a(size);
        if (this.c.f.equals(dwyd.PUBLISH_PRIVATE_PHOTO_NOTIFICATION)) {
            this.l.c(ddos.TODO_PHOTO).a(null);
        }
        cdfx cdfxVar = this.h;
        dcdd a = dcde.a();
        ilo d = this.c.d(i);
        dccx dccxVar = new dccx();
        dcpd<String> it = dcepVar.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                dccxVar.g(bbtn.d(decs.b(next), dbsj.e(this.c.h(next))));
            } catch (NumberFormatException unused) {
                bvoo.h("Photo id parsing failure in supposedly validated photo", new Object[0]);
            }
        }
        a.c(d, dccxVar.f());
        dcde a2 = a.a();
        dcax dcaxVar = dcax.a;
        cdbf cdbfVar = this.c;
        cdfxVar.j(a2, dcaxVar, cdbfVar.f, cdbfVar.c(), cjqmVar, new cdev(this, i));
        buqs buqsVar = this.n;
        chhs chhsVar = this.o;
        dcdc<dbsi> q = dcdc.q(dcft.o(this.c.d.L().entrySet(), new dbrn(this) { // from class: cdep
            private final cdex a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return dbsi.a(this.a.c.d(((Integer) entry.getKey()).intValue()).ai(), Integer.valueOf(((Collection) entry.getValue()).size()));
            }
        }));
        int c = this.c.c();
        djgx bZ = djhq.j.bZ();
        djgw a3 = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djhq djhqVar = (djhq) bZ.b;
        a3.getClass();
        djhqVar.b = a3;
        int i2 = djhqVar.a | 1;
        djhqVar.a = i2;
        djhqVar.c = chhsVar.a.d;
        djhqVar.a = i2 | 2;
        if (q != null) {
            djhi bZ2 = djhj.d.bZ();
            for (dbsi dbsiVar : q) {
                djha bZ3 = djhd.e.bZ();
                A a4 = dbsiVar.a;
                String o = a4 == 0 ? "" : ((akqi) a4).o();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djhd djhdVar = (djhd) bZ3.b;
                o.getClass();
                djhdVar.a |= 1;
                djhdVar.b = o;
                int intValue = ((Integer) dbsiVar.b).intValue();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djhd djhdVar2 = (djhd) bZ3.b;
                djhdVar2.a |= 2;
                djhdVar2.c = intValue;
                bZ2.a(bZ3);
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djhj djhjVar = (djhj) bZ2.b;
            djhjVar.a = 1 | djhjVar.a;
            djhjVar.c = c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djhq djhqVar2 = (djhq) bZ.b;
            djhj bK = bZ2.bK();
            bK.getClass();
            djhqVar2.e = bK;
            djhqVar2.a |= 8;
        }
        buqsVar.a(bZ.bK(), this, bvrj.UI_THREAD);
        if (this.j.getContributionsPageParameters().c) {
            dccx dccxVar2 = new dccx();
            dccx dccxVar3 = new dccx();
            for (dwfl dwflVar : this.c.e(i)) {
                if (!dcepVar.contains(dwflVar.d)) {
                    dccxVar3.g(dwflVar.q);
                } else {
                    dccxVar2.g(dwflVar.q);
                }
            }
            C(2, dccxVar2.f());
            C(4, dccxVar3.f());
        }
    }

    @Override // defpackage.btzi
    /* renamed from: z */
    public void QZ(btzr<djhq> btzrVar, djhs djhsVar) {
        djgd djgdVar;
        this.m.g(false);
        if ((djhsVar.a & 2) != 0) {
            djgj djgjVar = djhsVar.c;
            if (djgjVar == null) {
                djgjVar = djgj.b;
            }
            this.m.c(djgjVar.a);
        } else {
            djgl djglVar = djhsVar.b;
            if (djglVar == null) {
                djglVar = djgl.g;
            }
            if (djglVar.b == 5) {
                djgl djglVar2 = djhsVar.b;
                if (djglVar2 == null) {
                    djglVar2 = djgl.g;
                }
                if (djglVar2.b == 5) {
                    djgdVar = (djgd) djglVar2.c;
                } else {
                    djgdVar = djgd.j;
                }
                this.m.c(djgdVar.f);
            }
        }
        if ((djhsVar.a & 1) != 0) {
            djgl djglVar3 = djhsVar.b;
            if (djglVar3 == null) {
                djglVar3 = djgl.g;
            }
            this.b.c = djglVar3;
        }
    }
}

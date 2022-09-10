package defpackage;

import android.app.Application;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: brpk  reason: default package */
/* loaded from: classes4.dex */
public final class brpk {
    public final dcdc<Integer> a;
    private final Application b;
    private final btvo c;
    private final akpm d;
    private final btxz e;
    private final brpd g;
    private final dehq h;
    private final int i;
    @dzsi
    private brln k;
    @dzsi
    private bwrs<brlu> l;
    @dzsi
    private akqi m;
    private int p;
    @dzsi
    private dehu q;
    private final List<btxx> j = new ArrayList();
    private dwiv[] n = new dwiv[0];
    private int o = -1;
    private final crzo<brlu> f = new crzo<>();

    public brpk(Application application, btvo btvoVar, akpm akpmVar, brpd brpdVar, ckcw ckcwVar, brat bratVar, dehq dehqVar) {
        this.b = application;
        this.c = btvoVar;
        this.d = akpmVar;
        this.g = brpdVar;
        this.e = new btxz(ckcwVar, dunt.TACTILE_SEARCH_REQUEST);
        this.a = dcdc.r(bratVar.a.getExploreMapParametersWithoutLogging().x);
        this.h = dehqVar;
        this.i = bratVar.a.getExploreMapParametersWithoutLogging().H;
    }

    private final synchronized void e(dcdc<akqi> dcdcVar, boolean z) {
        int i;
        double size = dcdcVar.size();
        Double.isNaN(size);
        int ceil = (int) Math.ceil(size / 20.0d);
        int i2 = 0;
        while (i2 < ceil) {
            dwim bZ = dwir.R.bZ();
            brln brlnVar = this.k;
            dbsk.s(brlnVar);
            dwhv dwhvVar = brlnVar.b().B;
            if (dwhvVar == null) {
                dwhvVar = dwhv.H;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            dwhvVar.getClass();
            dwirVar.B = dwhvVar;
            dwirVar.b |= 8;
            brln brlnVar2 = this.k;
            dbsk.s(brlnVar2);
            dhkd dhkdVar = brlnVar2.b().q;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar2 = (dwir) bZ.b;
            dhkdVar.getClass();
            dwirVar2.q = dhkdVar;
            dwirVar2.a |= 4194304;
            dwir.f(dwirVar2);
            dhjx aa = this.d.aa();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar3 = (dwir) bZ.b;
            aa.getClass();
            dwirVar3.d = aa;
            dwirVar3.a |= 2;
            brln brlnVar3 = this.k;
            dbsk.s(brlnVar3);
            dhkd dhkdVar2 = brlnVar3.b().o;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar4 = (dwir) bZ.b;
            dhkdVar2.getClass();
            dwirVar4.o = dhkdVar2;
            dwirVar4.a |= ImageMetadata.LENS_APERTURE;
            brln brlnVar4 = this.k;
            dbsk.s(brlnVar4);
            String str = brlnVar4.b().c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar5 = (dwir) bZ.b;
            str.getClass();
            dwirVar5.a |= 1;
            dwirVar5.c = str;
            brln brlnVar5 = this.k;
            dbsk.s(brlnVar5);
            dnwb dnwbVar = brlnVar5.b().G;
            if (dnwbVar == null) {
                dnwbVar = dnwb.i;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar6 = (dwir) bZ.b;
            dnwbVar.getClass();
            dwirVar6.G = dnwbVar;
            dwirVar6.b |= 8192;
            brln brlnVar6 = this.k;
            dbsk.s(brlnVar6);
            dnzj dnzjVar = brlnVar6.b().t;
            if (dnzjVar == null) {
                dnzjVar = dnzj.Z;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar7 = (dwir) bZ.b;
            dnzjVar.getClass();
            dwirVar7.t = dnzjVar;
            dwirVar7.a |= 67108864;
            brln brlnVar7 = this.k;
            dbsk.s(brlnVar7);
            dvxv dvxvVar = brlnVar7.b().r;
            if (dvxvVar == null) {
                dvxvVar = dvxv.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar8 = (dwir) bZ.b;
            dvxvVar.getClass();
            dwirVar8.r = dvxvVar;
            dwirVar8.a |= 16777216;
            brln brlnVar8 = this.k;
            dbsk.s(brlnVar8);
            dwfv dwfvVar = brlnVar8.b().n;
            if (dwfvVar == null) {
                dwfvVar = dwfv.m;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar9 = (dwir) bZ.b;
            dwfvVar.getClass();
            dwirVar9.n = dwfvVar;
            dwirVar9.a |= 262144;
            brln brlnVar9 = this.k;
            dbsk.s(brlnVar9);
            int a = dwiu.a(brlnVar9.b().I);
            if (a == 0) {
                a = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar10 = (dwir) bZ.b;
            dwirVar10.I = a - 1;
            dwirVar10.b |= 32768;
            brln brlnVar10 = this.k;
            dbsk.s(brlnVar10);
            djmy djmyVar = brlnVar10.b().K;
            if (djmyVar == null) {
                djmyVar = djmy.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar11 = (dwir) bZ.b;
            djmyVar.getClass();
            dwirVar11.K = djmyVar;
            dwirVar11.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            if (i2 == 0) {
                if (z) {
                    brln brlnVar11 = this.k;
                    dbsk.s(brlnVar11);
                    dnqh dnqhVar = brlnVar11.b().s;
                    if (dnqhVar == null) {
                        dnqhVar = dnqh.p;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwir dwirVar12 = (dwir) bZ.b;
                    dnqhVar.getClass();
                    dwirVar12.s = dnqhVar;
                    dwirVar12.a |= 33554432;
                }
                i2 = 0;
                i = 0;
            } else {
                i = i2;
            }
            int i3 = i2 * 20;
            int min = Math.min(i3 + 20, dcdcVar.size());
            while (i3 < min) {
                dwik bZ2 = dwil.c.bZ();
                String o = dcdcVar.get(i3).o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwil dwilVar = (dwil) bZ2.b;
                o.getClass();
                dwilVar.a |= 1;
                dwilVar.b = o;
                bZ.b(bZ2.bK());
                i3++;
            }
            brpd brpdVar = this.g;
            brln brlnVar12 = this.k;
            dbsk.s(brlnVar12);
            dwir b = new brln(bZ.bK(), brlnVar12.a).b();
            brln brlnVar13 = this.k;
            dbsk.s(brlnVar13);
            this.j.add(brpdVar.a(b, brlnVar13.d, brpb.BOTH, this.e, new brpj(this, i2), bvrj.UI_THREAD, this.c.getOfflineMapsParameters().e));
            i2 = i + 1;
        }
    }

    private final boolean f(brlu brluVar) {
        if (brluVar.E() == 1 && this.m != null && brluVar.D(0) != null && brluVar.D(0).d() != null) {
            akqi akqiVar = this.m;
            dbsk.s(akqiVar);
            ilo d = brluVar.D(0).d();
            dbsk.s(d);
            if (akqiVar.equals(d.ai())) {
                return true;
            }
        }
        return false;
    }

    private final void g(List<brlu> list) {
        bwrs<brlu> bwrsVar = this.l;
        if (bwrsVar == null || bwrsVar.c() == null) {
            return;
        }
        brlu c = this.l.c();
        dbsk.s(c);
        bsjm bsjmVar = c.o;
        boolean z = bsjmVar == null || !bsjmVar.g();
        boolean h = h(list);
        if (h) {
            if (list.isEmpty()) {
                c = new brlu();
            } else if (f(list.get(0))) {
                c.M(list.get(0), this.o, this.b);
            } else {
                c = list.get(0);
                for (int i = 1; i < list.size(); i++) {
                    c.L(list.get(i), this.b, false);
                }
            }
        }
        if (z) {
            bsjm bsjmVar2 = c.o;
            djnk b = bsjmVar2.b();
            dcdc z2 = dcbg.b(b.d).o(new dbsl(this) { // from class: brpg
                private final brpk a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.a.contains(Integer.valueOf(((djml) obj).c));
                }
            }).z();
            dcdc z3 = dcbg.b(b.b).o(new dbsl(this) { // from class: brph
                private final brpk a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    dcdc<Integer> dcdcVar = this.a.a;
                    int a = djne.a(((djkr) obj).b);
                    if (a == 0) {
                        a = 1;
                    }
                    return dcdcVar.contains(Integer.valueOf(a - 1));
                }
            }).z();
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            djnj djnjVar = (djnj) dsqpVar;
            if (djnjVar.c) {
                djnjVar.bF();
                djnjVar.c = false;
            }
            ((djnk) djnjVar.b).b = djnk.ck();
            if (djnjVar.c) {
                djnjVar.bF();
                djnjVar.c = false;
            }
            ((djnk) djnjVar.b).d = djnk.ck();
            if (djnjVar.c) {
                djnjVar.bF();
                djnjVar.c = false;
            }
            djnk djnkVar = (djnk) djnjVar.b;
            djnkVar.b();
            dsod.bv(z3, djnkVar.b);
            if (djnjVar.c) {
                djnjVar.bF();
                djnjVar.c = false;
            }
            djnk djnkVar2 = (djnk) djnjVar.b;
            djnkVar2.d();
            dsod.bv(z2, djnkVar2.d);
            bsjmVar2.a(djnjVar.bK());
            c.o = bsjmVar2;
        } else {
            c.o = bsjmVar;
        }
        bwrs<brlu> bwrsVar2 = this.l;
        if (bwrsVar2 != null && bwrsVar2.c() != null) {
            bwrs<brlu> bwrsVar3 = this.l;
            dbsk.s(bwrsVar3);
            brlu c2 = bwrsVar3.c();
            dbsk.s(c2);
            c2.ak(false);
        }
        if (h) {
            this.f.a(c);
            bwrs<brlu> bwrsVar4 = this.l;
            dbsk.s(bwrsVar4);
            bwrsVar4.d(c);
        }
        i();
    }

    private final synchronized boolean h(List<brlu> list) {
        boolean isEmpty = this.j.isEmpty();
        boolean z = list.isEmpty() || dcbg.b(list).o(brpi.a).z().isEmpty();
        if (isEmpty || !z) {
            if (this.m != null) {
                if (!f(list.get(0))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final synchronized void i() {
        this.j.clear();
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = -1;
        this.n = new dwiv[0];
        this.p = 0;
    }

    public final synchronized void a(List<akqi> list, brln brlnVar, bwrs<brlu> bwrsVar, boolean z, int i, boolean z2) {
        b();
        i();
        this.l = bwrsVar;
        this.k = brlnVar;
        if (list.isEmpty()) {
            g(new ArrayList());
            return;
        }
        if (z && list.size() == 1) {
            this.m = list.get(0);
            this.o = i;
        }
        e(dcdc.r(list), z2);
        for (btxx btxxVar : this.j) {
            btxxVar.a();
        }
        this.n = new dwiv[this.j.size()];
    }

    public final synchronized void b() {
        if (!this.j.isEmpty()) {
            for (btxx btxxVar : this.j) {
                btxxVar.b();
            }
        }
    }

    public final synchronized void d(final List<akqi> list, final brln brlnVar, final bwrs<brlu> bwrsVar, final boolean z) {
        if (this.i <= 0) {
            a(list, brlnVar, bwrsVar, false, -1, z);
            return;
        }
        dehu dehuVar = this.q;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        this.q = this.h.d(new Runnable(this, list, brlnVar, bwrsVar, z) { // from class: brpf
            private final brpk a;
            private final List b;
            private final brln c;
            private final bwrs d;
            private final boolean e;

            {
                this.a = this;
                this.b = list;
                this.c = brlnVar;
                this.d = bwrsVar;
                this.e = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(this.b, this.c, this.d, false, -1, this.e);
            }
        }, this.i, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i, @dzsi dwiv dwivVar, @dzsi bttq bttqVar) {
        int i2 = 1;
        this.p++;
        int i3 = 0;
        if (bttqVar != null || dwivVar == null) {
            this.j.size();
        } else {
            dwiv[] dwivVarArr = this.n;
            brln brlnVar = this.k;
            dbsk.s(brlnVar);
            if (brlnVar.m()) {
                int a = dwiu.a(brlnVar.b().I);
                if (a != 0) {
                    i2 = a;
                }
                if ((brlnVar.b().b & 32768) == 0) {
                    i2 = 6;
                }
                dwis dwisVar = (dwis) dwiv.M.ca(dwivVar);
                if (dwisVar.c) {
                    dwisVar.bF();
                    dwisVar.c = false;
                }
                dwiv dwivVar2 = (dwiv) dwisVar.b;
                dwivVar2.r = i2 - 1;
                dwivVar2.a |= 262144;
                dwivVar = (dwiv) dwisVar.bK();
            }
            dwivVarArr[i] = dwivVar;
        }
        if (this.p >= this.j.size()) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                dwiv[] dwivVarArr2 = this.n;
                if (i3 < dwivVarArr2.length) {
                    if (dwivVarArr2[i3] != null) {
                        brlu brluVar = new brlu();
                        brluVar.aG(this.n[i3]);
                        arrayList.add(brluVar);
                    }
                    i3++;
                } else {
                    g(arrayList);
                    return;
                }
            }
        }
    }
}

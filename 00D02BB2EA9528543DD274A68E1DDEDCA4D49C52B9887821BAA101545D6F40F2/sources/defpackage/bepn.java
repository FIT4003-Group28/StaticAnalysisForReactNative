package defpackage;

import android.app.Application;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bepn  reason: default package */
/* loaded from: classes3.dex */
public class bepn extends beog {
    private final cjtd r;
    private final cjtd s;
    private final bent t;
    private final bepl u;
    private final axru v;
    private final axrx w;
    private boolean x;
    private boolean y;

    public bepn(ff ffVar, apnm apnmVar, cqhn cqhnVar, bgyj bgyjVar, beib beibVar, beph bephVar, bepl beplVar, axru axruVar, axrx axrxVar, cjqy cjqyVar, Executor executor, bwrs<bvrt<benb>> bwrsVar, cqkp cqkpVar, bwrs<ilo> bwrsVar2) {
        super(ffVar, apnmVar, bgyjVar, beibVar, null, cjqyVar, executor, null, bwrsVar, cqkpVar, bwrsVar2, ddda.dh, ddda.di);
        cjtd bZ;
        boolean[] zArr = this.h;
        bmel a = bephVar.a.a();
        beph.a(a, 1);
        beph.a(bwrsVar2, 2);
        this.t = new bepg(a, bwrsVar2, (boolean[]) beph.a(zArr, 3));
        this.u = beplVar;
        this.v = axruVar;
        this.w = axrxVar;
        if (bwrsVar2.c() == null) {
            bZ = null;
        } else {
            ilo c = bwrsVar2.c();
            dbsk.s(c);
            bZ = c.bZ();
        }
        cjta c2 = cjtd.c(bZ);
        c2.d = dtxv.aI;
        this.r = c2.a();
        c2.d = dtxv.aG;
        this.s = c2.a();
    }

    @Override // defpackage.beog, defpackage.benv
    public cjtd b() {
        return this.r;
    }

    @Override // defpackage.beog, defpackage.benv
    @dzsi
    public cjtd c() {
        if (d().booleanValue()) {
            return null;
        }
        return this.s;
    }

    @Override // defpackage.beog, defpackage.benv
    public Boolean d() {
        return Boolean.valueOf(this.b.isEmpty());
    }

    @Override // defpackage.beog
    public Boolean i() {
        return true;
    }

    @Override // defpackage.beog
    public bent m() {
        return this.t;
    }

    @Override // defpackage.beog
    public Boolean n() {
        return Boolean.valueOf(this.x);
    }

    @Override // defpackage.beog
    public void q(apsi<dbsg<List<dfzs>>> apsiVar) {
        if (!apsiVar.a().a()) {
            return;
        }
        this.y = this.v.a("android.permission.READ_CONTACTS");
        if (this.b.isEmpty() && !apsiVar.a().b().isEmpty() && !this.y) {
            this.w.b("android.permission.READ_CONTACTS", new axrw(this) { // from class: bepm
                private final bepn a;

                {
                    this.a = this;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    bepn bepnVar = this.a;
                    if (i == 0) {
                        Iterator<benu> it = bepnVar.b.iterator();
                        while (it.hasNext()) {
                            ((bepk) it.next()).s();
                        }
                        cqkx.p(bepnVar);
                    }
                }
            });
        }
        r(apsiVar.a().b());
        boolean z = false;
        if (this.c.e() && !this.b.isEmpty()) {
            z = true;
        }
        this.x = z;
    }

    @Override // defpackage.beog
    public final benz s(dfzs dfzsVar, int i) {
        bepl beplVar = this.u;
        apnm apnmVar = this.a;
        beny benyVar = this.i;
        bwrs<bvrt<benb>> bwrsVar = this.d;
        bwrs<ilo> bwrsVar2 = this.e;
        boolean[] zArr = this.h;
        beor a = beplVar.a.a();
        bepl.a(a, 1);
        Application a2 = beplVar.b.a();
        bepl.a(a2, 2);
        apny a3 = beplVar.c.a();
        bepl.a(a3, 3);
        dxio a4 = ((dxjh) beplVar.d).a();
        bepl.a(a4, 4);
        benm a5 = beplVar.e.a();
        bepl.a(a5, 5);
        bgyg a6 = beplVar.f.a();
        bepl.a(a6, 6);
        cqhn a7 = beplVar.g.a();
        bepl.a(a7, 7);
        czsx a8 = beplVar.h.a();
        bepl.a(a8, 8);
        czsy a9 = beplVar.i.a();
        bepl.a(a9, 9);
        bvrb a10 = beplVar.j.a();
        bepl.a(a10, 10);
        bepl.a(apnmVar, 11);
        bepl.a(dfzsVar, 12);
        bepl.a(benyVar, 14);
        bepl.a(bwrsVar, 15);
        bepl.a(bwrsVar2, 16);
        bepk bepkVar = new bepk(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, apnmVar, dfzsVar, i, benyVar, bwrsVar, bwrsVar2, (boolean[]) bepl.a(zArr, 17));
        if (this.y) {
            bepkVar.s();
        }
        return bepkVar;
    }
}

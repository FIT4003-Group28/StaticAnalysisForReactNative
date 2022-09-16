package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aorm  reason: default package */
/* loaded from: classes2.dex */
public class aorm implements aork, anha {
    private static final dcqe a = dcqe.c("aorm");
    private final aoqf b;
    private final aoru c;
    private final iyl d;
    private dbsg<? extends aorg> e = dbpy.a;

    public aorm(aoqf aoqfVar, aoru aoruVar, apjv apjvVar) {
        this.b = aoqfVar;
        this.c = aoruVar;
        this.d = new iyl(apjvVar.a().b());
    }

    @Override // defpackage.anha
    public aogm b() {
        if (this.e.a()) {
            return this.e.b().b();
        }
        return aogm.b;
    }

    @Override // defpackage.aork
    @dzsi
    public cqss c() {
        return (cqss) this.e.h(aorl.a).f();
    }

    @Override // defpackage.aork
    @dzsi
    /* renamed from: d */
    public aorg a() {
        return this.e.f();
    }

    public jbk e() {
        return this.d;
    }

    public void f(dvay dvayVar, aoge aogeVar, boolean z) {
        bvrj.UI_THREAD.c();
        dvax dvaxVar = dvax.UNKNOWN;
        dvax b = dvax.b(dvayVar.m);
        if (b == null) {
            b = dvax.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal == 2) {
            aoru aoruVar = this.c;
            aoru.a(dvayVar, 1);
            aoru.a(aogeVar, 2);
            Application a2 = aoruVar.a.a();
            aoru.a(a2, 4);
            anqv a3 = aoruVar.b.a();
            aoru.a(a3, 5);
            aorn aornVar = (aorn) ((dxjd) aoruVar.c).a;
            aoru.a(aornVar, 6);
            dzsj<jkf> dzsjVar = aoruVar.d;
            anrz a4 = aoruVar.g.a();
            aoru.a(a4, 8);
            apjv a5 = aoruVar.e.a();
            aoru.a(a5, 9);
            anru a6 = aoruVar.f.a();
            aoru.a(a6, 10);
            aort aortVar = new aort(dvayVar, aogeVar, z, a2, a3, aornVar, dzsjVar, a4, a5, a6);
            this.e = dbsg.i(aortVar);
            if (!z) {
                aortVar.m();
            }
        } else if (ordinal != 3) {
            Object[] objArr = new Object[1];
            dvax b2 = dvax.b(dvayVar.m);
            if (b2 == null) {
                b2 = dvax.UNKNOWN;
            }
            objArr[0] = b2;
            bvoo.h("unsupported segment type %s", objArr);
        } else {
            aoqf aoqfVar = this.b;
            dwyn dwynVar = dvayVar.f;
            if (dwynVar == null) {
                dwynVar = dwyn.d;
            }
            dwyn dwynVar2 = dvayVar.g;
            if (dwynVar2 == null) {
                dwynVar2 = dwyn.d;
            }
            dpop e = aogc.e(dwynVar, dwynVar2);
            aoqf.a(dvayVar, 1);
            aoqf.a(e, 2);
            aoqf.a(aogeVar, 3);
            anpb a7 = aoqfVar.e.a();
            aoqf.a(a7, 5);
            anpc a8 = aoqfVar.c.a();
            aoqf.a(a8, 6);
            Application a9 = aoqfVar.a.a();
            aoqf.a(a9, 7);
            dzsj<jkf> dzsjVar2 = aoqfVar.b;
            apjv a10 = aoqfVar.d.a();
            aoqf.a(a10, 9);
            this.e = dbsg.i(new aoqe(dvayVar, e, aogeVar, z, a7, a8, a9, dzsjVar2, a10));
        }
        this.d.b(this.e.b().f());
        cqkx.p(this.d);
        cqkx.p(this);
    }

    public void g(dvyw dvywVar) {
        bvrj.UI_THREAD.c();
        if (this.e.f() instanceof aort) {
            aort aortVar = (aort) this.e.b();
            dnql bZ = dnqm.c.bZ();
            dnry dnryVar = dnry.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqm dnqmVar = (dnqm) bZ.b;
            dnryVar.getClass();
            dnqmVar.b = dnryVar;
            dnqmVar.a = 2;
            aortVar.n(dvywVar, bZ.bK());
        }
    }
}

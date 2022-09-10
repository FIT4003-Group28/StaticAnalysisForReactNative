package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: angc  reason: default package */
/* loaded from: classes2.dex */
public abstract class angc extends dbrh<anhy, aoum> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ anhy b(aoum aoumVar) {
        aoum aoumVar2 = aoumVar;
        anhq p = anhy.p();
        if ((aoumVar2.a & 1) != 0) {
            dbrh<aoul, anhw> k = anht.a.k();
            aoul b = aoul.b(aoumVar2.b);
            if (b == null) {
                b = aoul.NONE_TARGET;
            }
            p.g(k.NV(b));
        }
        if ((aoumVar2.a & 2) != 0) {
            dbrh<aouj, anhu> k2 = anht.b.k();
            aouj b2 = aouj.b(aoumVar2.c);
            if (b2 == null) {
                b2 = aouj.NONE_OPTION;
            }
            p.f(k2.NV(b2));
        }
        if ((aoumVar2.a & 4) != 0) {
            dbrh<aouj, anhu> k3 = anht.b.k();
            aouj b3 = aouj.b(aoumVar2.d);
            if (b3 == null) {
                b3 = aouj.NONE_OPTION;
            }
            p.e(k3.NV(b3));
        }
        if ((aoumVar2.a & 8) != 0) {
            dbrh<aouj, anhu> k4 = anht.b.k();
            aouj b4 = aouj.b(aoumVar2.e);
            if (b4 == null) {
                b4 = aouj.NONE_OPTION;
            }
            p.d(k4.NV(b4));
        }
        if ((aoumVar2.a & 16) != 0) {
            f(aoumVar2, p);
        }
        if ((aoumVar2.a & 32) != 0) {
            ((angm) p).a = anht.c.k().NV(aoumVar2.g);
        }
        if ((aoumVar2.a & 64) != 0) {
            g(aoumVar2, p);
        }
        int i = aoumVar2.a;
        if ((i & 128) != 0) {
            ((angm) p).c = aoumVar2.i;
        }
        if ((i & 256) != 0) {
            ((angm) p).d = dbsg.i(aoumVar2.j);
        }
        return p.k();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ aoum c(anhy anhyVar) {
        anhy anhyVar2 = anhyVar;
        aouh bZ = aoum.k.bZ();
        aoul NV = anht.a.NV(anhyVar2.a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aoum aoumVar = (aoum) bZ.b;
        aoumVar.b = NV.i;
        aoumVar.a |= 1;
        aouj NV2 = anht.b.NV(anhyVar2.b());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aoum aoumVar2 = (aoum) bZ.b;
        aoumVar2.c = NV2.d;
        aoumVar2.a |= 2;
        aouj NV3 = anht.b.NV(anhyVar2.c());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aoum aoumVar3 = (aoum) bZ.b;
        aoumVar3.d = NV3.d;
        aoumVar3.a |= 4;
        aouj NV4 = anht.b.NV(anhyVar2.d());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aoum aoumVar4 = (aoum) bZ.b;
        aoumVar4.e = NV4.d;
        aoumVar4.a |= 8;
        if (anhyVar2.e() != null) {
            d(anhyVar2, bZ);
        }
        if (anhyVar2.f() != null) {
            String NV5 = anht.c.NV(anhyVar2.f());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aoum aoumVar5 = (aoum) bZ.b;
            NV5.getClass();
            aoumVar5.a |= 32;
            aoumVar5.g = NV5;
        }
        if (anhyVar2.g() != null) {
            e(anhyVar2, bZ);
        }
        if (anhyVar2.h() != null) {
            String h = anhyVar2.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aoum aoumVar6 = (aoum) bZ.b;
            h.getClass();
            aoumVar6.a |= 128;
            aoumVar6.i = h;
        }
        if (anhyVar2.i().a() && anhyVar2.i().a()) {
            String b = anhyVar2.i().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aoum aoumVar7 = (aoum) bZ.b;
            b.getClass();
            aoumVar7.a |= 256;
            aoumVar7.j = b;
        }
        return bZ.bK();
    }

    public abstract void d(anhy anhyVar, aouh aouhVar);

    public abstract void e(anhy anhyVar, aouh aouhVar);

    public abstract void f(aoum aoumVar, anhq anhqVar);

    public abstract void g(aoum aoumVar, anhq anhqVar);
}

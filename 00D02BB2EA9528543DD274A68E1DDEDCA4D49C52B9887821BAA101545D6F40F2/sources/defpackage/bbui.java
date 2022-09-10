package defpackage;
/* compiled from: PG */
/* renamed from: bbui  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbui {
    public abstract dbsg<dcdc<String>> a();

    public abstract dceq<bbvh, bbtj> b();

    public abstract dcet<bbvh, bbtj> c();

    public abstract dceq<bbvh, bbtn> d();

    public abstract dcet<bbvh, bbtn> e();

    public abstract bbuj f();

    @Deprecated
    public abstract void g(String str);

    public abstract void h(dwyd dwydVar);

    public abstract void i(cjqm cjqmVar);

    public abstract void j(dbsg<dcdc<String>> dbsgVar);

    public abstract void k(dcdc<String> dcdcVar);

    public abstract void l(bbuk bbukVar);

    public final bbuj m() {
        if (a().a()) {
            int size = a().b().size();
            int i = ((dced) c()).c + ((dced) e()).c;
            if (size < i) {
                bvoo.h("UGCS Content IDs: Not enough for photos.", new Object[0]);
                j(dbpy.a);
            } else if (size > i) {
                bvoo.h("UGCS Content IDs: More than enough for photos.", new Object[0]);
            }
        }
        bbuj f = f();
        if (f.b() == dwyd.UNKNOWN_ENTRY_POINT) {
            bvoo.h("UNKNOWN_ENTRY_POINT in uploadPhotos is not allowed.", new Object[0]);
        }
        return f;
    }

    public final void n(bbtj bbtjVar, bbvh bbvhVar) {
        b().b(bbvhVar, bbtjVar);
    }

    public final void o(bbtn bbtnVar, bbvh bbvhVar) {
        d().b(bbvhVar, bbtnVar);
    }

    public final void p(btlu btluVar) {
        dbsk.a(btlu.i(btluVar).equals(btlt.GOOGLE));
        g(btluVar.s().name);
    }
}

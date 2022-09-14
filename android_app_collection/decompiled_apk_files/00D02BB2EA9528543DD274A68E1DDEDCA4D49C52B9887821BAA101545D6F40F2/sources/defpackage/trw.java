package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: trw  reason: default package */
/* loaded from: classes7.dex */
public final class trw {
    public final tma a;
    public final tgi b;
    public final dxio<akfa> c;
    public final udk d;
    public final Executor e;
    @dzsi
    public crzp<btlu> f;
    public dbsg<btlu> g = dbpy.a;
    public final crzt<trv> h;

    public trw(tma tmaVar, tgi tgiVar, dxio<akfa> dxioVar, udk udkVar, Executor executor) {
        this.a = tmaVar;
        this.b = tgiVar;
        this.c = dxioVar;
        this.d = udkVar;
        this.e = executor;
        this.h = new crzt<>(executor);
    }

    public static btlu c(@dzsi btlu btluVar) {
        return btluVar != null ? btluVar : btlu.b;
    }

    private final synchronized crzm<trv> d(btlu btluVar) {
        return new crzj(new dbty(this) { // from class: tru
            private final trw a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dbsg<tmd> dbsgVar;
                trw trwVar = this.a;
                btlu b = trwVar.g.b();
                dbsg j = dbsg.j(trwVar.b.a().l());
                crzm<dbsg<tmd>> a = trwVar.a.a(b);
                if (a.k()) {
                    dbsgVar = a.l();
                    dbsk.s(dbsgVar);
                } else {
                    dbsgVar = dbpy.a;
                }
                Boolean l = trwVar.d.b().l();
                dbsk.s(l);
                return new trq(b, dbsgVar, j, l.booleanValue());
            }
        }, this.e, this.a.a(btluVar), this.b.a(), this.d.b());
    }

    public final crzm<trv> a() {
        return this.h.a.a;
    }

    public final void b(btlu btluVar) {
        this.g = dbsg.i(btluVar);
        this.h.b(d(btluVar));
    }
}

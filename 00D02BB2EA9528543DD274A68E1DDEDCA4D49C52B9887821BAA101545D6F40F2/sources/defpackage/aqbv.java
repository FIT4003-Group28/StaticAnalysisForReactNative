package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqbv  reason: default package */
/* loaded from: classes2.dex */
public final class aqbv {
    private final Executor a;
    private final dxio<akfa> b;

    public aqbv(Executor executor, dxio<akfa> dxioVar) {
        this.a = executor;
        this.b = dxioVar;
    }

    public static final <T> dehn<T> c(cuss<T> cussVar) {
        final deig d = deig.d();
        d.getClass();
        cussVar.k(new cusr(d) { // from class: aqbt
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                this.a.j(obj);
            }
        });
        return d;
    }

    public final dehn<dbsg<btlu>> a(final ctyy ctyyVar) {
        btlu j = this.b.a().j();
        if (aqda.a(ctyyVar, j)) {
            return deha.a(dbsg.i(j));
        }
        return deew.h(this.b.a().v(), new dbrn(ctyyVar) { // from class: aqbu
            private final ctyy a;

            {
                this.a = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ctyy ctyyVar2 = this.a;
                List<btlu> list = (List) obj;
                if (list == null) {
                    return dbpy.a;
                }
                for (btlu btluVar : list) {
                    if (aqda.a(ctyyVar2, btluVar)) {
                        return dbsg.i(btluVar);
                    }
                }
                return dbpy.a;
            }
        }, this.a);
    }

    public final dbsg<btlu> b(ctyy ctyyVar) {
        btlu k = this.b.a().k();
        if (aqda.a(ctyyVar, k)) {
            return dbsg.j(k);
        }
        for (btlu btluVar : this.b.a().t()) {
            if (aqda.a(ctyyVar, btluVar)) {
                return dbsg.i(btluVar);
            }
        }
        return dbpy.a;
    }
}

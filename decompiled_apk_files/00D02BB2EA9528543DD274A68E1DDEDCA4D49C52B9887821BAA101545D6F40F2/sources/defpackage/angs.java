package defpackage;
/* compiled from: PG */
/* renamed from: angs  reason: default package */
/* loaded from: classes2.dex */
public abstract class angs<D> {
    private static final dcqe a = dcqe.c("angs");

    public static <D> angs<D> c(dbsg<D> dbsgVar, angr angrVar) {
        dbsk.s(dbsgVar);
        dbsk.s(angrVar);
        if (angrVar == angr.SUCCESS && !dbsgVar.a()) {
            bvoo.h("Data must be present if the status is SUCCESS.", new Object[0]);
        }
        if (angrVar == angr.ABSENT && dbsgVar.a()) {
            bvoo.h("Data must be absent if the status is ABSENT.", new Object[0]);
        }
        if (angrVar == angr.PENDING_PARTIAL_DATA && !dbsgVar.a()) {
            bvoo.h("Data must be present if the status is PENDING_PARTIAL_DATA.", new Object[0]);
        }
        return new angf(dbsgVar, angrVar);
    }

    public static <D> angs<D> d() {
        return c(dbpy.a, angr.ABSENT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dbsg<D> a();

    public abstract angr b();

    public final boolean e() {
        return a().a();
    }

    public final D f() {
        return a().b();
    }

    public final angs<D> g(angr angrVar) {
        return c(a(), angrVar);
    }
}

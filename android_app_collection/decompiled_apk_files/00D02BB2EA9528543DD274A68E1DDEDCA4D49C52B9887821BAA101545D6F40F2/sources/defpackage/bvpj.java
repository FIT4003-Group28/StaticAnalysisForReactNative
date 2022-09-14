package defpackage;
/* compiled from: PG */
/* renamed from: bvpj  reason: default package */
/* loaded from: classes.dex */
public final class bvpj<T> implements dbsz<T> {
    @dzsi
    private volatile dbsz<T> a;

    private bvpj(dbsz<T> dbszVar) {
        this.a = dbszVar;
    }

    public static <T> bvpj<T> b(dbsz<T> dbszVar) {
        return new bvpj<>(dbszVar);
    }

    @Override // defpackage.dbsz
    public final void NU(@dzsi T t) {
        dbsz<T> dbszVar = this.a;
        if (dbszVar != null) {
            dbszVar.NU(t);
        }
    }

    public final void c() {
        this.a = null;
    }

    public final boolean d() {
        return this.a == null;
    }
}

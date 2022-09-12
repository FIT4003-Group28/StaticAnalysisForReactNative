package defpackage;
/* compiled from: PG */
/* renamed from: bst  reason: default package */
/* loaded from: classes4.dex */
final class bst<T> implements chv<T> {
    private final aiy<bsu<T>> a;

    public bst(aiy<bsu<T>> aiyVar) {
        this.a = aiyVar;
    }

    @Override // defpackage.chv
    public final boolean Nl(bwx bwxVar) {
        aiy<bsu<T>> aiyVar = this.a;
        Throwable th = bwxVar;
        if (bwxVar == null) {
            th = new RuntimeException("Unknown error");
        }
        aiyVar.c(th);
        return true;
    }

    @Override // defpackage.chv
    public final boolean Nm(T t, int i) {
        try {
            this.a.b(new bsu<>(t));
            return true;
        } catch (Throwable th) {
            this.a.c(th);
            return true;
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dssc  reason: default package */
/* loaded from: classes.dex */
public final class dssc<K, V> {
    public final dssb<K, V> a;

    private dssc(dsur dsurVar, K k, dsur dsurVar2, V v) {
        this.a = new dssb<>(dsurVar, k, dsurVar2, v);
    }

    public static <K, V> dssc<K, V> a(dsur dsurVar, K k, dsur dsurVar2, V v) {
        return new dssc<>(dsurVar, k, dsurVar2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void b(dspp dsppVar, dssb<K, V> dssbVar, K k, V v) {
        dsqh.g(dsppVar, dssbVar.a, 1, k);
        dsqh.g(dsppVar, dssbVar.c, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int c(dssb<K, V> dssbVar, K k, V v) {
        return dsqh.i(dssbVar.a, 1, k) + dsqh.i(dssbVar.c, 2, v);
    }
}

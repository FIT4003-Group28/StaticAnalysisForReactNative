package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpvh  reason: default package */
/* loaded from: classes5.dex */
public final class cpvh<T> implements cpve<T, String> {
    private final cpve<T, ?> a;

    public cpvh(cpve<T, ?> cpveVar) {
        this.a = cpveVar;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ String a(Object obj, int i, cpvi cpviVar) {
        Object a = this.a.a(obj, i, cpviVar);
        return a == null ? "null" : a.toString();
    }
}

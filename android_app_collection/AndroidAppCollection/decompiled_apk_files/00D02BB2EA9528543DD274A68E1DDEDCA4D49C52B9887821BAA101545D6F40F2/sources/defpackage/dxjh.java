package defpackage;
/* compiled from: PG */
/* renamed from: dxjh  reason: default package */
/* loaded from: classes.dex */
public final class dxjh<T> implements dzsj<dxio<T>> {
    private final dzsj<T> a;

    private dxjh(dzsj<T> dzsjVar) {
        this.a = dzsjVar;
    }

    public static <T> dzsj<dxio<T>> c(dzsj<T> dzsjVar) {
        return new dxjh(dzsjVar);
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final dxio<T> a() {
        return dxjc.c(this.a);
    }
}

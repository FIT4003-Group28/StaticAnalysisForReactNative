package defpackage;
/* compiled from: PG */
/* renamed from: baib  reason: default package */
/* loaded from: classes3.dex */
public final class baib {
    private final dzsj<cqhn> a;
    private final dzsj<gga> b;

    public baib(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <V extends bayj> bahy<V> a(dcdc<V> dcdcVar, bahx bahxVar, boolean z) {
        cqhn a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        b(dcdcVar, 3);
        b(bahxVar, 4);
        return new bahy<>(a, dcdcVar, bahxVar, z);
    }
}

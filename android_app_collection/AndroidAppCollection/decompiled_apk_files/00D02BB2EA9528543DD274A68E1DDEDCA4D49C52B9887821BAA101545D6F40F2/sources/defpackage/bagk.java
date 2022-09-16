package defpackage;
/* compiled from: PG */
/* renamed from: bagk  reason: default package */
/* loaded from: classes3.dex */
public final class bagk {
    public final dzsj<anhg> a;
    public final dzsj<axwy> b;

    public bagk(dzsj<anhg> dzsjVar, dzsj<axwy> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bpah  reason: default package */
/* loaded from: classes3.dex */
public final class bpah {
    public final dzsj<boyu> a;
    public final dzsj<bozs> b;

    public bpah(dzsj<boyu> dzsjVar, dzsj<bozs> dzsjVar2) {
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

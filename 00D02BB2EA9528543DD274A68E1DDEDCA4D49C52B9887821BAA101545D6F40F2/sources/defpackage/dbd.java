package defpackage;
/* compiled from: PG */
/* renamed from: dbd  reason: default package */
/* loaded from: classes5.dex */
public final class dbd {
    public final dzsj<cqat> a;
    public final dzsj<bvsl> b;

    public dbd(dzsj<cqat> dzsjVar, dzsj<bvsl> dzsjVar2) {
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

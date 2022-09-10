package defpackage;
/* compiled from: PG */
/* renamed from: bqub  reason: default package */
/* loaded from: classes4.dex */
public class bqub {
    public final dzsj<ff> a;
    public final dzsj<cqhn> b;
    public final dzsj<cpv> c;

    public bqub(dzsj<ff> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cpv> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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

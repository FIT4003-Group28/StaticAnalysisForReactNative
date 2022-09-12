package defpackage;
/* compiled from: PG */
/* renamed from: bxoq  reason: default package */
/* loaded from: classes4.dex */
public class bxoq {
    public final dzsj<begg> a;
    public final dzsj<brba> b;
    public final dzsj<cklq> c;

    public bxoq(dzsj<begg> dzsjVar, dzsj<brba> dzsjVar2, dzsj<cklq> dzsjVar3) {
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

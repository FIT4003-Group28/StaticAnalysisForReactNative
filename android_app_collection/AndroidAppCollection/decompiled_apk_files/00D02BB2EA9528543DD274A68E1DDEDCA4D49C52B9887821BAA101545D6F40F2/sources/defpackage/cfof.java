package defpackage;
/* compiled from: PG */
/* renamed from: cfof  reason: default package */
/* loaded from: classes4.dex */
public class cfof {
    public final dzsj<cfos> a;
    public final dzsj<cfoq> b;
    public final dzsj<cfok> c;

    public cfof(dzsj<cfos> dzsjVar, dzsj<cfoq> dzsjVar2, dzsj<cfok> dzsjVar3) {
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

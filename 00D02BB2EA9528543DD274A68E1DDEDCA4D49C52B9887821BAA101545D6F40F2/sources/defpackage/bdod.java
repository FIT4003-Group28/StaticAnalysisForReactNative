package defpackage;
/* compiled from: PG */
/* renamed from: bdod  reason: default package */
/* loaded from: classes3.dex */
public class bdod {
    public final dzsj<bdph> a;
    public final dzsj<dxio<apni>> b;
    public final dzsj<cqhn> c;
    public final dzsj<bdkl> d;
    public final dzsj<bdrt> e;

    public bdod(dzsj<bdph> dzsjVar, dzsj<dxio<apni>> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<bdkl> dzsjVar4, dzsj<bdrt> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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

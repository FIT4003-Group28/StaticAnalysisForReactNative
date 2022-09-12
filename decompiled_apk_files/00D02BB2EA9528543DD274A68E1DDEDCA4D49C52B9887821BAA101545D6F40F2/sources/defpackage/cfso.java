package defpackage;
/* compiled from: PG */
/* renamed from: cfso  reason: default package */
/* loaded from: classes4.dex */
public class cfso {
    public final dzsj<cfsc> a;
    public final dzsj<cfum> b;
    public final dzsj<cfse> c;
    public final dzsj<cftf> d;
    public final dzsj<cfue> e;
    public final dzsj<cgcv> f;

    public cfso(dzsj<cfsc> dzsjVar, dzsj<cfum> dzsjVar2, dzsj<cfse> dzsjVar3, dzsj<cftf> dzsjVar4, dzsj<cfue> dzsjVar5, dzsj<cgcv> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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

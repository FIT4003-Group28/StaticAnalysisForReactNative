package defpackage;
/* compiled from: PG */
/* renamed from: cgbl  reason: default package */
/* loaded from: classes4.dex */
public class cgbl {
    public final dzsj<cchz> a;
    public final dzsj<cqhn> b;
    public final dzsj<akfa> c;
    public final dzsj<axjh> d;
    public final dzsj<ceet> e;
    public final dzsj<acyp> f;
    public final dzsj<axhq> g;

    public cgbl(dzsj<cchz> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<axjh> dzsjVar4, dzsj<ceet> dzsjVar5, dzsj<acyp> dzsjVar6, dzsj<axhq> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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

package defpackage;
/* compiled from: PG */
/* renamed from: zld  reason: default package */
/* loaded from: classes7.dex */
public final class zld {
    public final dzsj<btvo> a;
    public final dzsj<vtn> b;
    public final dzsj<cqat> c;
    public final dzsj<wgh> d;
    public final dzsj<zgv> e;
    public final dzsj<zqg> f;

    public zld(dzsj<btvo> dzsjVar, dzsj<vtn> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<wgh> dzsjVar4, dzsj<zgv> dzsjVar5, dzsj<zqg> dzsjVar6) {
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

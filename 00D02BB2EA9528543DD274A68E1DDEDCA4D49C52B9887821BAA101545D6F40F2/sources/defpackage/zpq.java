package defpackage;
/* compiled from: PG */
/* renamed from: zpq  reason: default package */
/* loaded from: classes7.dex */
public final class zpq {
    public final dzsj<vtn> a;
    public final dzsj<bvrb> b;
    public final dzsj<cjqy> c;
    public final dzsj<yys> d;
    public final dzsj<btvo> e;
    public final dzsj<vwv> f;
    public final dzsj<qbv> g;

    public zpq(dzsj<vtn> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<yys> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<vwv> dzsjVar6, dzsj<qbv> dzsjVar7) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: bxen  reason: default package */
/* loaded from: classes4.dex */
public final class bxen {
    public final dzsj<btvo> a;
    public final dzsj<cqat> b;
    public final dzsj<cqhn> c;
    public final dzsj<akpm> d;
    public final dzsj<bxer> e;
    public final dzsj<cjqy> f;
    public final dzsj<cqhu> g;
    public final dzsj<bxnq> h;
    public final dzsj<bxnt> i;
    public final dzsj<cklq> j;

    public bxen(dzsj<btvo> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<akpm> dzsjVar4, dzsj<bxer> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<bxnq> dzsjVar8, dzsj<bxnt> dzsjVar9, dzsj<cklq> dzsjVar10) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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

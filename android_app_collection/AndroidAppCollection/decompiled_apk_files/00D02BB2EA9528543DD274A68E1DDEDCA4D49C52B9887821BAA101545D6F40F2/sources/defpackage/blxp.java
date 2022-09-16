package defpackage;
/* compiled from: PG */
/* renamed from: blxp  reason: default package */
/* loaded from: classes3.dex */
public final class blxp {
    public final dzsj<ff> a;
    public final dzsj<blwm> b;
    public final dzsj<btrm> c;
    public final dzsj<btvo> d;
    public final dzsj<bvjj> e;
    public final dzsj<anhg> f;
    public final dzsj<bvrb> g;
    public final dzsj<cjqy> h;
    public final dzsj<cjqq> i;
    public final dzsj<blpp> j;
    public final dzsj<ccif> k;
    public final dzsj<cqat> l;

    public blxp(dzsj<ff> dzsjVar, dzsj<blwm> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<anhg> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<cjqy> dzsjVar8, dzsj<cjqq> dzsjVar9, dzsj<blpp> dzsjVar10, dzsj<ccif> dzsjVar11, dzsj<cqat> dzsjVar12) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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

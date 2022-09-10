package defpackage;
/* compiled from: PG */
/* renamed from: brad  reason: default package */
/* loaded from: classes4.dex */
public final class brad {
    public final dzsj<dxio<afwp>> a;
    public final dzsj<bnlm> b;
    public final dzsj<bsni> c;
    public final dzsj<bsnk> d;
    public final dzsj<efg> e;
    public final dzsj<brat> f;
    public final dzsj<ckmp> g;
    public final dzsj<acyp> h;
    public final dzsj<bsos> i;
    public final dzsj<brlk> j;

    public brad(dzsj<dxio<afwp>> dzsjVar, dzsj<bnlm> dzsjVar2, dzsj<bsni> dzsjVar3, dzsj<bsnk> dzsjVar4, dzsj<efg> dzsjVar5, dzsj<brat> dzsjVar6, dzsj<ckmp> dzsjVar7, dzsj<acyp> dzsjVar8, dzsj<bsos> dzsjVar9, dzsj<brlk> dzsjVar10) {
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

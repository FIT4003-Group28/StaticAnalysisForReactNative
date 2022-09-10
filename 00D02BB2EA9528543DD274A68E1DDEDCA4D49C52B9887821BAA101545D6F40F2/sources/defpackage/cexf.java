package defpackage;
/* compiled from: PG */
/* renamed from: cexf  reason: default package */
/* loaded from: classes4.dex */
public final class cexf {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bjgj> c;
    public final dzsj<bjgl> d;
    public final dzsj<cjqq> e;
    public final dzsj<cjqy> f;
    public final dzsj<ceff> g;
    public final dzsj<cexb> h;
    public final dzsj<btvo> i;
    public final dzsj<cese> j;

    public cexf(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bjgj> dzsjVar3, dzsj<bjgl> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<ceff> dzsjVar7, dzsj<cexb> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<cese> dzsjVar10) {
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

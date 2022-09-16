package defpackage;
/* compiled from: PG */
/* renamed from: aqpp  reason: default package */
/* loaded from: classes2.dex */
public final class aqpp {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<czsy> c;
    public final dzsj<aqgo> d;
    public final dzsj<dxio<akfa>> e;
    public final dzsj<aprv> f;
    public final dzsj<dxio<aqav>> g;
    public final dzsj<dxio<apyz>> h;
    public final dzsj<dxio<apyu>> i;
    public final dzsj<dxio<aqcn>> j;

    public aqpp(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<czsy> dzsjVar3, dzsj<aqgo> dzsjVar4, dzsj<dxio<akfa>> dzsjVar5, dzsj<aprv> dzsjVar6, dzsj<dxio<aqav>> dzsjVar7, dzsj<dxio<apyz>> dzsjVar8, dzsj<dxio<apyu>> dzsjVar9, dzsj<dxio<aqcn>> dzsjVar10) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: bazf  reason: default package */
/* loaded from: classes3.dex */
public final class bazf {
    public final dzsj<gga> a;
    public final dzsj<ahjq> b;
    public final dzsj<axwq> c;
    public final dzsj<bayv> d;
    public final dzsj<bayy> e;
    public final dzsj<bazx> f;
    public final dzsj<ania> g;
    public final dzsj<dxio<axwy>> h;
    public final dzsj<wgc> i;
    public final dzsj<cqhn> j;

    public bazf(dzsj<gga> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<axwq> dzsjVar3, dzsj<bayv> dzsjVar4, dzsj<bayy> dzsjVar5, dzsj<bazx> dzsjVar6, dzsj<ania> dzsjVar7, dzsj<dxio<axwy>> dzsjVar8, dzsj<wgc> dzsjVar9, dzsj<cqhn> dzsjVar10) {
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

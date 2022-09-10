package defpackage;
/* compiled from: PG */
/* renamed from: aapr  reason: default package */
/* loaded from: classes2.dex */
public final class aapr {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<aapl> c;
    public final dzsj<cklf> d;
    public final dzsj<dxio<caym>> e;
    public final dzsj<cbqg> f;
    public final dzsj<dxio<akge>> g;
    public final dzsj<dxio<aaps>> h;

    public aapr(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<aapl> dzsjVar3, dzsj<cklf> dzsjVar4, dzsj<dxio<caym>> dzsjVar5, dzsj<cbqg> dzsjVar6, dzsj<dxio<akge>> dzsjVar7, dzsj<dxio<aaps>> dzsjVar8) {
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

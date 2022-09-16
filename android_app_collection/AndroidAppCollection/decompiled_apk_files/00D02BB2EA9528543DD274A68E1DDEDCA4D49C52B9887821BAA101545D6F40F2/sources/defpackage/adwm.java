package defpackage;
/* compiled from: PG */
/* renamed from: adwm  reason: default package */
/* loaded from: classes2.dex */
public final class adwm {
    public final dzsj<gga> a;
    public final dzsj<abfa> b;
    public final dzsj<dxio<adyg>> c;
    public final dzsj<dxio<apyz>> d;
    public final dzsj<adxf> e;
    public final dzsj<bfcn> f;
    public final dzsj<adwg> g;
    public final dzsj<ania> h;
    public final dzsj<adyo> i;

    public adwm(dzsj<gga> dzsjVar, dzsj<abfa> dzsjVar2, dzsj<dxio<adyg>> dzsjVar3, dzsj<dxio<apyz>> dzsjVar4, dzsj<adxf> dzsjVar5, dzsj<bfcn> dzsjVar6, dzsj<adwg> dzsjVar7, dzsj<ania> dzsjVar8, dzsj<adyo> dzsjVar9) {
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

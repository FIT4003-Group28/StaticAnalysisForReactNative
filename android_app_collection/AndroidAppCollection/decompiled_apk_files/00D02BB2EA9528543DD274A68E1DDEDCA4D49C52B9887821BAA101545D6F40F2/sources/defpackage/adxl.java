package defpackage;
/* compiled from: PG */
/* renamed from: adxl  reason: default package */
/* loaded from: classes2.dex */
public final class adxl {
    public final dzsj<abfa> a;
    public final dzsj<adxf> b;
    public final dzsj<dxio<adyg>> c;
    public final dzsj<ania> d;
    public final dzsj<gga> e;
    public final dzsj<dxio<afha>> f;

    public adxl(dzsj<abfa> dzsjVar, dzsj<adxf> dzsjVar2, dzsj<dxio<adyg>> dzsjVar3, dzsj<ania> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<dxio<afha>> dzsjVar6) {
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

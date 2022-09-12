package defpackage;
/* compiled from: PG */
/* renamed from: adwd  reason: default package */
/* loaded from: classes2.dex */
public final class adwd {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<abfa> c;
    public final dzsj<adxf> d;
    public final dzsj<adyo> e;
    public final dzsj<dxio<adyg>> f;

    public adwd(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<abfa> dzsjVar3, dzsj<adxf> dzsjVar4, dzsj<adyo> dzsjVar5, dzsj<dxio<adyg>> dzsjVar6) {
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

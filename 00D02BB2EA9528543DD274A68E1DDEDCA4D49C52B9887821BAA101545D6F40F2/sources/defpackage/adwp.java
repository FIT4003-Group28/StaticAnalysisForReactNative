package defpackage;
/* compiled from: PG */
/* renamed from: adwp  reason: default package */
/* loaded from: classes2.dex */
public final class adwp {
    public final dzsj<gga> a;
    public final dzsj<huc> b;
    public final dzsj<cqhn> c;
    public final dzsj<abfa> d;
    public final dzsj<adxl> e;
    public final dzsj<bvpe> f;

    public adwp(dzsj<gga> dzsjVar, dzsj<huc> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<abfa> dzsjVar4, dzsj<adxl> dzsjVar5, dzsj<bvpe> dzsjVar6) {
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

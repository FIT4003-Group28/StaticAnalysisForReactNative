package defpackage;
/* compiled from: PG */
/* renamed from: adxr  reason: default package */
/* loaded from: classes2.dex */
public final class adxr {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<adxf> c;
    public final dzsj<adxh> d;

    public adxr(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<adxf> dzsjVar3, dzsj<adxh> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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

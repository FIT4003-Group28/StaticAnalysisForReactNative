package defpackage;
/* compiled from: PG */
/* renamed from: pms  reason: default package */
/* loaded from: classes7.dex */
public final class pms {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<cjqy> c;
    public final dzsj<pmo> d;
    public final dzsj<brba> e;
    public final dzsj<dxio<afha>> f;

    public pms(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<pmo> dzsjVar4, dzsj<brba> dzsjVar5, dzsj<dxio<afha>> dzsjVar6) {
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

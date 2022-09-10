package defpackage;
/* compiled from: PG */
/* renamed from: bixx  reason: default package */
/* loaded from: classes3.dex */
public final class bixx {
    public final dzsj<dxio<afha>> a;
    public final dzsj<gce> b;
    public final dzsj<dxio<bvvw>> c;
    public final dzsj<btvo> d;
    public final dzsj<gga> e;

    public bixx(dzsj<dxio<afha>> dzsjVar, dzsj<gce> dzsjVar2, dzsj<dxio<bvvw>> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<gga> dzsjVar5) {
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

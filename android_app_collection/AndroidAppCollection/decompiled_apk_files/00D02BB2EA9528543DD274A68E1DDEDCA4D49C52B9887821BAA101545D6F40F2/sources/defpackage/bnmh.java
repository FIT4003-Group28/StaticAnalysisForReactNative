package defpackage;
/* compiled from: PG */
/* renamed from: bnmh  reason: default package */
/* loaded from: classes3.dex */
public final class bnmh {
    public final dzsj<btvo> a;
    public final dzsj<dxio<bvjj>> b;
    public final dzsj<dxio<afha>> c;
    public final dzsj<gga> d;

    public bnmh(dzsj<btvo> dzsjVar, dzsj<dxio<bvjj>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<gga> dzsjVar4) {
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

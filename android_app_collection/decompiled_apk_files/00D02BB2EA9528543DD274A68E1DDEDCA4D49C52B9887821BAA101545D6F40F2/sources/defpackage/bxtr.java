package defpackage;
/* compiled from: PG */
/* renamed from: bxtr  reason: default package */
/* loaded from: classes4.dex */
public final class bxtr {
    public final dzsj<gga> a;
    public final dzsj<gft> b;
    public final dzsj<dxio<axwy>> c;
    public final dzsj<btvo> d;

    public bxtr(dzsj<gga> dzsjVar, dzsj<gft> dzsjVar2, dzsj<dxio<axwy>> dzsjVar3, dzsj<btvo> dzsjVar4) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: pif  reason: default package */
/* loaded from: classes7.dex */
public final class pif {
    public final dzsj<dehp> a;
    public final dzsj<akfa> b;
    public final dzsj<dxio<btvo>> c;
    public final dzsj<dxio<pgf>> d;
    public final dzsj<dxio<pgp>> e;

    public pif(dzsj<dehp> dzsjVar, dzsj<akfa> dzsjVar2, dzsj<dxio<btvo>> dzsjVar3, dzsj<dxio<pgf>> dzsjVar4, dzsj<dxio<pgp>> dzsjVar5) {
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

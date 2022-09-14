package defpackage;
/* compiled from: PG */
/* renamed from: bxul  reason: default package */
/* loaded from: classes4.dex */
public final class bxul {
    public final dzsj<ff> a;
    public final dzsj<dxio<brba>> b;
    public final dzsj<gft> c;
    public final dzsj<cjqy> d;

    public bxul(dzsj<ff> dzsjVar, dzsj<dxio<brba>> dzsjVar2, dzsj<gft> dzsjVar3, dzsj<cjqy> dzsjVar4) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: ahgs  reason: default package */
/* loaded from: classes2.dex */
public final class ahgs {
    public final dzsj<ahas> a;
    public final dzsj<ahgn> b;
    public final dzsj<ahht> c;
    public final dzsj<ahfo> d;
    public final dzsj<dxio<agaw>> e;

    public ahgs(dzsj<ahas> dzsjVar, dzsj<ahgn> dzsjVar2, dzsj<ahht> dzsjVar3, dzsj<ahfo> dzsjVar4, dzsj<dxio<agaw>> dzsjVar5) {
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

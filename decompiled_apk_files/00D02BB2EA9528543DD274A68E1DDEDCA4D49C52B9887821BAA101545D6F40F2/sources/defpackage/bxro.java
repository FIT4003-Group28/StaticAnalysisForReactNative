package defpackage;
/* compiled from: PG */
/* renamed from: bxro  reason: default package */
/* loaded from: classes4.dex */
public final class bxro {
    public final dzsj<bxeg> a;
    public final dzsj<awvy> b;
    public final dzsj<bxrf> c;
    public final dzsj<dxio<akox>> d;
    public final dzsj<dbsg<dxio<aeaa>>> e;

    public bxro(dzsj<bxeg> dzsjVar, dzsj<awvy> dzsjVar2, dzsj<bxrf> dzsjVar3, dzsj<dxio<akox>> dzsjVar4, dzsj<dbsg<dxio<aeaa>>> dzsjVar5) {
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

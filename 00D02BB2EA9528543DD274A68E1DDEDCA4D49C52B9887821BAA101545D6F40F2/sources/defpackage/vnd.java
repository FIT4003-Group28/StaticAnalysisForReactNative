package defpackage;
/* compiled from: PG */
/* renamed from: vnd  reason: default package */
/* loaded from: classes7.dex */
public final class vnd {
    public final dzsj<bvnx> a;
    public final dzsj<btrm> b;
    public final dzsj<dxio<akzh>> c;
    public final dzsj<dxio<akpm>> d;

    public vnd(dzsj<bvnx> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<dxio<akzh>> dzsjVar3, dzsj<dxio<akpm>> dzsjVar4) {
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

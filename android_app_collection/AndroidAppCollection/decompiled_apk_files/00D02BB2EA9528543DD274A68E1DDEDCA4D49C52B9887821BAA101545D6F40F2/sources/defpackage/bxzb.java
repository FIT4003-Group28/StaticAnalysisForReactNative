package defpackage;
/* compiled from: PG */
/* renamed from: bxzb  reason: default package */
/* loaded from: classes4.dex */
public final class bxzb {
    public final dzsj<dxio<nut>> a;
    public final dzsj<bxyp> b;
    public final dzsj<ckmp> c;
    public final dzsj<cklq> d;
    public final dzsj<btvo> e;

    public bxzb(dzsj<dxio<nut>> dzsjVar, dzsj<bxyp> dzsjVar2, dzsj<ckmp> dzsjVar3, dzsj<cklq> dzsjVar4, dzsj<btvo> dzsjVar5) {
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

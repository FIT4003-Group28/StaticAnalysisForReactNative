package defpackage;
/* compiled from: PG */
/* renamed from: bxyy  reason: default package */
/* loaded from: classes4.dex */
public final class bxyy {
    public final dzsj<dxio<nut>> a;
    public final dzsj<dxio<bxtx>> b;
    public final dzsj<btvo> c;
    public final dzsj<dxio<ahjq>> d;
    public final dzsj<bxyp> e;
    public final dzsj<cklq> f;

    public bxyy(dzsj<dxio<nut>> dzsjVar, dzsj<dxio<bxtx>> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<dxio<ahjq>> dzsjVar4, dzsj<bxyp> dzsjVar5, dzsj<cklq> dzsjVar6) {
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

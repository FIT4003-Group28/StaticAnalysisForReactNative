package defpackage;
/* compiled from: PG */
/* renamed from: ccys  reason: default package */
/* loaded from: classes4.dex */
public final class ccys {
    public final dzsj<ff> a;
    public final dzsj<dxio<cclq>> b;
    public final dzsj<cqhn> c;
    public final dzsj<ccyl> d;
    public final dzsj<chhr> e;
    public final dzsj<ccrh> f;
    public final dzsj<cctx> g;

    public ccys(dzsj<ff> dzsjVar, dzsj<dxio<cclq>> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<ccyl> dzsjVar4, dzsj<chhr> dzsjVar5, dzsj<ccrh> dzsjVar6, dzsj<cctx> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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

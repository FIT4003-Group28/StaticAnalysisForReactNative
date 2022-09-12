package defpackage;
/* compiled from: PG */
/* renamed from: cbew  reason: default package */
/* loaded from: classes4.dex */
public final class cbew {
    public final dzsj<cbeq> a;
    public final dzsj<cqkj> b;
    public final dzsj<dxio<cqhn>> c;
    public final dzsj<cbbc> d;
    public final dzsj<cbqg> e;
    public final dzsj<gga> f;

    public cbew(dzsj<cbeq> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<dxio<cqhn>> dzsjVar3, dzsj<cbbc> dzsjVar4, dzsj<cbqg> dzsjVar5, dzsj<gga> dzsjVar6) {
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

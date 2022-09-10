package defpackage;
/* compiled from: PG */
/* renamed from: byjz  reason: default package */
/* loaded from: classes4.dex */
public final class byjz {
    public final dzsj<dxio<ahjq>> a;
    public final dzsj<axru> b;
    public final dzsj<btrm> c;
    public final dzsj<btvo> d;
    public final dzsj<byiq> e;
    public final dzsj<byjf> f;

    public byjz(dzsj<dxio<ahjq>> dzsjVar, dzsj<axru> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<byiq> dzsjVar5, dzsj<byjf> dzsjVar6) {
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

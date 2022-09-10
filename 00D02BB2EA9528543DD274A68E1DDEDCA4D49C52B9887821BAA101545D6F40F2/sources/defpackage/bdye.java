package defpackage;
/* compiled from: PG */
/* renamed from: bdye  reason: default package */
/* loaded from: classes3.dex */
public final class bdye {
    public final dzsj<brrr> a;
    public final dzsj<btrm> b;
    public final dzsj<dxio<iqr>> c;
    public final dzsj<dxio<iqu>> d;
    public final dzsj<bhlk> e;
    public final dzsj<begx> f;
    public final dzsj<jkf> g;
    public final dzsj<iqs> h;
    public final dzsj<bego> i;
    public final dzsj<cqhu> j;

    public bdye(dzsj<brrr> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<dxio<iqr>> dzsjVar3, dzsj<dxio<iqu>> dzsjVar4, dzsj<bhlk> dzsjVar5, dzsj<begx> dzsjVar6, dzsj<jkf> dzsjVar7, dzsj<iqs> dzsjVar8, dzsj<bego> dzsjVar9, dzsj<cqhu> dzsjVar10) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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

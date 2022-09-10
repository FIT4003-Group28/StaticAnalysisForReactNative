package defpackage;
/* compiled from: PG */
/* renamed from: aibv  reason: default package */
/* loaded from: classes2.dex */
public final class aibv {
    public final dzsj<cqat> a;
    public final dzsj<bvrb> b;
    public final dzsj<aibg> c;
    public final dzsj<btpc> d;
    public final dzsj<aihe<ailz, aihs>> e;
    public final dzsj<aihe<aimj, aiig>> f;
    public final dzsj<aiki> g;
    public final dzsj<btvo> h;

    public aibv(dzsj<cqat> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<aibg> dzsjVar3, dzsj<btpc> dzsjVar4, dzsj<aihe<ailz, aihs>> dzsjVar5, dzsj<aihe<aimj, aiig>> dzsjVar6, dzsj<aiki> dzsjVar7, dzsj<btvo> dzsjVar8) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: tna  reason: default package */
/* loaded from: classes7.dex */
final class tna {
    public final dzsj<gga> a;
    public final dzsj<cjzo> b;
    public final dzsj<cjqy> c;
    public final dzsj<bwjz> d;
    public final dzsj<btrm> e;
    public final dzsj<dxio<akfa>> f;
    public final dzsj<eeu> g;
    public final dzsj<bvrb> h;
    public final dzsj<nut> i;
    public final dzsj<qbt> j;
    public final dzsj<ahjq> k;
    public final dzsj<ckcw> l;
    public final dzsj<bwjy> m;

    public tna(dzsj<gga> dzsjVar, dzsj<cjzo> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<bwjz> dzsjVar4, dzsj<btrm> dzsjVar5, dzsj<dxio<akfa>> dzsjVar6, dzsj<eeu> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<nut> dzsjVar9, dzsj<qbt> dzsjVar10, dzsj<ahjq> dzsjVar11, dzsj<ckcw> dzsjVar12, dzsj<bwjy> dzsjVar13) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
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

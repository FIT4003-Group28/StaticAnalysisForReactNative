package defpackage;
/* compiled from: PG */
/* renamed from: bxtf  reason: default package */
/* loaded from: classes4.dex */
public final class bxtf {
    public final dzsj<cqhn> a;
    public final dzsj<dxio<btpc>> b;
    public final dzsj<dxio<bxtr>> c;
    public final dzsj<dxio<bxtt>> d;
    public final dzsj<wfx> e;
    public final dzsj<dxio<axwy>> f;
    public final dzsj<dxio<anhg>> g;
    public final dzsj<dxio<batn>> h;
    public final dzsj<gga> i;
    public final dzsj<wdw> j;
    public final dzsj<wdy> k;
    public final dzsj<cjqy> l;
    public final dzsj<cjqq> m;

    public bxtf(dzsj<cqhn> dzsjVar, dzsj<dxio<btpc>> dzsjVar2, dzsj<dxio<bxtr>> dzsjVar3, dzsj<dxio<bxtt>> dzsjVar4, dzsj<wfx> dzsjVar5, dzsj<dxio<axwy>> dzsjVar6, dzsj<dxio<anhg>> dzsjVar7, dzsj<dxio<batn>> dzsjVar8, dzsj<gga> dzsjVar9, dzsj<wdw> dzsjVar10, dzsj<wdy> dzsjVar11, dzsj<cjqy> dzsjVar12, dzsj<cjqq> dzsjVar13) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: bxye  reason: default package */
/* loaded from: classes4.dex */
public final class bxye {
    public final dzsj<gga> a;
    public final dzsj<btrm> b;
    public final dzsj<bxeg> c;
    public final dzsj<bxyu> d;
    public final dzsj<bxzr> e;
    public final dzsj<bxtu> f;
    public final dzsj<bxtx> g;
    public final dzsj<ania> h;
    public final dzsj<dxio<afha>> i;

    public bxye(dzsj<gga> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bxeg> dzsjVar3, dzsj<bxyu> dzsjVar4, dzsj<bxzr> dzsjVar5, dzsj<bxtu> dzsjVar6, dzsj<bxtx> dzsjVar7, dzsj<ania> dzsjVar8, dzsj<dxio<afha>> dzsjVar9) {
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

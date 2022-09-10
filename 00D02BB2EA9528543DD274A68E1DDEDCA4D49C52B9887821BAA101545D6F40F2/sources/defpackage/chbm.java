package defpackage;
/* compiled from: PG */
/* renamed from: chbm  reason: default package */
/* loaded from: classes4.dex */
public class chbm {
    public final dzsj<cgsi> a;
    public final dzsj<cham> b;
    public final dzsj<cgwr> c;
    public final dzsj<gga> d;
    public final dzsj<cztz> e;
    public final dzsj<bvjj> f;
    public final dzsj<cjqy> g;
    public final dzsj<cjqq> h;
    public final dzsj<btvo> i;

    public chbm(dzsj<cgsi> dzsjVar, dzsj<cham> dzsjVar2, dzsj<cgwr> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<cztz> dzsjVar5, dzsj<bvjj> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<cjqq> dzsjVar8, dzsj<btvo> dzsjVar9) {
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

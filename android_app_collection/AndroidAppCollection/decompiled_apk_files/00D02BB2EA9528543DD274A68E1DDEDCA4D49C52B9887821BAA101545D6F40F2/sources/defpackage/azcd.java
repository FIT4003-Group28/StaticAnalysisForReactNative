package defpackage;
/* compiled from: PG */
/* renamed from: azcd  reason: default package */
/* loaded from: classes3.dex */
public final class azcd {
    public final dzsj<gga> a;
    public final dzsj<cqkj> b;
    public final dzsj<cjqy> c;
    public final dzsj<axxb> d;
    public final dzsj<aymh> e;
    public final dzsj<cqhn> f;
    public final dzsj<axwo> g;
    public final dzsj<axwi> h;
    public final dzsj<axze> i;
    public final dzsj<aydl> j;

    public azcd(dzsj<gga> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<axxb> dzsjVar4, dzsj<aymh> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<axwo> dzsjVar7, dzsj<axwi> dzsjVar8, dzsj<axze> dzsjVar9, dzsj<aydl> dzsjVar10) {
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

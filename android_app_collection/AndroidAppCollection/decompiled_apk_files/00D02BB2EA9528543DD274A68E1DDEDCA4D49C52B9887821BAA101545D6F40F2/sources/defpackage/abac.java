package defpackage;
/* compiled from: PG */
/* renamed from: abac  reason: default package */
/* loaded from: classes2.dex */
public final class abac {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqhu> c;
    public final dzsj<bvjj> d;
    public final dzsj<dxio<bbut>> e;
    public final dzsj<dxio<bdhl>> f;
    public final dzsj<akfa> g;
    public final dzsj<jlp> h;

    public abac(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<dxio<bbut>> dzsjVar5, dzsj<dxio<bdhl>> dzsjVar6, dzsj<akfa> dzsjVar7, dzsj<jlp> dzsjVar8) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: cbeq  reason: default package */
/* loaded from: classes4.dex */
public final class cbeq {
    public final dzsj<buni> a;
    public final dzsj<gga> b;
    public final dzsj<cqkj> c;
    public final dzsj<cztz> d;
    public final dzsj<bvjj> e;
    public final dzsj<dxio<aagc>> f;
    public final dzsj<dxio<cafi>> g;

    public cbeq(dzsj<buni> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cqkj> dzsjVar3, dzsj<cztz> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<dxio<aagc>> dzsjVar6, dzsj<dxio<cafi>> dzsjVar7) {
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

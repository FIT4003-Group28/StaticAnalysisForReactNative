package defpackage;
/* compiled from: PG */
/* renamed from: aejb  reason: default package */
/* loaded from: classes.dex */
public final class aejb {
    public final dzsj<gga> a;
    public final dzsj<btvo> b;
    public final dzsj<cqat> c;
    public final dzsj<cqhn> d;
    public final dzsj<aeiv> e;
    public final dzsj<aeic> f;
    public final dzsj<dxio<bskt>> g;

    public aejb(dzsj<gga> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<aeiv> dzsjVar5, dzsj<aeic> dzsjVar6, dzsj<dxio<bskt>> dzsjVar7) {
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

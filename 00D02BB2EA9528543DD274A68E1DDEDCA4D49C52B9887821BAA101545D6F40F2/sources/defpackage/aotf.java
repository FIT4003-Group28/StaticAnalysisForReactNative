package defpackage;
/* compiled from: PG */
/* renamed from: aotf  reason: default package */
/* loaded from: classes2.dex */
public final class aotf {
    public final dzsj<anhg> a;
    public final dzsj<btpc> b;
    public final dzsj<gga> c;
    public final dzsj<bvjj> d;
    public final dzsj<cqhn> e;
    public final dzsj<aosw> f;
    public final dzsj<aoth> g;
    public final dzsj<huc> h;
    public final dzsj<bvpe> i;

    public aotf(dzsj<anhg> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<aosw> dzsjVar6, dzsj<aoth> dzsjVar7, dzsj<huc> dzsjVar8, dzsj<bvpe> dzsjVar9) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: ahbc  reason: default package */
/* loaded from: classes2.dex */
public final class ahbc {
    public final dzsj<gga> a;
    public final dzsj<huc> b;
    public final dzsj<bvpe> c;
    public final dzsj<cqhn> d;
    public final dzsj<cqhu> e;
    public final dzsj<dehq> f;
    public final dzsj<jmq> g;
    public final dzsj<cpv> h;

    public ahbc(dzsj<gga> dzsjVar, dzsj<huc> dzsjVar2, dzsj<bvpe> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<cqhu> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<jmq> dzsjVar7, dzsj<cpv> dzsjVar8) {
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

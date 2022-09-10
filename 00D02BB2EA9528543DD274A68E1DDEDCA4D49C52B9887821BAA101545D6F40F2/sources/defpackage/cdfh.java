package defpackage;
/* compiled from: PG */
/* renamed from: cdfh  reason: default package */
/* loaded from: classes4.dex */
public class cdfh {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bmdv> c;
    public final dzsj<cdfm> d;
    public final dzsj<cdaq> e;
    public final dzsj<cqhu> f;
    public final dzsj<gdc> g;
    public final dzsj<cpv> h;

    public cdfh(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bmdv> dzsjVar3, dzsj<cdfm> dzsjVar4, dzsj<cdaq> dzsjVar5, dzsj<cqhu> dzsjVar6, dzsj<gdc> dzsjVar7, dzsj<cpv> dzsjVar8) {
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

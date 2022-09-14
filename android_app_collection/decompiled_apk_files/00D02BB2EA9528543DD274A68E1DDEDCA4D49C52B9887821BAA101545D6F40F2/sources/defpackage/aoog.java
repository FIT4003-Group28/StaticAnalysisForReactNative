package defpackage;
/* compiled from: PG */
/* renamed from: aoog  reason: default package */
/* loaded from: classes2.dex */
public class aoog {
    public final dzsj<jkf> a;
    public final dzsj<anri> b;
    public final dzsj<anrz> c;
    public final dzsj<aoiq> d;
    public final dzsj<fd> e;
    public final dzsj<gga> f;
    public final dzsj<bwqv> g;
    public final dzsj<cqhn> h;

    public aoog(dzsj<jkf> dzsjVar, dzsj<anri> dzsjVar2, dzsj<anrz> dzsjVar3, dzsj<aoiq> dzsjVar4, dzsj<fd> dzsjVar5, dzsj<gga> dzsjVar6, dzsj<bwqv> dzsjVar7, dzsj<cqhn> dzsjVar8) {
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

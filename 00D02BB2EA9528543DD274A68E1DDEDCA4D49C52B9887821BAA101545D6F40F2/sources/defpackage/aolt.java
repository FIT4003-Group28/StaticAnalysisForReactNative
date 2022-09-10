package defpackage;
/* compiled from: PG */
/* renamed from: aolt  reason: default package */
/* loaded from: classes2.dex */
public class aolt {
    public final dzsj<anpb> a;
    public final dzsj<fd> b;
    public final dzsj<jkf> c;
    public final dzsj<anri> d;
    public final dzsj<aoiq> e;
    public final dzsj<gga> f;
    public final dzsj<cqhn> g;

    public aolt(dzsj<anpb> dzsjVar, dzsj<fd> dzsjVar2, dzsj<jkf> dzsjVar3, dzsj<anri> dzsjVar4, dzsj<aoiq> dzsjVar5, dzsj<gga> dzsjVar6, dzsj<cqhn> dzsjVar7) {
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

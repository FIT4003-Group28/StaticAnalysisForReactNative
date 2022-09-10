package defpackage;
/* compiled from: PG */
/* renamed from: aolm  reason: default package */
/* loaded from: classes2.dex */
public final class aolm {
    public final dzsj<bvvq> a;
    public final dzsj<cqhn> b;
    public final dzsj<gga> c;
    public final dzsj<btvo> d;
    public final dzsj<afha> e;
    public final dzsj<anhg> f;
    public final dzsj<btrm> g;

    public aolm(dzsj<bvvq> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<afha> dzsjVar5, dzsj<anhg> dzsjVar6, dzsj<btrm> dzsjVar7) {
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

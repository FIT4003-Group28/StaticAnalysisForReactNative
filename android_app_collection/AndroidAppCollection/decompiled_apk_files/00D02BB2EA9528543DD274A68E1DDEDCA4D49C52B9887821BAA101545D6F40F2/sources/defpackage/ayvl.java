package defpackage;
/* compiled from: PG */
/* renamed from: ayvl  reason: default package */
/* loaded from: classes3.dex */
public final class ayvl {
    public final dzsj<gga> a;
    public final dzsj<fd> b;
    public final dzsj<ahjq> c;
    public final dzsj<bvsl> d;
    public final dzsj<aydo> e;
    public final dzsj<aybq> f;
    public final dzsj<aywv> g;

    public ayvl(dzsj<gga> dzsjVar, dzsj<fd> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<bvsl> dzsjVar4, dzsj<aydo> dzsjVar5, dzsj<aybq> dzsjVar6, dzsj<aywv> dzsjVar7) {
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

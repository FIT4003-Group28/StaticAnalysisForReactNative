package defpackage;
/* compiled from: PG */
/* renamed from: aheu  reason: default package */
/* loaded from: classes2.dex */
public final class aheu {
    public final dzsj<gga> a;
    public final dzsj<dxio<bkpi>> b;
    public final dzsj<axjh> c;
    public final dzsj<ixf> d;
    public final dzsj<axoi> e;
    public final dzsj<bviq> f;
    public final dzsj<ceda> g;

    public aheu(dzsj<gga> dzsjVar, dzsj<dxio<bkpi>> dzsjVar2, dzsj<axjh> dzsjVar3, dzsj<ixf> dzsjVar4, dzsj<axoi> dzsjVar5, dzsj<bviq> dzsjVar6, dzsj<ceda> dzsjVar7) {
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

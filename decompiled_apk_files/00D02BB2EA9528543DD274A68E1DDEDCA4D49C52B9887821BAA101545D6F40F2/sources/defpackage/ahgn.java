package defpackage;
/* compiled from: PG */
/* renamed from: ahgn  reason: default package */
/* loaded from: classes2.dex */
public class ahgn {
    public final dzsj<btvo> a;
    public final dzsj<cqhn> b;
    public final dzsj<gga> c;
    public final dzsj<dxio<ania>> d;
    public final dzsj<afzs> e;
    public final dzsj<akfa> f;
    public final dzsj<bbdv> g;
    public final dzsj<agag> h;
    public final dzsj<agbq> i;

    public ahgn(dzsj<btvo> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<dxio<ania>> dzsjVar4, dzsj<afzs> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<bbdv> dzsjVar7, dzsj<agag> dzsjVar8, dzsj<agbq> dzsjVar9) {
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

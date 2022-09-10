package defpackage;
/* compiled from: PG */
/* renamed from: ahbx  reason: default package */
/* loaded from: classes2.dex */
public final class ahbx {
    public final dzsj<cqhn> a;
    public final dzsj<agwa> b;
    public final dzsj<gfq> c;
    public final dzsj<gga> d;
    public final dzsj<dxio<akzh>> e;
    public final dzsj<akox> f;
    public final dzsj<bvrb> g;
    public final dzsj<iwv> h;
    public final dzsj<btxv> i;

    public ahbx(dzsj<cqhn> dzsjVar, dzsj<agwa> dzsjVar2, dzsj<gfq> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<dxio<akzh>> dzsjVar5, dzsj<akox> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<iwv> dzsjVar8, dzsj<btxv> dzsjVar9) {
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

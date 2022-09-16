package defpackage;
/* compiled from: PG */
/* renamed from: blli  reason: default package */
/* loaded from: classes3.dex */
public class blli {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<cqhu> c;
    private final dzsj<dxio<akfa>> d;
    private final dzsj<blnq> e;
    private final dzsj<bkuf> f;
    private final dzsj<btrm> g;
    private final dzsj<cebr> h;
    private final dzsj<btvo> i;

    public blli(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<blnq> dzsjVar5, dzsj<bkuf> dzsjVar6, dzsj<btrm> dzsjVar7, dzsj<cebr> dzsjVar8, dzsj<btvo> dzsjVar9) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bllh a(blhs blhsVar) {
        b(blhsVar, 1);
        gga a = this.a.a();
        b(a, 2);
        cqhn a2 = this.b.a();
        b(a2, 3);
        cqhu a3 = this.c.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 5);
        blnq a5 = this.e.a();
        b(a5, 6);
        bkuf a6 = this.f.a();
        b(a6, 7);
        btrm a7 = this.g.a();
        b(a7, 8);
        cebr a8 = this.h.a();
        b(a8, 9);
        btvo a9 = this.i.a();
        b(a9, 10);
        return new bllh(blhsVar, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}

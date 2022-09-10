package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iyj  reason: default package */
/* loaded from: classes7.dex */
public class iyj {
    private final dzsj<ff> a;
    private final dzsj<buyl> b;
    private final dzsj<bvas> c;
    private final dzsj<akfa> d;
    private final dzsj<akfc> e;
    private final dzsj<Executor> f;
    private final dzsj<btvo> g;
    private final dzsj<cebr> h;
    private final dzsj<btrm> i;

    public iyj(dzsj<ff> dzsjVar, dzsj<buyl> dzsjVar2, dzsj<bvas> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<akfc> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<cebr> dzsjVar8, dzsj<btrm> dzsjVar9) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
        c(dzsjVar6, 6);
        this.f = dzsjVar6;
        c(dzsjVar7, 7);
        this.g = dzsjVar7;
        c(dzsjVar8, 8);
        this.h = dzsjVar8;
        c(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final iyi a(dtol dtolVar, boolean z) {
        c(dtolVar, 1);
        ff ffVar = (ff) ((dxjd) this.a).a;
        c(ffVar, 3);
        buyl a = this.b.a();
        c(a, 4);
        bvas a2 = this.c.a();
        c(a2, 5);
        akfa a3 = this.d.a();
        c(a3, 6);
        akfc a4 = this.e.a();
        c(a4, 7);
        Executor a5 = this.f.a();
        c(a5, 8);
        btvo a6 = this.g.a();
        c(a6, 9);
        cebr a7 = this.h.a();
        c(a7, 10);
        btrm a8 = this.i.a();
        c(a8, 11);
        return new iyi(dtolVar, z, ffVar, a, a2, a3, a4, a5, a6, a7, a8);
    }

    public final iyi b(bwrs<ilo> bwrsVar, cdjd cdjdVar, @dzsi ddho ddhoVar) {
        c(bwrsVar, 1);
        c(cdjdVar, 2);
        ff ffVar = (ff) ((dxjd) this.a).a;
        c(ffVar, 6);
        buyl a = this.b.a();
        c(a, 7);
        bvas a2 = this.c.a();
        c(a2, 8);
        akfa a3 = this.d.a();
        c(a3, 9);
        akfc a4 = this.e.a();
        c(a4, 10);
        Executor a5 = this.f.a();
        c(a5, 11);
        btvo a6 = this.g.a();
        c(a6, 12);
        cebr a7 = this.h.a();
        c(a7, 13);
        btrm a8 = this.i.a();
        c(a8, 14);
        return new iyi(bwrsVar, cdjdVar, false, ddhoVar, null, ffVar, a, a2, a3, a4, a5, a6, a7, a8);
    }
}

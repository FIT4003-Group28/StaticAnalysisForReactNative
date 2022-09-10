package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mip  reason: default package */
/* loaded from: classes7.dex */
public final class mip {
    private final dzsj<cqhn> a;
    private final dzsj<bvsl> b;
    private final dzsj<bvnx> c;
    private final dzsj<cjqy> d;
    private final dzsj<cjqq> e;
    private final dzsj<ckcw> f;
    private final dzsj<btrm> g;
    private final dzsj<akfa> h;
    private final dzsj<dehq> i;
    private final dzsj<mpv> j;

    public mip(dzsj<cqhn> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<bvnx> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<ckcw> dzsjVar6, dzsj<btrm> dzsjVar7, dzsj<akfa> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<mpv> dzsjVar10) {
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
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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

    public final mio a(Context context, nov novVar, ksh kshVar, ksi ksiVar, qbo qboVar, ksr ksrVar, kcw kcwVar, cqkj cqkjVar, not notVar, akox akoxVar, hwe hweVar, kxu kxuVar, lzf lzfVar, jty jtyVar, kdi kdiVar, nop nopVar, ncm ncmVar, asmp asmpVar, ldm ldmVar, ncf ncfVar, dcdc<ldm> dcdcVar, @dzsi vup vupVar, @dzsi aryr aryrVar, kdk kdkVar, mnz mnzVar, boolean z, boolean z2, mwp mwpVar, boolean z3, @dzsi cjsz cjszVar, @dzsi axxb axxbVar, @dzsi axwi axwiVar, moe moeVar) {
        b(context, 1);
        cqhn a = this.a.a();
        b(a, 2);
        bvsl a2 = this.b.a();
        b(a2, 3);
        b(novVar, 4);
        b(kshVar, 5);
        b(ksiVar, 6);
        b(qboVar, 7);
        b(ksrVar, 8);
        b(kcwVar, 9);
        bvnx a3 = this.c.a();
        b(a3, 10);
        b(cqkjVar, 11);
        b(notVar, 12);
        b(akoxVar, 13);
        b(hweVar, 14);
        b(kxuVar, 15);
        b(lzfVar, 16);
        b(jtyVar, 17);
        b(kdiVar, 18);
        b(nopVar, 19);
        b(ncmVar, 20);
        cjqy a4 = this.d.a();
        b(a4, 21);
        cjqq a5 = this.e.a();
        b(a5, 22);
        ckcw a6 = this.f.a();
        b(a6, 23);
        b(asmpVar, 24);
        b(ldmVar, 25);
        b(ncfVar, 26);
        b(dcdcVar, 27);
        b(kdkVar, 30);
        b(mnzVar, 31);
        b(mwpVar, 34);
        btrm a7 = this.g.a();
        b(a7, 37);
        akfa a8 = this.h.a();
        b(a8, 40);
        dehq a9 = this.i.a();
        b(a9, 41);
        mpv a10 = this.j.a();
        b(a10, 42);
        b(moeVar, 43);
        return new mio(a, a2, novVar, kshVar, ksiVar, qboVar, ksrVar, kcwVar, a3, cqkjVar, notVar, akoxVar, hweVar, kxuVar, lzfVar, jtyVar, kdiVar, nopVar, ncmVar, a4, a5, a6, asmpVar, ldmVar, ncfVar, dcdcVar, vupVar, aryrVar, kdkVar, mnzVar, z, z2, mwpVar, z3, cjszVar, a7, axxbVar, axwiVar, a8, a9, a10);
    }
}

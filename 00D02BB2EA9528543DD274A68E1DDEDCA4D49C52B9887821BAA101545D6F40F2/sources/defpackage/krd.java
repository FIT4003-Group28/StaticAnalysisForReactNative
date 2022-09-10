package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: krd  reason: default package */
/* loaded from: classes7.dex */
public final class krd {
    private final dzsj<btrm> a;
    private final dzsj<cqat> b;
    private final dzsj<btpc> c;
    private final dzsj<cjqy> d;
    private final dzsj<cjqq> e;
    private final dzsj<jzp> f;
    private final dzsj<krt> g;
    private final dzsj<cqiw<krv>> h;
    private final dzsj<krx> i;
    private final dzsj<btvo> j;
    private final dzsj<krg> k;

    public krd(dzsj<btrm> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btpc> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<jzp> dzsjVar6, dzsj<krt> dzsjVar7, dzsj<cqiw<krv>> dzsjVar8, dzsj<krx> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<krg> dzsjVar11) {
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
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
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

    public final krc a(Context context, bxer bxerVar, kdg kdgVar, kdi kdiVar, cqkj cqkjVar, akox akoxVar, nov novVar, nop nopVar, noo nooVar, @dzsi mcm mcmVar, not notVar, @dzsi dndr dndrVar, kpl kplVar, befw befwVar, kcv kcvVar, kqp kqpVar) {
        b(context, 1);
        btrm a = this.a.a();
        b(a, 2);
        cqat a2 = this.b.a();
        b(a2, 3);
        b(bxerVar, 4);
        b(kdgVar, 5);
        btpc a3 = this.c.a();
        b(a3, 6);
        cjqy a4 = this.d.a();
        b(a4, 7);
        cjqq a5 = this.e.a();
        b(a5, 8);
        b(kdiVar, 9);
        b(cqkjVar, 10);
        jzp a6 = this.f.a();
        b(a6, 11);
        b(akoxVar, 12);
        b(novVar, 13);
        b(nopVar, 14);
        b(nooVar, 15);
        b(notVar, 17);
        b(kplVar, 19);
        b(befwVar, 20);
        b(kcvVar, 21);
        krt a7 = this.g.a();
        b(a7, 22);
        cqiw<krv> a8 = this.h.a();
        b(a8, 23);
        krx a9 = this.i.a();
        b(a9, 24);
        btvo a10 = this.j.a();
        b(a10, 25);
        krg a11 = this.k.a();
        b(a11, 26);
        b(kqpVar, 27);
        return new krc(context, a, a2, bxerVar, kdgVar, a3, a4, a5, kdiVar, cqkjVar, a6, akoxVar, novVar, nopVar, nooVar, mcmVar, notVar, dndrVar, kplVar, befwVar, kcvVar, a7, a8, a9, a10, a11, kqpVar);
    }
}

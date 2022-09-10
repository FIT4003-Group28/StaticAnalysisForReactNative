package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atom  reason: default package */
/* loaded from: classes2.dex */
public final class atom {
    private static final dcqe a = dcqe.c("atom");
    private final btvo b;
    private final atvu c;
    private final atvj d;
    private final atsy e;
    @dzsi
    private final atvm f;
    @dzsi
    private final atui g;
    @dzsi
    private final atum h;
    @dzsi
    private final atuo i;

    public atom(btvo btvoVar, atvu atvuVar, atvj atvjVar, atsy atsyVar, @dzsi atvm atvmVar, @dzsi atui atuiVar, @dzsi atum atumVar, @dzsi atuo atuoVar) {
        this.b = btvoVar;
        this.c = atvuVar;
        this.d = atvjVar;
        this.e = atsyVar;
        this.f = atvmVar;
        this.g = atuiVar;
        this.h = atumVar;
        this.i = atuoVar;
    }

    @dzsi
    public final atxz a(crqw crqwVar, @dzsi atxu atxuVar, boolean z) {
        if (crqwVar instanceof crre) {
            atvu atvuVar = this.c;
            crre crreVar = (crre) crqwVar;
            dbsk.s(atxuVar);
            long j = true != z ? 6000L : 30000L;
            atvu.a(crreVar, 1);
            atvu.a(atxuVar, 2);
            btrm a2 = atvuVar.a.a();
            atvu.a(a2, 4);
            btvo a3 = atvuVar.b.a();
            atvu.a(a3, 5);
            cref a4 = atvuVar.c.a();
            atvu.a(a4, 6);
            Context a5 = atvuVar.d.a();
            atvu.a(a5, 7);
            cqat a6 = atvuVar.e.a();
            atvu.a(a6, 8);
            cjqy a7 = atvuVar.f.a();
            atvu.a(a7, 9);
            cjqq a8 = atvuVar.g.a();
            atvu.a(a8, 10);
            vtn a9 = atvuVar.h.a();
            atvu.a(a9, 11);
            dehq a10 = atvuVar.i.a();
            atvu.a(a10, 12);
            Executor a11 = atvuVar.j.a();
            atvu.a(a11, 13);
            atsr a12 = atvuVar.k.a();
            atvu.a(a12, 14);
            crem a13 = atvuVar.l.a();
            atvu.a(a13, 15);
            Boolean a14 = atvuVar.m.a();
            atvu.a(a14, 16);
            return new atvt(crreVar, atxuVar, j, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14.booleanValue());
        } else if (crqwVar instanceof crrb) {
            atvj atvjVar = this.d;
            crrb crrbVar = (crrb) crqwVar;
            atvj.a(crrbVar, 1);
            Context a15 = atvjVar.a.a();
            atvj.a(a15, 2);
            btrm a16 = atvjVar.b.a();
            atvj.a(a16, 3);
            btvo a17 = atvjVar.c.a();
            atvj.a(a17, 4);
            cref a18 = atvjVar.d.a();
            atvj.a(a18, 5);
            cqat a19 = atvjVar.e.a();
            atvj.a(a19, 6);
            cjqy a20 = atvjVar.f.a();
            atvj.a(a20, 7);
            cjqq a21 = atvjVar.g.a();
            atvj.a(a21, 8);
            dehq a22 = atvjVar.h.a();
            atvj.a(a22, 9);
            Executor a23 = atvjVar.i.a();
            atvj.a(a23, 10);
            atsr a24 = atvjVar.j.a();
            atvj.a(a24, 11);
            Boolean a25 = atvjVar.k.a();
            atvj.a(a25, 12);
            return new atvi(crrbVar, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25.booleanValue());
        } else if (crqwVar instanceof crpv) {
            atsy atsyVar = this.e;
            crpv crpvVar = (crpv) crqwVar;
            dbsk.s(atxuVar);
            int a26 = dpin.a(crpvVar.a.c);
            long millis = (a26 != 0 && a26 == 3) ? 6000L : TimeUnit.SECONDS.toMillis(this.b.getNavigationParameters().w());
            atsy.a(crpvVar, 1);
            atsy.a(atxuVar, 2);
            dbsg<asmp> a27 = atsyVar.a.a();
            atsy.a(a27, 4);
            btrm a28 = atsyVar.b.a();
            atsy.a(a28, 5);
            cref a29 = atsyVar.c.a();
            atsy.a(a29, 6);
            pfk a30 = atsyVar.d.a();
            atsy.a(a30, 7);
            brlz a31 = atsyVar.e.a();
            atsy.a(a31, 8);
            cqat a32 = atsyVar.f.a();
            atsy.a(a32, 9);
            Context a33 = atsyVar.g.a();
            atsy.a(a33, 10);
            btvo a34 = atsyVar.h.a();
            atsy.a(a34, 11);
            cjqy a35 = atsyVar.i.a();
            atsy.a(a35, 12);
            cjqq a36 = atsyVar.j.a();
            atsy.a(a36, 13);
            jzv a37 = atsyVar.k.a();
            atsy.a(a37, 14);
            dehq a38 = atsyVar.l.a();
            atsy.a(a38, 15);
            Executor a39 = atsyVar.m.a();
            atsy.a(a39, 16);
            atsr a40 = atsyVar.n.a();
            atsy.a(a40, 17);
            vtn a41 = atsyVar.o.a();
            atsy.a(a41, 18);
            Boolean a42 = atsyVar.p.a();
            atsy.a(a42, 19);
            return new atsx(crpvVar, atxuVar, millis, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42.booleanValue());
        } else {
            atvm atvmVar = this.f;
            if (atvmVar == null || !(crqwVar instanceof crrc)) {
                atui atuiVar = this.g;
                if (atuiVar == null || !(crqwVar instanceof crqs)) {
                    atum atumVar = this.h;
                    if (atumVar == null || !(crqwVar instanceof crqt)) {
                        if (crqwVar instanceof crqb) {
                            return null;
                        }
                        atuo atuoVar = this.i;
                        if (atuoVar == null || !(crqwVar instanceof crqu)) {
                            if (!(crqwVar instanceof crrd) && !(crqwVar instanceof crqp) && !(crqwVar instanceof crqq) && !(crqwVar instanceof crql) && !(crqwVar instanceof crqm) && !(crqwVar instanceof crqk) && !(crqwVar instanceof crrf) && !(crqwVar instanceof crqz) && !(crqwVar instanceof crra) && !(crqwVar instanceof crpz) && !(crqwVar instanceof crpy) && !(crqwVar instanceof asbp) && z) {
                                bvoo.h("Unknown PromptState type: %s", crqwVar.getClass());
                            }
                            return null;
                        }
                        crqu crquVar = (crqu) crqwVar;
                        atuo.a(crquVar, 1);
                        btrm a43 = atuoVar.a.a();
                        atuo.a(a43, 2);
                        btvo a44 = atuoVar.b.a();
                        atuo.a(a44, 3);
                        cref a45 = atuoVar.c.a();
                        atuo.a(a45, 4);
                        cqat a46 = atuoVar.d.a();
                        atuo.a(a46, 5);
                        cjqy a47 = atuoVar.e.a();
                        atuo.a(a47, 6);
                        cjqq a48 = atuoVar.f.a();
                        atuo.a(a48, 7);
                        Context a49 = atuoVar.g.a();
                        atuo.a(a49, 8);
                        dehq a50 = atuoVar.h.a();
                        atuo.a(a50, 9);
                        Executor a51 = atuoVar.i.a();
                        atuo.a(a51, 10);
                        atsr a52 = atuoVar.j.a();
                        atuo.a(a52, 11);
                        Boolean a53 = atuoVar.k.a();
                        atuo.a(a53, 12);
                        return new atun(crquVar, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, a53.booleanValue());
                    }
                    crqt crqtVar = (crqt) crqwVar;
                    atum.a(crqtVar, 1);
                    btrm a54 = atumVar.a.a();
                    atum.a(a54, 2);
                    btvo a55 = atumVar.b.a();
                    atum.a(a55, 3);
                    cref a56 = atumVar.c.a();
                    atum.a(a56, 4);
                    cqat a57 = atumVar.d.a();
                    atum.a(a57, 5);
                    cjqy a58 = atumVar.e.a();
                    atum.a(a58, 6);
                    cjqq a59 = atumVar.f.a();
                    atum.a(a59, 7);
                    Context a60 = atumVar.g.a();
                    atum.a(a60, 8);
                    dehq a61 = atumVar.h.a();
                    atum.a(a61, 9);
                    Executor a62 = atumVar.i.a();
                    atum.a(a62, 10);
                    atsr a63 = atumVar.j.a();
                    atum.a(a63, 11);
                    Boolean a64 = atumVar.k.a();
                    atum.a(a64, 12);
                    return new atul(crqtVar, a54, a55, a56, a57, a58, a59, a60, a61, a62, a63, a64.booleanValue());
                }
                crqs crqsVar = (crqs) crqwVar;
                atui.a(crqsVar, 1);
                btrm a65 = atuiVar.a.a();
                atui.a(a65, 2);
                btvo a66 = atuiVar.b.a();
                atui.a(a66, 3);
                cref a67 = atuiVar.c.a();
                atui.a(a67, 4);
                Context a68 = atuiVar.d.a();
                atui.a(a68, 5);
                cqat a69 = atuiVar.e.a();
                atui.a(a69, 6);
                cjqy a70 = atuiVar.f.a();
                atui.a(a70, 7);
                cjqq a71 = atuiVar.g.a();
                atui.a(a71, 8);
                vtn a72 = atuiVar.h.a();
                atui.a(a72, 9);
                dehq a73 = atuiVar.i.a();
                atui.a(a73, 10);
                Executor a74 = atuiVar.j.a();
                atui.a(a74, 11);
                atsr a75 = atuiVar.k.a();
                atui.a(a75, 12);
                Boolean a76 = atuiVar.l.a();
                atui.a(a76, 13);
                return new atuh(crqsVar, a65, a66, a67, a68, a69, a70, a71, a72, a73, a74, a75, a76.booleanValue());
            }
            crrc crrcVar = (crrc) crqwVar;
            atvm.a(crrcVar, 1);
            btrm a77 = atvmVar.a.a();
            atvm.a(a77, 2);
            btvo a78 = atvmVar.b.a();
            atvm.a(a78, 3);
            cref a79 = atvmVar.c.a();
            atvm.a(a79, 4);
            cqat a80 = atvmVar.d.a();
            atvm.a(a80, 5);
            cjqy a81 = atvmVar.e.a();
            atvm.a(a81, 6);
            cjqq a82 = atvmVar.f.a();
            atvm.a(a82, 7);
            Context a83 = atvmVar.g.a();
            atvm.a(a83, 8);
            dehq a84 = atvmVar.h.a();
            atvm.a(a84, 9);
            Executor a85 = atvmVar.i.a();
            atvm.a(a85, 10);
            atsr a86 = atvmVar.j.a();
            atvm.a(a86, 11);
            Boolean a87 = atvmVar.k.a();
            atvm.a(a87, 12);
            return new atvl(crrcVar, a77, a78, a79, a80, a81, a82, a83, a84, a85, a86, a87.booleanValue());
        }
    }
}

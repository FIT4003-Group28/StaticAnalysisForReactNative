package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bize  reason: default package */
/* loaded from: classes.dex */
public final class bize implements bjbu {
    private final gga a;
    private final bwqv b;

    public bize(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    private final void e(bwrs<ilo> bwrsVar, djao djaoVar, bjbv bjbvVar) {
        bwqv bwqvVar = this.b;
        bjjf bjjfVar = new bjjf();
        Bundle aJ = bjjf.aJ(bwqvVar, bwrsVar);
        bvrs.l(aJ, djaoVar);
        bjjfVar.B(aJ);
        bjbt bjbtVar = (bjbt) bjbvVar;
        if (bjbtVar.a) {
            bjjfVar.o.putBoolean("enable_answer_input", true);
            bjjfVar.e = true;
        }
        if (bjbtVar.b) {
            bjjfVar.o.putBoolean("skip_post_contribution_thanks_page", true);
            bjjfVar.ak = true;
        }
        if (bjbtVar.c) {
            bjjfVar.o.putBoolean("close_after_answering_question", true);
            bjjfVar.al = true;
        }
        String str = bjbtVar.d;
        if (str != null) {
            dbsk.s(str);
            bjjfVar.o.putString("answer_text", str);
        }
        dqcj dqcjVar = bjbtVar.f;
        bjjfVar.am = dqcjVar;
        bjjfVar.o.putInt("entry_point", dqcjVar.e);
        gfw gfwVar = bjbtVar.e;
        if (gfwVar != null) {
            dbsk.s(gfwVar);
            gfwVar.aZ(bjjfVar);
            return;
        }
        this.a.D(bjjfVar);
    }

    @Override // defpackage.bjbu
    public final void a(bwrs<ilo> bwrsVar) {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.b;
        bizi biziVar = new bizi();
        biziVar.B(bizi.aJ(bwqvVar, bwrsVar));
        ggaVar.D(biziVar);
    }

    @Override // defpackage.bjbu
    public final void b(ilo iloVar) {
        this.a.D(bjck.q(this.b, bwrs.a(iloVar)));
    }

    @Override // defpackage.bjbu
    public final void c(bwrs<ilo> bwrsVar, djao djaoVar) {
        e(bwrsVar, djaoVar, bjbv.h().a());
    }

    @Override // defpackage.bjbu
    public final void d(bwrs<ilo> bwrsVar, djao djaoVar, bjbv bjbvVar) {
        e(bwrsVar, djaoVar, bjbvVar);
    }
}

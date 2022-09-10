package defpackage;

import android.content.IntentSender;
/* compiled from: PG */
/* renamed from: btku  reason: default package */
/* loaded from: classes4.dex */
final class btku implements btkw {
    final /* synthetic */ btkv a;

    public btku(btkv btkvVar) {
        this.a = btkvVar;
    }

    @Override // defpackage.btkw
    public final void a(cpfa cpfaVar) {
        int i = cpfaVar.a().a.b;
        cjta b = cjtd.b();
        b.d = dtyi.bR;
        if (i == 2) {
            cjqy cjqyVar = this.a.a.b;
            cjte cjteVar = new cjte(deaf.TAP);
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = deaa.TOGGLE_ON;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
            cjqyVar.m(cjteVar, b.a());
        } else if (i != 3) {
            this.a.a.b.i(b.a());
        } else {
            cjqy cjqyVar2 = this.a.a.b;
            cjte cjteVar2 = new cjte(deaf.TAP);
            ddzy bZ2 = deab.c.bZ();
            deaa deaaVar2 = deaa.TOGGLE_OFF;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            deab deabVar2 = (deab) bZ2.b;
            deabVar2.b = deaaVar2.d;
            deabVar2.a |= 1;
            b.a = bZ2.bK();
            cjqyVar2.m(cjteVar2, b.a());
        }
        if (i != 3) {
            if (!((cpdq) cpfaVar.a).c()) {
                return;
            }
            try {
                ((cpdq) cpfaVar.a).b(this.a.a.a, awnn.UNKNOWN.ordinal());
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        btkx btkxVar = this.a.a;
        btkxVar.c.a(new btkr(btkxVar), "personal_content_settings");
    }
}

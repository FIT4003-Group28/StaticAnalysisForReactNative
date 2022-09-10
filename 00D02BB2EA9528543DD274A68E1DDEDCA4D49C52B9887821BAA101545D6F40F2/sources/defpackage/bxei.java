package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxei  reason: default package */
/* loaded from: classes4.dex */
public final class bxei implements bxqe {
    final /* synthetic */ bxel a;

    public bxei(bxel bxelVar) {
        this.a = bxelVar;
    }

    @Override // defpackage.bxqe
    public final void b(String str) {
        cjqm j;
        bxel bxelVar = this.a;
        if (!bxelVar.aD || !bxelVar.bb.r()) {
            return;
        }
        bxel bxelVar2 = this.a;
        if (bxelVar2.bc == null) {
            return;
        }
        bxelVar2.bb.Q();
        bxel bxelVar3 = this.a;
        bxem bxemVar = bxelVar3.bc;
        cjql f = bxem.f(bxelVar3.bv());
        if (f == null) {
            ddho ddhoVar = bxemVar.g.b().t;
            if (ddhoVar != null) {
                j = bxemVar.c.m(new cjte(deaf.KEYBOARD_ENTER, dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID), cjtd.a(ddhoVar));
            } else {
                bvoo.d(new IllegalStateException("Impression for interaction not found."));
                j = bxemVar.c.i(cjtd.a(dtyi.L));
            }
        } else {
            ddho ddhoVar2 = bxemVar.g.b().t;
            if (ddhoVar2 != null) {
                j = bxemVar.c.n(f, new cjte(deaf.KEYBOARD_ENTER, dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID), cjtd.a(ddhoVar2));
            } else {
                j = bxemVar.c.j(f, cjtd.a(dtyi.L));
            }
        }
        String bx = bxel.bx(str);
        if (!this.a.bb.p() && bx.isEmpty()) {
            return;
        }
        this.a.bb.e(bx);
        this.a.bc.d(bxkq.ENTER_KEY, j);
    }

    @Override // defpackage.bxqe
    public final void c(String str, int i) {
        deaa deaaVar;
        String d = this.a.bb.d();
        this.a.bb.e(str);
        if (!this.a.aD || dbsj.e(d).equals(dbsj.e(str))) {
            return;
        }
        if (!this.a.bb.R(str)) {
            this.a.bb.Q();
        }
        bxel bxelVar = this.a;
        bxem bxemVar = bxelVar.bc;
        if (bxemVar == null) {
            return;
        }
        if (d != null && str != null) {
            View bv = bxelVar.bv();
            ddho ddhoVar = bxemVar.g.d;
            if (ddhoVar != null) {
                if (d.length() == 0 && str.length() > 0) {
                    deaaVar = deaa.TOGGLE_OFF;
                } else if (d.length() > 0 && str.length() == 0) {
                    deaaVar = deaa.TOGGLE_ON;
                }
                bxemVar.e(ddhoVar, deaaVar, bv);
            }
        }
        if (!dbsj.d(str)) {
            this.a.ba.a(ckls.TYPED_SUGGESTIONS_REQUESTED);
        }
        this.a.bc.b(str, i);
    }
}

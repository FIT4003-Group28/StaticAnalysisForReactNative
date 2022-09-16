package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: apce  reason: default package */
/* loaded from: classes2.dex */
final class apce extends cqqw {
    final /* synthetic */ cjtd a;
    final /* synthetic */ bwrs b;
    final /* synthetic */ apcf c;

    public apce(apcf apcfVar, cjtd cjtdVar, bwrs bwrsVar) {
        this.c = apcfVar;
        this.a = cjtdVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.c.b = true;
        } else if (i != 0) {
        } else {
            apcf apcfVar = this.c;
            if (!apcfVar.b) {
                return;
            }
            apcfVar.b = false;
            if (apcfVar.a == dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID) {
                return;
            }
            this.c.c.m(new cjte(deaf.SWIPE, this.c.a), this.a);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        aag aagVar;
        if (i2 != 0) {
            this.c.a = i2 > 0 ? dead.UP : dead.DOWN;
        }
        aoyg aoygVar = (aoyg) this.b.c();
        dbsk.s(aoygVar);
        if (aoygVar.b() != aoyf.PARTIALLY_LOADED || (aagVar = (aag) recyclerView.l) == null || aagVar.ae() == -1 || aagVar.ae() < aagVar.aN() - 5) {
            return;
        }
        this.c.d.c(this.b);
    }
}

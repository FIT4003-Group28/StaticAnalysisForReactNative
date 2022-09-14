package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: jmp  reason: default package */
/* loaded from: classes7.dex */
public final class jmp extends cqqw {
    private final jmo a;
    private int b = -1;

    public jmp(jmo jmoVar) {
        this.a = jmoVar;
        dbsk.v(0, Integer.MAX_VALUE, "Threshold must be non-negative");
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (od.ad(recyclerView) || !od.ae(recyclerView)) {
            return;
        }
        abs absVar = recyclerView.l;
        if (!(absVar instanceof aag)) {
            return;
        }
        aag aagVar = (aag) absVar;
        int ae = aagVar.ae();
        int aN = aagVar.aN() - 1;
        if (ae <= this.b || ae < aN) {
            return;
        }
        this.b = aN;
        this.a.c();
    }
}

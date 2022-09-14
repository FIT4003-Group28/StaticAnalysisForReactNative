package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: inj  reason: default package */
/* loaded from: classes6.dex */
public final class inj extends iop {
    private static final dcqe a = dcqe.c("inj");

    public inj(cqhn cqhnVar, cqhu cqhuVar, jmz jmzVar) {
        super(jmzVar);
    }

    @Override // defpackage.iop
    @dzsi
    public final RecyclerView a(View view) {
        iqd iqdVar = (iqd) cqkx.e(view, iph.a, iqd.class);
        if (iqdVar == null) {
            bvoo.h("Couldn't find scroll view", new Object[0]);
        }
        return iqdVar;
    }
}

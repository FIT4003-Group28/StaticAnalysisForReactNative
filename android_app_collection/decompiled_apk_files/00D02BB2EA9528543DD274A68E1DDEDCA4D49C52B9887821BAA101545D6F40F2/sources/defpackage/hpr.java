package defpackage;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hpr  reason: default package */
/* loaded from: classes6.dex */
public final class hpr implements cqfc {
    final /* synthetic */ Integer a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ird c;

    public hpr(Integer num, boolean z, ird irdVar) {
        this.a = num;
        this.b = z;
        this.c = irdVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        View a;
        int a2;
        float f;
        Integer num = this.a;
        cqtv cqtvVar = hps.a;
        if (num != null) {
            a = view.getRootView().findViewById(num.intValue());
        } else {
            a = cqhu.a(view, hqv.d);
            dbsk.s(a);
        }
        View view2 = this.a != null ? a : view;
        if (this.b) {
            f = 0.0f;
        } else {
            Context context = view.getContext();
            ird irdVar = this.c;
            Integer valueOf = Integer.valueOf(irdVar == null ? 0 : irdVar.NR(context));
            if (this.a != null) {
                a2 = a.getHeight();
            } else {
                a2 = jmj.a(context, 48) + valueOf.intValue();
            }
            f = -a2;
        }
        a.animate().translationY(f).setInterpolator(irf.a).setDuration(500L).setListener(new hpq(this, view2)).start();
    }
}

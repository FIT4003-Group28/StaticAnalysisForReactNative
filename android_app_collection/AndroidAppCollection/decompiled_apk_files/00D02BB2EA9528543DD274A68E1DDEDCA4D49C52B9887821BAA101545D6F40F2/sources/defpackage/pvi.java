package defpackage;

import android.view.View;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pvi  reason: default package */
/* loaded from: classes7.dex */
public final class pvi implements Callable<Integer> {
    final /* synthetic */ pvk a;

    public pvi(pvk pvkVar) {
        this.a = pvkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        int i;
        View view = null;
        if (this.a.c.b().booleanValue()) {
            int intValue = this.a.c.i().intValue();
            pvk pvkVar = this.a;
            if (pvkVar.t == null || pvkVar.u != intValue) {
                pvkVar.u = intValue;
                pvkVar.t = pvkVar.h.c().findViewById(this.a.c.q().get(intValue).a().V().intValue());
            }
        } else {
            this.a.t = null;
        }
        View view2 = this.a.t;
        if (view2 != null) {
            i = view2.getMeasuredHeight();
            View rootView = this.a.t.getRootView();
            if (rootView != null) {
                view = cqhu.a(rootView, zei.a);
            }
            if (!this.a.g()) {
                pvk pvkVar2 = this.a;
                if (!pvkVar2.c.q().isEmpty() && (pvkVar2.c.q().get(pvkVar2.c.i().intValue()).a() instanceof zeu) && view != null) {
                    i += view.getMeasuredHeight();
                }
            }
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}

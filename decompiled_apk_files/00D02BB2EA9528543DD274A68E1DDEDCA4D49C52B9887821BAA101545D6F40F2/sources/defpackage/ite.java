package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ite  reason: default package */
/* loaded from: classes.dex */
public final class ite implements itg {
    private final cjqq a;

    public ite(cjqq cjqqVar) {
        this.a = cjqqVar;
    }

    @Override // defpackage.itg
    public final void a(View view) {
        c(view);
    }

    @Override // defpackage.itg
    public final void b(View view) {
        itf.a(view);
    }

    @Deprecated
    public final void c(View view) {
        int i = itf.c;
        itf itfVar = (itf) view.getTag(R.id.impression_logger);
        if (itfVar == null) {
            itfVar = new itf(view, this.a);
            view.setTag(R.id.impression_logger, itfVar);
            view.addOnAttachStateChangeListener(itfVar);
            if (od.ak(view)) {
                itfVar.onViewAttachedToWindow(view);
            }
        }
        itfVar.a = false;
    }
}

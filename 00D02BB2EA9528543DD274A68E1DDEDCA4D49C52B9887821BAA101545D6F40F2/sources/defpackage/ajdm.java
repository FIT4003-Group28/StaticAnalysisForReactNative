package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: ajdm  reason: default package */
/* loaded from: classes2.dex */
final class ajdm implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ ajdu a;

    public ajdm(ajdu ajduVar) {
        this.a = ajduVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        dbsg i;
        ajds ajdsVar = this.a.j;
        dbsk.s(ajdsVar);
        View view = this.a.i;
        dbsk.s(view);
        boolean a = ((ajck) ajdsVar).a(view, this.a.a);
        ajds ajdsVar2 = this.a.j;
        dbsk.s(ajdsVar2);
        View view2 = this.a.i;
        dbsk.s(view2);
        Context context = this.a.a;
        ajck ajckVar = (ajck) ajdsVar2;
        if (!ajckVar.a(view2, context)) {
            i = dbpy.a;
        } else {
            int a2 = ajcl.a(view2);
            i = dbsg.i(Integer.valueOf(((ajckVar.b(context) - a2) - ajcl.b(view2)) / 2));
        }
        ajdu ajduVar = this.a;
        boolean z = ajduVar.f;
        if (z != a) {
            ajduVar.f = a;
            if (a) {
                ajduVar.g = ((Integer) i.b()).intValue();
            }
            this.a.x();
        } else if (!z || ajduVar.g == ((Integer) i.b()).intValue()) {
        } else {
            this.a.g = ((Integer) i.b()).intValue();
            this.a.x();
        }
    }
}

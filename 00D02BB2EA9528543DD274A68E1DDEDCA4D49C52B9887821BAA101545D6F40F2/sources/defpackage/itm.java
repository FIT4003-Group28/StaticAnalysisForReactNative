package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: itm  reason: default package */
/* loaded from: classes6.dex */
public final class itm implements itg {
    private final itq a;

    public itm(itq itqVar) {
        this.a = itqVar;
    }

    @Override // defpackage.itg
    public final void a(View view) {
        dzvx.c(view, "view");
        int i = itp.b;
        if (itl.a(view) != null) {
            return;
        }
        cjqq a = this.a.a.a();
        itq.a(a, 1);
        itq.a(view, 2);
        new itp(a, view);
    }

    @Override // defpackage.itg
    public final void b(View view) {
        dzvx.c(view, "view");
        int i = itp.b;
        itp a = itl.a(view);
        if (a != null) {
            a.c(null);
            a.b(false);
            a.a(false);
            a.a.removeOnAttachStateChangeListener(a);
            a.a.setTag(R.id.impression_logger, null);
        }
    }
}

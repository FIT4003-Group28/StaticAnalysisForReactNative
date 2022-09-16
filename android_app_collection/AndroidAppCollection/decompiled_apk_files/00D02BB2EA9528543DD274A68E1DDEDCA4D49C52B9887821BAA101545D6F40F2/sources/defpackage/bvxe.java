package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bvxe  reason: default package */
/* loaded from: classes4.dex */
final class bvxe implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gga L = gga.L(view.getContext());
        if (L.g() != null) {
            gn g = L.g();
            dbsk.s(g);
            if (g.J()) {
                return;
            }
            L.g().e();
        }
    }
}

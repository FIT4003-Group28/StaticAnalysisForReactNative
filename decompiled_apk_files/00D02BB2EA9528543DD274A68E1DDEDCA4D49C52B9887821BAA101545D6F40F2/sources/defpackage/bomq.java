package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: bomq  reason: default package */
/* loaded from: classes3.dex */
public final class bomq {
    private static final cqrp a = cqrp.d(4.0d);
    @dzsi
    private View b;
    private final Context c;

    public bomq(Context context) {
        this.c = context;
    }

    public final synchronized void a(View view) {
        if (view.equals(this.b)) {
            return;
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.animate().setDuration(200L).setInterpolator(irf.a).scaleX(1.0f).scaleY(1.0f).alpha(0.7f).translationZ(0.0f);
        }
        view.animate().setDuration(200L).scaleX(1.05f).scaleY(1.05f).alpha(1.0f).translationZ(a.a(this.c));
        this.b = view;
    }
}

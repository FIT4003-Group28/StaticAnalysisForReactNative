package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: alpo  reason: default package */
/* loaded from: classes.dex */
final class alpo implements View.OnFocusChangeListener {
    final /* synthetic */ alpx a;

    public alpo(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.k.l.setActivated(z);
        if (!z) {
            this.a.d(false);
            this.a.d = false;
        }
    }
}

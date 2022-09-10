package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dagw  reason: default package */
/* loaded from: classes5.dex */
final class dagw implements View.OnFocusChangeListener {
    final /* synthetic */ dahe a;

    public dagw(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.a.k.setEndIconActivated(z);
        if (!z) {
            this.a.i(false);
            this.a.d = false;
        }
    }
}

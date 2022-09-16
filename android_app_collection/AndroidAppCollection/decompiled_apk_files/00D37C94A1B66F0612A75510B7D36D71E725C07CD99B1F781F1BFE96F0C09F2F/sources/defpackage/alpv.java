package defpackage;

import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpv  reason: default package */
/* loaded from: classes.dex */
final class alpv implements AutoCompleteTextView.OnDismissListener {
    final /* synthetic */ alpx a;

    public alpv(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        alpx alpxVar = this.a;
        alpxVar.d = true;
        alpxVar.f = System.currentTimeMillis();
        this.a.d(false);
    }
}

package defpackage;

import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: dagt  reason: default package */
/* loaded from: classes5.dex */
final class dagt implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ dagv b;

    public dagt(dagv dagvVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = dagvVar;
        this.a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPopupShowing = this.a.isPopupShowing();
        this.b.a.i(isPopupShowing);
        this.b.a.d = isPopupShowing;
    }
}

package defpackage;

import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpl  reason: default package */
/* loaded from: classes.dex */
final class alpl implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ alpn b;

    public alpl(alpn alpnVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = alpnVar;
        this.a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPopupShowing = this.a.isPopupShowing();
        this.b.a.d(isPopupShowing);
        this.b.a.d = isPopupShowing;
    }
}

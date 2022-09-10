package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkti  reason: default package */
/* loaded from: classes3.dex */
public final class bkti implements View.OnFocusChangeListener {
    final /* synthetic */ bktk a;

    public bkti(bktk bktkVar) {
        this.a = bktkVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        bktk bktkVar = this.a;
        bktkVar.i = z;
        if (z) {
            bktkVar.k(true);
        } else {
            ((InputMethodManager) bktkVar.e.getSystemService("input_method")).hideSoftInputFromWindow(this.a.e.getWindow().getDecorView().getWindowToken(), 0);
        }
    }
}

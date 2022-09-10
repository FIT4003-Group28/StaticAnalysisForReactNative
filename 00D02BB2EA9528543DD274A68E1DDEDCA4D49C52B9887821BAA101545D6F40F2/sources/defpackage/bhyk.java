package defpackage;

import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bhyk  reason: default package */
/* loaded from: classes3.dex */
final class bhyk implements Runnable {
    final /* synthetic */ bhyn a;

    public bhyk(bhyn bhynVar) {
        this.a = bhynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.j.requestFocus();
        ((InputMethodManager) this.a.a.f.getSystemService("input_method")).showSoftInput(this.a.a.j, 1);
    }
}

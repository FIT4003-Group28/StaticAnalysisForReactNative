package defpackage;

import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bdji  reason: default package */
/* loaded from: classes3.dex */
final class bdji implements Runnable {
    final /* synthetic */ bdjk a;

    public bdji(bdjk bdjkVar) {
        this.a = bdjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InputMethodManager) this.a.H().getSystemService("input_method")).toggleSoftInput(1, 1);
    }
}

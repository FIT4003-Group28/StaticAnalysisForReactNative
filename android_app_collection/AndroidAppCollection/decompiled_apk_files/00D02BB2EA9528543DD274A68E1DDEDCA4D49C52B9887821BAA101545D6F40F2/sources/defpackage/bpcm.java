package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
/* compiled from: PG */
/* renamed from: bpcm  reason: default package */
/* loaded from: classes3.dex */
final class bpcm implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ Context b;

    public bpcm(View view, Context context) {
        this.a = view;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.requestFocus();
        ((InputMethodManager) this.b.getSystemService("input_method")).toggleSoftInput(1, 1);
    }
}

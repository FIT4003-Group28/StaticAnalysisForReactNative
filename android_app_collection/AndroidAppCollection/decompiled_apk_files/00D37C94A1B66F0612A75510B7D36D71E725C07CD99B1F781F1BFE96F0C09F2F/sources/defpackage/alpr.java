package defpackage;

import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpr  reason: default package */
/* loaded from: classes.dex */
final class alpr implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ alps b;

    public alpr(alps alpsVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = alpsVar;
        this.a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}

package defpackage;

import com.google.android.libraries.addressinput.widget.components.DelayAutocompleteTextView;
/* compiled from: PG */
/* renamed from: cpnh  reason: default package */
/* loaded from: classes5.dex */
public final class cpnh implements Runnable {
    final /* synthetic */ DelayAutocompleteTextView a;

    public cpnh(DelayAutocompleteTextView delayAutocompleteTextView) {
        this.a = delayAutocompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getBackground().clearColorFilter();
    }
}

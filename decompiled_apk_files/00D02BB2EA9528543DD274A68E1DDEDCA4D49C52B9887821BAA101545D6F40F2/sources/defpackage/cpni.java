package defpackage;

import android.graphics.PorterDuff;
import com.google.android.apps.maps.R;
import com.google.android.libraries.addressinput.widget.components.DelayAutocompleteTextView;
/* compiled from: PG */
/* renamed from: cpni  reason: default package */
/* loaded from: classes5.dex */
public final class cpni implements Runnable {
    final /* synthetic */ DelayAutocompleteTextView a;

    public cpni(DelayAutocompleteTextView delayAutocompleteTextView) {
        this.a = delayAutocompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getBackground().setColorFilter(akm.c(this.a.a, R.color.autocomplete_underline_error_color), PorterDuff.Mode.SRC_IN);
    }
}

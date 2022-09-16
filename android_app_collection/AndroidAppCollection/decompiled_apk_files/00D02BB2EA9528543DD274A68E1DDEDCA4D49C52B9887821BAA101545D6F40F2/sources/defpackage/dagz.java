package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagz  reason: default package */
/* loaded from: classes5.dex */
final class dagz implements dahx {
    final /* synthetic */ dahe a;

    public dagz(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // defpackage.dahx
    public final void a(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.a;
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.removeTextChangedListener(this.a.a);
        if (autoCompleteTextView.getOnFocusChangeListener() == this.a.b) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        autoCompleteTextView.setOnDismissListener(null);
    }
}

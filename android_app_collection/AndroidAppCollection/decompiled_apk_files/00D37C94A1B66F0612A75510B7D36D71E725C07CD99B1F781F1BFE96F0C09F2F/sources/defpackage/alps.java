package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alps  reason: default package */
/* loaded from: classes.dex */
final class alps implements alqq {
    final /* synthetic */ alpx a;

    public alps(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // defpackage.alqq
    public final void a(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.a;
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.post(new alpr(this, autoCompleteTextView));
        if (autoCompleteTextView.getOnFocusChangeListener() == this.a.b) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        autoCompleteTextView.setOnDismissListener(null);
    }
}

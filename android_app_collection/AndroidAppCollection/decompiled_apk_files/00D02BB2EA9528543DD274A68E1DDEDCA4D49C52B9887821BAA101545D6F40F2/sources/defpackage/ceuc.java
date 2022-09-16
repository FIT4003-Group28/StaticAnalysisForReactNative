package defpackage;

import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: ceuc  reason: default package */
/* loaded from: classes4.dex */
final class ceuc implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) view;
        if (!z || editText.getText() == null) {
            return;
        }
        editText.setSelection(editText.getText().length());
    }
}

package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aom  reason: default package */
/* loaded from: classes.dex */
final class aom extends hz {
    private final Reference a;

    public aom(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.hz
    public final void i() {
        EditText editText = (EditText) this.a.get();
        if (editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        anp.b().c(editableText);
        aoi.a(editableText, selectionStart, selectionEnd);
    }
}

package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aoh  reason: default package */
/* loaded from: classes.dex */
final class aoh extends hz {
    private final Reference a;

    public aoh(TextView textView) {
        this.a = new WeakReference(textView);
    }

    @Override // defpackage.hz
    public final void i() {
        TextView textView = (TextView) this.a.get();
        if (textView == null || !textView.isAttachedToWindow()) {
            return;
        }
        CharSequence c = anp.b().c(textView.getText());
        int selectionStart = Selection.getSelectionStart(c);
        int selectionEnd = Selection.getSelectionEnd(c);
        textView.setText(c);
        if (!(c instanceof Spannable)) {
            return;
        }
        aoi.a((Spannable) c, selectionStart, selectionEnd);
    }
}

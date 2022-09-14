package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cvdg  reason: default package */
/* loaded from: classes5.dex */
public class cvdg extends eacn {
    private boolean a = false;

    @Override // defpackage.eacn
    protected final void a(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.a) {
            return;
        }
        this.a = true;
        Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.eacn
    protected final void b(TextView textView) {
        if (!this.a) {
            return;
        }
        this.a = false;
        Selection.removeSelection((Spannable) textView.getText());
    }
}

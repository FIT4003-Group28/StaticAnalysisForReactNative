package defpackage;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
/* compiled from: PG */
/* renamed from: xxq  reason: default package */
/* loaded from: classes4.dex */
public final class xxq implements SpanWatcher {
    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int spanStart;
        int spanEnd;
        if (obj != Selection.SELECTION_END) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        if (selectionStart == -1 || selectionStart != selectionEnd || i4 <= 0 || i4 >= spannable.length()) {
            return;
        }
        if (i4 > i2) {
            ajwp[] ajwpVarArr = (ajwp[]) spannable.getSpans(i4 - 1, i4, ajwp.class);
            if (ajwpVarArr == null || ajwpVarArr.length <= 0 || (spanEnd = spannable.getSpanEnd(ajwpVarArr[0])) < 0) {
                return;
            }
            Selection.setSelection(spannable, spanEnd);
            return;
        }
        ajwp[] ajwpVarArr2 = (ajwp[]) spannable.getSpans(i4, i4 + 1, ajwp.class);
        if (ajwpVarArr2 == null || ajwpVarArr2.length <= 0 || (spanStart = spannable.getSpanStart(ajwpVarArr2[0])) < 0) {
            return;
        }
        Selection.setSelection(spannable, spanStart);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}

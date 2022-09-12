package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: bxnn  reason: default package */
/* loaded from: classes4.dex */
public final class bxnn implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        bxno[] bxnoVarArr;
        for (bxno bxnoVar : (bxno[]) editable.getSpans(0, editable.length(), bxno.class)) {
            int spanStart = editable.getSpanStart(bxnoVar);
            int spanEnd = editable.getSpanEnd(bxnoVar);
            editable.removeSpan(bxnoVar);
            editable.delete(spanStart, spanEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

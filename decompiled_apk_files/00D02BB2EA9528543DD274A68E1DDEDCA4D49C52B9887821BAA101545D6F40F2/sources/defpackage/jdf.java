package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: jdf  reason: default package */
/* loaded from: classes7.dex */
public final class jdf extends AutoCompleteTextView {
    public jdf(Context context) {
        super(context);
    }

    @Override // android.widget.AutoCompleteTextView
    protected final CharSequence convertSelectionToString(Object obj) {
        CharSequence m = obj instanceof jbi ? ((jbi) obj).m() : null;
        return m == null ? super.convertSelectionToString(obj) : m;
    }

    @Override // android.widget.AutoCompleteTextView
    protected final void performFiltering(CharSequence charSequence, int i) {
    }

    public jdf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jdf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

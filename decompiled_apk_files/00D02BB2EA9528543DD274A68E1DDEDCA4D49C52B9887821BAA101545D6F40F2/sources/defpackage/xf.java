package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: PG */
/* renamed from: xf  reason: default package */
/* loaded from: classes.dex */
public final class xf extends CheckedTextView {
    private static final int[] a = {16843016};
    private final yh b;

    public xf(Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        yh yhVar = this.b;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xk.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(sl.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        yh yhVar = this.b;
        if (yhVar != null) {
            yhVar.b(context, i);
        }
    }

    public xf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        yh yhVar = new yh(this);
        this.b = yhVar;
        yhVar.a(attributeSet, i);
        yhVar.d();
        aeq b = aeq.b(getContext(), attributeSet, a, i, 0);
        setCheckMarkDrawable(b.d(0));
        b.q();
    }
}

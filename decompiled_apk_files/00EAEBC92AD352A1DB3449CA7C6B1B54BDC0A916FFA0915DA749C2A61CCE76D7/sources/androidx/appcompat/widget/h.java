package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1256c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    private final y f1257b;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1257b = new y(this);
        this.f1257b.a(attributeSet, i);
        this.f1257b.a();
        x0 a2 = x0.a(getContext(), attributeSet, f1256c, i, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.a();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f1257b;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.a.k.a.a.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f1257b;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}

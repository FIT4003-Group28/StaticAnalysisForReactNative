package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: PG */
/* renamed from: ua  reason: default package */
/* loaded from: classes4.dex */
public final class ua extends CheckedTextView {
    private static final int[] a = {16843016};
    private final uz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        aaa.a(context);
        zy.d(this, getContext());
        uz uzVar = new uz(this);
        this.b = uzVar;
        uzVar.g(attributeSet, 16843720);
        uzVar.e();
        aad l = aad.l(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(l.h(0));
        l.o();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.e();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        le.c(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(po.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        uz uzVar = this.b;
        if (uzVar != null) {
            uzVar.h(context, i);
        }
    }
}

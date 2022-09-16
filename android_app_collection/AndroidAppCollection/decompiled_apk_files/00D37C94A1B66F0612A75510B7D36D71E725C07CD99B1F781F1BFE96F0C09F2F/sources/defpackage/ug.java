package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ug  reason: default package */
/* loaded from: classes4.dex */
public final class ug extends MultiAutoCompleteTextView {
    private static final int[] a = {16843126};
    private final ty b;
    private final uz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        aaa.a(context);
        zy.d(this, getContext());
        aad l = aad.l(getContext(), attributeSet, a, R.attr.autoCompleteTextViewStyle, 0);
        if (l.q(0)) {
            setDropDownBackgroundDrawable(l.h(0));
        }
        l.o();
        ty tyVar = new ty(this);
        this.b = tyVar;
        tyVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        uz uzVar = new uz(this);
        this.c = uzVar;
        uzVar.g(attributeSet, R.attr.autoCompleteTextViewStyle);
        uzVar.e();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.a();
        }
        uz uzVar = this.c;
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

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ty tyVar = this.b;
        if (tyVar != null) {
            tyVar.c(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(po.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        uz uzVar = this.c;
        if (uzVar != null) {
            uzVar.h(context, i);
        }
    }
}

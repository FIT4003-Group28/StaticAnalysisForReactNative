package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xb  reason: default package */
/* loaded from: classes.dex */
public class xb extends AutoCompleteTextView {
    private static final int[] a = {16843126};
    private final xc b;
    private final yh c;

    public xb(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.e();
        }
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        xk.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(sl.b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.b;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        yh yhVar = this.c;
        if (yhVar != null) {
            yhVar.b(context, i);
        }
    }

    public xb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        aeq b = aeq.b(getContext(), attributeSet, a, i, 0);
        if (b.p(0)) {
            setDropDownBackgroundDrawable(b.d(0));
        }
        b.q();
        xc xcVar = new xc(this);
        this.b = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.c = yhVar;
        yhVar.a(attributeSet, i);
        yhVar.d();
    }
}

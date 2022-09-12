package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xj  reason: default package */
/* loaded from: classes.dex */
public class xj extends EditText {
    private final xc a;
    private final yh b;
    private final yf c;
    private qd<TextView> d;

    public xj(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.e();
        }
        yh yhVar = this.b;
        if (yhVar != null) {
            yhVar.d();
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public final Editable mo48getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        yh.s(this, onCreateInputConnection, editorInfo);
        xk.a(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection == null || this.d == null) {
            return onCreateInputConnection;
        }
        throw null;
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (this.d == null) {
            return super.onTextContextMenuItem(i);
        }
        if (i == 16908322 || i == 16908337) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if ((clipboardManager == null ? null : clipboardManager.getPrimaryClip()) == null) {
                return true;
            }
            this.d.a();
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.b(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    public void setRichContentReceiverCompat(qd<TextView> qdVar) {
        this.d = qdVar;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.c(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        xc xcVar = this.a;
        if (xcVar != null) {
            xcVar.d(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        yh yhVar = this.b;
        if (yhVar != null) {
            yhVar.b(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        yf yfVar;
        if (Build.VERSION.SDK_INT >= 28 || (yfVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yfVar.a = textClassifier;
        }
    }

    public xj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        yf yfVar;
        if (Build.VERSION.SDK_INT >= 28 || (yfVar = this.c) == null) {
            return super.getTextClassifier();
        }
        return yfVar.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aen.a(context);
        ael.d(this, getContext());
        xc xcVar = new xc(this);
        this.a = xcVar;
        xcVar.a(attributeSet, i);
        yh yhVar = new yh(this);
        this.b = yhVar;
        yhVar.a(attributeSet, i);
        yhVar.d();
        this.c = new yf(this);
    }
}

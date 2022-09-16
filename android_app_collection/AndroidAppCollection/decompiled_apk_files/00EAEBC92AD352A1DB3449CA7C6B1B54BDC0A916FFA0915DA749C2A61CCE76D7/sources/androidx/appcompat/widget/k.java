package androidx.appcompat.widget;

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
/* loaded from: classes.dex */
public class k extends EditText implements a.g.m.u {

    /* renamed from: b  reason: collision with root package name */
    private final e f1305b;

    /* renamed from: c  reason: collision with root package name */
    private final y f1306c;

    /* renamed from: d  reason: collision with root package name */
    private final x f1307d;

    public k(Context context) {
        this(context, null);
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.editTextStyle);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        this.f1305b = new e(this);
        this.f1305b.a(attributeSet, i);
        this.f1306c = new y(this);
        this.f1306c.a(attributeSet, i);
        this.f1306c.a();
        this.f1307d = new x(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1305b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1306c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1305b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1305b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public Editable mo57getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1307d) == null) ? super.getTextClassifier() : xVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1305b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1305b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1305b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1305b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f1306c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1307d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.a(textClassifier);
        }
    }
}

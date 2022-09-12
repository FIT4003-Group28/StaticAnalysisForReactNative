package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextInputEditText extends xj {
    private final Rect a;
    private boolean b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout a = a();
        if (a == null || !this.b || rect == null) {
            return;
        }
        a.getFocusedRect(this.a);
        rect.bottom = this.a.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout a = a();
        if (a != null && this.b && rect != null) {
            a.getGlobalVisibleRect(this.a, point);
            rect.bottom = this.a.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout a = a();
        return (a == null || !a.h) ? super.getHint() : a.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout a = a();
        if (a == null || !a.h || super.getHint() != null || !daan.a()) {
            return;
        }
        setHint("");
    }

    @Override // defpackage.xj, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout a = a();
            editorInfo.hintText = a != null ? a.b() : null;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout a = a();
        if (Build.VERSION.SDK_INT >= 23 || a == null) {
            return;
        }
        Editable mo48getText = mo48getText();
        CharSequence b = a.b();
        boolean z = !TextUtils.isEmpty(mo48getText);
        boolean isEmpty = TextUtils.isEmpty(b);
        setLabelFor(R.id.textinput_helper_text);
        String str = "";
        String charSequence = isEmpty ^ true ? b.toString() : str;
        if (z) {
            String valueOf = String.valueOf(mo48getText);
            if (!TextUtils.isEmpty(charSequence)) {
                String valueOf2 = String.valueOf(charSequence);
                str = valueOf2.length() != 0 ? ", ".concat(valueOf2) : new String(", ");
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            str = sb.toString();
        } else if (!TextUtils.isEmpty(charSequence)) {
            str = charSequence;
        }
        accessibilityNodeInfo.setText(str);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout a = a();
        if (a != null && this.b) {
            this.a.set(0, a.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), a.getWidth(), a.getHeight());
            a.requestRectangleOnScreen(this.a, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.b = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 0), attributeSet, i);
        this.a = new Rect();
        TypedArray a = daaz.a(context, attributeSet, dahq.b, i, 2132018544, new int[0]);
        setTextInputLayoutFocusedRectEnabled(a.getBoolean(0, false));
        a.recycle();
    }
}

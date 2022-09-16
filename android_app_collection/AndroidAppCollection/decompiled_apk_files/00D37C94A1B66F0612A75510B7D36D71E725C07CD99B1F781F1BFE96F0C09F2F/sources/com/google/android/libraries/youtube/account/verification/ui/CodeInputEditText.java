package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CodeInputEditText extends EditText {
    public wid a;

    public CodeInputEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new wic(this, super.onCreateInputConnection(editorInfo));
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

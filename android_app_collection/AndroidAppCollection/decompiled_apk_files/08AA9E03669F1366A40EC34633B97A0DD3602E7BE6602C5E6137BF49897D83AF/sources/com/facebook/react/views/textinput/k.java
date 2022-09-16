package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
/* compiled from: ReactTextInputLocalData.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final SpannableStringBuilder f4149a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4150b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4151c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4152d;
    private final int e;
    private final int f;

    public k(EditText editText) {
        this.f4149a = new SpannableStringBuilder(editText.getText());
        this.f4150b = editText.getTextSize();
        this.f4151c = editText.getMinLines();
        this.f4152d = editText.getMaxLines();
        this.e = editText.getInputType();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f = editText.getBreakStrategy();
        } else {
            this.f = 0;
        }
    }

    public void a(EditText editText) {
        editText.setText(this.f4149a);
        editText.setTextSize(0, this.f4150b);
        editText.setMinLines(this.f4151c);
        editText.setMaxLines(this.f4152d);
        editText.setInputType(this.e);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f);
        }
    }
}

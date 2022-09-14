package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final SpannableStringBuilder f6368a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6369b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6370c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6371d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6372e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6373f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f6374g;

    public k(EditText editText) {
        this.f6368a = new SpannableStringBuilder(editText.getText());
        this.f6369b = editText.getTextSize();
        this.f6372e = editText.getInputType();
        this.f6374g = editText.getHint();
        this.f6370c = editText.getMinLines();
        this.f6371d = editText.getMaxLines();
        this.f6373f = Build.VERSION.SDK_INT >= 23 ? editText.getBreakStrategy() : 0;
    }

    public void a(EditText editText) {
        editText.setText(this.f6368a);
        editText.setTextSize(0, this.f6369b);
        editText.setMinLines(this.f6370c);
        editText.setMaxLines(this.f6371d);
        editText.setInputType(this.f6372e);
        editText.setHint(this.f6374g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f6373f);
        }
    }
}

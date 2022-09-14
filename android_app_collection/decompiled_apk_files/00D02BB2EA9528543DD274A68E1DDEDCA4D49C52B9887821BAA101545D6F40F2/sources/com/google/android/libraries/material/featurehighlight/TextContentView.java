package com.google.android.libraries.material.featurehighlight;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextContentView extends LinearLayout implements cslg {
    private static final int[] b = {16843287};
    public csmd a;
    private TextView c;
    private TextView d;
    private TextView e;

    public TextContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void k(TextView textView, int i) {
        TypedArray typedArray;
        try {
            typedArray = getContext().obtainStyledAttributes(i, b);
            try {
                textView.setLineSpacing(typedArray.getDimension(0, textView.getLineSpacingExtra()), textView.getLineSpacingMultiplier());
                if (typedArray == null) {
                    return;
                }
                typedArray.recycle();
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
        }
    }

    private static final void l(TextView textView, int i) {
        if (i == 0) {
            textView.setTextAlignment(5);
        } else if (i == 1) {
            textView.setTextAlignment(4);
        } else if (i != 2) {
        } else {
            textView.setTextAlignment(6);
        }
    }

    private static final void m(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        if (charSequence instanceof Spanned) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @Override // defpackage.cslg
    public final View a() {
        return this;
    }

    @Override // defpackage.cslg
    public final boolean b() {
        return this.c.getVisibility() == 0;
    }

    @Override // defpackage.cslg
    public final CharSequence c() {
        CharSequence text = this.c.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.cslg
    public final View d() {
        return this.c;
    }

    @Override // defpackage.cslg
    public final boolean e() {
        return this.d.getVisibility() == 0;
    }

    @Override // defpackage.cslg
    public final CharSequence f() {
        CharSequence text = this.d.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.cslg
    public final View g() {
        return this.d;
    }

    @Override // defpackage.cslg
    public final boolean h() {
        return this.e.getVisibility() == 0;
    }

    @Override // defpackage.cslg
    public final CharSequence i() {
        CharSequence text = this.e.getText();
        return text == null ? "" : text;
    }

    @Override // defpackage.cslg
    public final View j() {
        return this.e;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.featurehighlight_help_text_header_view);
        czhx.d(textView);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.featurehighlight_help_text_body_view);
        czhx.d(textView2);
        this.d = textView2;
        TextView textView3 = (TextView) findViewById(R.id.featurehighlight_dismiss_action_text_view);
        czhx.d(textView3);
        this.e = textView3;
    }

    @Override // defpackage.cslg
    public void setBodyTextAlignment(int i) {
        l(this.d, i);
    }

    @Override // defpackage.cslg
    public void setBodyTextAppearance(int i) {
        qf.a(this.d, i);
        k(this.d, i);
    }

    @Override // defpackage.cslg
    public void setBodyTextColor(ColorStateList colorStateList) {
        this.d.setTextColor(colorStateList);
    }

    @Override // defpackage.cslg
    public void setBodyTextSize(float f) {
        this.d.setTextSize(f);
    }

    @Override // defpackage.cslg
    public void setCallback(csmd csmdVar) {
        this.a = csmdVar;
    }

    @Override // defpackage.cslg
    public void setDismissActionRippleColor(ColorStateList colorStateList) {
        TextView textView = this.e;
        if (textView instanceof MaterialButton) {
            ((MaterialButton) textView).setRippleColor(colorStateList);
        }
    }

    @Override // defpackage.cslg
    public void setDismissActionStrokeColor(ColorStateList colorStateList) {
        TextView textView = this.e;
        if (textView instanceof MaterialButton) {
            ((MaterialButton) textView).setStrokeColor(colorStateList);
        }
    }

    @Override // defpackage.cslg
    public void setDismissActionTextAlignment(int i) {
        l(this.e, i);
    }

    @Override // defpackage.cslg
    public void setDismissActionTextAppearance(int i) {
        qf.a(this.e, i);
        k(this.e, i);
    }

    @Override // defpackage.cslg
    public void setDismissActionTextColor(ColorStateList colorStateList) {
        this.e.setTextColor(colorStateList);
    }

    @Override // defpackage.cslg
    public void setHeaderTextAlignment(int i) {
        l(this.c, i);
    }

    @Override // defpackage.cslg
    public void setHeaderTextAppearance(int i) {
        qf.a(this.c, i);
        k(this.c, i);
    }

    @Override // defpackage.cslg
    public void setHeaderTextColor(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    @Override // defpackage.cslg
    public void setHeaderTextSize(float f) {
        this.c.setTextSize(f);
    }

    @Override // defpackage.cslg
    public void setText(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        m(this.c, charSequence);
        m(this.d, charSequence2);
        m(this.e, charSequence3);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: csml
            private final TextContentView a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.b();
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            spannableStringBuilder.append(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(charSequence2);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(charSequence3);
        }
    }
}

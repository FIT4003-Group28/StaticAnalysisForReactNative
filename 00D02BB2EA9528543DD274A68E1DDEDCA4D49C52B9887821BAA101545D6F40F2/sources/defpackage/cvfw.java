package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cvfw  reason: default package */
/* loaded from: classes5.dex */
public final class cvfw extends LinearLayout implements cvfr {
    private final TextView a;
    private final MaterialButton b;
    private cvft c;
    private final int d;
    private final int e;
    private final int f;

    public cvfw(Context context) {
        this(context, null);
    }

    public void setActionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.setText(str);
        this.b.setVisibility(0);
    }

    public void setActionTextAndRippleEffectColor(int i) {
        this.b.setTextColor(i);
        this.b.setRippleColor(ColorStateList.valueOf(cuwg.d(i)));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.b.setBackgroundColor(i);
    }

    public void setContentText(String str) {
        this.a.setText(str);
    }

    public void setContentTextColor(int i) {
        this.a.setTextColor(i);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvfq cvfqVar) {
        this.b.setOnClickListener(new View.OnClickListener(cvfqVar) { // from class: cvfv
            private final cvfq a;

            {
                this.a = cvfqVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public void setStyleProvider(cvft cvftVar) {
        this.c = cvftVar;
        setActionTextAndRippleEffectColor(cvftVar.b());
        setBackgroundColor(this.c.c());
        setContentTextColor(this.c.a());
    }

    public cvfw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textStatusBarStyle);
    }

    public cvfw(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Default);
    }

    public cvfw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.text_status_bar_layout, this);
        this.a = (TextView) findViewById(R.id.status_content);
        this.b = (MaterialButton) findViewById(R.id.action_button);
        int c = akm.c(getContext(), R.color.google_blue700);
        this.d = c;
        int c2 = akm.c(getContext(), R.color.google_grey800);
        this.e = c2;
        int c3 = akm.c(getContext(), R.color.google_grey50);
        this.f = c3;
        setBackgroundColor(akm.c(getContext(), R.color.google_grey50));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvfo.c, i, i2);
        int color = obtainStyledAttributes.getColor(2, c2);
        int color2 = obtainStyledAttributes.getColor(1, c);
        int color3 = obtainStyledAttributes.getColor(0, c3);
        setContentTextColor(color);
        setActionTextAndRippleEffectColor(color2);
        setBackgroundColor(color3);
        obtainStyledAttributes.recycle();
    }
}

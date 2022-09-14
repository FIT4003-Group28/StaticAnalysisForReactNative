package com.google.android.libraries.messaging.lighter.ui.composebox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ComposeBoxView extends CardView implements cuwz {
    public static final int g = Color.parseColor("#F1F3F4");
    public static final int h = Color.parseColor("#1A73E8");
    public static final int i = Color.parseColor("#9AA0A6");
    public final LighterEditText j;
    public boolean k;
    public boolean l;
    private final LinearLayout m;
    private final ImageButton n;
    private final ViewGroup o;

    public ComposeBoxView(Context context) {
        this(context, null);
    }

    private final int i(float f) {
        return cuwg.a(getContext(), f);
    }

    @Override // defpackage.cuwz
    public final void a() {
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.j, 1);
    }

    @Override // android.view.ViewGroup, android.view.View, defpackage.cuwz
    public final void clearFocus() {
        this.j.clearFocus();
    }

    public final void h(boolean z) {
        this.n.setEnabled(z);
        this.n.setColorFilter(z ? h : i);
    }

    @Override // defpackage.cuwz
    public void setAttachmentPreviewsView(cuug cuugVar) {
        this.o.removeAllViews();
        this.o.addView((View) cuugVar);
    }

    public void setBorderRadius(float f) {
        setRadius(f);
    }

    @Override // defpackage.cuwz
    public void setHintText(CharSequence charSequence) {
        LighterEditText lighterEditText = this.j;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = getResources().getString(R.string.composebox_text_placeholder);
        }
        lighterEditText.setHint(charSequence);
    }

    @Override // defpackage.cuwz
    public void setOverrideSendButtonEnabled(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        if (z && !this.k) {
            h(true);
        }
        if (this.l || this.k) {
            return;
        }
        h(false);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cuwy cuwyVar) {
        this.n.setOnClickListener(new View.OnClickListener(this, cuwyVar) { // from class: cuxe
            private final ComposeBoxView a;
            private final cuwy b;

            {
                this.a = this;
                this.b = cuwyVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ComposeBoxView composeBoxView = this.a;
                this.b.a(composeBoxView.j.mo48getText() == null ? null : composeBoxView.j.mo48getText().toString());
                composeBoxView.j.setText("");
            }
        });
        this.j.addTextChangedListener(new cuxf(this, cuwyVar));
    }

    public void setStyleProvider(cuxc cuxcVar) {
        cuxcVar.a().b();
        this.j.setHintTextColor(cuxcVar.b());
    }

    @Override // defpackage.cuwz
    public void setText(CharSequence charSequence) {
        this.j.setText(charSequence);
        this.j.setSelection(charSequence.length());
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.composeBoxStyle);
    }

    public ComposeBoxView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = false;
        this.l = false;
        inflate(getContext(), R.layout.compose_view_layout, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_container);
        this.m = linearLayout;
        this.n = (ImageButton) findViewById(R.id.send_message_button);
        LighterEditText lighterEditText = (LighterEditText) findViewById(R.id.compose);
        this.j = lighterEditText;
        this.o = (ViewGroup) findViewById(R.id.attachment_preview_container);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuxi.a, i2, R.style.LighterComposeBox);
        setCardBackgroundColor(akm.c(getContext(), R.color.compose_box_background_color));
        setBorderRadius(obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.compose_box_border_radius)));
        setCardElevation(i(2.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i(1.0f), g);
        linearLayout.setBackground(gradientDrawable);
        if (cste.a(getContext())) {
            linearLayout.setPadding(i(0.0f), i(0.0f), i(12.0f), i(0.0f));
        } else {
            linearLayout.setPadding(i(12.0f), i(0.0f), i(0.0f), i(0.0f));
        }
        setUseCompatPadding(true);
        qf.a(lighterEditText, obtainStyledAttributes.getResourceId(2, R.style.ComposeBoxInputText));
        lighterEditText.setHintTextColor(obtainStyledAttributes.getColor(0, akm.c(getContext(), R.color.compose_box_hint_color)));
        lighterEditText.setHint(R.string.composebox_text_placeholder);
        lighterEditText.addTextChangedListener(new cuxg(this));
        lighterEditText.setBackgroundColor(0);
        lighterEditText.setInputType(147457);
        h(false);
        cuwe.a(lighterEditText, context.getResources().getColor(R.color.text_select_handle_color));
        obtainStyledAttributes.recycle();
        setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: cuxd
            private final ComposeBoxView a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ComposeBoxView composeBoxView = this.a;
                if (z) {
                    composeBoxView.j.requestFocus();
                }
            }
        });
    }
}

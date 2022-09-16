package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsSurvey extends GridLayout {
    TextView c;
    public ViewGroup d;
    View e;
    TextView f;
    View g;

    public HatsSurvey(Context context) {
        super(context);
    }

    protected boolean c() {
        return false;
    }

    public final void d(CharSequence charSequence) {
        zag.m(this.c, charSequence);
    }

    public final void e(List list) {
        this.d.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            this.d.addView((View) list.get(i));
            if (c() && i < list.size() - 1) {
                ViewGroup viewGroup = this.d;
                Space space = new Space(getContext());
                space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                viewGroup.addView(space);
            }
        }
    }

    public final void f(apoj apojVar, View.OnClickListener onClickListener) {
        boolean z = apojVar != null;
        zag.o(this.e, z);
        zag.o(this.f, z);
        zag.o(this.g, z);
        if (z) {
            TextView textView = this.f;
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            this.f.setOnClickListener(onClickListener);
        }
    }

    public final void g(boolean z) {
        if (this.f.isClickable() == z) {
            return;
        }
        this.f.setClickable(z);
        this.f.setFocusable(z);
        this.f.setTextColor(zhn.d(getContext(), z ? R.attr.ytCallToAction : R.attr.ytIconDisabled));
        this.f.setBackground(z ? zhn.g(getContext(), R.attr.selectableItemBackground) : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.hats_survey_question);
        this.e = findViewById(R.id.hats_branding_logo);
        this.f = (TextView) findViewById(R.id.hats_submit_button);
        this.g = findViewById(R.id.hats_submit_button_spacing);
        this.d = (ViewGroup) findViewById(R.id.hats_survey_response);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HatsSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

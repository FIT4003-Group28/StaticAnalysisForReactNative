package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lek  reason: default package */
/* loaded from: classes3.dex */
public final class lek implements lev {
    public leu a;
    public final TextView b;
    public final TextView c;
    public int d = 0;
    private final Context e;
    private final View f;
    private final MicrophoneView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final RelativeLayout l;

    public lek(Context context, View view, acti actiVar) {
        this.e = context;
        this.f = view;
        MicrophoneView microphoneView = (MicrophoneView) view.findViewById(R.id.microphone_container);
        this.g = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(zag.f(microphoneView.getContext(), 2131233438, R.attr.ytTextPrimary));
        ((FloatingActionButton) microphoneView.findViewById(R.id.enabled_microphone)).setImageResource(2131233268);
        this.j = (TextView) view.findViewById(R.id.state_text_view);
        this.h = (TextView) view.findViewById(R.id.stable_recognized_text);
        this.i = (TextView) view.findViewById(R.id.unstable_recognized_text);
        this.b = (TextView) view.findViewById(R.id.error_text);
        this.c = (TextView) view.findViewById(R.id.error_voice_tips);
        this.k = (TextView) view.findViewById(R.id.listening_voice_tips_text);
        this.l = (RelativeLayout) view.findViewById(R.id.voice_text_container);
        view.findViewById(R.id.back_button).setOnClickListener(new lej(this, 1));
        microphoneView.setOnClickListener(new lej(this));
        actiVar.n(new acte(actj.MOBILE_BACK_BUTTON));
        actiVar.n(new acte(actj.VOICE_SEARCH_CANCEL_BUTTON));
    }

    private final boolean t() {
        return this.e.getResources().getConfiguration().screenHeightDp >= 400;
    }

    @Override // defpackage.lev
    public final int a() {
        return 3;
    }

    @Override // defpackage.lev
    public final String b() {
        return t() ? "\n\n" : "\n";
    }

    @Override // defpackage.lev
    public final void c(StringBuilder sb) {
        this.c.setText(sb);
    }

    @Override // defpackage.lev
    public final void d(leu leuVar) {
        this.a = leuVar;
    }

    @Override // defpackage.lev
    public final void e(StringBuilder sb) {
        this.k.setText(sb);
    }

    @Override // defpackage.lev
    public final void f(int i) {
        this.g.b(i);
    }

    @Override // defpackage.lev
    public final void g() {
        this.j.setText(this.e.getText(R.string.you_are_online));
        this.g.setEnabled(true);
        this.g.setVisibility(0);
    }

    @Override // defpackage.lev
    public final void h() {
        this.b.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setEnabled(true);
        this.g.setVisibility(0);
        this.g.e();
    }

    @Override // defpackage.lev
    public final void i() {
        this.h.setVisibility(8);
        this.h.setText("");
        this.i.setText("");
        this.g.setEnabled(true);
        this.g.setVisibility(0);
        this.b.setVisibility(4);
        this.j.setText(this.e.getResources().getText(R.string.listening));
        this.j.setVisibility(0);
        this.c.setVisibility(8);
        this.g.g();
    }

    @Override // defpackage.lev
    public final void j() {
        this.k.setVisibility(0);
    }

    @Override // defpackage.lev
    public final void k() {
        this.b.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.j.setText(this.e.getResources().getText(R.string.you_are_offline));
        this.j.setVisibility(0);
        this.g.setVisibility(8);
        this.g.e();
    }

    @Override // defpackage.lev
    public final void l() {
        this.g.setEnabled(false);
        this.g.f();
    }

    @Override // defpackage.lev
    public final void m() {
        this.h.setVisibility(0);
        this.i.setVisibility(0);
        this.g.c();
    }

    @Override // defpackage.lev
    public final void n(String str) {
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setText("");
        this.h.setText(str);
    }

    @Override // defpackage.lev
    public final void o(boolean z, boolean z2) {
        this.b.setVisibility(0);
        this.j.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.k.setVisibility(8);
        this.c.setVisibility(8);
        this.g.setEnabled(true);
        this.g.setVisibility(0);
        this.g.e();
        Resources resources = this.e.getResources();
        if (!z) {
            this.j.setText(resources.getText(R.string.you_are_offline));
            this.g.setEnabled(false);
        } else if (!z2) {
            this.j.setText(resources.getText(R.string.didnt_hear_that));
        } else if (!TextUtils.isEmpty(this.c.getText().toString())) {
            this.j.setText(resources.getText(R.string.try_saying_text));
            this.c.setVisibility(0);
        } else {
            this.j.setText(resources.getText(R.string.try_again_text));
        }
    }

    @Override // defpackage.lev
    public final void p(String str) {
        this.k.setVisibility(8);
        this.j.setVisibility(8);
        this.i.setText(str);
    }

    @Override // defpackage.lev
    public final boolean q() {
        return Boolean.valueOf(this.e.getResources().getConfiguration().screenWidthDp >= 400).booleanValue() || t();
    }

    @Override // defpackage.lev
    public final boolean r() {
        return this.g.b == 1;
    }

    public final void s() {
        int dimension;
        float dimension2;
        int dimensionPixelSize;
        int dimension3;
        int i;
        int i2;
        float dimensionPixelSize2;
        float dimensionPixelSize3;
        int dimensionPixelSize4;
        float f;
        float f2;
        Resources resources = this.e.getResources();
        int dimension4 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
        if (zew.y(this.e)) {
            if (zew.w(this.e)) {
                i = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet_land);
                f = 0.22f;
                f2 = 0.2f;
            } else {
                i = resources.getDimensionPixelSize(R.dimen.microphone_view_margin_bottom_tablet);
                f = 0.24f;
                f2 = 0.1f;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom_tablet);
            this.f.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: lei
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    lek.this.d = windowInsets.getSystemWindowInsetTop();
                    return windowInsets;
                }
            });
            i2 = (int) (f * (zew.j(this.e) - this.d));
            dimension3 = (int) (f2 * zew.l(this.e));
        } else {
            if (t()) {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top);
            } else {
                dimension = (int) resources.getDimension(R.dimen.microphone_view_margin_bottom_land);
                dimension2 = resources.getDimension(R.dimen.text_layout_margin_top_land);
            }
            int i3 = (int) dimension2;
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.state_text_margin_bottom);
            dimension3 = (int) resources.getDimension(R.dimen.text_layout_margin_start_end_bottom);
            i = dimension;
            i2 = i3;
        }
        zgd.t(this.g, zgd.m(0, 0, 0, i), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.l, zgd.m(dimension3, i2, dimension3, dimension4), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.j, zgd.m(0, 0, 0, dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        Resources resources2 = this.e.getResources();
        if (zew.y(this.e)) {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size_tablet);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size_tablet);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra_tablet);
        } else {
            dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.voice_search_small_text_size);
            dimensionPixelSize3 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_size);
            dimensionPixelSize4 = resources2.getDimensionPixelSize(R.dimen.voice_search_large_text_line_spacing_extra);
        }
        float f3 = dimensionPixelSize4;
        this.j.setTextSize(0, dimensionPixelSize3);
        this.j.setLineSpacing(f3, 1.0f);
        this.h.setTextSize(0, dimensionPixelSize3);
        this.h.setLineSpacing(f3, 1.0f);
        this.i.setTextSize(0, dimensionPixelSize3);
        this.i.setLineSpacing(f3, 1.0f);
        this.c.setTextSize(0, dimensionPixelSize2);
        this.k.setTextSize(0, dimensionPixelSize2);
        this.b.setTextSize(0, dimensionPixelSize2);
    }
}

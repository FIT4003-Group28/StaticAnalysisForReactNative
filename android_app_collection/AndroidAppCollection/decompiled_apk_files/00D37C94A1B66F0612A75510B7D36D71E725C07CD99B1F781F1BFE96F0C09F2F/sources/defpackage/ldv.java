package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ldv  reason: default package */
/* loaded from: classes3.dex */
public final class ldv implements lev {
    public leu a;
    private final Context b;
    private final MicrophoneView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public ldv(Context context, View view, acti actiVar) {
        this.b = context;
        MicrophoneView microphoneView = (MicrophoneView) view.findViewById(R.id.microphone_container);
        this.c = microphoneView;
        ((FloatingActionButton) microphoneView.findViewById(R.id.disabled_microphone)).setImageDrawable(zag.f(microphoneView.getContext(), 2131233438, R.attr.ytTextPrimary));
        ((FloatingActionButton) microphoneView.findViewById(R.id.enabled_microphone)).setImageResource(2131233268);
        this.f = (TextView) view.findViewById(R.id.state_text_view);
        this.d = (TextView) view.findViewById(R.id.stable_recognized_text);
        this.e = (TextView) view.findViewById(R.id.unstable_recognized_text);
        this.g = (TextView) view.findViewById(R.id.listening_voice_tips_text);
        view.findViewById(R.id.back_button).setOnClickListener(new ldu(this, 1));
        microphoneView.setOnClickListener(new ldu(this));
        actiVar.n(new acte(actj.MOBILE_BACK_BUTTON));
        actiVar.n(new acte(actj.VOICE_SEARCH_CANCEL_BUTTON));
    }

    @Override // defpackage.lev
    public final int a() {
        return 1;
    }

    @Override // defpackage.lev
    public final String b() {
        return " ";
    }

    @Override // defpackage.lev
    public final void c(StringBuilder sb) {
    }

    @Override // defpackage.lev
    public final void d(leu leuVar) {
        this.a = leuVar;
    }

    @Override // defpackage.lev
    public final void e(StringBuilder sb) {
        this.g.setText(sb);
    }

    @Override // defpackage.lev
    public final void f(int i) {
        this.c.b(i);
    }

    @Override // defpackage.lev
    public final void g() {
        this.f.setText(this.b.getText(R.string.you_are_online_half_plate));
        this.c.setEnabled(true);
        this.c.setVisibility(0);
    }

    @Override // defpackage.lev
    public final void h() {
        this.f.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.e();
    }

    @Override // defpackage.lev
    public final void i() {
        this.d.setVisibility(8);
        this.d.setText("");
        this.e.setText("");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.f.setText(this.b.getResources().getText(R.string.listening));
        this.f.setVisibility(0);
        this.c.g();
    }

    @Override // defpackage.lev
    public final void j() {
        this.g.setVisibility(0);
    }

    @Override // defpackage.lev
    public final void k() {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setText(this.b.getResources().getText(R.string.you_are_offline));
        this.f.setVisibility(0);
        this.c.setVisibility(8);
        this.c.e();
    }

    @Override // defpackage.lev
    public final void l() {
        this.c.setEnabled(false);
        this.c.f();
    }

    @Override // defpackage.lev
    public final void m() {
        this.d.setVisibility(0);
        this.e.setVisibility(0);
        this.c.c();
    }

    @Override // defpackage.lev
    public final void n(String str) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText("");
        this.d.setText(str);
    }

    @Override // defpackage.lev
    public final void o(boolean z, boolean z2) {
        this.f.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.e();
        Resources resources = this.b.getResources();
        if (!z) {
            this.f.setText(resources.getText(R.string.you_are_offline));
            this.c.setEnabled(false);
        } else if (!z2) {
            this.f.setText(resources.getText(R.string.didnt_hear_that_half_plate));
        } else {
            this.f.setText(resources.getText(R.string.try_again_text_half_plate));
        }
    }

    @Override // defpackage.lev
    public final void p(String str) {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.e.setText(str);
    }

    @Override // defpackage.lev
    public final boolean q() {
        return true;
    }

    @Override // defpackage.lev
    public final boolean r() {
        return this.c.b == 1;
    }
}

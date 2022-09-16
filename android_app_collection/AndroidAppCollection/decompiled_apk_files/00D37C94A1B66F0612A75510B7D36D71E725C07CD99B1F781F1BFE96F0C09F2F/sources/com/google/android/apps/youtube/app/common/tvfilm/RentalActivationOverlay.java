package com.google.android.apps.youtube.app.common.tvfilm;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RentalActivationOverlay extends aizc implements ezg, f {
    public YouTubeTextView a;
    private final ezh b;

    public RentalActivationOverlay(Context context, ezh ezhVar) {
        super(context);
        this.b = ezhVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void g() {
        YouTubeTextView youTubeTextView = this.a;
        if (youTubeTextView == null) {
            return;
        }
        youTubeTextView.setText((CharSequence) null);
        h();
    }

    public final void h() {
        YouTubeTextView youTubeTextView;
        if (this.b.g() == ezx.WATCH_WHILE_MINIMIZED || (youTubeTextView = this.a) == null || youTubeTextView.getText() == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.b.j(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.b.i(this);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        h();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}

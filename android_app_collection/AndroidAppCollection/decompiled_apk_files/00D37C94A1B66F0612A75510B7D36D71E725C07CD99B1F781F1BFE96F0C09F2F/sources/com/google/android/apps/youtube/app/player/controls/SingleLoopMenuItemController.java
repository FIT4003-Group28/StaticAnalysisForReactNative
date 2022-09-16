package com.google.android.apps.youtube.app.player.controls;

import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SingleLoopMenuItemController implements f, fea {
    public final Context a;
    public final airw b;
    public final acti c;
    public final int d;
    public jxt e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ValueAnimator j;
    private final PlaybackLoopShuffleMonitor k;
    public aika i = aika.NEW;
    private final aypf l = new aypf();

    public SingleLoopMenuItemController(Context context, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, airw airwVar, acti actiVar) {
        this.a = context;
        this.k = playbackLoopShuffleMonitor;
        this.b = airwVar;
        this.c = actiVar;
        this.d = zhn.j(context, R.attr.ytSuggestedAction).orElse(0);
    }

    @Override // defpackage.fea
    public final void g(int i, boolean z) {
        boolean z2 = this.f;
        boolean z3 = i == 2;
        this.f = z3;
        if (z2 != z3) {
            h();
            if (this.i != aika.ENDED || !this.f) {
                return;
            }
            this.b.D().a(aiqk.c);
        }
    }

    public final void h() {
        jxt jxtVar = this.e;
        if (jxtVar == null) {
            return;
        }
        jxtVar.d(this.a.getString(true != this.f ? R.string.single_loop_off : R.string.single_loop_on));
        this.e.e = zag.f(this.a, true != this.f ? 2131233318 : 2131233207, R.attr.ytTextPrimary);
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
        this.k.i(this);
        this.l.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = this.k;
        this.f = playbackLoopShuffleMonitor.a == 2;
        playbackLoopShuffleMonitor.g(this);
        this.l.d(this.b.ao().I().G(aypa.a()).aa(new jyq(this, 1), jww.f));
        this.l.d(this.b.G().b.aa(new jyq(this), jww.f));
    }
}

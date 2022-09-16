package com.google.android.apps.youtube.app.watch.playback;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SingleLoopPlaybackMonitor implements f, fea {
    public final acti a;
    public final airw b;
    public boolean c;
    public PlaybackStartDescriptor d;
    public int e;
    private final aadd f;
    private final PlaybackLoopShuffleMonitor g;
    private final fgo h;
    private final akfg i;
    private final String j;
    private final String k;
    private final aypf l = new aypf();
    private fvl m;

    public SingleLoopPlaybackMonitor(Context context, PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor, fgo fgoVar, akfg akfgVar, airw airwVar, acti actiVar, aadd aaddVar) {
        this.g = playbackLoopShuffleMonitor;
        this.h = fgoVar;
        this.i = akfgVar;
        this.b = airwVar;
        this.a = actiVar;
        this.f = aaddVar;
        this.j = context.getString(R.string.single_loop_snack_bar_text);
        this.k = context.getString(R.string.single_loop_snack_bar_button_text).toUpperCase(context.getResources().getConfiguration().locale);
    }

    @Override // defpackage.fea
    public final void g(int i, boolean z) {
        fvl fvlVar;
        this.e = i;
        if (!this.c || (fvlVar = this.m) == null || i == 2) {
            return;
        }
        this.i.m(fvlVar);
    }

    public final void h() {
        asxp asxpVar = this.f.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        if (!asxpVar.bg || this.c) {
            return;
        }
        fgu fguVar = (fgu) this.h.a.c();
        int i = (fguVar.b & 32) != 0 ? fguVar.i : 1;
        if (i <= 0) {
            return;
        }
        if (this.m == null) {
            fvg d = fvl.d();
            d.e(true);
            d.k(this.j);
            d.m(this.k, new View.OnClickListener() { // from class: ofa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SingleLoopPlaybackMonitor singleLoopPlaybackMonitor = SingleLoopPlaybackMonitor.this;
                    singleLoopPlaybackMonitor.a.H(3, new acte(actj.SINGLE_LOOP_SNACKBAR_TURN_OFF_BUTTON), null);
                    singleLoopPlaybackMonitor.b.D().h(0);
                }
            });
            d.b = new ofc(this);
            this.m = d.b();
        }
        this.i.n(this.m);
        ylx.m(this.h.a.b(new fgn(i - 1)), dzl.n);
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
        this.g.i(this);
        this.l.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.g.g(this);
        this.l.d(this.b.ab().aa(new ofb(this), npy.r));
        this.l.d(this.b.G().a.aa(new ofb(this, 1), npy.r));
    }
}

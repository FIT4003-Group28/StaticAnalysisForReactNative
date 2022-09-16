package com.google.android.apps.youtube.app.common.playervideoviewlayoutdelegate;

import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayoutDelegate;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerVideoViewLayoutDelegateController implements f, ezg {
    private final ezh a;
    private final InlinePlayerLayoutDelegate b;
    private final ofh c;
    private final jvo d;

    public PlayerVideoViewLayoutDelegateController(jvo jvoVar, ezh ezhVar, InlinePlayerLayoutDelegate inlinePlayerLayoutDelegate, ofh ofhVar) {
        this.d = jvoVar;
        this.a = ezhVar;
        this.b = inlinePlayerLayoutDelegate;
        this.c = ofhVar;
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
        this.a.j(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.a.i(this);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) this.d.get()).aT;
        if (youTubePlayerViewNotForReflection == null) {
            return;
        }
        if (ezxVar.h()) {
            youTubePlayerViewNotForReflection.kE(this.c);
        } else if (ezxVar.d()) {
            youTubePlayerViewNotForReflection.kE(this.b);
        } else {
            youTubePlayerViewNotForReflection.kE(null);
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}

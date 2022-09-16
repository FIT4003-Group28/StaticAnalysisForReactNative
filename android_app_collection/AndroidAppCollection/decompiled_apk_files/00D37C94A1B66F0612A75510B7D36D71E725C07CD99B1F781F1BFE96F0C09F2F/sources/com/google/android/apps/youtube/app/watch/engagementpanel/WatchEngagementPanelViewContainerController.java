package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import java.util.ArrayDeque;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchEngagementPanelViewContainerController implements f {
    public ayoi a;
    public final Context b;
    public final axnm c;
    public final aadd d;
    public final nqz e;
    public final ghu f;
    public final airw g;
    public final ArrayDeque h = new ArrayDeque();
    public final aypf i = new aypf();
    public nqw j;
    public final aacz k;

    public WatchEngagementPanelViewContainerController(Context context, axnm axnmVar, aacz aaczVar, aadd aaddVar, nqz nqzVar, ghu ghuVar, airw airwVar) {
        this.b = context;
        this.k = aaczVar;
        this.d = aaddVar;
        this.c = axnmVar;
        this.e = nqzVar;
        this.f = ghuVar;
        this.g = airwVar;
    }

    public final void g(String str) {
        if (this.h.size() == 8) {
            this.h.removeFirst();
        }
        this.h.addLast(str);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.i.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}

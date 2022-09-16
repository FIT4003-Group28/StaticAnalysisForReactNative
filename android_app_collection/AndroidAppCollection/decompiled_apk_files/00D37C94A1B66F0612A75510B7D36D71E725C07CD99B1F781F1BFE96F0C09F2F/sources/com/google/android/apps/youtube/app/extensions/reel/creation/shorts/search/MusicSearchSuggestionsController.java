package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MusicSearchSuggestionsController implements f {
    public final ajsg a;
    public final ajyx b;
    public final yni c;
    public final akar d;
    public final yzj e;
    public final acth f;
    public final ajyi g;
    public final aadd h;
    public final aynx i;
    public final aksr j;
    public final aksk k;
    public Activity l;
    public ajzq m;
    public aksj n;
    public aypg o;
    public LoadingFrameLayout p;
    public RecyclerView q;
    public RecyclerView r;
    public final ne s = new hii(this);

    public MusicSearchSuggestionsController(Activity activity, ajsg ajsgVar, ajyx ajyxVar, yni yniVar, acth acthVar, akar akarVar, yzj yzjVar, ajyi ajyiVar, aadd aaddVar, aynx aynxVar, akss akssVar, aksk akskVar) {
        this.l = activity;
        this.a = ajsgVar;
        this.b = ajyxVar;
        this.c = yniVar;
        this.f = acthVar;
        this.d = akarVar;
        this.e = yzjVar;
        this.g = ajyiVar;
        this.h = aaddVar;
        this.i = aynxVar;
        this.j = akssVar.a(amuk.r(new aksm()));
        this.k = akskVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.l = null;
        this.m = null;
        this.n = null;
        this.p = null;
        aypg aypgVar = this.o;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.o);
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

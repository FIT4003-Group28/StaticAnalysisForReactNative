package com.google.android.apps.youtube.app.common.tvfilm;

import android.content.Context;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailerOverlayPresenter implements ydp, f {
    public final int a;
    public final int b;
    public boolean c;
    public final fpm d;
    private final fqa e;
    private final fpy f;
    private final airw g;
    private final aypf h = new aypf();
    private final yni i;
    private final ydq j;
    private final aacz k;

    public TrailerOverlayPresenter(Context context, fpm fpmVar, ydq ydqVar, airw airwVar, aacz aaczVar, yni yniVar) {
        this.d = fpmVar;
        this.j = ydqVar;
        this.g = airwVar;
        this.k = aaczVar;
        this.i = yniVar;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = zew.i(displayMetrics, 30);
        this.b = zew.i(displayMetrics, 12);
        this.e = new fqa(this);
        this.f = new fpy(this);
    }

    @Override // defpackage.ydp
    public final void h() {
        this.d.e();
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

    @Override // defpackage.ydp
    public final void mE() {
    }

    @Override // defpackage.ydp
    public final void mF(ashn ashnVar) {
        this.d.e();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.k)) {
            this.h.c();
        } else {
            this.i.m(this.e);
        }
        this.i.m(this.f);
        this.j.e(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.k)) {
            this.h.g(this.e.g(this.g));
        } else {
            this.i.g(this.e);
        }
        this.i.g(this.f);
        this.j.d(this);
    }
}

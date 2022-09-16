package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MiniPlayerErrorOverlay implements fgd, ahyh, f {
    public boolean a;
    public boolean b;
    private final Context c;
    private final airw d;
    private View f;
    private ahyg g;
    private ezx h = ezx.NONE;
    private final aypf e = new aypf();

    public MiniPlayerErrorOverlay(Context context, airw airwVar) {
        this.c = context;
        this.d = airwVar;
    }

    private final void i() {
        if (nI()) {
            return;
        }
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.mini_player_error_view, (ViewGroup) null);
        this.f = inflate;
        ahyg ahygVar = this.g;
        if (ahygVar != null) {
            ahygVar.d(this, inflate);
        }
        this.a = this.f.getParent() != null;
        this.f.addOnAttachStateChangeListener(new kfk(this));
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void g() {
        if (!nI() && mY(this.h) && this.b) {
            i();
        }
        if (!nI()) {
            return;
        }
        View view = this.f;
        boolean z = false;
        if (this.b && this.a) {
            z = true;
        }
        zag.o(view, z);
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (this.h == ezxVar) {
            return;
        }
        this.h = ezxVar;
        if (nI()) {
            return;
        }
        g();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.aizf
    public final View kZ() {
        i();
        return this.f;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return ezxVar.j() || ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.e.c();
    }

    @Override // defpackage.ahyh
    public final boolean nI() {
        return this.f != null;
    }

    @Override // defpackage.ahyh
    public final void ns(ahyg ahygVar) {
        this.g = ahygVar;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.e.d(this.d.G().f.aa(new kfj(this), jww.m));
        this.e.d(this.d.G().i.aa(new kfj(this, 1), jww.m));
    }
}

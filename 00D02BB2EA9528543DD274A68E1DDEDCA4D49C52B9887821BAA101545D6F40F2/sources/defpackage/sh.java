package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: sh  reason: default package */
/* loaded from: classes.dex */
public final class sh extends ud implements vd {
    public final vf a;
    public uc b;
    final /* synthetic */ si c;
    private final Context f;
    private WeakReference<View> g;

    public sh(si siVar, Context context, uc ucVar) {
        this.c = siVar;
        this.f = context;
        this.b = ucVar;
        vf vfVar = new vf(context);
        vfVar.D();
        this.a = vfVar;
        vfVar.b = this;
    }

    @Override // defpackage.ud
    public final MenuInflater a() {
        return new ul(this.f);
    }

    @Override // defpackage.ud
    public final Menu b() {
        return this.a;
    }

    @Override // defpackage.ud
    public final void d() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.t();
        }
    }

    @Override // defpackage.ud
    public final void e(View view) {
        this.c.e.setCustomView(view);
        this.g = new WeakReference<>(view);
    }

    @Override // defpackage.ud
    public final void f(CharSequence charSequence) {
        this.c.e.setSubtitle(charSequence);
    }

    @Override // defpackage.ud
    public final void g(CharSequence charSequence) {
        this.c.e.setTitle(charSequence);
    }

    @Override // defpackage.ud
    public final void h(int i) {
        g(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ud
    public final void i(int i) {
        f(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ud
    public final CharSequence j() {
        return this.c.e.g;
    }

    @Override // defpackage.ud
    public final CharSequence k() {
        return this.c.e.h;
    }

    @Override // defpackage.ud
    public final void l(boolean z) {
        this.e = z;
        this.c.e.setTitleOptional(z);
    }

    @Override // defpackage.ud
    public final boolean m() {
        return this.c.e.j;
    }

    @Override // defpackage.ud
    public final View n() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.vd
    public final boolean x(vf vfVar, MenuItem menuItem) {
        uc ucVar = this.b;
        if (ucVar != null) {
            return ucVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.vd
    public final void y(vf vfVar) {
        if (this.b == null) {
            return;
        }
        d();
        this.c.e.i();
    }

    @Override // defpackage.ud
    public final void c() {
        si siVar = this.c;
        if (siVar.g != this) {
            return;
        }
        if (!si.s(siVar.k, false)) {
            si siVar2 = this.c;
            siVar2.h = this;
            siVar2.i = this.b;
        } else {
            this.b.c(this);
        }
        this.b = null;
        this.c.q(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.h();
        }
        this.c.d.a().sendAccessibilityEvent(32);
        si siVar3 = this.c;
        siVar3.b.setHideOnContentScrollEnabled(siVar3.m);
        this.c.g = null;
    }
}

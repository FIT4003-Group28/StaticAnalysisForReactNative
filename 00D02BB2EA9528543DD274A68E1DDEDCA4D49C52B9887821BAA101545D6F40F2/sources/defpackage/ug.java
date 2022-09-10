package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ug  reason: default package */
/* loaded from: classes.dex */
public final class ug extends ud implements vd {
    public final vf a;
    private final Context b;
    private final ActionBarContextView c;
    private final uc f;
    private WeakReference<View> g;
    private boolean h;

    public ug(Context context, ActionBarContextView actionBarContextView, uc ucVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = ucVar;
        vf vfVar = new vf(actionBarContextView.getContext());
        vfVar.D();
        this.a = vfVar;
        vfVar.b = this;
    }

    @Override // defpackage.ud
    public final MenuInflater a() {
        return new ul(this.c.getContext());
    }

    @Override // defpackage.ud
    public final Menu b() {
        return this.a;
    }

    @Override // defpackage.ud
    public final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.sendAccessibilityEvent(32);
        this.f.c(this);
    }

    @Override // defpackage.ud
    public final void d() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.ud
    public final void e(View view) {
        this.c.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.ud
    public final void f(CharSequence charSequence) {
        this.c.setSubtitle(charSequence);
    }

    @Override // defpackage.ud
    public final void g(CharSequence charSequence) {
        this.c.setTitle(charSequence);
    }

    @Override // defpackage.ud
    public final void h(int i) {
        g(this.b.getString(i));
    }

    @Override // defpackage.ud
    public final void i(int i) {
        f(this.b.getString(i));
    }

    @Override // defpackage.ud
    public final CharSequence j() {
        return this.c.g;
    }

    @Override // defpackage.ud
    public final CharSequence k() {
        return this.c.h;
    }

    @Override // defpackage.ud
    public final void l(boolean z) {
        this.e = z;
        this.c.setTitleOptional(z);
    }

    @Override // defpackage.ud
    public final boolean m() {
        return this.c.j;
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
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.vd
    public final void y(vf vfVar) {
        d();
        this.c.i();
    }
}

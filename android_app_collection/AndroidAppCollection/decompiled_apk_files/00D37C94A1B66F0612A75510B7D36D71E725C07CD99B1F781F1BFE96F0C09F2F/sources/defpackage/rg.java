package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: rg  reason: default package */
/* loaded from: classes4.dex */
public final class rg extends re implements sd {
    public final sf a;
    private final Context b;
    private final ActionBarContextView c;
    private final rd f;
    private WeakReference g;
    private boolean h;

    public rg(Context context, ActionBarContextView actionBarContextView, rd rdVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = rdVar;
        sf sfVar = new sf(actionBarContextView.getContext());
        sfVar.D();
        this.a = sfVar;
        sfVar.b = this;
    }

    @Override // defpackage.sd
    public final void O(sf sfVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.sd
    public final boolean Q(sf sfVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.re
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.re
    public final MenuInflater b() {
        return new rl(this.c.getContext());
    }

    @Override // defpackage.re
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.re
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.re
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.re
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // defpackage.re
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.re
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.re
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.re
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.re
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.re
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.re
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.re
    public final boolean n() {
        return this.c.j;
    }
}

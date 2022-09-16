package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: pk  reason: default package */
/* loaded from: classes4.dex */
public final class pk extends re implements sd {
    public final sf a;
    public rd b;
    final /* synthetic */ pl c;
    private final Context f;
    private WeakReference g;

    public pk(pl plVar, Context context, rd rdVar) {
        this.c = plVar;
        this.f = context;
        this.b = rdVar;
        sf sfVar = new sf(context);
        sfVar.D();
        this.a = sfVar;
        sfVar.b = this;
    }

    @Override // defpackage.sd
    public final void O(sf sfVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.sd
    public final boolean Q(sf sfVar, MenuItem menuItem) {
        rd rdVar = this.b;
        if (rdVar != null) {
            return rdVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.re
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.re
    public final MenuInflater b() {
        return new rl(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.re
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.re
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.re
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.re
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.re
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.re
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.re
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.re
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.re
    public final boolean n() {
        return this.c.e.j;
    }

    @Override // defpackage.re
    public final void f() {
        pl plVar = this.c;
        if (plVar.g != this) {
            return;
        }
        if (!pl.F(plVar.l, plVar.m, false)) {
            pl plVar2 = this.c;
            plVar2.h = this;
            plVar2.i = this.b;
        } else {
            this.b.a(this);
        }
        this.b = null;
        this.c.D(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        this.c.d.e().sendAccessibilityEvent(32);
        pl plVar3 = this.c;
        plVar3.b.l(plVar3.o);
        this.c.g = null;
    }
}

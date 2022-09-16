package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pd  reason: default package */
/* loaded from: classes4.dex */
public final class pd extends nj {
    final vh a;
    boolean b;
    final Window.Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f = new ArrayList();
    private final Runnable g = new oy(this);
    private final aaj h;

    public pd(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        oz ozVar = new oz(this);
        this.h = ozVar;
        aam aamVar = new aam(toolbar, false);
        this.a = aamVar;
        pc pcVar = new pc(this, callback);
        this.c = pcVar;
        aamVar.e = pcVar;
        toolbar.q = ozVar;
        aamVar.t(charSequence);
    }

    @Override // defpackage.nj
    public final void A() {
        this.a.o(R.string.abc_action_bar_up_description);
    }

    @Override // defpackage.nj
    public final void B() {
        this.a.l(null);
    }

    @Override // defpackage.nj
    public final void C() {
    }

    public final Menu D() {
        if (!this.d) {
            vh vhVar = this.a;
            pa paVar = new pa(this);
            pb pbVar = new pb(this);
            Toolbar toolbar = ((aam) vhVar).a;
            toolbar.t = paVar;
            toolbar.u = pbVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f(paVar, pbVar);
            }
            this.d = true;
        }
        return ((aam) this.a).a.g();
    }

    @Override // defpackage.nj
    public final int a() {
        return ((aam) this.a).b;
    }

    @Override // defpackage.nj
    public final Context b() {
        return this.a.b();
    }

    @Override // defpackage.nj
    public final View d() {
        return ((aam) this.a).c;
    }

    @Override // defpackage.nj
    public final void e(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ni) this.f.get(i)).a();
        }
    }

    @Override // defpackage.nj
    public final void f() {
        this.a.r(8);
    }

    @Override // defpackage.nj
    public final void g() {
        ((aam) this.a).a.removeCallbacks(this.g);
    }

    @Override // defpackage.nj
    public final void h(View view, nh nhVar) {
        view.setLayoutParams(nhVar);
        this.a.j(view);
    }

    @Override // defpackage.nj
    public final void i(boolean z) {
    }

    @Override // defpackage.nj
    public final void j(boolean z) {
        k(4, 4);
    }

    @Override // defpackage.nj
    public final void k(int i, int i2) {
        vh vhVar = this.a;
        vhVar.k((i & i2) | ((i2 ^ (-1)) & ((aam) vhVar).b));
    }

    @Override // defpackage.nj
    public final void l(boolean z) {
        k(true != z ? 0 : 2, 2);
    }

    @Override // defpackage.nj
    public final void m(Drawable drawable) {
        this.a.p(drawable);
    }

    @Override // defpackage.nj
    public final void n(boolean z) {
    }

    @Override // defpackage.nj
    public final void o(int i) {
        vh vhVar = this.a;
        vhVar.q(vhVar.b().getText(i));
    }

    @Override // defpackage.nj
    public final void p(CharSequence charSequence) {
        this.a.q(charSequence);
    }

    @Override // defpackage.nj
    public final void q(CharSequence charSequence) {
        this.a.t(charSequence);
    }

    @Override // defpackage.nj
    public final void r() {
        this.a.r(0);
    }

    @Override // defpackage.nj
    public final boolean s() {
        return this.a.w();
    }

    @Override // defpackage.nj
    public final boolean t() {
        if (this.a.v()) {
            this.a.f();
            return true;
        }
        return false;
    }

    @Override // defpackage.nj
    public final boolean u() {
        ((aam) this.a).a.removeCallbacks(this.g);
        lj.H(((aam) this.a).a, this.g);
        return true;
    }

    @Override // defpackage.nj
    public final boolean v(int i, KeyEvent keyEvent) {
        Menu D = D();
        if (D != null) {
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            D.setQwertyMode(z);
            return D.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // defpackage.nj
    public final boolean w(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            x();
        }
        return true;
    }

    @Override // defpackage.nj
    public final boolean x() {
        return this.a.z();
    }

    @Override // defpackage.nj
    public final void y() {
    }

    @Override // defpackage.nj
    public final void z() {
        k(0, 8);
    }
}

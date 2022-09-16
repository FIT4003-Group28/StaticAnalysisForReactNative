package com.google.android.apps.youtube.app.common.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityStateReceiver implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, f {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    private final Context c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public AccessibilityStateReceiver(Context context) {
        this.c = context;
    }

    public final void g() {
        if (this.d) {
            zdg.h(this.c, this);
            this.d = false;
        }
    }

    public final void h() {
        if (this.e) {
            zdg.a(this.c).removeTouchExplorationStateChangeListener(this);
            this.e = false;
        }
    }

    public final void i() {
        if (!this.d) {
            zdg.g(this.c, this);
            this.d = true;
        }
    }

    public final void j() {
        k(n());
    }

    public final void k(boolean z) {
        for (AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener : this.a) {
            accessibilityStateChangeListener.onAccessibilityStateChanged(z);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l() {
        m(o());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    public final void m(boolean z) {
        for (AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener : this.b) {
            touchExplorationStateChangeListener.onTouchExplorationStateChanged(z);
        }
    }

    public final boolean n() {
        return zdg.e(this.c);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        g();
        this.f = n();
        h();
        this.g = o();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (!this.a.isEmpty()) {
            i();
            if (this.f != n()) {
                j();
            }
        }
        if (!this.b.isEmpty()) {
            if (!this.e) {
                zdg.a(this.c).addTouchExplorationStateChangeListener(this);
                this.e = true;
            }
            if (this.g == n()) {
                return;
            }
            l();
        }
    }

    public final boolean o() {
        return zdg.f(this.c);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        k(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        m(z);
    }
}

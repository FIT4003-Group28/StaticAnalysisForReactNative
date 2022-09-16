package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acm  reason: default package */
/* loaded from: classes.dex */
public final class acm extends ne {
    final acn b;
    public final Map<View, ne> c = new WeakHashMap();

    public acm(acn acnVar) {
        this.b = acnVar;
    }

    @Override // defpackage.ne
    public final void a(View view, int i) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            neVar.a(view, i);
        } else {
            super.a(view, i);
        }
    }

    @Override // defpackage.ne
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            neVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ne
    public final boolean c(View view, AccessibilityEvent accessibilityEvent) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            return neVar.c(view, accessibilityEvent);
        }
        return super.c(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            neVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            neVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        abs absVar;
        if (this.b.k() || (absVar = this.b.b.l) == null) {
            super.f(view, pcVar);
            return;
        }
        absVar.bf(view, pcVar);
        ne neVar = this.c.get(view);
        if (neVar != null) {
            neVar.f(view, pcVar);
        } else {
            super.f(view, pcVar);
        }
    }

    @Override // defpackage.ne
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        ne neVar = this.c.get(viewGroup);
        if (neVar != null) {
            return neVar.g(viewGroup, view, accessibilityEvent);
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final pg h(View view) {
        ne neVar = this.c.get(view);
        if (neVar != null) {
            return neVar.h(view);
        }
        return super.h(view);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (this.b.k() || this.b.b.l == null) {
            return super.i(view, i, bundle);
        }
        ne neVar = this.c.get(view);
        if (neVar != null) {
            if (neVar.i(view, i, bundle)) {
                return true;
            }
        } else if (super.i(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.b.b.l.q;
        aca acaVar = recyclerView.b;
        aci aciVar = recyclerView.J;
        return false;
    }
}

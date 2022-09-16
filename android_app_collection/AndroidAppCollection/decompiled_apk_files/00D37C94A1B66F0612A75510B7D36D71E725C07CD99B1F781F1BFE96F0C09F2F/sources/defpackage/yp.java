package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: yp  reason: default package */
/* loaded from: classes4.dex */
public final class yp extends jo {
    final yq b;
    public final Map c = new WeakHashMap();

    public yp(yq yqVar) {
        this.b = yqVar;
    }

    @Override // defpackage.jo
    public final ml a(View view) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            return joVar.a(view);
        }
        return super.a(view);
    }

    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            joVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        xw xwVar;
        if (this.b.l() || (xwVar = this.b.b.n) == null) {
            super.d(view, mhVar);
            return;
        }
        xwVar.aN(view, mhVar);
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            joVar.d(view, mhVar);
        } else {
            super.d(view, mhVar);
        }
    }

    @Override // defpackage.jo
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            joVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.jo
    public final void f(View view, int i) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            joVar.f(view, i);
        } else {
            super.f(view, i);
        }
    }

    @Override // defpackage.jo
    public final void g(View view, AccessibilityEvent accessibilityEvent) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            joVar.g(view, accessibilityEvent);
        } else {
            super.g(view, accessibilityEvent);
        }
    }

    @Override // defpackage.jo
    public final boolean h(View view, AccessibilityEvent accessibilityEvent) {
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            return joVar.h(view, accessibilityEvent);
        }
        return super.h(view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        jo joVar = (jo) this.c.get(viewGroup);
        if (joVar != null) {
            return joVar.i(viewGroup, view, accessibilityEvent);
        }
        return super.i(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        if (this.b.l() || this.b.b.n == null) {
            return super.j(view, i, bundle);
        }
        jo joVar = (jo) this.c.get(view);
        if (joVar != null) {
            if (joVar.j(view, i, bundle)) {
                return true;
            }
        } else if (super.j(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.b.b.n.u;
        yd ydVar = recyclerView.d;
        yl ylVar = recyclerView.M;
        return false;
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* renamed from: alwt  reason: default package */
/* loaded from: classes.dex */
public final class alwt extends jo {
    public final jo b;

    public alwt(jo joVar) {
        this.b = joVar;
    }

    @Override // defpackage.jo
    public final ml a(View view) {
        return this.b.a(view);
    }

    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        this.b.c(view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        this.b.d(view, mhVar);
    }

    @Override // defpackage.jo
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        this.b.e(view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final void f(View view, int i) {
        this.b.f(view, i);
    }

    @Override // defpackage.jo
    public final void g(View view, AccessibilityEvent accessibilityEvent) {
        this.b.g(view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final boolean h(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.h(view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.i(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.jo
    public final boolean j(View view, int i, Bundle bundle) {
        return this.b.j(view, i, bundle);
    }
}

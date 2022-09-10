package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: daph  reason: default package */
/* loaded from: classes5.dex */
public final class daph extends ne {
    public final ne b;

    public daph(TextView textView) {
        ne dapgVar;
        if (Build.VERSION.SDK_INT >= 26) {
            dapgVar = new ne();
        } else {
            dapgVar = new dapg(textView);
        }
        this.b = dapgVar;
    }

    @Override // defpackage.ne
    public final void a(View view, int i) {
        this.b.a(view, i);
    }

    @Override // defpackage.ne
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.b.b(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final boolean c(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.c(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        this.b.d(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        this.b.e(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        this.b.f(view, pcVar);
    }

    @Override // defpackage.ne
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.g(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final pg h(View view) {
        return this.b.h(view);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        return this.b.i(view, i, bundle);
    }
}

package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
/* compiled from: PG */
/* renamed from: daaf  reason: default package */
/* loaded from: classes5.dex */
public final class daaf extends ne {
    final /* synthetic */ CheckableImageButton b;

    public daaf(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        pcVar.n(this.b.b);
        pcVar.a.setChecked(this.b.a);
    }
}

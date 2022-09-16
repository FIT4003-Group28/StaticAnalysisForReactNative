package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
/* compiled from: PG */
/* renamed from: alkw  reason: default package */
/* loaded from: classes.dex */
public final class alkw extends jo {
    final /* synthetic */ CheckableImageButton b;

    public alkw(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // defpackage.jo
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.a);
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        mhVar.p(this.b.b);
        mhVar.q(this.b.a);
    }
}

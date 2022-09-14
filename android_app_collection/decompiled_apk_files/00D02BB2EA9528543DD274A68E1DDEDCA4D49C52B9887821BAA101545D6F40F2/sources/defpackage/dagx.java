package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagx  reason: default package */
/* loaded from: classes5.dex */
final class dagx extends dahv {
    final /* synthetic */ dahe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dagx(dahe daheVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.b = daheVar;
    }

    @Override // defpackage.ne
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        AutoCompleteTextView g = dahe.g(this.b.k.a);
        if (accessibilityEvent.getEventType() != 1 || !this.b.i.isTouchExplorationEnabled() || dahe.h(this.b.k.a)) {
            return;
        }
        this.b.e(g);
    }

    @Override // defpackage.dahv, defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        if (!dahe.h(this.b.k.a)) {
            pcVar.B(Spinner.class.getName());
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            Bundle L = pcVar.L();
            if (L != null && (L.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                z = true;
            }
        } else {
            z = pcVar.a.isShowingHintText();
        }
        if (z) {
            pcVar.K(null);
        }
    }
}

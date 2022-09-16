package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alpp  reason: default package */
/* loaded from: classes.dex */
final class alpp extends alqo {
    final /* synthetic */ alpx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpp(alpx alpxVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.b = alpxVar;
    }

    @Override // defpackage.alqo, defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        if (!alpx.h(this.b.k.a)) {
            mhVar.r(Spinner.class.getName());
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 26) {
            Bundle a = mhVar.a();
            if (a != null && (a.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                z = true;
            }
        } else {
            z = mhVar.b.isShowingHintText();
        }
        if (z) {
            mhVar.A(null);
        }
    }

    @Override // defpackage.jo
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        AutoCompleteTextView a = alpx.a(this.b.k.a);
        if (accessibilityEvent.getEventType() != 1 || !this.b.i.isTouchExplorationEnabled() || alpx.h(this.b.k.a)) {
            return;
        }
        this.b.e(a);
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: anc  reason: default package */
/* loaded from: classes.dex */
final class anc extends ne {
    final /* synthetic */ ank b;

    public anc(ank ankVar) {
        this.b = ankVar;
        new Rect();
    }

    @Override // defpackage.ne
    public final boolean c(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        if (accessibilityEvent.getEventType() == 32) {
            List<CharSequence> text = accessibilityEvent.getText();
            View k = this.b.k();
            if (k == null) {
                return true;
            }
            int e = this.b.e(k);
            ank ankVar = this.b;
            int absoluteGravity = Gravity.getAbsoluteGravity(e, od.s(ankVar));
            if (absoluteGravity == 3) {
                charSequence = ankVar.g;
            } else {
                charSequence = absoluteGravity == 5 ? ankVar.h : null;
            }
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }
        return super.c(view, accessibilityEvent);
    }

    @Override // defpackage.ne
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        int i = ank.i;
        super.f(view, pcVar);
        pcVar.B("androidx.drawerlayout.widget.DrawerLayout");
        pcVar.q(false);
        pcVar.r(false);
        pcVar.R(oy.a);
        pcVar.R(oy.b);
    }

    @Override // defpackage.ne
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int i = ank.i;
        return super.g(viewGroup, view, accessibilityEvent);
    }
}

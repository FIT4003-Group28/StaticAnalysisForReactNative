package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {
    private final avj c;
    private CharSequence d;
    private CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969877(0x7f040515, float:1.7548448E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = defpackage.kb.k(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            avj r2 = new avj
            r2.<init>(r3)
            r3.c = r2
            int[] r2 = defpackage.avf.l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = defpackage.kb.h(r4, r5, r1)
            r3.n(r5)
            r5 = 6
            r0 = 1
            java.lang.String r5 = defpackage.kb.h(r4, r5, r0)
            r3.o(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = defpackage.kb.h(r4, r5, r0)
            r3.d = r5
            r3.d()
            r5 = 8
            r0 = 4
            java.lang.String r5 = defpackage.kb.h(r4, r5, r0)
            r3.e = r5
            r3.d()
            r5 = 5
            r0 = 2
            boolean r5 = defpackage.kb.f(r4, r5, r0, r1)
            r3.b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final void ai(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        ai(aveVar.C(16908352));
        ag(aveVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        K();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ai(view.findViewById(16908352));
        ah(view.findViewById(16908304));
    }
}

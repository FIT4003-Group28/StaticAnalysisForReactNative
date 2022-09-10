package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final atk c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968841(0x7f040109, float:1.7546347E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = defpackage.kb.k(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            atk r2 = new atk
            r2.<init>(r3)
            r3.c = r2
            int[] r2 = defpackage.avf.b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = defpackage.kb.h(r4, r5, r1)
            r3.n(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = defpackage.kb.h(r4, r5, r0)
            r3.o(r5)
            r5 = 3
            r0 = 2
            boolean r5 = defpackage.kb.f(r4, r5, r0, r1)
            r3.b = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final void ai(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void Rk(ave aveVar) {
        super.Rk(aveVar);
        ai(aveVar.C(16908289));
        ag(aveVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        K();
        if (!((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ai(view.findViewById(16908289));
        ah(view.findViewById(16908304));
    }
}

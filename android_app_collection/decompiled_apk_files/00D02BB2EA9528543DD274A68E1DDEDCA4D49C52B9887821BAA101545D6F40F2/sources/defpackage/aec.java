package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aec  reason: default package */
/* loaded from: classes.dex */
public final class aec extends abt {
    aeg a;
    public boolean b;

    public aec(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        aeg aegVar = this.a;
        if (aegVar == null) {
            return -1;
        }
        return aegVar.e;
    }

    public aec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public aec(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public aec(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}

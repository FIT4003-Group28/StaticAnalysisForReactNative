package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: jko  reason: default package */
/* loaded from: classes7.dex */
public class jko extends jnq implements jkm {
    private boolean n;

    public jko(Context context) {
        super(context);
        this.n = true;
    }

    @Override // defpackage.jnq, defpackage.ecs
    public final void Qf() {
    }

    @Override // defpackage.jkm
    public final boolean a() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public final void p(int i, float f, int i2) {
        super.p(i, f, i2);
        this.n = i2 == 0;
    }

    public jko(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: aliu  reason: default package */
/* loaded from: classes.dex */
public class aliu extends ajc {
    private aliv a;
    private int b;

    public aliu() {
        this.b = 0;
    }

    public aliu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public final int C() {
        aliv alivVar = this.a;
        if (alivVar != null) {
            return alivVar.b;
        }
        return 0;
    }

    public final boolean D(int i) {
        aliv alivVar = this.a;
        if (alivVar != null) {
            return alivVar.c(i);
        }
        this.b = i;
        return false;
    }

    @Override // defpackage.ajc
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        sc(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new aliv(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.c(i2);
            this.b = 0;
            return true;
        }
        return true;
    }

    protected void sc(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.l(view, i);
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: czvl  reason: default package */
/* loaded from: classes5.dex */
public class czvl<V extends View> extends aji<V> {
    private czvm a;
    private int b;

    public czvl() {
        this.b = 0;
    }

    public czvl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public final boolean C(int i) {
        czvm czvmVar = this.a;
        if (czvmVar != null) {
            return czvmVar.c(i);
        }
        this.b = i;
        return false;
    }

    public final int D() {
        czvm czvmVar = this.a;
        if (czvmVar != null) {
            return czvmVar.b;
        }
        return 0;
    }

    protected void R(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.h(v, i);
    }

    @Override // defpackage.aji
    public boolean f(CoordinatorLayout coordinatorLayout, V v, int i) {
        R(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new czvm(v);
        }
        this.a.a();
        this.a.b();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.c(i2);
            this.b = 0;
            return true;
        }
        return true;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: alxl  reason: default package */
/* loaded from: classes.dex */
public final class alxl extends xo {
    public View d;
    private final xo e;
    private final lg f;

    public alxl(xo xoVar) {
        alxk alxkVar = new alxk(this);
        this.f = alxkVar;
        this.e = xoVar;
        xoVar.u(alxkVar);
        q(xoVar.b);
    }

    @Override // defpackage.xo
    public final int b() {
        int b = this.e.b();
        return this.d != null ? b + 1 : b;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        if (this.d != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.e.c(i);
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new alxm(frameLayout);
        }
        return this.e.f(viewGroup, i);
    }

    @Override // defpackage.xo
    public final long mp(int i) {
        if (this.d != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.e.mp(i);
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        View view = this.d;
        if (view != null) {
            i--;
        }
        if (!(yoVar instanceof alxm)) {
            this.e.o(yoVar, i);
        } else if (view == null) {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) this.d.getParent()).removeView(this.d);
            }
            ((FrameLayout) yoVar.a).addView(this.d);
        }
    }
}

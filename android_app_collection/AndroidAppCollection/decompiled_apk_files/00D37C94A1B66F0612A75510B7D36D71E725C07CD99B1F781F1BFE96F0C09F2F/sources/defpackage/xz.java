package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: xz  reason: default package */
/* loaded from: classes4.dex */
public abstract class xz {
    public RecyclerView a;
    private Scroller b;
    private final ne c;

    public xz() {
    }

    public abstract int a(xw xwVar, int i, int i2);

    public abstract View b(xw xwVar);

    public abstract int[] c(xw xwVar, View view);

    public yk d(xw xwVar) {
        return h(xwVar);
    }

    public void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aG(this.c);
            this.a.H = null;
        }
        this.a = recyclerView;
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.H != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        recyclerView.aE(this.c);
        RecyclerView recyclerView3 = this.a;
        recyclerView3.H = this;
        this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
        f();
    }

    public final void f() {
        xw xwVar;
        View b;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (xwVar = recyclerView.n) == null || (b = b(xwVar)) == null) {
            return;
        }
        int[] c = c(xwVar, b);
        int i = 0;
        int i2 = c[0];
        if (i2 != 0) {
            i = i2;
        } else if (c[1] == 0) {
            return;
        }
        this.a.aj(i, c[1]);
    }

    public final int[] g(int i, int i2) {
        this.b.fling(0, 0, i, i2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    @Deprecated
    protected yk h(xw xwVar) {
        if (!(xwVar instanceof yj)) {
            return null;
        }
        return new zp(this, this.a.getContext());
    }

    public xz(byte[] bArr) {
        this.c = new zo(this);
    }
}

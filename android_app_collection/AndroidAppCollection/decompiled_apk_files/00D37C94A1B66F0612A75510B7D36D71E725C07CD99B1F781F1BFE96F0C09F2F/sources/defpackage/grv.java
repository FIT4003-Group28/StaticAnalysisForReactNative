package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: grv  reason: default package */
/* loaded from: classes3.dex */
public final class grv extends RecyclerView {
    public LinearLayoutManager W;
    public long aa;
    public Runnable ab;
    public gra ac;
    public boolean ad;
    public boolean ae;
    public ne af;
    public ne ag;
    public ne ah;

    public grv(Context context) {
        super(context);
        this.ad = false;
        this.ae = false;
    }

    public static int a(long j, long j2) {
        return (int) ((((float) j) / ((float) j2)) * 6.0f);
    }

    public final long aH(int i, int i2) {
        int i3;
        int w;
        grt grtVar = (grt) this.m;
        if (grtVar == null) {
            return 0L;
        }
        if (this.ad) {
            i3 = (i + i2) - grtVar.j;
            w = grtVar.k * grtVar.e;
        } else {
            i3 = i + i2;
            w = grtVar.w();
        }
        int max = Math.max(w, getMeasuredWidth());
        if (max != 0) {
            return (i3 * grtVar.f) / max;
        }
        return 0L;
    }

    public final long aI() {
        int i = 0;
        if (this.ad) {
            grt grtVar = (grt) this.m;
            if (grtVar != null) {
                i = grtVar.j;
            }
            return aH(computeHorizontalScrollOffset(), i);
        }
        return aH(computeHorizontalScrollOffset(), 0);
    }

    public final long aJ() {
        if (this.ad) {
            grt grtVar = (grt) this.m;
            return aH(computeHorizontalScrollOffset(), getMeasuredWidth() - (grtVar != null ? grtVar.j : 0));
        }
        return aH(computeHorizontalScrollOffset(), getMeasuredWidth());
    }

    public final void aK() {
        ne neVar = this.af;
        if (neVar != null) {
            neVar.i(this, 101);
        }
    }

    public final void aL(boolean z) {
        this.ae = z;
        grt grtVar = (grt) this.m;
        if (grtVar != null) {
            grtVar.n = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeHorizontalScrollOffset() {
        int J2;
        View S;
        if (this.ad) {
            grt grtVar = (grt) this.m;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.n;
            if (grtVar == null || linearLayoutManager == null || (S = linearLayoutManager.S((J2 = linearLayoutManager.J()))) == null) {
                return 0;
            }
            if (J2 != 0) {
                return grtVar.j + ((J2 - 1) * grtVar.k) + Math.abs(S.getLeft());
            }
            return Math.abs(S.getLeft());
        }
        return super.computeHorizontalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        grt grtVar = (grt) this.m;
        if (grtVar != null) {
            grtVar.h.clear();
            grtVar.i.evictAll();
            grtVar.d.h(grtVar);
        }
        super.onDetachedFromWindow();
    }
}

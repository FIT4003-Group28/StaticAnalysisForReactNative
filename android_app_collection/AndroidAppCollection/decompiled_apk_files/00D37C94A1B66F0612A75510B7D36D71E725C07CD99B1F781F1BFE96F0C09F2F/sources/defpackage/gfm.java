package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gfm  reason: default package */
/* loaded from: classes3.dex */
public final class gfm {
    public final RecyclerView a;
    public final xo b;
    public final ViewGroup c;
    public final gfa d;
    public final gey e;
    public final ya f;
    public final float g;
    public final gfl h;
    public View i;
    public long j;
    public boolean k;
    public View l;
    public float m;
    public int n;
    public Runnable o;
    public final ne p;
    public nd q;
    private float r;
    private View s;
    private boolean t;

    public gfm(StickyHeaderContainer stickyHeaderContainer, xo xoVar, gey geyVar) {
        xoVar.getClass();
        this.b = xoVar;
        this.e = geyVar;
        stickyHeaderContainer.getClass();
        RecyclerView recyclerView = stickyHeaderContainer.a;
        this.a = recyclerView;
        this.c = (ViewGroup) recyclerView.getParent();
        this.g = recyclerView.getContext().getResources().getDimensionPixelOffset(R.dimen.expansion_start);
        this.f = new gfg(this);
        this.p = new gfh(this);
        this.h = new gfl(recyclerView.getContext());
        gfa gfaVar = new gfa(xoVar, geyVar);
        this.d = gfaVar;
        gfaVar.d = new gfc(this);
        gfaVar.x();
    }

    public static final float e(View view, float f) {
        return 1.0f - Math.max(0.0f, Math.min(1.0f, view.getTop() / f));
    }

    private final void f() {
        if (!this.t) {
            this.a.ae(gfb.a);
            this.t = true;
        }
    }

    private final void g() {
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.c.post(new gfe(this, this.i, 1));
            this.i = null;
            this.j = 0L;
        }
    }

    private final void h() {
        if (this.t) {
            this.a.ae(null);
            this.t = false;
        }
    }

    private final void i() {
        View view = this.s;
        if (view != null) {
            view.setAlpha(this.r);
            this.s.setVisibility(this.r == 0.0f ? 8 : 0);
            this.s = null;
        }
    }

    private static final boolean j(int i) {
        return (i & 28) == 28;
    }

    public final View a(xw xwVar) {
        if (xwVar != null) {
            gfa gfaVar = this.d;
            int i = gfaVar.b;
            if (i == -1) {
                if (!gfaVar.z()) {
                    return null;
                }
            } else if (i >= gfaVar.a.size() - 1) {
                return null;
            }
            return xwVar.S(this.d.v());
        }
        return null;
    }

    public final void b() {
        nd ndVar = this.q;
        if (ndVar != null) {
            this.a.aF(ndVar);
            this.a.Z(this.f);
            this.q = null;
        }
    }

    public final void c() {
        if (this.i != null) {
            g();
        }
        this.a.aG(this.p);
        this.d.y();
        if (this.q != null) {
            this.a.post(new gfd(this));
        }
        i();
        h();
        this.l = null;
        this.o = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r5 == (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfm.d():void");
    }
}

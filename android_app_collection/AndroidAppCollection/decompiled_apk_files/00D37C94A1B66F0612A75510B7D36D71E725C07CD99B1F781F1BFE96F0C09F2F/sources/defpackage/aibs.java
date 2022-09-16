package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aibs  reason: default package */
/* loaded from: classes.dex */
public abstract class aibs extends View implements aibw {
    private final int a;
    private int b;
    private int[] c;
    private Point d;
    public aibx r;
    public long s;
    protected final aibp t;
    public boolean u;

    public aibs(aibx aibxVar, Context context, AttributeSet attributeSet) {
        this(aibxVar, context, attributeSet, new aibp());
    }

    public static String I(long j) {
        return zgh.j(j / 1000, j >= 3600000 ? 5 : j >= 60000 ? 4 : 3);
    }

    public static void K(aibx aibxVar, long j) {
        aibt aibtVar = (aibt) aibxVar;
        boolean z = false;
        if (aibtVar.p && j == aibtVar.a) {
            z = true;
        }
        aibtVar.q = z;
    }

    private final long f(long j) {
        return this.r.t() ? -(this.r.i() - j) : j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void B();

    protected abstract boolean C(float f, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long E() {
        return this.r.h() - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long F() {
        return this.s - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Point G(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.c == null) {
            this.c = new int[2];
        }
        if (this.d == null) {
            this.d = new Point();
        }
        getLocationOnScreen(this.c);
        this.d.set(((int) motionEvent.getRawX()) - this.c[0], ((int) motionEvent.getRawY()) - this.c[1]);
        return this.d;
    }

    public final String H() {
        return getContext().getResources().getString(R.string.accessibility_player_progress_time, zgt.z(getResources(), I(E())), zgt.z(getResources(), I(kJ())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(long j) {
        this.t.a(3, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L() {
        this.t.a(5, this.s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M() {
        this.t.a(4, this.s);
        kL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void N(int i) {
        o(i);
        long c = c();
        this.s = c;
        this.t.a(2, c);
        kL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(int i) {
        o(i);
        long c = c();
        this.s = c;
        this.t.a(1, c);
        kL();
    }

    public final void P(long j) {
        this.s = j;
        kL();
    }

    public abstract long c();

    @Override // defpackage.aibw
    public final long kH() {
        return f(this.r.h());
    }

    @Override // defpackage.aibw
    public final long kI() {
        return this.r.g() - this.r.j();
    }

    @Override // defpackage.aibw
    public final long kJ() {
        return this.r.i() - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kK() {
        if (this.u) {
            kL();
            J(c());
            return;
        }
        J(c());
        kL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void kL();

    @Override // defpackage.aibw
    public final boolean kM() {
        return this.t.b;
    }

    @Override // defpackage.aibw
    public final void kN() {
        aibp aibpVar = this.t;
        long c = c();
        if (!aibpVar.b) {
            return;
        }
        aibpVar.b(false, 4, c);
    }

    @Override // defpackage.aibw
    public final long kO() {
        return f(this.s);
    }

    @Override // defpackage.aibz
    public final void kP(aiby aibyVar) {
        this.t.a.add(aibyVar);
    }

    protected abstract void o(float f);

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        Point G = G(motionEvent);
        int i = G.x;
        int i2 = G.y;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.t.b) {
                        M();
                        return true;
                    }
                } else if (this.t.b) {
                    if (i2 < this.a) {
                        int i3 = this.b;
                        i = ((i - i3) / 3) + i3;
                    } else {
                        this.b = i;
                    }
                    N(i);
                    return true;
                }
            } else if (this.t.b) {
                kK();
                return true;
            }
        } else if (C(i, i2)) {
            L();
            O(i);
            return true;
        }
        return false;
    }

    @Override // defpackage.aibz
    public final void q(aiby aibyVar) {
        this.t.a.remove(aibyVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        B();
    }

    @Override // defpackage.aibw
    public final void y(aibx aibxVar) {
        aibxVar.getClass();
        this.r = aibxVar;
        kL();
    }

    public aibs(aibx aibxVar, Context context, AttributeSet attributeSet, aibp aibpVar) {
        super(context, attributeSet);
        this.t = aibpVar;
        this.r = aibxVar;
        aibpVar.c = new aibo(this);
        setAccessibilityDelegate(new aibr(this));
        this.a = (int) (context.getResources().getDisplayMetrics().density * (-50.0f));
    }
}

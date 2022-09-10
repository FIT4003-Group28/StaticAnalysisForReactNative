package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: jtz  reason: default package */
/* loaded from: classes7.dex */
public final class jtz extends FrameLayout {
    private static final dcep<Integer> x = dcep.E(21, 19, 22, 20);
    private final jzp A;
    private final lai B;
    public final Context a;
    public final Choreographer b;
    public final ckcw c;
    public final akfa d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final jty g;
    public final FrameLayout h;
    public final FrameLayout i;
    public final FrameLayout j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final FrameLayout o;
    public final FrameLayout p;
    public final FrameLayout q;
    public final FrameLayout r;
    public final FrameLayout s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Choreographer.FrameCallback w;
    private final bvjj y;
    private final bttf z;

    public jtz(Context context, Choreographer choreographer, bvjj bvjjVar, bttf bttfVar, jzp jzpVar, ckcw ckcwVar, FrameLayout frameLayout, lai laiVar, akfa akfaVar, FrameLayout frameLayout2, jty jtyVar, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, FrameLayout frameLayout7, FrameLayout frameLayout8, FrameLayout frameLayout9, FrameLayout frameLayout10, FrameLayout frameLayout11, FrameLayout frameLayout12, FrameLayout frameLayout13) {
        super(context);
        this.w = new jtx(this);
        this.a = context;
        dbsk.s(choreographer);
        this.b = choreographer;
        dbsk.s(bvjjVar);
        this.y = bvjjVar;
        dbsk.s(bttfVar);
        this.z = bttfVar;
        dbsk.s(jzpVar);
        this.A = jzpVar;
        dbsk.s(ckcwVar);
        this.c = ckcwVar;
        dbsk.s(laiVar);
        this.B = laiVar;
        dbsk.s(akfaVar);
        this.d = akfaVar;
        this.e = frameLayout2;
        dbsk.s(frameLayout);
        this.f = frameLayout;
        this.g = jtyVar;
        this.h = frameLayout3;
        this.i = frameLayout4;
        this.j = frameLayout5;
        frameLayout5.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.l = frameLayout6;
        this.m = frameLayout7;
        this.n = frameLayout8;
        this.o = frameLayout9;
        this.p = frameLayout10;
        this.q = frameLayout11;
        this.s = frameLayout12;
        this.k = frameLayout13;
        if (jzpVar.g()) {
            this.r = new FrameLayout(context);
        } else {
            this.r = new ntf(context, frameLayout9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!this.z.b()) {
            this.i.addFocusables(arrayList, i, i2);
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getSource() == 1048584 && keyEvent.getAction() == 1 && x.contains(Integer.valueOf(keyEvent.getKeyCode()))) {
            return false;
        }
        lai laiVar = this.B;
        laiVar.f = true;
        if (laiVar.g) {
            laiVar.a.dispatchTouchEvent(MotionEvent.obtain(laiVar.h, SystemClock.uptimeMillis(), 1, 0.0f, 0.0f, 0));
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3 && (this.A.f() || this.A.g())) {
            lai laiVar = this.B;
            if (laiVar.b.g()) {
                if (!laiVar.c.b) {
                    if (laiVar.i != null) {
                        laiVar.e.onTouchEvent(motionEvent);
                        return true;
                    }
                } else {
                    laiVar.d.onTouchEvent(motionEvent);
                }
            }
            if (laiVar.a(motionEvent)) {
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void setNightMode(boolean z) {
        int i;
        if (this.t) {
            return;
        }
        boolean m = this.y.m(bvjk.gk, false);
        FrameLayout frameLayout = this.e;
        if (z || m) {
            i = alwn.NAVIGATION_LOW_LIGHT.z;
        } else {
            i = alwn.NAVIGATION.z;
        }
        frameLayout.setBackgroundColor(i);
    }
}

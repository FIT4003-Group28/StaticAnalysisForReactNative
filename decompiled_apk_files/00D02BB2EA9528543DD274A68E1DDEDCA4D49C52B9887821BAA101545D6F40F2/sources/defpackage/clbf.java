package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: clbf  reason: default package */
/* loaded from: classes5.dex */
public final class clbf implements View.OnTouchListener {
    public final int a;
    @dzsi
    public clbe b;
    @dzsi
    public clbd f;
    private final ScaleGestureDetector g;
    private final GestureDetector h;
    private final GestureDetector i;
    @dzsi
    private clbc l;
    private final clbl m;
    public final StringBuilder c = new StringBuilder();
    private boolean j = false;
    public boolean d = false;
    public boolean e = false;
    private final PointF k = new PointF();

    public clbf(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        clbb clbbVar = new clbb(this);
        GestureDetector gestureDetector = new GestureDetector(context, clbbVar);
        this.h = gestureDetector;
        this.g = new ScaleGestureDetector(context, clbbVar);
        gestureDetector.setOnDoubleTapListener(null);
        GestureDetector gestureDetector2 = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
        this.i = gestureDetector2;
        gestureDetector2.setOnDoubleTapListener(clbbVar);
        this.m = new clbl();
    }

    private final void g(float f, float f2) {
        this.j = true;
        this.d = false;
        this.c.setLength(0);
        this.k.set(f, f2);
        this.f = clbd.TOUCH;
        f(String.format("Start tracking (%d, %d)", Integer.valueOf((int) f), Integer.valueOf((int) f2)));
    }

    public final boolean a(MotionEvent motionEvent, boolean z) {
        char c;
        clbe clbeVar;
        if (motionEvent.getActionMasked() == 0 && this.j && this.d) {
            g(motionEvent.getX(), motionEvent.getY());
        }
        clbc clbcVar = this.l;
        if (clbcVar != null && motionEvent != null && clbcVar.a == motionEvent.getEventTime() && clbcVar.b == motionEvent.getActionMasked() && z == this.e) {
            return false;
        }
        if (!this.j) {
            g(motionEvent.getX(), motionEvent.getY());
        }
        if (!this.j || motionEvent.getActionMasked() != 0 || this.f != clbd.DOUBLE_TAP || this.e || !z) {
            if (this.b != null && z && !this.e) {
                f("Gesture start");
                clcl clclVar = ((clcj) this.b).j;
                clclVar.k = 0;
                clclVar.j = 0;
                clclVar.c.forceFinished(true);
            }
            this.e = z;
            StringBuilder sb = this.c;
            switch (motionEvent.getActionMasked()) {
                case 0:
                    c = 'D';
                    break;
                case 1:
                    c = 'U';
                    break;
                case 2:
                    c = 'M';
                    break;
                case 3:
                    c = 'C';
                    break;
                case 4:
                default:
                    c = '.';
                    break;
                case 5:
                    c = 'P';
                    break;
                case 6:
                    c = 'Q';
                    break;
                case 7:
                    c = 'm';
                    break;
                case 8:
                    c = 'S';
                    break;
                case 9:
                    c = 'e';
                    break;
                case 10:
                    c = 'x';
                    break;
            }
            sb.append(c);
            this.h.onTouchEvent(motionEvent);
            clbl clblVar = this.m;
            clbc clbcVar2 = this.l;
            if (clbcVar2 == null || clbcVar2.b != 1 || !clbl.b.contains(clblVar.c) || motionEvent.getEventTime() - clbcVar2.a >= clbl.a) {
                this.g.onTouchEvent(motionEvent);
            } else {
                f("Skipping zoom detector!");
            }
            this.i.onTouchEvent(motionEvent);
        } else {
            this.e = true;
        }
        if (motionEvent.getActionMasked() == 8) {
            this.b.onScroll(motionEvent, motionEvent, motionEvent.getAxisValue(10) * 10.0f, -(motionEvent.getAxisValue(9) * 10.0f));
        }
        if (motionEvent.getActionMasked() == 1) {
            if (this.f == clbd.DOUBLE_TAP && this.e && (clbeVar = this.b) != null) {
                clbeVar.onDoubleTap(motionEvent);
            }
            if (this.f != clbd.FIRST_TAP) {
                b();
            } else {
                this.c.append('+');
            }
        }
        if (motionEvent.getActionMasked() == 3) {
            b();
        }
        this.l = new clbc(motionEvent);
        return true;
    }

    public final void b() {
        clbe clbeVar;
        this.j = false;
        this.c.append('/');
        f("End gesture");
        if (this.e && (clbeVar = this.b) != null) {
            clbd clbdVar = this.f;
            clbd clbdVar2 = clbd.TOUCH;
            int ordinal = clbdVar.ordinal();
            if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
                ((clcj) clbeVar).j.o(true);
            } else if (ordinal == 9) {
                clcj clcjVar = (clcj) clbeVar;
                clcjVar.j.n();
                clcjVar.j.o(true);
            }
            clcj clcjVar2 = (clcj) clbeVar;
            clcjVar2.h = 0.0f;
            clcjVar2.i = 0.0f;
            clcjVar2.f = clcjVar2.j.v;
            clcjVar2.g.clear();
        }
        this.e = false;
    }

    public final boolean c(clbd... clbdVarArr) {
        for (clbd clbdVar : clbdVarArr) {
            if (this.f == clbdVar) {
                return true;
            }
        }
        return false;
    }

    public final float d(MotionEvent motionEvent, int i) {
        if (i != -1) {
            if (i != 0) {
                return Math.abs(motionEvent.getY() - this.k.y);
            }
            return Math.abs(motionEvent.getX() - this.k.x);
        }
        float x = motionEvent.getX() - this.k.x;
        float y = motionEvent.getY() - this.k.y;
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public final void e(clbd clbdVar) {
        clbd clbdVar2;
        if (!this.d && (clbdVar2 = this.f) != clbdVar) {
            if (clbdVar2 != null && clbdVar2 != clbd.TOUCH) {
                if (clbdVar2 == clbd.FIRST_TAP) {
                    if (clbdVar == clbd.TOUCH) {
                        return;
                    }
                } else if (clbdVar2 != clbd.DOUBLE_TAP) {
                    int ordinal = clbdVar.ordinal();
                    if (ordinal != 8 && ordinal != 9 && clbdVar2 != clbd.LONG_PRESS) {
                        return;
                    }
                } else if (clbdVar != clbd.DRAG && clbdVar != clbd.DRAG_X && clbdVar != clbd.DRAG_Y) {
                    return;
                }
            }
            this.m.c = this.f;
            this.f = clbdVar;
        }
    }

    public final void f(String str) {
        String str2 = true != this.e ? "[]" : "[H]";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + str2.length());
        sb.append("[%s] ");
        sb.append(str);
        sb.append(" %s (%s)");
        sb.append(str2);
        sb.toString();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return a(motionEvent, true);
    }
}

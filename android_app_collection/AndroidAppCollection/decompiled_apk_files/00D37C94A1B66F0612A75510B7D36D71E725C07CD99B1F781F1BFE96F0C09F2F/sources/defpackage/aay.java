package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aay  reason: default package */
/* loaded from: classes.dex */
public final class aay implements ya {
    final /* synthetic */ abh a;

    public aay(abh abhVar) {
        this.a = abhVar;
    }

    @Override // defpackage.ya
    public final void g(boolean z) {
        if (!z) {
            return;
        }
        this.a.m(null, 0);
    }

    @Override // defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.q.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        abf abfVar = null;
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.k();
            abh abhVar = this.a;
            if (abhVar.b == null) {
                if (!abhVar.l.isEmpty()) {
                    View g = abhVar.g(motionEvent);
                    int size = abhVar.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        abf abfVar2 = (abf) abhVar.l.get(size);
                        if (abfVar2.h.a == g) {
                            abfVar = abfVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (abfVar != null) {
                    abh abhVar2 = this.a;
                    abhVar2.c -= abfVar.l;
                    abhVar2.d -= abfVar.m;
                    abhVar2.i(abfVar.h, true);
                    if (this.a.a.remove(abfVar.h.a)) {
                        abh abhVar3 = this.a;
                        abhVar3.j.f(abhVar3.m, abfVar.h);
                    }
                    this.a.m(abfVar.h, abfVar.i);
                    abh abhVar4 = this.a;
                    abhVar4.n(motionEvent, abhVar4.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            abh abhVar5 = this.a;
            abhVar5.i = -1;
            abhVar5.m(null, 0);
        } else {
            int i = this.a.i;
            if (i != -1 && motionEvent.findPointerIndex(i) >= 0) {
                this.a.o(actionMasked);
            }
        }
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    @Override // defpackage.ya
    public final void n(MotionEvent motionEvent) {
        this.a.q.a(motionEvent);
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.i == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
        if (findPointerIndex >= 0) {
            this.a.o(actionMasked);
        }
        abh abhVar = this.a;
        yo yoVar = abhVar.b;
        if (yoVar == null) {
            return;
        }
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex < 0) {
                    return;
                }
                abhVar.n(motionEvent, abhVar.k, findPointerIndex);
                this.a.j(yoVar);
                abh abhVar2 = this.a;
                abhVar2.m.removeCallbacks(abhVar2.n);
                this.a.n.run();
                this.a.m.invalidate();
                return;
            } else if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                abh abhVar3 = this.a;
                if (pointerId != abhVar3.i) {
                    return;
                }
                if (actionIndex == 0) {
                    i = 1;
                }
                abhVar3.i = motionEvent.getPointerId(i);
                abh abhVar4 = this.a;
                abhVar4.n(motionEvent, abhVar4.k, actionIndex);
                return;
            } else {
                VelocityTracker velocityTracker2 = abhVar.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
        }
        this.a.m(null, 0);
        this.a.i = -1;
    }
}

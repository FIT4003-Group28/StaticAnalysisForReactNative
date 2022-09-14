package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afp  reason: default package */
/* loaded from: classes2.dex */
public final class afp implements abw {
    final /* synthetic */ aga a;

    public afp(aga agaVar) {
        this.a = agaVar;
    }

    @Override // defpackage.abw
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        this.a.q.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        afx afxVar = null;
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.i();
            aga agaVar = this.a;
            if (agaVar.b == null) {
                if (!agaVar.l.isEmpty()) {
                    View l = agaVar.l(motionEvent);
                    int size = agaVar.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        afx afxVar2 = agaVar.l.get(size);
                        if (afxVar2.h.a == l) {
                            afxVar = afxVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (afxVar != null) {
                    aga agaVar2 = this.a;
                    agaVar2.c -= afxVar.l;
                    agaVar2.d -= afxVar.m;
                    agaVar2.h(afxVar.h, true);
                    if (this.a.a.remove(afxVar.h.a)) {
                        aga agaVar3 = this.a;
                        agaVar3.j.j(agaVar3.m, afxVar.h);
                    }
                    this.a.f(afxVar.h, afxVar.i);
                    aga agaVar4 = this.a;
                    agaVar4.m(motionEvent, agaVar4.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            aga agaVar5 = this.a;
            agaVar5.i = -1;
            agaVar5.f(null, 0);
        } else {
            int i = this.a.i;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                this.a.j(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    @Override // defpackage.abw
    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
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
            this.a.j(actionMasked, motionEvent, findPointerIndex);
        }
        aga agaVar = this.a;
        acl aclVar = agaVar.b;
        if (aclVar == null) {
            return;
        }
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex < 0) {
                    return;
                }
                agaVar.m(motionEvent, agaVar.k, findPointerIndex);
                this.a.g(aclVar);
                aga agaVar2 = this.a;
                agaVar2.m.removeCallbacks(agaVar2.n);
                this.a.n.run();
                this.a.m.invalidate();
                return;
            } else if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                aga agaVar3 = this.a;
                if (pointerId != agaVar3.i) {
                    return;
                }
                if (actionIndex == 0) {
                    i = 1;
                }
                agaVar3.i = motionEvent.getPointerId(i);
                aga agaVar4 = this.a;
                agaVar4.m(motionEvent, agaVar4.k, actionIndex);
                return;
            } else {
                VelocityTracker velocityTracker2 = agaVar.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
        }
        this.a.f(null, 0);
        this.a.i = -1;
    }

    @Override // defpackage.abw
    public final void h(boolean z) {
        if (!z) {
            return;
        }
        this.a.f(null, 0);
    }
}

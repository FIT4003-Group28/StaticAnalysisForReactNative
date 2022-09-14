package defpackage;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqe  reason: default package */
/* loaded from: classes4.dex */
public final class bqe extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ bqi a;

    public bqe(bqi bqiVar) {
        this.a = bqiVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.a.p.setEmpty();
        int j = this.a.j();
        int i = this.a.i();
        int d = this.a.d();
        float f = i;
        if (x >= f) {
            bqi bqiVar = this.a;
            int i2 = bqiVar.t;
            if (x <= i2 - j) {
                float f2 = d;
                if (y >= f2) {
                    float f3 = ((i2 - i) - j) / bqiVar.A;
                    int i3 = (int) (f + (((int) ((x - f) / f3)) * f3));
                    int i4 = bqiVar.v;
                    int i5 = d + (((int) ((y - f2) / i4)) * i4);
                    bqiVar.p.set(i3, i5, (int) (i3 + f3), i4 + i5);
                    bqi bqiVar2 = this.a;
                    Drawable drawable = bqiVar2.n;
                    if (drawable == null) {
                        return true;
                    }
                    drawable.setBounds(bqiVar2.p);
                    this.a.p();
                    bqi bqiVar3 = this.a;
                    if (bqiVar3.o) {
                        bqiVar3.n.setHotspot(x, y);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        final bqi bqiVar = this.a;
        if (bqiVar.p.isEmpty()) {
            return;
        }
        bqiVar.c(motionEvent.getX(), motionEvent.getY(), new bqg(bqiVar) { // from class: bqc
            private final bqi a;

            {
                this.a = bqiVar;
            }

            @Override // defpackage.bqg
            public final void a(bqa bqaVar) {
                this.a.n(bqaVar);
            }
        });
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a.p.isEmpty()) {
            return false;
        }
        float x = motionEvent2.getX();
        float y = motionEvent2.getY();
        if (!this.a.p.contains((int) x, (int) y)) {
            this.a.p.setEmpty();
            this.a.p();
            return false;
        }
        bqi bqiVar = this.a;
        if (!bqiVar.o) {
            return true;
        }
        bqiVar.n.setHotspot(x, y);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.a.p.isEmpty()) {
            return false;
        }
        return this.a.c(motionEvent.getX(), motionEvent.getY(), new bqg(this) { // from class: bqd
            private final bqe a;

            {
                this.a = this;
            }

            @Override // defpackage.bqg
            public final void a(bqa bqaVar) {
                this.a.a.m(bqaVar);
            }
        });
    }
}

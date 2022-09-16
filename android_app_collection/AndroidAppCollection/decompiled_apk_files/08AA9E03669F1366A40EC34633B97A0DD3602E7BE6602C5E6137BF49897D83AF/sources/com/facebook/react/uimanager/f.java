package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
/* compiled from: JSTouchDispatcher.java */
/* loaded from: classes.dex */
public class f {
    private final ViewGroup e;

    /* renamed from: a  reason: collision with root package name */
    private int f3899a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f3900b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    private boolean f3901c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f3902d = Long.MIN_VALUE;
    private final com.facebook.react.uimanager.events.g f = new com.facebook.react.uimanager.events.g();

    public f(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        if (this.f3901c) {
            return;
        }
        c(motionEvent, cVar);
        this.f3901c = true;
        this.f3899a = -1;
    }

    public void b(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f3899a != -1) {
                com.facebook.common.e.a.d("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f3901c = false;
            this.f3902d = motionEvent.getEventTime();
            this.f3899a = a(motionEvent);
            cVar.a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.START, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
        } else if (this.f3901c) {
        } else {
            if (this.f3899a == -1) {
                com.facebook.common.e.a.d("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                a(motionEvent);
                cVar.a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.END, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
                this.f3899a = -1;
                this.f3902d = Long.MIN_VALUE;
            } else if (action == 2) {
                a(motionEvent);
                cVar.a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.MOVE, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
            } else if (action == 5) {
                cVar.a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.START, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
            } else if (action == 6) {
                cVar.a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.END, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
            } else if (action == 3) {
                if (this.f.e(motionEvent.getDownTime())) {
                    c(motionEvent, cVar);
                } else {
                    com.facebook.common.e.a.d("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.f3899a = -1;
                this.f3902d = Long.MIN_VALUE;
            } else {
                com.facebook.common.e.a.c("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f3899a);
            }
        }
    }

    private int a(MotionEvent motionEvent) {
        return ag.a(motionEvent.getX(), motionEvent.getY(), this.e, this.f3900b, (int[]) null);
    }

    private void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        if (this.f3899a == -1) {
            com.facebook.common.e.a.c("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        com.facebook.j.a.a.a(!this.f3901c, "Expected to not have already sent a cancel for this gesture");
        ((com.facebook.react.uimanager.events.c) com.facebook.j.a.a.b(cVar)).a(com.facebook.react.uimanager.events.f.a(this.f3899a, com.facebook.react.uimanager.events.h.CANCEL, motionEvent, this.f3902d, this.f3900b[0], this.f3900b[1], this.f));
    }
}

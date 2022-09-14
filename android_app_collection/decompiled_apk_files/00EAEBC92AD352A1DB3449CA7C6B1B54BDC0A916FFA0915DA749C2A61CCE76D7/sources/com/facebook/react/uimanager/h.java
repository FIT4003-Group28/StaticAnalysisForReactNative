package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f5928e;

    /* renamed from: a  reason: collision with root package name */
    private int f5924a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f5925b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    private boolean f5926c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f5927d = Long.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.react.uimanager.events.h f5929f = new com.facebook.react.uimanager.events.h();

    public h(ViewGroup viewGroup) {
        this.f5928e = viewGroup;
    }

    private int a(MotionEvent motionEvent) {
        return l0.a(motionEvent.getX(), motionEvent.getY(), this.f5928e, this.f5925b, (int[]) null);
    }

    private void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f5924a == -1) {
            c.d.d.e.a.d("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        c.d.k.a.a.a(!this.f5926c, "Expected to not have already sent a cancel for this gesture");
        c.d.k.a.a.a(dVar);
        int i = this.f5924a;
        com.facebook.react.uimanager.events.i iVar = com.facebook.react.uimanager.events.i.CANCEL;
        long j = this.f5927d;
        float[] fArr = this.f5925b;
        dVar.a(com.facebook.react.uimanager.events.g.b(i, iVar, motionEvent, j, fArr[0], fArr[1], this.f5929f));
    }

    public void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        com.facebook.react.uimanager.events.i iVar;
        long j;
        float f2;
        float f3;
        com.facebook.react.uimanager.events.g b2;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (this.f5926c) {
                return;
            }
            int i = this.f5924a;
            if (i == -1) {
                c.d.d.e.a.b("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                a(motionEvent);
                int i2 = this.f5924a;
                com.facebook.react.uimanager.events.i iVar2 = com.facebook.react.uimanager.events.i.END;
                long j2 = this.f5927d;
                float[] fArr = this.f5925b;
                dVar.a(com.facebook.react.uimanager.events.g.b(i2, iVar2, motionEvent, j2, fArr[0], fArr[1], this.f5929f));
            } else if (action == 2) {
                a(motionEvent);
                int i3 = this.f5924a;
                com.facebook.react.uimanager.events.i iVar3 = com.facebook.react.uimanager.events.i.MOVE;
                long j3 = this.f5927d;
                float[] fArr2 = this.f5925b;
                b2 = com.facebook.react.uimanager.events.g.b(i3, iVar3, motionEvent, j3, fArr2[0], fArr2[1], this.f5929f);
            } else {
                if (action == 5) {
                    iVar = com.facebook.react.uimanager.events.i.START;
                    j = this.f5927d;
                    float[] fArr3 = this.f5925b;
                    f2 = fArr3[0];
                    f3 = fArr3[1];
                } else if (action == 6) {
                    iVar = com.facebook.react.uimanager.events.i.END;
                    j = this.f5927d;
                    float[] fArr4 = this.f5925b;
                    f2 = fArr4[0];
                    f3 = fArr4[1];
                } else if (action != 3) {
                    c.d.d.e.a.d("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f5924a);
                    return;
                } else if (this.f5929f.c(motionEvent.getDownTime())) {
                    c(motionEvent, dVar);
                } else {
                    c.d.d.e.a.b("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                b2 = com.facebook.react.uimanager.events.g.b(i, iVar, motionEvent, j, f2, f3, this.f5929f);
            }
            this.f5924a = -1;
            this.f5927d = Long.MIN_VALUE;
            return;
        }
        if (this.f5924a != -1) {
            c.d.d.e.a.b("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
        }
        this.f5926c = false;
        this.f5927d = motionEvent.getEventTime();
        this.f5924a = a(motionEvent);
        int i4 = this.f5924a;
        com.facebook.react.uimanager.events.i iVar4 = com.facebook.react.uimanager.events.i.START;
        long j4 = this.f5927d;
        float[] fArr5 = this.f5925b;
        b2 = com.facebook.react.uimanager.events.g.b(i4, iVar4, motionEvent, j4, fArr5[0], fArr5[1], this.f5929f);
        dVar.a(b2);
    }

    public void b(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f5926c) {
            return;
        }
        c(motionEvent, dVar);
        this.f5926c = true;
        this.f5924a = -1;
    }
}

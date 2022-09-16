package com.facebook.react.uimanager.events;

import android.support.v4.i.j;
import android.view.MotionEvent;
import com.facebook.react.bridge.ao;
/* compiled from: TouchEvent.java */
/* loaded from: classes.dex */
public class f extends b<f> {

    /* renamed from: a  reason: collision with root package name */
    private static final j.b<f> f3889a = new j.b<>(3);

    /* renamed from: b  reason: collision with root package name */
    private MotionEvent f3890b;

    /* renamed from: c  reason: collision with root package name */
    private h f3891c;

    /* renamed from: d  reason: collision with root package name */
    private short f3892d;
    private float e;
    private float f;

    public static f a(int i, h hVar, MotionEvent motionEvent, long j, float f, float f2, g gVar) {
        f a2 = f3889a.a();
        if (a2 == null) {
            a2 = new f();
        }
        a2.b(i, hVar, motionEvent, j, f, f2, gVar);
        return a2;
    }

    private f() {
    }

    private void b(int i, h hVar, MotionEvent motionEvent, long j, float f, float f2, g gVar) {
        super.a(i);
        short s = 0;
        ao.a(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                gVar.a(j);
                break;
            case 1:
                gVar.d(j);
                break;
            case 2:
                s = gVar.c(j);
                break;
            case 3:
                gVar.d(j);
                break;
            case 4:
            default:
                throw new RuntimeException("Unhandled MotionEvent action: " + action);
            case 5:
            case 6:
                gVar.b(j);
                break;
        }
        this.f3891c = hVar;
        this.f3890b = MotionEvent.obtain(motionEvent);
        this.f3892d = s;
        this.e = f;
        this.f = f2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void c() {
        ((MotionEvent) com.facebook.j.a.a.b(this.f3890b)).recycle();
        this.f3890b = null;
        f3889a.a(this);
    }

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return ((h) com.facebook.j.a.a.b(this.f3891c)).a();
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        switch ((h) com.facebook.j.a.a.b(this.f3891c)) {
            case START:
            case END:
            case CANCEL:
                return false;
            case MOVE:
                return true;
            default:
                throw new RuntimeException("Unknown touch event type: " + this.f3891c);
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return this.f3892d;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        i.a(rCTEventEmitter, (h) com.facebook.j.a.a.b(this.f3891c), d(), this);
    }

    public MotionEvent j() {
        com.facebook.j.a.a.b(this.f3890b);
        return this.f3890b;
    }

    public float k() {
        return this.e;
    }

    public float l() {
        return this.f;
    }
}

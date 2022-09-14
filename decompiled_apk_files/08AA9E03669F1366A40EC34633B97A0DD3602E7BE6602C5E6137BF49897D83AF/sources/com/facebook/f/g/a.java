package com.facebook.f.g;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
/* compiled from: GestureDetector.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0055a f2473a;

    /* renamed from: b  reason: collision with root package name */
    final float f2474b;

    /* renamed from: c  reason: collision with root package name */
    boolean f2475c;

    /* renamed from: d  reason: collision with root package name */
    boolean f2476d;
    long e;
    float f;
    float g;

    /* compiled from: GestureDetector.java */
    /* renamed from: com.facebook.f.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0055a {
        boolean n();
    }

    public a(Context context) {
        this.f2474b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a a(Context context) {
        return new a(context);
    }

    public void a() {
        this.f2473a = null;
        b();
    }

    public void b() {
        this.f2475c = false;
        this.f2476d = false;
    }

    public void a(InterfaceC0055a interfaceC0055a) {
        this.f2473a = interfaceC0055a;
    }

    public boolean c() {
        return this.f2475c;
    }

    public boolean a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f2475c = true;
                this.f2476d = true;
                this.e = motionEvent.getEventTime();
                this.f = motionEvent.getX();
                this.g = motionEvent.getY();
                break;
            case 1:
                this.f2475c = false;
                if (Math.abs(motionEvent.getX() - this.f) > this.f2474b || Math.abs(motionEvent.getY() - this.g) > this.f2474b) {
                    this.f2476d = false;
                }
                if (this.f2476d && motionEvent.getEventTime() - this.e <= ViewConfiguration.getLongPressTimeout() && this.f2473a != null) {
                    this.f2473a.n();
                }
                this.f2476d = false;
                break;
            case 2:
                if (Math.abs(motionEvent.getX() - this.f) > this.f2474b || Math.abs(motionEvent.getY() - this.g) > this.f2474b) {
                    this.f2476d = false;
                    break;
                }
                break;
            case 3:
                this.f2475c = false;
                this.f2476d = false;
                break;
        }
        return true;
    }
}

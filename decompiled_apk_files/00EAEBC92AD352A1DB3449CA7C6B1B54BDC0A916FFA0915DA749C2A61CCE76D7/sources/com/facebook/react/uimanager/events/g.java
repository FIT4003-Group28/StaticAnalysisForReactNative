package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.SoftAssertions;
/* loaded from: classes.dex */
public class g extends c<g> {
    private static final androidx.core.util.f<g> k = new androidx.core.util.f<>(3);

    /* renamed from: f  reason: collision with root package name */
    private MotionEvent f5913f;

    /* renamed from: g  reason: collision with root package name */
    private i f5914g;

    /* renamed from: h  reason: collision with root package name */
    private short f5915h;
    private float i;
    private float j;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5916a = new int[i.values().length];

        static {
            try {
                f5916a[i.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5916a[i.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5916a[i.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5916a[i.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private g() {
    }

    private void a(int i, i iVar, MotionEvent motionEvent, long j, float f2, float f3, h hVar) {
        super.a(i);
        short s = 0;
        SoftAssertions.assertCondition(j != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    s = hVar.b(j);
                } else if (action != 3) {
                    if (action != 5 && action != 6) {
                        throw new RuntimeException("Unhandled MotionEvent action: " + action);
                    }
                    hVar.d(j);
                }
            }
            hVar.e(j);
        } else {
            hVar.a(j);
        }
        this.f5914g = iVar;
        this.f5913f = MotionEvent.obtain(motionEvent);
        this.f5915h = s;
        this.i = f2;
        this.j = f3;
    }

    public static g b(int i, i iVar, MotionEvent motionEvent, long j, float f2, float f3, h hVar) {
        g a2 = k.a();
        if (a2 == null) {
            a2 = new g();
        }
        a2.a(i, iVar, motionEvent, j, f2, f3, hVar);
        return a2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        i iVar = this.f5914g;
        c.d.k.a.a.a(iVar);
        j.a(rCTEventEmitter, iVar, g(), this);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        int[] iArr = a.f5916a;
        i iVar = this.f5914g;
        c.d.k.a.a.a(iVar);
        int i = iArr[iVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f5914g);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return this.f5915h;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        i iVar = this.f5914g;
        c.d.k.a.a.a(iVar);
        return i.a(iVar);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void i() {
        MotionEvent motionEvent = this.f5913f;
        c.d.k.a.a.a(motionEvent);
        motionEvent.recycle();
        this.f5913f = null;
        k.a(this);
    }

    public MotionEvent j() {
        c.d.k.a.a.a(this.f5913f);
        return this.f5913f;
    }

    public float k() {
        return this.i;
    }

    public float l() {
        return this.j;
    }
}

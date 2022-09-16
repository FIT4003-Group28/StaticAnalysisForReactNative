package c.d.h.g;

import android.content.Context;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0079a f3114a;

    /* renamed from: b  reason: collision with root package name */
    final float f3115b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3116c;

    /* renamed from: d  reason: collision with root package name */
    boolean f3117d;

    /* renamed from: e  reason: collision with root package name */
    long f3118e;

    /* renamed from: f  reason: collision with root package name */
    float f3119f;

    /* renamed from: g  reason: collision with root package name */
    float f3120g;

    /* renamed from: c.d.h.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0079a {
        boolean d();
    }

    public a(Context context) {
        this.f3115b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a a(Context context) {
        return new a(context);
    }

    public void a() {
        this.f3114a = null;
        c();
    }

    public void a(InterfaceC0079a interfaceC0079a) {
        this.f3114a = interfaceC0079a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (java.lang.Math.abs(r8.getY() - r7.f3120g) <= r7.f3115b) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L7d
            r2 = 0
            if (r0 == r1) goto L3b
            r3 = 2
            if (r0 == r3) goto L18
            r8 = 3
            if (r0 == r8) goto L12
            goto L93
        L12:
            r7.f3116c = r2
        L14:
            r7.f3117d = r2
            goto L93
        L18:
            float r0 = r8.getX()
            float r3 = r7.f3119f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3115b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L14
            float r8 = r8.getY()
            float r0 = r7.f3120g
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = r7.f3115b
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L93
            goto L14
        L3b:
            r7.f3116c = r2
            float r0 = r8.getX()
            float r3 = r7.f3119f
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3115b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L5f
            float r0 = r8.getY()
            float r3 = r7.f3120g
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.f3115b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L61
        L5f:
            r7.f3117d = r2
        L61:
            boolean r0 = r7.f3117d
            if (r0 == 0) goto L14
            long r3 = r8.getEventTime()
            long r5 = r7.f3118e
            long r3 = r3 - r5
            int r8 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r8
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L14
            c.d.h.g.a$a r8 = r7.f3114a
            if (r8 == 0) goto L14
            r8.d()
            goto L14
        L7d:
            r7.f3116c = r1
            r7.f3117d = r1
            long r2 = r8.getEventTime()
            r7.f3118e = r2
            float r0 = r8.getX()
            r7.f3119f = r0
            float r8 = r8.getY()
            r7.f3120g = r8
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.h.g.a.a(android.view.MotionEvent):boolean");
    }

    public boolean b() {
        return this.f3116c;
    }

    public void c() {
        this.f3116c = false;
        this.f3117d = false;
    }
}

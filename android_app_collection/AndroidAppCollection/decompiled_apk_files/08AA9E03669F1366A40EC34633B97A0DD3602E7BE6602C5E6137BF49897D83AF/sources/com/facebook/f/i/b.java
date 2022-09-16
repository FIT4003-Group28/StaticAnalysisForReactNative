package com.facebook.f.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.f.b.b;
import com.facebook.f.e.r;
import com.facebook.f.e.s;
import com.facebook.f.h.b;
/* compiled from: DraweeHolder.java */
/* loaded from: classes.dex */
public class b<DH extends com.facebook.f.h.b> implements s {

    /* renamed from: d  reason: collision with root package name */
    private DH f2482d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2479a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2480b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2481c = true;
    private com.facebook.f.h.a e = null;
    private final com.facebook.f.b.b f = com.facebook.f.b.b.a();

    public void a(Context context) {
    }

    public static <DH extends com.facebook.f.h.b> b<DH> a(DH dh, Context context) {
        b<DH> bVar = new b<>(dh);
        bVar.a(context);
        return bVar;
    }

    public b(DH dh) {
        if (dh != null) {
            a((b<DH>) dh);
        }
    }

    public void b() {
        this.f.a(b.a.ON_HOLDER_ATTACH);
        this.f2480b = true;
        i();
    }

    public void c() {
        this.f.a(b.a.ON_HOLDER_DETACH);
        this.f2480b = false;
        i();
    }

    public boolean a(MotionEvent motionEvent) {
        if (!j()) {
            return false;
        }
        return this.e.a(motionEvent);
    }

    @Override // com.facebook.f.e.s
    public void a(boolean z) {
        if (this.f2481c == z) {
            return;
        }
        this.f.a(z ? b.a.ON_DRAWABLE_SHOW : b.a.ON_DRAWABLE_HIDE);
        this.f2481c = z;
        i();
    }

    @Override // com.facebook.f.e.s
    public void a() {
        if (this.f2479a) {
            return;
        }
        com.facebook.common.e.a.d(com.facebook.f.b.b.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
        this.f2480b = true;
        this.f2481c = true;
        i();
    }

    private void a(s sVar) {
        Drawable f = f();
        if (f instanceof r) {
            ((r) f).a(sVar);
        }
    }

    public void a(com.facebook.f.h.a aVar) {
        boolean z = this.f2479a;
        if (z) {
            h();
        }
        if (j()) {
            this.f.a(b.a.ON_CLEAR_OLD_CONTROLLER);
            this.e.a((com.facebook.f.h.b) null);
        }
        this.e = aVar;
        if (this.e != null) {
            this.f.a(b.a.ON_SET_CONTROLLER);
            this.e.a(this.f2482d);
        } else {
            this.f.a(b.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            g();
        }
    }

    public com.facebook.f.h.a d() {
        return this.e;
    }

    public void a(DH dh) {
        this.f.a(b.a.ON_SET_HIERARCHY);
        boolean j = j();
        a((s) null);
        this.f2482d = (DH) i.a(dh);
        Drawable a2 = this.f2482d.a();
        a(a2 == null || a2.isVisible());
        a(this);
        if (j) {
            this.e.a(dh);
        }
    }

    public DH e() {
        return (DH) i.a(this.f2482d);
    }

    public Drawable f() {
        if (this.f2482d == null) {
            return null;
        }
        return this.f2482d.a();
    }

    private void g() {
        if (this.f2479a) {
            return;
        }
        this.f.a(b.a.ON_ATTACH_CONTROLLER);
        this.f2479a = true;
        if (this.e == null || this.e.i() == null) {
            return;
        }
        this.e.k();
    }

    private void h() {
        if (!this.f2479a) {
            return;
        }
        this.f.a(b.a.ON_DETACH_CONTROLLER);
        this.f2479a = false;
        if (!j()) {
            return;
        }
        this.e.l();
    }

    private void i() {
        if (this.f2480b && this.f2481c) {
            g();
        } else {
            h();
        }
    }

    public String toString() {
        return h.a(this).a("controllerAttached", this.f2479a).a("holderAttached", this.f2480b).a("drawableVisible", this.f2481c).a("events", this.f.toString()).toString();
    }

    private boolean j() {
        return this.e != null && this.e.i() == this.f2482d;
    }
}

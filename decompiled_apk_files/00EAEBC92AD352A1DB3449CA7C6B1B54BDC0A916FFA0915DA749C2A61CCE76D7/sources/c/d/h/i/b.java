package c.d.h.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import c.d.d.d.h;
import c.d.d.d.i;
import c.d.h.b.b;
import c.d.h.e.u;
import c.d.h.e.v;
import c.d.h.h.b;
/* loaded from: classes.dex */
public class b<DH extends c.d.h.h.b> implements v {

    /* renamed from: d  reason: collision with root package name */
    private DH f3126d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3123a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3124b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3125c = true;

    /* renamed from: e  reason: collision with root package name */
    private c.d.h.h.a f3127e = null;

    /* renamed from: f  reason: collision with root package name */
    private final c.d.h.b.b f3128f = c.d.h.b.b.a();

    public b(DH dh) {
        if (dh != null) {
            a((b<DH>) dh);
        }
    }

    public static <DH extends c.d.h.h.b> b<DH> a(DH dh, Context context) {
        b<DH> bVar = new b<>(dh);
        bVar.a(context);
        return bVar;
    }

    private void a(v vVar) {
        Drawable d2 = d();
        if (d2 instanceof u) {
            ((u) d2).a(vVar);
        }
    }

    private void h() {
        if (this.f3123a) {
            return;
        }
        this.f3128f.a(b.a.ON_ATTACH_CONTROLLER);
        this.f3123a = true;
        c.d.h.h.a aVar = this.f3127e;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.f3127e.c();
    }

    private void i() {
        if (!this.f3124b || !this.f3125c) {
            j();
        } else {
            h();
        }
    }

    private void j() {
        if (!this.f3123a) {
            return;
        }
        this.f3128f.a(b.a.ON_DETACH_CONTROLLER);
        this.f3123a = false;
        if (!e()) {
            return;
        }
        this.f3127e.a();
    }

    @Override // c.d.h.e.v
    public void a() {
        if (this.f3123a) {
            return;
        }
        c.d.d.e.a.c(c.d.h.b.b.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f3127e)), toString());
        this.f3124b = true;
        this.f3125c = true;
        i();
    }

    public void a(Context context) {
    }

    public void a(c.d.h.h.a aVar) {
        boolean z = this.f3123a;
        if (z) {
            j();
        }
        if (e()) {
            this.f3128f.a(b.a.ON_CLEAR_OLD_CONTROLLER);
            this.f3127e.a((c.d.h.h.b) null);
        }
        this.f3127e = aVar;
        if (this.f3127e != null) {
            this.f3128f.a(b.a.ON_SET_CONTROLLER);
            this.f3127e.a(this.f3126d);
        } else {
            this.f3128f.a(b.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            h();
        }
    }

    public void a(DH dh) {
        this.f3128f.a(b.a.ON_SET_HIERARCHY);
        boolean e2 = e();
        a((v) null);
        i.a(dh);
        this.f3126d = dh;
        Drawable a2 = this.f3126d.a();
        a(a2 == null || a2.isVisible());
        a(this);
        if (e2) {
            this.f3127e.a(dh);
        }
    }

    @Override // c.d.h.e.v
    public void a(boolean z) {
        if (this.f3125c == z) {
            return;
        }
        this.f3128f.a(z ? b.a.ON_DRAWABLE_SHOW : b.a.ON_DRAWABLE_HIDE);
        this.f3125c = z;
        i();
    }

    public boolean a(MotionEvent motionEvent) {
        if (!e()) {
            return false;
        }
        return this.f3127e.a(motionEvent);
    }

    public c.d.h.h.a b() {
        return this.f3127e;
    }

    public DH c() {
        DH dh = this.f3126d;
        i.a(dh);
        return dh;
    }

    public Drawable d() {
        DH dh = this.f3126d;
        if (dh == null) {
            return null;
        }
        return dh.a();
    }

    public boolean e() {
        c.d.h.h.a aVar = this.f3127e;
        return aVar != null && aVar.b() == this.f3126d;
    }

    public void f() {
        this.f3128f.a(b.a.ON_HOLDER_ATTACH);
        this.f3124b = true;
        i();
    }

    public void g() {
        this.f3128f.a(b.a.ON_HOLDER_DETACH);
        this.f3124b = false;
        i();
    }

    public String toString() {
        h.b a2 = h.a(this);
        a2.a("controllerAttached", this.f3123a);
        a2.a("holderAttached", this.f3124b);
        a2.a("drawableVisible", this.f3125c);
        a2.a("events", this.f3128f.toString());
        return a2.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: azvb  reason: default package */
/* loaded from: classes2.dex */
public abstract class azvb extends azyq {
    public int f;

    public azvb(int i) {
        super(0L, azyp.a);
        this.f = i;
    }

    public Object c(Object obj) {
        return obj;
    }

    public abstract Object d();

    public Throwable e(Object obj) {
        azuk azukVar = obj instanceof azuk ? (azuk) obj : null;
        if (azukVar == null) {
            return null;
        }
        return azukVar.b;
    }

    public abstract azqy f();

    public void g(Object obj, Throwable th) {
        throw null;
    }

    public final void q(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            azqc.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ayno.h(f().getContext(), new azux("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [azqy, azrj] */
    @Override // java.lang.Runnable
    public final void run() {
        Object p;
        Object p2;
        boolean z = azuy.a;
        azyr azyrVar = this.h;
        try {
            azxp azxpVar = (azxp) f();
            ?? r2 = azxpVar.b;
            Object obj = azxpVar.d;
            azrd context = r2.getContext();
            Object b = azyi.b(context, obj);
            if (b != azyi.a) {
                azup.c(r2, context);
            }
            azrd context2 = r2.getContext();
            Object d = d();
            Throwable e = e(d);
            azvo azvoVar = (e != null || !banl.i(this.f)) ? null : (azvo) context2.get(azvo.b);
            if (azvoVar != null && !azvoVar.l()) {
                Throwable h = azvoVar.h();
                g(d, h);
                if (azuy.b) {
                    h = azyf.a(h, r2);
                }
                r2.resumeWith(azqj.p(h));
            } else if (e != null) {
                r2.resumeWith(azqj.p(e));
            } else {
                r2.resumeWith(c(d));
            }
            azyi.c(context, b);
            try {
                azyrVar.f();
                p2 = azqm.a;
            } catch (Throwable th) {
                p2 = azqj.p(th);
            }
            q(null, azqh.a(p2));
        } catch (Throwable th2) {
            try {
                azyrVar.f();
                p = azqm.a;
            } catch (Throwable th3) {
                p = azqj.p(th3);
            }
            q(th2, azqh.a(p));
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: azub  reason: default package */
/* loaded from: classes2.dex */
public final class azub extends azvb implements azua, azrj {
    public final azqy a;
    public final azrd b;
    public final azts c;
    public final aztu d;
    public azve e;

    public azub(azqy azqyVar, int i) {
        super(i);
        this.a = azqyVar;
        boolean z = azuy.a;
        this.b = azqyVar.getContext();
        this.c = ayme.g();
        this.d = ayme.f(aztx.a);
    }

    public static final void m(azsc azscVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + azscVar + ", already has " + obj).toString());
    }

    private static final Object s(azwb azwbVar, Object obj, int i) {
        boolean z;
        if (obj instanceof azuk) {
            boolean z2 = azuy.a;
        } else if (banl.i(i) && ((z = azwbVar instanceof aztz)) && !z) {
            return new azuj(obj, (aztz) azwbVar, null, 16);
        }
        return obj;
    }

    @Override // defpackage.azua
    public final void a() {
        boolean z = azuy.a;
        r(this.f);
    }

    public final Object b() {
        return this.d.a;
    }

    @Override // defpackage.azvb
    public final Object c(Object obj) {
        return obj instanceof azuj ? ((azuj) obj).a : obj;
    }

    @Override // defpackage.azvb
    public final Object d() {
        return b();
    }

    @Override // defpackage.azvb
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        azqy azqyVar = this.a;
        return (!azuy.b || !(azqyVar instanceof azrj)) ? e : azyf.a(e, (azrj) azqyVar);
    }

    @Override // defpackage.azvb
    public final azqy f() {
        return this.a;
    }

    @Override // defpackage.azvb
    public final void g(Object obj, Throwable th) {
        aztu aztuVar = this.d;
        while (true) {
            Object obj2 = aztuVar.a;
            if (obj2 instanceof azwb) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof azuk) {
                return;
            }
            if (obj2 instanceof azuj) {
                azuj azujVar = (azuj) obj2;
                if (azujVar.d == null) {
                    Object obj3 = azujVar.a;
                    aztz aztzVar = azujVar.e;
                    azsc azscVar = azujVar.b;
                    Object obj4 = azujVar.c;
                    if (this.d.c(obj2, new azuj(obj3, aztzVar, th))) {
                        aztz aztzVar2 = azujVar.e;
                        if (aztzVar2 != null) {
                            p(aztzVar2);
                        }
                        azsc azscVar2 = azujVar.b;
                        return;
                    }
                } else {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
            } else if (this.d.c(obj2, new azuj(obj2, null, th, 14))) {
                return;
            }
        }
    }

    @Override // defpackage.azrj
    public final azrj getCallerFrame() {
        azqy azqyVar = this.a;
        if (azqyVar instanceof azrj) {
            return (azrj) azqyVar;
        }
        return null;
    }

    @Override // defpackage.azqy
    public final azrd getContext() {
        return this.b;
    }

    @Override // defpackage.azrj
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h() {
        azve azveVar = this.e;
        if (azveVar == null) {
            return;
        }
        azveVar.d();
        this.e = azwa.a;
    }

    public final void i() {
        if (!k()) {
            h();
        }
    }

    public final void j() {
        azqy azqyVar = this.a;
        Throwable th = null;
        azxp azxpVar = azqyVar instanceof azxp ? (azxp) azqyVar : null;
        if (azxpVar != null) {
            aztu aztuVar = azxpVar.e;
            while (true) {
                Object obj = aztuVar.a;
                if (obj == azxq.b) {
                    if (azxpVar.e.c(azxq.b, this)) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    if (!azxpVar.e.c(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(azst.a("Inconsistent state ", obj).toString());
                }
            }
        }
        if (th == null) {
            return;
        }
        h();
        l(th);
    }

    public final boolean k() {
        return this.f == 2 && ((azxp) this.a).e.a != null;
    }

    public final void l(Throwable th) {
        Object obj;
        boolean z;
        aztu aztuVar = this.d;
        do {
            obj = aztuVar.a;
            if (!(obj instanceof azwb)) {
                return;
            }
            z = obj instanceof aztz;
        } while (!this.d.c(obj, new azud(th, z)));
        aztz aztzVar = z ? (aztz) obj : null;
        if (aztzVar != null) {
            p(aztzVar);
        }
        i();
        r(this.f);
    }

    public final void n(Object obj, int i) {
        Object obj2;
        aztu aztuVar = this.d;
        do {
            obj2 = aztuVar.a;
            if (obj2 instanceof azwb) {
            } else if ((obj2 instanceof azud) && ((azud) obj2).a.b()) {
                return;
            } else {
                throw new IllegalStateException(azst.a("Already resumed, but proposed with update ", obj).toString());
            }
        } while (!this.d.c(obj2, s((azwb) obj2, obj, i)));
        i();
        r(i);
    }

    public final azyg o(Object obj) {
        Object obj2;
        aztu aztuVar = this.d;
        do {
            obj2 = aztuVar.a;
            if (obj2 instanceof azwb) {
            } else {
                boolean z = obj2 instanceof azuj;
                return null;
            }
        } while (!this.d.c(obj2, s((azwb) obj2, obj, this.f)));
        i();
        return azuc.a;
    }

    public final void p(aztz aztzVar) {
        try {
            aztzVar.b();
        } catch (Throwable th) {
            ayno.h(this.b, new azun(azst.a("Exception in invokeOnCancellation handler for ", this), th));
        }
    }

    @Override // defpackage.azqy
    public final void resumeWith(Object obj) {
        Throwable a = azqh.a(obj);
        if (a != null) {
            if (azuy.b) {
                a = azyf.a(a, this);
            }
            obj = new azuk(a);
        }
        n(obj, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CancellableContinuation(");
        sb.append(banl.l(this.a));
        sb.append("){");
        Object b = b();
        if (b instanceof azwb) {
            str = "Active";
        } else {
            str = b instanceof azud ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(banl.k(this));
        return sb.toString();
    }

    private final void r(int i) {
        azts aztsVar = this.c;
        do {
            int i2 = aztsVar.a;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = azuy.a;
                azqy azqyVar = this.a;
                if (!(azqyVar instanceof azxp) || banl.i(i) != banl.i(this.f)) {
                    banl.h(this, azqyVar, false);
                    return;
                }
                azur azurVar = ((azxp) azqyVar).a;
                azrd context = azqyVar.getContext();
                if (!azurVar.d(context)) {
                    azvg a = azwe.a.a();
                    if (a.h()) {
                        a.e(this);
                        return;
                    }
                    a.f(true);
                    try {
                        banl.h(this, this.a, true);
                        do {
                        } while (a.i());
                        return;
                    } catch (Throwable th) {
                        try {
                            q(th, null);
                            return;
                        } finally {
                            a.j();
                        }
                    }
                }
                azurVar.st(context, this);
                return;
            }
        } while (!this.c.c(0, 2));
    }
}

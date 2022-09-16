package defpackage;
/* compiled from: PG */
/* renamed from: azxp  reason: default package */
/* loaded from: classes2.dex */
public final class azxp extends azvb implements azrj, azqy {
    public final azur a;
    public final azqy b;
    public Object c;
    public final Object d;
    public final aztu e;

    public azxp(azur azurVar, azqy azqyVar) {
        super(-1);
        this.a = azurVar;
        this.b = azqyVar;
        this.c = azxq.a;
        this.d = azyi.a(getContext());
        this.e = ayme.f(null);
    }

    @Override // defpackage.azvb
    public final Object d() {
        Object obj = this.c;
        boolean z = azuy.a;
        this.c = azxq.a;
        return obj;
    }

    @Override // defpackage.azvb
    public final azqy f() {
        return this;
    }

    @Override // defpackage.azvb
    public final void g(Object obj, Throwable th) {
        if (!(obj instanceof azul)) {
            return;
        }
        azsc azscVar = ((azul) obj).a;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [azqy, azrj] */
    @Override // defpackage.azrj
    public final azrj getCallerFrame() {
        return this.b;
    }

    @Override // defpackage.azqy
    public final azrd getContext() {
        return this.b.getContext();
    }

    @Override // defpackage.azrj
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.azqy
    public final void resumeWith(Object obj) {
        azrd context = this.b.getContext();
        Object i = ayno.i(obj);
        if (this.a.d(context)) {
            this.c = i;
            this.f = 0;
            this.a.st(context, this);
            return;
        }
        boolean z = azuy.a;
        azvg a = azwe.a.a();
        if (a.h()) {
            this.c = i;
            this.f = 0;
            a.e(this);
            return;
        }
        a.f(true);
        try {
            azrd context2 = getContext();
            Object b = azyi.b(context2, this.d);
            this.b.resumeWith(obj);
            azyi.c(context2, b);
            do {
            } while (a.i());
        } catch (Throwable th) {
            try {
                q(th, null);
            } finally {
                a.j();
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + banl.l(this.b) + ']';
    }
}

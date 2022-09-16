package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: alhl  reason: default package */
/* loaded from: classes.dex */
public final class alhl extends albi {
    public final akze b;
    public final AtomicBoolean c;
    public final ayqf d;
    private final int e;
    private final Executor f;
    private aypg g;
    private final ayoi h;

    public alhl(Executor executor, akze akzeVar, int i, int i2, akzp akzpVar, String str, ayqf ayqfVar) {
        super(i);
        this.f = executor;
        this.b = akzeVar;
        this.e = i2;
        this.d = ayqfVar;
        ayoi ayoiVar = (ayoi) akzpVar.a.get(str);
        ayoiVar.getClass();
        this.h = ayoiVar;
        this.c = new AtomicBoolean();
    }

    @Override // defpackage.albi
    protected final void e() {
        this.g = this.h.ae(azpj.b(this.f)).X(azpj.b(this.f)).au(new alhk(this), new alhk(this, 3), new aypv() { // from class: alhj
            @Override // defpackage.aypv
            public final void a() {
                alhl.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.albi
    public final void f() {
        aypg aypgVar = this.g;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
    }

    @Override // defpackage.albu
    public final albv g() {
        ayqi.c((AtomicReference) this.h.ag(1L).at(new alhk(this, 1), new alhk(this, 2)));
        return this.c.get() ? albv.a : albv.a(this.e);
    }
}

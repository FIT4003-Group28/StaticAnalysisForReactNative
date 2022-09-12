package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aqrp  reason: default package */
/* loaded from: classes2.dex */
public class aqrp {
    public final aqck a;
    private final dehq c;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final crzo<aqcj> d = new crzo<>();

    public aqrp(dehq dehqVar, aqcl aqclVar, auur auurVar) {
        this.c = dehqVar;
        this.a = aqclVar.a(auurVar);
    }

    public final crzm<aqcj> a() {
        return this.d.a;
    }

    public final void b() {
        if (!this.b.compareAndSet(false, true)) {
            return;
        }
        degp q = degp.q(this.c.c(new Callable(this) { // from class: aqrn
            private final aqrp a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                aqrp aqrpVar = this.a;
                aqcj a = aqrpVar.a.a();
                aqrpVar.b.compareAndSet(true, false);
                return a;
            }
        }));
        final crzo<aqcj> crzoVar = this.d;
        crzoVar.getClass();
        deha.q(q, bvqj.b(new bvqg(crzoVar) { // from class: aqro
            private final crzo a;

            {
                this.a = crzoVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.b((aqcj) obj);
            }
        }), this.c);
    }
}

package defpackage;

import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kuw  reason: default package */
/* loaded from: classes.dex */
public final class kuw implements kuu {
    public final kus a;
    private final btrm b;
    private final kvd c;
    private final AtomicBoolean d = new AtomicBoolean();

    public kuw(btrm btrmVar, ktw ktwVar, ktx ktxVar, ktz ktzVar, crzm crzmVar, Executor executor) {
        this.b = btrmVar;
        final AtomicReference atomicReference = new AtomicReference(ddlj.i);
        this.a = new kut(ktwVar, ktxVar, ktzVar, new dbty(atomicReference) { // from class: kuv
            private final AtomicReference a;

            {
                this.a = atomicReference;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.get();
            }
        });
        this.c = new kvd(atomicReference, crzmVar, executor);
    }

    @Override // defpackage.kuu
    public final void a() {
        if (!this.d.getAndSet(true)) {
            btrm btrmVar = this.b;
            kvd kvdVar = this.c;
            dceq a = dcet.a();
            a.b(GmmCarProjectionStateEvent.class, new kve(GmmCarProjectionStateEvent.class, kvdVar, bvrj.CURRENT));
            btrmVar.g(kvdVar, a.a());
            kvd kvdVar2 = this.c;
            kvdVar2.a.d(kvdVar2.c, kvdVar2.b);
        }
    }

    @Override // defpackage.kuu
    public final void b() {
        if (this.d.getAndSet(false)) {
            kvd kvdVar = this.c;
            kvdVar.a.c(kvdVar.c);
            this.b.a(this.c);
        }
    }
}

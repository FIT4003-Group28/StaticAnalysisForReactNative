package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ajin  reason: default package */
/* loaded from: classes.dex */
public abstract class ajin implements akad {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public ajin(Executor executor) {
        this(executor, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aqtb a(Object obj);

    @Override // defpackage.akad
    public final void b(Object obj, akac akacVar) {
        aqtb a2 = a(obj);
        if (a2 != null) {
            akacVar.a(ajhh.a(a2));
        }
    }

    @Override // defpackage.akad
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.akad
    public final ampt e() {
        return new ampt() { // from class: ajim
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                return (obj == null || ajin.this.a(obj) == null) ? false : true;
            }
        };
    }

    public ajin(Executor executor, boolean z) {
        if (b.compareAndSet(false, true)) {
            aohk.e = z;
            executor.execute(qvl.e);
            executor.execute(qvl.j);
        }
    }
}

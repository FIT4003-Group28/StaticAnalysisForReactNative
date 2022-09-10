package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqcb  reason: default package */
/* loaded from: classes2.dex */
public final class aqcb {
    public dehn<dcdc<ctyy>> a;
    @dzsi
    public dcdc<dehn<dbsg<ctyy>>> b;
    private final dxio<aqbo> c;
    private final bvrb d;
    private final dcdc<Integer> e;

    public aqcb(dxio<aqbo> dxioVar, bvrb bvrbVar, dcdc<Integer> dcdcVar) {
        this.d = bvrbVar;
        this.c = dxioVar;
        this.e = dcdcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dehn<dcdc<ctyy>> a() {
        dehn<dcdc<ctyy>> b;
        dccx dccxVar = new dccx();
        dcdc<Integer> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dccxVar.g(this.c.a().g(dcdcVar.get(i).intValue()));
        }
        dcdc<dehn<dbsg<ctyy>>> f = dccxVar.f();
        this.b = f;
        degy n = deha.n(f);
        Callable callable = new Callable(this) { // from class: aqca
            private final aqcb a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                aqcb aqcbVar = this.a;
                dccx dccxVar2 = new dccx();
                dcdc<dehn<dbsg<ctyy>>> dcdcVar2 = aqcbVar.b;
                if (dcdcVar2 == null) {
                    return dccxVar2.f();
                }
                int size2 = dcdcVar2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dbsg<ctyy> dbsgVar = dcdcVar2.get(i2).get();
                    if (dbsgVar.a()) {
                        dccxVar2.g(dbsgVar.b());
                    } else {
                        throw new Exception("Failed to load all account contexts.");
                    }
                }
                return dccxVar2.f();
            }
        };
        Executor g = this.d.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g);
        b = n.b(callable, g);
        this.a = b;
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        dcdc<dehn<dbsg<ctyy>>> dcdcVar = this.b;
        if (dcdcVar == null) {
            return;
        }
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).cancel(true);
        }
        this.b = null;
    }
}

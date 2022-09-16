package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crzj  reason: default package */
/* loaded from: classes.dex */
public final class crzj<V> extends crzn<V> {
    private final List<crzi<?>> a;
    private final Executor b;
    private boolean c;

    public crzj(dbty<V> dbtyVar, Executor executor, crzm<?>... crzmVarArr) {
        super(dbtyVar);
        this.c = false;
        ArrayList arrayList = new ArrayList(crzmVarArr.length);
        for (crzm<?> crzmVar : crzmVarArr) {
            arrayList.add(new crzi(crzmVar));
        }
        this.a = arrayList;
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crzg
    protected final void i() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            for (crzi<?> crziVar : this.a) {
                crzp<T> crzpVar = new crzp(this) { // from class: crzh
                    private final crzj a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        crzj crzjVar = this.a;
                        if (crzjVar.k()) {
                            crzjVar.o();
                        }
                    }
                };
                Executor executor = this.b;
                synchronized (crziVar) {
                    if (crziVar.b == null) {
                        crziVar.b = crzpVar;
                    } else {
                        throw new IllegalStateException("Cannot start already started combining observable.");
                    }
                }
                crziVar.a.e(crzpVar, executor);
            }
        }
    }
}

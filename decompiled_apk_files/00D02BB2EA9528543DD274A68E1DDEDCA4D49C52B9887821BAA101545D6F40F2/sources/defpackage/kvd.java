package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvd  reason: default package */
/* loaded from: classes.dex */
public final class kvd {
    public final crzm<Boolean> a;
    public final Executor b;
    public final crzp<Boolean> c = new kvc(this);
    private final AtomicReference<ddlj> d;

    public kvd(AtomicReference<ddlj> atomicReference, crzm<Boolean> crzmVar, Executor executor) {
        this.d = atomicReference;
        this.a = crzmVar;
        this.b = executor;
    }

    public final void a(dbrn<ddlj, ddlj> dbrnVar) {
        ddlj ddljVar;
        do {
            ddljVar = this.d.get();
        } while (!this.d.compareAndSet(ddljVar, dbrnVar.a(ddljVar)));
    }
}

package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azdw  reason: default package */
/* loaded from: classes2.dex */
public final class azdw extends azdm {
    final Callable b;
    final aypw c;

    public azdw(ayok ayokVar, Callable callable, aypw aypwVar) {
        super(ayokVar);
        this.b = callable;
        this.c = aypwVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        try {
            Object call = this.b.call();
            ayrd.b(call, "The initialSupplier returned a null value");
            this.a.az(new azdv(ayomVar, call, this.c));
        } catch (Throwable th) {
            ayqj.h(th, ayomVar);
        }
    }
}

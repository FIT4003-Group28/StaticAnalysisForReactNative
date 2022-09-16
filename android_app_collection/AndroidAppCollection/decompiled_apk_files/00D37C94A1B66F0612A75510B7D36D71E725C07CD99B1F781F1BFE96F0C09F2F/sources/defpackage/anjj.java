package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anjj  reason: default package */
/* loaded from: classes.dex */
public final class anjj extends anil {
    private anji c;

    public anjj(amub amubVar, boolean z, Executor executor, aniq aniqVar) {
        super(amubVar, z, false);
        this.c = new anjg(this, aniqVar, executor);
        r();
    }

    @Override // defpackage.anil
    public final void g(int i, Object obj) {
    }

    @Override // defpackage.anie
    protected final void m() {
        anji anjiVar = this.c;
        if (anjiVar != null) {
            anjiVar.h();
        }
    }

    @Override // defpackage.anil
    public final void q() {
        anji anjiVar = this.c;
        if (anjiVar != null) {
            anjiVar.f();
        }
    }

    @Override // defpackage.anil
    public final void s(int i) {
        super.s(i);
        if (i == 1) {
            this.c = null;
        }
    }

    public anjj(amub amubVar, boolean z, Executor executor, Callable callable) {
        super(amubVar, z, false);
        this.c = new anjh(this, callable, executor);
        r();
    }
}

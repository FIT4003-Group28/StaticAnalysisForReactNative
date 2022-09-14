package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deiu  reason: default package */
/* loaded from: classes.dex */
public final class deiu extends dehm {
    final /* synthetic */ deiv a;
    private final Callable b;

    public deiu(deiv deivVar, Callable callable) {
        this.a = deivVar;
        dbsk.s(callable);
        this.b = callable;
    }

    @Override // defpackage.dehm
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.dehm
    public final Object c() {
        return this.b.call();
    }

    @Override // defpackage.dehm
    public final boolean d() {
        return this.a.isDone();
    }

    @Override // defpackage.dehm
    public final void f(Object obj, Throwable th) {
        if (th == null) {
            this.a.j(obj);
        } else {
            this.a.k(th);
        }
    }
}

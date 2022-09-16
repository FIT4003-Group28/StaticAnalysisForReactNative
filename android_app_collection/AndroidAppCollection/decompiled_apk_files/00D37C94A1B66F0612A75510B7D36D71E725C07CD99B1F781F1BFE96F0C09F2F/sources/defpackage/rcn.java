package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rcn  reason: default package */
/* loaded from: classes4.dex */
public final class rcn {
    public final Context a;
    public final rcd b;
    public final rcf c;
    public rve d;
    public rve e;
    private final Executor f;

    public rcn(Context context, Executor executor, rcd rcdVar, rcf rcfVar) {
        this.a = context;
        this.f = executor;
        this.b = rcdVar;
        this.c = rcfVar;
    }

    public static dnw a(rve rveVar, dnw dnwVar) {
        return !rveVar.k() ? dnwVar : (dnw) rveVar.g();
    }

    public final rve b(Callable callable) {
        rve a = rwd.a(this.f, callable);
        a.o(this.f, new ruw() { // from class: rcj
            @Override // defpackage.ruw
            public final void c(Exception exc) {
                rcn rcnVar = rcn.this;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                rcnVar.b.c(2025, -1L, exc);
            }
        });
        return a;
    }
}

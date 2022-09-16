package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rcd  reason: default package */
/* loaded from: classes4.dex */
public final class rcd {
    public static volatile dno a = dno.UNKNOWN;
    private final Context b;
    private final Executor c;
    private final rve d;
    private final boolean e;

    public rcd(Context context, Executor executor, rve rveVar, boolean z) {
        this.b = context;
        this.c = executor;
        this.d = rveVar;
        this.e = z;
    }

    public static rcd a(final Context context, Executor executor, final boolean z) {
        return new rcd(context, executor, rwd.a(executor, new Callable() { // from class: rcc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new rcy(context, true != z ? "" : "GLAS");
            }
        }), z);
    }

    private final void g(final int i, long j, Exception exc, String str, String str2) {
        if (!this.e) {
            this.d.b(this.c, rcb.a);
            return;
        }
        final dnm a2 = dnp.a();
        String packageName = this.b.getPackageName();
        a2.copyOnWrite();
        dnp.i((dnp) a2.instance, packageName);
        a2.copyOnWrite();
        dnp.c((dnp) a2.instance, j);
        dno dnoVar = a;
        a2.copyOnWrite();
        dnp.h((dnp) a2.instance, dnoVar);
        if (exc != null) {
            String b = amqs.b(exc);
            a2.copyOnWrite();
            dnp.d((dnp) a2.instance, b);
            String name = exc.getClass().getName();
            a2.copyOnWrite();
            dnp.e((dnp) a2.instance, name);
        }
        if (str2 != null) {
            a2.copyOnWrite();
            dnp.f((dnp) a2.instance, str2);
        }
        if (str != null) {
            a2.copyOnWrite();
            dnp.g((dnp) a2.instance, str);
        }
        this.d.b(this.c, new rui() { // from class: rca
            @Override // defpackage.rui
            public final Object a(rve rveVar) {
                dnm dnmVar = dnm.this;
                int i2 = i;
                dno dnoVar2 = rcd.a;
                if (rveVar.k()) {
                    rcx a3 = ((rcy) rveVar.g()).a(((dnp) dnmVar.mo39build()).toByteArray());
                    a3.b = i2;
                    a3.a();
                    return true;
                }
                return false;
            }
        });
    }

    public final void b(int i, String str) {
        g(i, 0L, null, null, str);
    }

    public final void c(int i, long j, Exception exc) {
        g(i, j, exc, null, null);
    }

    public final void d(int i, long j) {
        g(i, j, null, null, null);
    }

    public final void e(int i, long j, String str) {
        g(i, j, null, null, str);
    }

    public final void f(int i, long j, String str) {
        g(i, j, null, str, null);
    }
}

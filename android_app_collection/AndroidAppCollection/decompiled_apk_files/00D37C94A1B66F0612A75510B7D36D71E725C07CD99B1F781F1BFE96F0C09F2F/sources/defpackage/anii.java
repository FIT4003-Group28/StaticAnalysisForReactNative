package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anii  reason: default package */
/* loaded from: classes.dex */
public abstract class anii extends anjv implements Runnable {
    ankt a;
    Object b;

    public anii(ankt anktVar, Object obj) {
        anktVar.getClass();
        this.a = anktVar;
        obj.getClass();
        this.b = obj;
    }

    public static ankt h(ankt anktVar, ampg ampgVar, Executor executor) {
        ampgVar.getClass();
        anih anihVar = new anih(anktVar, ampgVar);
        anktVar.qY(anihVar, anlz.h(executor, anihVar));
        return anihVar;
    }

    public static ankt i(ankt anktVar, anir anirVar, Executor executor) {
        executor.getClass();
        anig anigVar = new anig(anktVar, anirVar);
        anktVar.qY(anigVar, anlz.h(executor, anigVar));
        return anigVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        String str;
        ankt anktVar = this.a;
        Object obj = this.b;
        String c = super.c();
        if (anktVar != null) {
            String valueOf = String.valueOf(anktVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj == null) {
            if (c == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            return c.length() != 0 ? valueOf2.concat(c) : new String(valueOf2);
        }
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf3).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    public abstract Object f(Object obj, Object obj2);

    public abstract void g(Object obj);

    @Override // defpackage.anie
    protected final void qu() {
        n(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ankt anktVar = this.a;
        Object obj = this.b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (anktVar == null);
        if (obj != null) {
            z = false;
        }
        if (isCancelled || z) {
            return;
        }
        this.a = null;
        if (anktVar.isCancelled()) {
            lV(anktVar);
            return;
        }
        try {
            try {
                Object f = f(obj, anlz.y(anktVar));
                this.b = null;
                g(f);
            } catch (Throwable th) {
                try {
                    e(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            e(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            e(e2);
        } catch (ExecutionException e3) {
            e(e3.getCause());
        }
    }
}

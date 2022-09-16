package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afxi  reason: default package */
/* loaded from: classes.dex */
final class afxi implements Runnable, yiw {
    final /* synthetic */ afxj a;
    private final Object b;
    private final Object c;
    private final yiw d;
    private Object e;

    public afxi(afxj afxjVar, Object obj, Object obj2, yiw yiwVar) {
        this.a = afxjVar;
        this.b = obj;
        this.c = obj2;
        this.d = yiwVar;
    }

    @Override // defpackage.yiw
    public final void a(Object obj, Exception exc) {
        this.d.a(this.b, exc);
    }

    @Override // defpackage.yiw
    public final void b(Object obj, Object obj2) {
        this.e = obj2;
        afxj afxjVar = this.a;
        if (afxjVar.a == null) {
            this.d.b(this.b, obj2);
            return;
        }
        Executor executor = afxjVar.b;
        if (executor != null) {
            executor.execute(this);
        } else {
            run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.b(this.b, this.a.a.b(this.e));
        } catch (IOException e) {
            this.a.c(this.b, this.c, this.d, e);
        } catch (zhy e2) {
            this.a.c(this.b, this.c, this.d, e2);
        }
    }
}

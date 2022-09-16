package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qvd  reason: default package */
/* loaded from: classes4.dex */
public final class qvd {
    public volatile Object a;
    public volatile qvb b;
    private final Executor c;

    public qvd(Looper looper, Object obj, String str) {
        this.c = new adk(looper, 2);
        qnm.n(obj, "Listener must not be null");
        this.a = obj;
        qnm.l(str);
        this.b = new qvb(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(final qvc qvcVar) {
        qnm.n(qvcVar, "Notifier must not be null");
        this.c.execute(new Runnable() { // from class: qva
            @Override // java.lang.Runnable
            public final void run() {
                qvd qvdVar = qvd.this;
                qvc qvcVar2 = qvcVar;
                Object obj = qvdVar.a;
                if (obj == null) {
                    qvcVar2.b();
                    return;
                }
                try {
                    qvcVar2.a(obj);
                } catch (RuntimeException e) {
                    qvcVar2.b();
                    throw e;
                }
            }
        });
    }
}

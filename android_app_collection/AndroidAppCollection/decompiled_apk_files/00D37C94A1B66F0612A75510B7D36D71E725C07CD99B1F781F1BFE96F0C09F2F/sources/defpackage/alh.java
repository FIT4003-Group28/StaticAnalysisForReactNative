package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: alh  reason: default package */
/* loaded from: classes.dex */
public final class alh implements Runnable {
    private final Callable a;
    private final ji b;
    private final Handler c;

    public alh(Handler handler, Callable callable, ji jiVar) {
        this.a = callable;
        this.b = jiVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ala alaVar;
        try {
            alaVar = ((aky) this.a).call();
        } catch (Exception unused) {
            alaVar = null;
        }
        this.c.post(new alg(this.b, alaVar));
    }
}

package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alk  reason: default package */
/* loaded from: classes2.dex */
public final class alk implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ alm c;

    public alk(Callable callable, Handler handler, alm almVar) {
        this.a = callable;
        this.b = handler;
        this.c = almVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        alg algVar;
        try {
            algVar = ((ala) this.a).call();
        } catch (Exception unused) {
            algVar = null;
        }
        this.b.post(new alj(this, algVar));
    }
}

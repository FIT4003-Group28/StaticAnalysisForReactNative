package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpcy  reason: default package */
/* loaded from: classes5.dex */
public final class cpcy implements Runnable {
    final /* synthetic */ cpcx a;
    final /* synthetic */ Callable b;

    public cpcy(cpcx cpcxVar, Callable callable) {
        this.a = cpcxVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.t(this.b.call());
        } catch (Exception e) {
            this.a.u(e);
        } catch (Throwable th) {
            this.a.u(new RuntimeException(th));
        }
    }
}

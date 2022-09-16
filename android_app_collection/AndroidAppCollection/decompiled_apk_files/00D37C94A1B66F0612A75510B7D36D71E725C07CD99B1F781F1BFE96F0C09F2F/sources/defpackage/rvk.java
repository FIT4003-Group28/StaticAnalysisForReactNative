package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rvk  reason: default package */
/* loaded from: classes4.dex */
public final class rvk implements Runnable {
    final /* synthetic */ rvj a;
    final /* synthetic */ Callable b;

    public rvk(rvj rvjVar, Callable callable) {
        this.a = rvjVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.t(this.b.call());
        } catch (Exception e) {
            this.a.s(e);
        } catch (Throwable th) {
            this.a.s(new RuntimeException(th));
        }
    }
}

package defpackage;

import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: azyn  reason: default package */
/* loaded from: classes2.dex */
public class azyn extends azvj {
    private final azyl b;

    public azyn(int i, int i2, long j) {
        this.b = new azyl(i, i2, j);
    }

    public void close() {
        this.b.close();
    }

    public final void e(Runnable runnable, azyr azyrVar, boolean z) {
        runnable.getClass();
        try {
            this.b.a(runnable, azyrVar, z);
        } catch (RejectedExecutionException unused) {
            azuz.b.l(azyl.g(runnable, azyrVar));
        }
    }

    @Override // defpackage.azur
    public final void st(azrd azrdVar, Runnable runnable) {
        azrdVar.getClass();
        try {
            azyl.e(this.b, runnable);
        } catch (RejectedExecutionException unused) {
            azuz.b.st(azrdVar, runnable);
        }
    }

    @Override // defpackage.azur
    public String toString() {
        return super.toString() + "[scheduler = " + this.b + ']';
    }
}

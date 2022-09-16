package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: brs  reason: default package */
/* loaded from: classes2.dex */
final class brs implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bru b;
    final /* synthetic */ bwk c;

    public brs(bru bruVar, bwk bwkVar, String str) {
        this.b = bruVar;
        this.c = bwkVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bru bruVar;
        try {
            try {
                adz adzVar = (adz) this.c.get();
                if (adzVar != null) {
                    bqf a = bqf.a();
                    int i = bru.j;
                    String.format("%s returned a %s result.", this.b.c.d, adzVar);
                    a.d(new Throwable[0]);
                    this.b.i = adzVar;
                } else {
                    bqf.a();
                    bqf.e(bru.a, String.format("%s returned a null result. Treating it as a failure.", this.b.c.d), new Throwable[0]);
                }
                bruVar = this.b;
            } catch (InterruptedException e) {
                e = e;
                bqf.a();
                bqf.e(bru.a, String.format("%s failed because it threw an exception/error", this.a), e);
                bruVar = this.b;
            } catch (CancellationException e2) {
                bqf.a();
                int i2 = bru.j;
                String.format("%s was cancelled", this.a);
                bqf.f(e2);
                bruVar = this.b;
            } catch (ExecutionException e3) {
                e = e3;
                bqf.a();
                bqf.e(bru.a, String.format("%s failed because it threw an exception/error", this.a), e);
                bruVar = this.b;
            }
            bruVar.a();
        } catch (Throwable th) {
            this.b.a();
            throw th;
        }
    }
}

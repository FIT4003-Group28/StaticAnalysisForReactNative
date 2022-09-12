package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsc  reason: default package */
/* loaded from: classes.dex */
public final class bsc implements Callable<Void> {
    final /* synthetic */ bsh a;

    public bsc(bsh bshVar) {
        this.a = bshVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        synchronized (this.a) {
            bsh bshVar = this.a;
            if (bshVar.c != null) {
                bshVar.e();
                if (this.a.d()) {
                    this.a.a();
                    this.a.d = 0;
                }
            }
        }
        return null;
    }
}

package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aniv  reason: default package */
/* loaded from: classes.dex */
public final class aniv implements Callable {
    final /* synthetic */ anjd a;
    final /* synthetic */ vnz b;

    public aniv(anjd anjdVar, vnz vnzVar) {
        this.a = anjdVar;
        this.b = vnzVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vnz vnzVar = this.b;
        anjb anjbVar = this.a.b.a;
        Closeable[] closeableArr = vnzVar.a;
        for (int i = 0; i <= 0; i++) {
            anjbVar.a(closeableArr[i], anjk.a);
        }
        return null;
    }

    public final String toString() {
        return this.b.toString();
    }
}

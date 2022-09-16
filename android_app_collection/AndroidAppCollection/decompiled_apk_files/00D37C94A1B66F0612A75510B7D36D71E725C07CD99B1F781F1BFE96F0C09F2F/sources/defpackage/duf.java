package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: duf  reason: default package */
/* loaded from: classes3.dex */
public final class duf implements Callable {
    private final dtq a;
    private final aopa b;

    public duf(dtq dtqVar, aopa aopaVar) {
        this.a = dtqVar;
        this.b = aopaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Future future = this.a.j;
        if (future != null) {
            future.get();
        }
        dnw dnwVar = this.a.i;
        if (dnwVar != null) {
            try {
                synchronized (this.b) {
                    this.b.mo38mergeFrom(dnwVar.toByteArray(), aoos.a());
                }
                return null;
            } catch (aopx | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}

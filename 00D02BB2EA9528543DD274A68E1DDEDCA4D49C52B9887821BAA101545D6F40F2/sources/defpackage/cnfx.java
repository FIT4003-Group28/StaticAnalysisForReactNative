package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfx  reason: default package */
/* loaded from: classes5.dex */
final class cnfx implements Callable<Boolean> {
    final /* synthetic */ cngn a;

    public cnfx(cngn cngnVar) {
        this.a = cngnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.a.a.endBatchEdit());
    }
}

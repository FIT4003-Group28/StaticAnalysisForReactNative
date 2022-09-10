package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfz  reason: default package */
/* loaded from: classes5.dex */
final class cnfz implements Callable<Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ cngn b;

    public cnfz(cngn cngnVar, int i) {
        this.b = cngnVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.b.a.clearMetaKeyStates(this.a));
    }
}

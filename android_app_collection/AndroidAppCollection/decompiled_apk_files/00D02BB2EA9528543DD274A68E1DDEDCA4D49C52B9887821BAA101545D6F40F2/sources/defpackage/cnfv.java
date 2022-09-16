package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfv  reason: default package */
/* loaded from: classes5.dex */
final class cnfv implements Callable<Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ cngn b;

    public cnfv(cngn cngnVar, int i) {
        this.b = cngnVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.b.a.performContextMenuAction(this.a));
    }
}

package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfw  reason: default package */
/* loaded from: classes5.dex */
final class cnfw implements Callable<Boolean> {
    final /* synthetic */ cngn a;

    public cnfw(cngn cngnVar) {
        this.a = cngnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.a.a.beginBatchEdit());
    }
}

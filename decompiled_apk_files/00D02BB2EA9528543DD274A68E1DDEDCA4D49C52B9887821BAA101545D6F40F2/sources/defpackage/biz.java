package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: biz  reason: default package */
/* loaded from: classes3.dex */
final class biz implements Callable<bjw<bis>> {
    final /* synthetic */ bis a;

    public biz(bis bisVar) {
        this.a = bisVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ bjw<bis> call() {
        return new bjw<>(this.a);
    }
}

package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnga  reason: default package */
/* loaded from: classes5.dex */
final class cnga implements Callable<Boolean> {
    final /* synthetic */ boolean a;
    final /* synthetic */ cngn b;

    public cnga(cngn cngnVar, boolean z) {
        this.b = cngnVar;
        this.a = z;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.b.a.reportFullscreenMode(this.a));
    }
}

package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngg  reason: default package */
/* loaded from: classes5.dex */
final class cngg implements Callable<Integer> {
    final /* synthetic */ int a;
    final /* synthetic */ cngn b;

    public cngg(cngn cngnVar, int i) {
        this.b = cngnVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.b.a.getCursorCapsMode(this.a));
    }
}

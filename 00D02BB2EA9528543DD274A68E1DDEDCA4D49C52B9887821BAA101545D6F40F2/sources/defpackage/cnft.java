package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnft  reason: default package */
/* loaded from: classes5.dex */
final class cnft implements Callable<Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cngn c;

    public cnft(cngn cngnVar, int i, int i2) {
        this.c = cngnVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.c.a.setSelection(this.a, this.b));
    }
}

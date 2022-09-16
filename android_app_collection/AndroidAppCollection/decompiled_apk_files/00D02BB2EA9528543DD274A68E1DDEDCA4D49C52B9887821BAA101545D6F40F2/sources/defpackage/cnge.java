package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnge  reason: default package */
/* loaded from: classes5.dex */
final class cnge implements Callable<CharSequence> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cngn c;

    public cnge(cngn cngnVar, int i, int i2) {
        this.c = cngnVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ CharSequence call() {
        return this.c.a.getTextAfterCursor(this.a, this.b);
    }
}

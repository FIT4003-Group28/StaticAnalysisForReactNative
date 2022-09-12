package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngd  reason: default package */
/* loaded from: classes5.dex */
final class cngd implements Callable<CharSequence> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ cngn c;

    public cngd(cngn cngnVar, int i, int i2) {
        this.c = cngnVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ CharSequence call() {
        return this.c.a.getTextBeforeCursor(this.a, this.b);
    }
}

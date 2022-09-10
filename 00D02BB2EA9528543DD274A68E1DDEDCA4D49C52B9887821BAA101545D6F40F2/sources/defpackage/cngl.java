package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngl  reason: default package */
/* loaded from: classes5.dex */
final class cngl implements Callable<Boolean> {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ int b;
    final /* synthetic */ cngn c;

    public cngl(cngn cngnVar, CharSequence charSequence, int i) {
        this.c = cngnVar;
        this.a = charSequence;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.c.a.commitText(this.a, this.b));
    }
}

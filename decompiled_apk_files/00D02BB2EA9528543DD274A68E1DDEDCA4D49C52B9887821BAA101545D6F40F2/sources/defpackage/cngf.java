package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cngf  reason: default package */
/* loaded from: classes5.dex */
final class cngf implements Callable<CharSequence> {
    final /* synthetic */ int a;
    final /* synthetic */ cngn b;

    public cngf(cngn cngnVar, int i) {
        this.b = cngnVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ CharSequence call() {
        return this.b.a.getSelectedText(this.a);
    }
}

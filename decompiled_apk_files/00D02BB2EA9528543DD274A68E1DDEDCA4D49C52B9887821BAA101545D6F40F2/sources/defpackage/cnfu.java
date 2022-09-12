package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: cnfu  reason: default package */
/* loaded from: classes5.dex */
final class cnfu implements Callable<Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ cngn b;

    public cnfu(cngn cngnVar, int i) {
        this.b = cngnVar;
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.b.a.performEditorAction(this.a));
    }
}

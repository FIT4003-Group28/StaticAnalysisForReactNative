package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: zll  reason: default package */
/* loaded from: classes7.dex */
final class zll implements Callable<Boolean> {
    final /* synthetic */ afwo a;
    final /* synthetic */ afwm b;

    public zll(afwo afwoVar, afwm afwmVar) {
        this.a = afwoVar;
        this.b = afwmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.a.d(this.b));
    }
}

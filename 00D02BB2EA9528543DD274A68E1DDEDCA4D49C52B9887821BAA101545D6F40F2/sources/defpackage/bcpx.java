package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bcpx  reason: default package */
/* loaded from: classes3.dex */
final class bcpx implements Callable<Boolean> {
    final /* synthetic */ bcpz a;

    public bcpx(bcpz bcpzVar) {
        this.a = bcpzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        this.a.al.g();
        return true;
    }
}

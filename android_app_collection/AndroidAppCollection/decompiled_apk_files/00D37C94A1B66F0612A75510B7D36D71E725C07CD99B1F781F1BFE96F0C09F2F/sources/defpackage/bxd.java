package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bxd  reason: default package */
/* loaded from: classes2.dex */
final class bxd implements Callable {
    final /* synthetic */ bwx a;

    public bxd(bwx bwxVar) {
        this.a = bwxVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return new bxt(this.a);
    }
}

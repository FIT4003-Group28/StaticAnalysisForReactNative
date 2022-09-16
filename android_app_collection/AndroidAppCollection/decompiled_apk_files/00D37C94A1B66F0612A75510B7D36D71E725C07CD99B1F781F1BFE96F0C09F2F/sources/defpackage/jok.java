package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jok  reason: default package */
/* loaded from: classes3.dex */
final class jok implements Callable {
    final String a;
    final /* synthetic */ jol b;

    public jok(jol jolVar, String str) {
        this.b = jolVar;
        zgh.m(str);
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((agrf) this.b.b.get()).a().i().c(this.a);
    }
}

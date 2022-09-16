package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rmh  reason: default package */
/* loaded from: classes4.dex */
final class rmh implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ rki b;

    public rmh(rki rkiVar, String str) {
        this.b = rkiVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.b.a.w();
        return this.b.a.j().q(this.a);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: bvqb  reason: default package */
/* loaded from: classes4.dex */
final class bvqb<T> implements degu<T> {
    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        dbue.b(th);
        throw new bvqc(th);
    }

    @Override // defpackage.degu
    public final void b(T t) {
    }
}

package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: bufj  reason: default package */
/* loaded from: classes4.dex */
final class bufj implements btzc {
    final Future<?> a;

    public bufj(Future<?> future) {
        this.a = future;
    }

    @Override // defpackage.btzc
    public final boolean a() {
        return this.a.cancel(true);
    }
}

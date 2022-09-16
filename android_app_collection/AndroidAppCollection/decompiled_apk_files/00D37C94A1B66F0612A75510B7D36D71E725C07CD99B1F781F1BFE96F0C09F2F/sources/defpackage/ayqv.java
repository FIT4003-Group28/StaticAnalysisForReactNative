package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: ayqv  reason: default package */
/* loaded from: classes2.dex */
public final class ayqv implements aypv {
    final Future a;

    public ayqv(Future future) {
        this.a = future;
    }

    @Override // defpackage.aypv
    public final void a() {
        this.a.get();
    }
}

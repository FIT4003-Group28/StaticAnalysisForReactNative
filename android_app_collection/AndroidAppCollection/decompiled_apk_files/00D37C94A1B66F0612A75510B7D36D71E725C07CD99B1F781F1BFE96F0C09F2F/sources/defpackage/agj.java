package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agj  reason: default package */
/* loaded from: classes.dex */
final class agj {
    static final agj a = new agj(null, null);
    final Runnable b;
    final Executor c;
    agj next;

    public agj(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

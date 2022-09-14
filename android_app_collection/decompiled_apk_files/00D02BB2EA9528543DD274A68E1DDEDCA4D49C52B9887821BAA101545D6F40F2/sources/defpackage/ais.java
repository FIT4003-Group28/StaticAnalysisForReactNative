package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ais  reason: default package */
/* loaded from: classes2.dex */
final class ais {
    static final ais a = new ais(null, null);
    final Runnable b;
    final Executor c;
    ais next;

    public ais(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

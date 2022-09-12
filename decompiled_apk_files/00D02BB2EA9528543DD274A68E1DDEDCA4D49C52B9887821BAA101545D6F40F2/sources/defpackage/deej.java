package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deej  reason: default package */
/* loaded from: classes.dex */
final class deej {
    static final deej a = new deej(null, null);
    final Runnable b;
    final Executor c;
    deej next;

    public deej(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

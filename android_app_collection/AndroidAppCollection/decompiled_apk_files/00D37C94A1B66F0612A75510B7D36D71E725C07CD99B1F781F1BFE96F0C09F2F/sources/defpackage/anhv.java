package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anhv  reason: default package */
/* loaded from: classes.dex */
final class anhv {
    static final anhv a = new anhv();
    final Runnable b;
    final Executor c;
    anhv next;

    public anhv() {
        this.b = null;
        this.c = null;
    }

    public anhv(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}

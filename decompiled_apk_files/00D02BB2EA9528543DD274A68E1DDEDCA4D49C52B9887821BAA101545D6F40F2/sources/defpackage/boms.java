package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: boms  reason: default package */
/* loaded from: classes3.dex */
public final class boms implements Runnable {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    private final ache b;

    public boms(ache acheVar) {
        this.b = acheVar;
    }

    public static void a(bvrb bvrbVar, ache acheVar) {
        bvrbVar.a(new boms(acheVar), bvrj.BACKGROUND_THREADPOOL, a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.t(false);
    }
}

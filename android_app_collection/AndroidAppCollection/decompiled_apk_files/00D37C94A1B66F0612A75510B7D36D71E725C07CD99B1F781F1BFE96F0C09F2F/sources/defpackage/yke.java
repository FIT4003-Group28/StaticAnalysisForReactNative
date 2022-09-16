package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yke  reason: default package */
/* loaded from: classes4.dex */
public final class yke {
    private final Executor a;
    private final Runnable b;
    private final yjt c;

    public yke(Executor executor, yjt yjtVar, Runnable runnable) {
        this.a = executor;
        this.c = yjtVar;
        this.b = runnable;
    }

    public final yjy a(amfb amfbVar, aoqu aoquVar) {
        return new yjy(this.a, this.c, this.b, amfbVar, aoquVar);
    }

    public final ykd b(azqb azqbVar) {
        return new ykd(this.a, this.c, this.b, azqbVar);
    }
}

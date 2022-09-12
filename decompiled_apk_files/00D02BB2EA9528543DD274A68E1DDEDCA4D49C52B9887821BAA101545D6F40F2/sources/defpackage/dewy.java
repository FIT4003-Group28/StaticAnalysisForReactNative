package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dewy  reason: default package */
/* loaded from: classes6.dex */
public abstract class dewy {
    public abstract Context a();

    public abstract URI b();

    public abstract Executor c();

    public abstract Executor d();

    @dzsi
    public abstract ScheduledExecutorService e();

    @dzsi
    public abstract String f();

    public abstract dbty<Boolean> g();

    @dzsi
    public abstract dewp h();

    @dzsi
    public abstract Integer i();

    @dzsi
    public abstract Integer j();

    public abstract long k();

    public final String l() {
        return b().getHost();
    }

    public final int m() {
        return b().getPort();
    }
}

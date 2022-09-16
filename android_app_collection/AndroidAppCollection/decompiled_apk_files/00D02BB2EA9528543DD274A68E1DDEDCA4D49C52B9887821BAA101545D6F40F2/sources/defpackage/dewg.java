package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dewg  reason: default package */
/* loaded from: classes6.dex */
public final class dewg extends dewx {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public ScheduledExecutorService e;
    public String f;
    public dbty<Boolean> g;
    public dewp h;
    public Integer i;
    public Integer j;
    public Long k;

    @Override // defpackage.dewx
    public final void a(dbty<Boolean> dbtyVar) {
        if (dbtyVar != null) {
            this.g = dbtyVar;
            return;
        }
        throw new NullPointerException("Null recordNetworkMetricsToPrimes");
    }
}

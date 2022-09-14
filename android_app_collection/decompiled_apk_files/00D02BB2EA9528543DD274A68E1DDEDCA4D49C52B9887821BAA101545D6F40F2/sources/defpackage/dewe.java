package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dewe  reason: default package */
/* loaded from: classes6.dex */
public final class dewe extends dewi {
    public Context a;
    public cqat b;
    public dewz c;
    public Executor d;
    public Executor e;
    public Executor f;
    public ScheduledExecutorService g;
    public dexd h;
    public dbty<Boolean> i;
    public dbty<Boolean> j;
    public dbty<Boolean> k;
    public dbty<Long> l;

    @Override // defpackage.dewi
    public final void a(dbty<Boolean> dbtyVar) {
        if (dbtyVar != null) {
            this.k = dbtyVar;
            return;
        }
        throw new NullPointerException("Null recordBandwidthMetrics");
    }
}

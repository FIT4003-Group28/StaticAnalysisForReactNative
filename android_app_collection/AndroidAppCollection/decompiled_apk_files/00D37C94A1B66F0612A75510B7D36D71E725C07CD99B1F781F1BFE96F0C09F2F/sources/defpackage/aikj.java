package defpackage;

import android.os.ConditionVariable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aikj  reason: default package */
/* loaded from: classes.dex */
final class aikj extends afze {
    private final ConditionVariable a = new ConditionVariable();
    private final long b;

    public aikj(long j) {
        this.b = j;
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.open();
        return super.cancel(z);
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get() {
        this.a.open();
        return super.get();
    }

    @Override // defpackage.afze, defpackage.afzf
    public final void kW() {
        this.a.block(this.b);
    }

    @Override // defpackage.anie, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        this.a.open();
        return super.get(j, timeUnit);
    }
}

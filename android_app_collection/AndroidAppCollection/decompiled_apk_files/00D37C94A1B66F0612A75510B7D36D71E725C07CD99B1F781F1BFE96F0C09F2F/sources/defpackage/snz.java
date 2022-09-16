package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: snz  reason: default package */
/* loaded from: classes4.dex */
public final class snz extends anjz implements ankv {
    public volatile ankv a;

    public snz(ankt anktVar, ankv ankvVar) {
        super(anktVar);
        this.a = ankvVar;
        anktVar.qY(new Runnable() { // from class: sny
            @Override // java.lang.Runnable
            public final void run() {
                snz.this.a.cancel(false);
            }
        }, anjk.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}

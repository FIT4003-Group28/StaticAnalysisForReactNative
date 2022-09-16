package defpackage;

import android.util.Pair;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcr  reason: default package */
/* loaded from: classes5.dex */
public final class ctcr implements cswc<Boolean> {
    final /* synthetic */ ctct a;

    public ctcr(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // defpackage.cswc
    public final /* bridge */ /* synthetic */ void a(Boolean bool) {
        Boolean bool2 = bool;
        synchronized (this.a) {
            if (bool2.booleanValue()) {
                cswg.b();
                if (cswg.a(this.a.a)) {
                    cstd.a();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = Long.MAX_VALUE;
                    for (Map.Entry<ctyy, Pair<Integer, Long>> entry : this.a.u.entrySet()) {
                        if (((Long) entry.getValue().second).longValue() <= currentTimeMillis) {
                            HashSet<ctyy> hashSet = this.a.t;
                            if (hashSet == null || !hashSet.contains(entry.getKey())) {
                                this.a.K(entry.getKey()).d();
                            }
                            entry.setValue(new Pair<>((Integer) entry.getValue().first, Long.valueOf(TimeUnit.SECONDS.toMillis(((Integer) entry.getValue().first).intValue()) + currentTimeMillis)));
                        }
                        j = Math.min(((Long) entry.getValue().second).longValue(), j);
                    }
                    ctct ctctVar = this.a;
                    ctctVar.o.postDelayed(ctctVar.A, j - currentTimeMillis);
                }
            }
            this.a.u.clear();
        }
    }
}

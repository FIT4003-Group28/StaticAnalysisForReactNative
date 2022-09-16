package defpackage;

import android.util.Pair;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjwp  reason: default package */
/* loaded from: classes.dex */
public final class cjwp extends cjwn {
    private final List<Pair<ddda, Long>> b;

    public cjwp(cqat cqatVar) {
        super(cqatVar);
        this.b = dchl.a();
    }

    private final synchronized void e(ddda dddaVar, long j) {
        this.b.add(new Pair<>(dddaVar, Long.valueOf(j)));
    }

    @Override // defpackage.cjws
    public final void b(ddda dddaVar) {
        e(dddaVar, this.a.e());
    }

    @Override // defpackage.cjws
    public final synchronized void c(long j) {
        e(ddda.B, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(cjqy cjqyVar) {
        for (Pair<ddda, Long> pair : this.b) {
            a(cjqyVar, (ddda) pair.first, ((Long) pair.second).longValue());
        }
        this.b.clear();
    }
}

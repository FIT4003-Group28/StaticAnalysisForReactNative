package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qxt  reason: default package */
/* loaded from: classes4.dex */
public final class qxt implements qsz {
    final /* synthetic */ qta a;
    final /* synthetic */ rvh b;
    final /* synthetic */ qxu c;

    public qxt(qta qtaVar, rvh rvhVar, qxu qxuVar) {
        this.a = qtaVar;
        this.b = rvhVar;
        this.c = qxuVar;
    }

    @Override // defpackage.qsz
    public final void a(Status status) {
        if (status.c()) {
            this.b.b(this.c.a(this.a.h(TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.a(tjk.h(status));
    }
}

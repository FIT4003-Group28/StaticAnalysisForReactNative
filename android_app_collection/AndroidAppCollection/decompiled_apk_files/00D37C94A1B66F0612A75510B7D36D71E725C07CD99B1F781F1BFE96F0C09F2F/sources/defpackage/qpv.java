package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: qpv  reason: default package */
/* loaded from: classes4.dex */
public final class qpv implements qpz {
    final /* synthetic */ qpy a;

    public qpv(qpy qpyVar) {
        this.a = qpyVar;
    }

    @Override // defpackage.qpz
    public final void a(long j, int i, Object obj) {
        if (i != 0) {
            this.a.D.a(new IOException("storing session is timeout"));
        }
    }

    @Override // defpackage.qpz
    public final void b(long j) {
        this.a.D.b(null);
    }
}

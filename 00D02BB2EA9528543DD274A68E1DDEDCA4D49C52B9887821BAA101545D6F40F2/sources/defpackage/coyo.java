package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
/* compiled from: PG */
/* renamed from: coyo  reason: default package */
/* loaded from: classes5.dex */
final class coyo extends coyr {
    private final cpct a;

    public coyo(cpct cpctVar) {
        this.a = cpctVar;
    }

    @Override // defpackage.coys
    public final void b(Status status, PseudonymousIdToken pseudonymousIdToken) {
        cntf.b(status, pseudonymousIdToken, this.a);
    }

    @Override // defpackage.coys
    public final void c(Status status) {
        cntf.a(status, this.a);
    }

    @Override // defpackage.coys
    public final void d(Status status, long j) {
        cntf.b(status, Long.valueOf(j), this.a);
    }
}

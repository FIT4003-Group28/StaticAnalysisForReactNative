package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aodx  reason: default package */
/* loaded from: classes.dex */
public final class aodx extends aycd {
    final /* synthetic */ qsf a;

    public aodx(qsf qsfVar) {
        this.a = qsfVar;
    }

    @Override // defpackage.aycd
    public final Status a(int i) {
        if (this.a.d(i)) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (1st-party only) security policy");
    }
}

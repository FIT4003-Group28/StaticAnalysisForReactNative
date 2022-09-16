package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aycb  reason: default package */
/* loaded from: classes2.dex */
public final class aycb extends aycd {
    @Override // defpackage.aycd
    public final Status a(int i) {
        if (i == aycc.a) {
            return Status.b;
        }
        return Status.h.withDescription("Rejected by (internal-only) security policy");
    }
}

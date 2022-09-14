package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: denw  reason: default package */
/* loaded from: classes6.dex */
final class denw extends cnrs {
    final /* synthetic */ cpct a;
    final /* synthetic */ denx b;

    public denw(denx denxVar, cpct cpctVar) {
        this.b = denxVar;
        this.a = cpctVar;
    }

    @Override // defpackage.cnrt
    public final void b(Status status) {
        if (this.a.b(null)) {
            if (status.d()) {
                this.b.a.b.a(null);
            } else {
                this.b.a.b.c(deoq.statusToFirebaseException(status, "Indexing error, please try again."));
            }
        }
    }
}

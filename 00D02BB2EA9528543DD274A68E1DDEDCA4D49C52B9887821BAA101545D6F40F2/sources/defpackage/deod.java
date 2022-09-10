package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: deod  reason: default package */
/* loaded from: classes6.dex */
abstract class deod extends cntd<cmqj, Void> implements cnph<Status> {
    protected cpct<Void> e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cntd
    public final /* bridge */ /* synthetic */ void a(cmqj cmqjVar, cpct<Void> cpctVar) {
        this.e = cpctVar;
        b((cmqf) cmqjVar.L());
    }

    protected abstract void b(cmqf cmqfVar);

    @Override // defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Status status = (Status) obj;
        if (status.d()) {
            this.e.a(null);
        } else {
            this.e.c(deoq.statusToFirebaseException(status, "User Action indexing error, please try again."));
        }
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: anxe  reason: default package */
/* loaded from: classes.dex */
final class anxe extends quu {
    final /* synthetic */ rvh a;
    final /* synthetic */ anxf b;

    public anxe(anxf anxfVar, rvh rvhVar) {
        this.b = anxfVar;
        this.a = rvhVar;
    }

    @Override // defpackage.quv
    public final void a(Status status) {
        if (this.a.d(null)) {
            if (status.c()) {
                this.b.a.b.b(null);
            } else {
                this.b.a.b.a(ancv.m(status, "Indexing error, please try again."));
            }
        }
    }
}

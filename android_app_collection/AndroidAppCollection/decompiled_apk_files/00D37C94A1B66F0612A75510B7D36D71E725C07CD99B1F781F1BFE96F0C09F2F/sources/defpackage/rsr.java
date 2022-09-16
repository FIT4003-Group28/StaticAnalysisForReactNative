package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rsr  reason: default package */
/* loaded from: classes4.dex */
final class rsr implements rsb {
    private final Status a;
    private final qwd b;

    public rsr(Status status, qwd qwdVar) {
        this.a = status;
        this.b = qwdVar;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.qtb
    public final void b() {
        qwd qwdVar = this.b;
        if (qwdVar != null) {
            qwdVar.b();
        }
    }

    @Override // defpackage.rsb
    public final qwd c() {
        return this.b;
    }
}

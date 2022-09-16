package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayel  reason: default package */
/* loaded from: classes2.dex */
final class ayel implements ayeq {
    public Status a;
    final /* synthetic */ ayen b;
    public final axzl c;

    public ayel(ayen ayenVar, axzl axzlVar, byte[] bArr) {
        this.b = ayenVar;
        this.c = axzlVar;
    }

    @Override // defpackage.ayeq
    public final void a(Status status, ayep ayepVar, ayat ayatVar) {
        int i = aynn.a;
        axyy f = this.b.f();
        if (status.getCode() == Status.Code.CANCELLED && f != null && f.d()) {
            ayhk ayhkVar = new ayhk();
            this.b.e.b(ayhkVar);
            Status status2 = Status.f;
            String valueOf = String.valueOf(ayhkVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("ClientCall was cancelled at or after deadline. ");
            sb.append(valueOf);
            status = status2.a(sb.toString());
            ayatVar = new ayat();
        }
        this.b.b.execute(new ayej(this, status, ayatVar));
    }

    public final void b(Status status) {
        this.a = status;
        this.b.e.c(status);
    }

    @Override // defpackage.ayeq
    public final void c(ayat ayatVar) {
        int i = aynn.a;
        this.b.b.execute(new ayeh(this, ayatVar));
    }

    @Override // defpackage.aymn
    public final void d(aymm aymmVar) {
        int i = aynn.a;
        this.b.b.execute(new ayei(this, aymmVar));
    }

    @Override // defpackage.aymn
    public final void e() {
        if (this.b.a.a.a()) {
            return;
        }
        int i = aynn.a;
        this.b.b.execute(new ayek(this));
    }
}

package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfu  reason: default package */
/* loaded from: classes2.dex */
public final class ayfu extends aygi {
    public final ayad a;
    public final axyx b = axyx.b();
    final /* synthetic */ ayfv c;
    public final azqj[] d;

    public ayfu(ayfv ayfvVar, ayad ayadVar, azqj[] azqjVarArr, byte[] bArr, byte[] bArr2) {
        this.c = ayfvVar;
        this.a = ayadVar;
        this.d = azqjVarArr;
    }

    @Override // defpackage.aygi, defpackage.ayeo
    public final void b(ayhk ayhkVar) {
        if (this.a.a.f()) {
            ayhkVar.a("wait_for_ready");
        }
        super.b(ayhkVar);
    }

    @Override // defpackage.aygi, defpackage.ayeo
    public final void c(Status status) {
        super.c(status);
        synchronized (this.c.a) {
            ayfv ayfvVar = this.c;
            if (ayfvVar.e != null) {
                boolean remove = ayfvVar.g.remove(this);
                if (!this.c.b() && remove) {
                    ayfv ayfvVar2 = this.c;
                    ayfvVar2.b.c(ayfvVar2.d);
                    ayfv ayfvVar3 = this.c;
                    if (ayfvVar3.h != null) {
                        ayfvVar3.b.c(ayfvVar3.e);
                        this.c.e = null;
                    }
                }
            }
        }
        this.c.b.b();
    }

    @Override // defpackage.aygi
    protected final void p(Status status) {
        for (azqj azqjVar : this.d) {
            azqjVar.l(status);
        }
    }
}

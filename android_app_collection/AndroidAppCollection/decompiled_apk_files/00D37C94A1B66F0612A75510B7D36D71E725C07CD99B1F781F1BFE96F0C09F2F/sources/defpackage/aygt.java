package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygt  reason: default package */
/* loaded from: classes2.dex */
public final class aygt extends aykc {
    private boolean b;
    private final Status c;
    private final ayep d;
    private final azqj[] e;

    public aygt(Status status, ayep ayepVar, azqj[] azqjVarArr, byte[] bArr, byte[] bArr2) {
        aqxo.q(!status.f(), "error must not be OK");
        this.c = status;
        this.d = ayepVar;
        this.e = azqjVarArr;
    }

    @Override // defpackage.aykc, defpackage.ayeo
    public final void b(ayhk ayhkVar) {
        ayhkVar.b("error", this.c);
        ayhkVar.b("progress", this.d);
    }

    @Override // defpackage.aykc, defpackage.ayeo
    public final void m(ayeq ayeqVar) {
        aqxo.z(!this.b, "already started");
        this.b = true;
        for (azqj azqjVar : this.e) {
            azqjVar.l(this.c);
        }
        ayeqVar.a(this.c, this.d, new ayat());
    }

    public aygt(Status status, azqj[] azqjVarArr, byte[] bArr, byte[] bArr2) {
        this(status, ayep.PROCESSED, azqjVarArr, null, null);
    }
}

package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aygu  reason: default package */
/* loaded from: classes2.dex */
public final class aygu implements ayer {
    final Status a;
    private final ayep b;

    public aygu(Status status, ayep ayepVar) {
        aqxo.q(!status.f(), "error must not be OK");
        this.a = status;
        this.b = ayepVar;
    }

    @Override // defpackage.axzw
    public final axzs c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.ayer
    public final ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        return new aygt(this.a, this.b, azqjVarArr, null, null);
    }
}

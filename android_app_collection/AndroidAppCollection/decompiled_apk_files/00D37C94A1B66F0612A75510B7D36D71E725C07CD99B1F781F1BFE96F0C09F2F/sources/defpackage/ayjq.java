package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayjq  reason: default package */
/* loaded from: classes2.dex */
final class ayjq extends axzq {
    final ayjr b;

    public ayjq(ayjr ayjrVar) {
        this.b = ayjrVar;
    }

    @Override // defpackage.axzq
    public final axzp a() {
        axzo axzoVar = new axzo();
        axzoVar.a = this.b;
        aqxo.z(axzoVar.a != null, "config is not set");
        return new axzp(Status.b, axzoVar.a);
    }
}

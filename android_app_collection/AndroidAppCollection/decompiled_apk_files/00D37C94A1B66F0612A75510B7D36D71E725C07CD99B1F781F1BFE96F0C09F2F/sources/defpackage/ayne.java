package defpackage;

import io.grpc.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayne  reason: default package */
/* loaded from: classes2.dex */
public final class ayne extends aynd {
    private final aynl a;
    private final aynb b;

    public ayne(aynl aynlVar, aynb aynbVar) {
        this.a = aynlVar;
        this.b = aynbVar;
        if (aynlVar instanceof ayni) {
            ((ayni) aynlVar).d();
        }
    }

    @Override // defpackage.axzl
    public final void a(Status status, ayat ayatVar) {
        if (status.f()) {
            this.a.a();
        } else {
            this.a.b(status.g());
        }
    }

    @Override // defpackage.axzl
    public final void b(ayat ayatVar) {
    }

    @Override // defpackage.axzl
    public final void c(Object obj) {
        this.a.c(obj);
        aynb aynbVar = this.b;
        if (aynbVar.b) {
            aynbVar.e();
        }
    }

    @Override // defpackage.axzl
    public final void d() {
    }

    @Override // defpackage.aynd
    public final void q() {
        aynb aynbVar = this.b;
        if (aynbVar.a > 0) {
            aynbVar.e();
        }
    }
}

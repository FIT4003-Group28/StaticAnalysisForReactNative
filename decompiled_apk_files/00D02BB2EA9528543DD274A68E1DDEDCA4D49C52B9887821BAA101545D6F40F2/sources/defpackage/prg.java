package defpackage;
/* compiled from: PG */
/* renamed from: prg  reason: default package */
/* loaded from: classes7.dex */
final class prg implements bzmn {
    final /* synthetic */ prh a;

    public prg(prh prhVar) {
        this.a = prhVar;
    }

    @Override // defpackage.bzmn
    public final void PJ() {
    }

    @Override // defpackage.bzmn
    public final void PK() {
    }

    @Override // defpackage.bzmn
    public final void PL() {
        jdi jdiVar = this.a.b;
        if (jdiVar != null) {
            jdiVar.f();
        }
    }

    @Override // defpackage.bzmn
    public final void PM() {
        cjql cjqlVar;
        prh prhVar = this.a;
        cjtd cjtdVar = prhVar.e;
        if (cjtdVar != null && (cjqlVar = prhVar.f) != null) {
            prhVar.a.j(cjqlVar, cjtdVar);
        }
        jdi jdiVar = this.a.b;
        if (jdiVar != null) {
            jdiVar.f();
        }
    }

    @Override // defpackage.bzmn
    public final void PN(int i) {
        jdi jdiVar;
        if (i != 8 || (jdiVar = this.a.b) == null || !jdiVar.b()) {
            return;
        }
        this.a.b.f();
    }

    @Override // defpackage.bzmn
    public final void PO() {
    }
}

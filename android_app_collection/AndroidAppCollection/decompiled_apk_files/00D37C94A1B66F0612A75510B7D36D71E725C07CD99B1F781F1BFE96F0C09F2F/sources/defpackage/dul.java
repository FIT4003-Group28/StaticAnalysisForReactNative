package defpackage;
/* compiled from: PG */
/* renamed from: dul  reason: default package */
/* loaded from: classes3.dex */
public final class dul extends dux {
    public dul(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "VYCDm5duSbIrDVEzx16kZEv8WHHF/iAgG7tmpbyNz9JTUOZl7vOBiagQjgSGt6PD", "GcAXLTlOKYjjJu9S8Z1CR6e5L3N6/FK7qoEK2PqRVKU=", aopaVar, i, 3);
    }

    @Override // defpackage.dux
    protected final void a() {
        dtd dtdVar = new dtd((String) this.d.invoke(null, this.a.a, Boolean.valueOf(((Boolean) qdb.q.e()).booleanValue())));
        synchronized (this.g) {
            aopa aopaVar = this.g;
            long j = dtdVar.a;
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 4;
            dnwVar.g = j;
            aopa aopaVar2 = this.g;
            long j2 = dtdVar.b;
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            dnwVar3.c |= 4194304;
            dnwVar3.T = j2;
        }
    }
}

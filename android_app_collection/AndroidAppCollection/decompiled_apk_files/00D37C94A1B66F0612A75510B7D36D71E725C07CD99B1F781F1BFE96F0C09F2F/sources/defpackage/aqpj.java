package defpackage;
/* compiled from: PG */
/* renamed from: aqpj  reason: default package */
/* loaded from: classes2.dex */
public final class aqpj extends abga {
    public final aopa a;

    private aqpj() {
        aqpn aqpnVar = aqpn.a;
        throw null;
    }

    public aqpj(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    /* renamed from: b */
    public final aqpl a(aajl aajlVar) {
        return new aqpl((aqpn) this.a.mo39build(), aajlVar);
    }

    public final void c(aqpm aqpmVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqpn aqpnVar = (aqpn) aopaVar.instance;
        aqpn aqpnVar2 = aqpn.a;
        aqpmVar.getClass();
        aqpnVar.e = aqpmVar;
        aqpnVar.d = 7;
    }

    public final void d(Integer num) {
        aopa aopaVar = this.a;
        int intValue = num.intValue();
        aopaVar.copyOnWrite();
        aqpn aqpnVar = (aqpn) aopaVar.instance;
        aqpn aqpnVar2 = aqpn.a;
        aqpnVar.c |= 1024;
        aqpnVar.n = intValue;
    }
}

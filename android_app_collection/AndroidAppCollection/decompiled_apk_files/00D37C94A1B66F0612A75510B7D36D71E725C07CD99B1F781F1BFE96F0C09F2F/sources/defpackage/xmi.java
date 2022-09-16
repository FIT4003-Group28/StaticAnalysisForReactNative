package defpackage;
/* compiled from: PG */
/* renamed from: xmi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xmi implements ynj {
    public final /* synthetic */ xml a;
    private final /* synthetic */ int b;

    public /* synthetic */ xmi(xml xmlVar) {
        this.a = xmlVar;
    }

    public /* synthetic */ xmi(xml xmlVar, int i) {
        this.b = i;
        this.a = xmlVar;
    }

    @Override // defpackage.ynj
    public final void a(Object obj) {
        if (this.b == 0) {
            xml xmlVar = this.a;
            aabo aaboVar = (aabo) obj;
            if ((aaboVar.a().b & 64) == 0) {
                if ((aaboVar.a().b & 4) == 0) {
                    return;
                }
                aqbx aqbxVar = aaboVar.a().e;
                if (aqbxVar == null) {
                    aqbxVar = aqbx.a;
                }
                xmlVar.a.D(new acte(aqbxVar.e.I()));
                xmlVar.w(aqbxVar);
                return;
            }
            aqtb aqtbVar = aaboVar.a().i;
            if (aqtbVar == null) {
                aqtbVar = aqtb.a;
            }
            xmlVar.a.D(new acte(aqtbVar.e.I()));
            xmlVar.x(aqtbVar);
            return;
        }
        aabi aabiVar = (aabi) obj;
        this.a.lw(aabiVar.b(), aabiVar.a());
    }
}

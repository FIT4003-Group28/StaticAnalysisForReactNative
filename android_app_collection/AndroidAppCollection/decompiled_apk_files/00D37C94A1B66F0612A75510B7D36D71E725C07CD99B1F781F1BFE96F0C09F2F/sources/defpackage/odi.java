package defpackage;
/* compiled from: PG */
/* renamed from: odi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class odi implements ayqb {
    public final /* synthetic */ odl a;
    private final /* synthetic */ int b;

    public /* synthetic */ odi(odl odlVar, int i) {
        this.b = i;
        this.a = odlVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            odl odlVar = this.a;
            Boolean bool = (Boolean) obj;
            if (odlVar.h == bool.booleanValue()) {
                return;
            }
            odlVar.h = bool.booleanValue();
            odlVar.h();
            return;
        }
        odl odlVar2 = this.a;
        odlVar2.j = (awbn) obj;
        for (odj odjVar : odlVar2.e) {
            odjVar.oU();
        }
    }
}

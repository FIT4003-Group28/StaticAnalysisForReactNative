package defpackage;
/* compiled from: PG */
/* renamed from: off  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class off implements ayqb {
    public final /* synthetic */ ofg a;
    private final /* synthetic */ int b;

    public /* synthetic */ off(ofg ofgVar, int i) {
        this.b = i;
        this.a = ofgVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            ofg ofgVar = this.a;
            zbb zbbVar = (zbb) obj;
            boolean z = ofgVar.e;
            boolean z2 = ofgVar.f;
            boolean z3 = zbbVar instanceof zbe;
            ofgVar.e = z3;
            boolean z4 = zbbVar instanceof zbd;
            ofgVar.f = z4;
            if (z3 == z) {
                return;
            }
            if (z2 && z3) {
                return;
            }
            if ((z && z4) || !ofgVar.b.g() || ofgVar.b.f()) {
                return;
            }
            if (!ofgVar.e && ofgVar.b.d()) {
                return;
            }
            ofgVar.l(false);
            return;
        }
        ofg ofgVar2 = this.a;
        nza nzaVar = nza.UNFORCED;
        int ordinal = ((nza) obj).ordinal();
        if (ordinal == 1) {
            ofgVar2.m(true);
        } else if (ordinal != 2) {
        } else {
            ofgVar2.q(4, true);
        }
    }
}

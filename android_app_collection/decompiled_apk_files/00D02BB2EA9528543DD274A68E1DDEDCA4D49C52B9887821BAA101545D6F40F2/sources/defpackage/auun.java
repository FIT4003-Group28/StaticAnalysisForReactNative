package defpackage;
/* compiled from: PG */
/* renamed from: auun  reason: default package */
/* loaded from: classes.dex */
public class auun extends aujb {
    private final int c;
    private final dxio<ckcw> d;
    private final dxio<afzs> e;
    private final afzu f;

    public auun(aujd aujdVar, int i, dxio<ckcw> dxioVar, dxio<afzs> dxioVar2, afzu afzuVar) {
        super(aujdVar);
        this.c = i;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = afzuVar;
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return this.e.a().a();
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, @dzsi btlu btluVar) {
        dlgv dlgvVar;
        if (btluVar != null && btlu.i(btluVar) == btlt.GOOGLE) {
            afzu afzuVar = this.f;
            dlgn dlgnVar = dlfvVar.g;
            if (dlgnVar == null) {
                dlgnVar = dlgn.G;
            }
            if (dlgnVar.c == 27) {
                dlgvVar = (dlgv) dlgnVar.d;
            } else {
                dlgvVar = dlgv.c;
            }
            if ((dlgvVar.a & 1) != 0 && dlgvVar.b <= afzuVar.a(btluVar)) {
                ((ckco) this.d.a().a(ckht.aT)).a(this.c);
                return true;
            }
        }
        return false;
    }
}

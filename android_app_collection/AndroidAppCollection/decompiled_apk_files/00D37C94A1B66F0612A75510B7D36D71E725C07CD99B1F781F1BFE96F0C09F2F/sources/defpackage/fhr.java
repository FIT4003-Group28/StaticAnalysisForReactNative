package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: fhr  reason: default package */
/* loaded from: classes3.dex */
final class fhr implements geq {
    private final axnm a;
    private final tdq b;
    private final awmt c;
    private final awmt d;

    public fhr(axnm axnmVar, tdq tdqVar, awmt awmtVar, awmt awmtVar2) {
        this.a = axnmVar;
        this.b = tdqVar;
        this.c = awmtVar;
        this.d = awmtVar2;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        tcq a = tcs.a();
        a.f = this.b;
        tcs a2 = a.a();
        if (i != 2 || this.d == null) {
            if (i != 0 || this.c == null) {
                if (i != 1 || this.d == null) {
                    return aynr.f();
                }
                return ((tcu) this.a.get()).b(this.d, a2);
            }
            return ((tcu) this.a.get()).b(this.c, a2);
        }
        return ((tcu) this.a.get()).b(this.d, a2);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof fhr) {
            fhr fhrVar = (fhr) geqVar;
            if (Objects.equals(this.d, fhrVar.d) && Objects.equals(this.c, fhrVar.c)) {
                return true;
            }
        }
        return false;
    }
}

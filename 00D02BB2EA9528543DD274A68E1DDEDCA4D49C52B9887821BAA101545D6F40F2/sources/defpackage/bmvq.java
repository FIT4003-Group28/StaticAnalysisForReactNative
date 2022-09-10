package defpackage;
/* compiled from: PG */
/* renamed from: bmvq  reason: default package */
/* loaded from: classes3.dex */
final class bmvq implements bmtu {
    final /* synthetic */ bmwc a;

    public bmvq(bmwc bmwcVar) {
        this.a = bmwcVar;
    }

    @Override // defpackage.bmtu
    public final Boolean a() {
        boolean z = false;
        if (this.a.k().booleanValue() && (this.a.aq() || b().booleanValue() || this.a.ao() || this.a.E().booleanValue() || this.a.F().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtu
    public final Boolean b() {
        boolean z = false;
        if (this.a.k().booleanValue() && this.a.d.b() && !this.a.ar() && this.a.W().n()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmtu
    public final Boolean c() {
        ckgn ckgnVar = ckgn.ARE_YOU_HERE_NOW_QUESTION;
        bmwc bmwcVar = this.a;
        int i = bmwcVar.i;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = false;
            if (i2 == 0) {
                if (bmwcVar.d.b()) {
                    z = this.a.ap() ? true : this.a.W().m();
                }
                return Boolean.valueOf(!z);
            }
            if (i2 != 1 && i2 == 2) {
                return true;
            }
            return false;
        }
        throw null;
    }
}

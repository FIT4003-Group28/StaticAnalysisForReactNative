package defpackage;
/* renamed from: atfw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atfw implements cqlc {
    static final cqlc a = new atfw();

    private atfw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = athe.header;
        atnj w = atnaVar.w();
        dbsk.s(w);
        if (w.d().booleanValue()) {
            if (atnaVar.W().booleanValue()) {
                if (atnaVar.ab().booleanValue()) {
                    return cqrt.g(2131231702, ibl.m());
                }
                return cqrt.g(2131231702, iva.b(ibl.s(), ibl.b()));
            } else if (atnaVar.ab().booleanValue()) {
                return cqrt.g(2131231703, ibl.m());
            } else {
                return cqrt.g(2131231703, iva.b(ibl.s(), ibl.b()));
            }
        } else if (atnaVar.W().booleanValue()) {
            if (atnaVar.ab().booleanValue()) {
                return cqrt.g(2131231704, ibl.m());
            }
            return cqrt.g(2131231704, iva.b(ibl.s(), ibl.b()));
        } else if (atnaVar.ab().booleanValue()) {
            return cqrt.g(2131231705, ibl.m());
        } else {
            return cqrt.g(2131231705, iva.b(ibl.s(), ibl.b()));
        }
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

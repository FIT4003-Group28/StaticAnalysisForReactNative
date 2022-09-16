package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: atgg  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgg implements cqlc {
    static final cqlc a = new atgg();

    private atgg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = athe.header;
        if (atnaVar.W().booleanValue()) {
            if (atnaVar.ab().booleanValue()) {
                return cqrt.j(iup.f(R.raw.ic_alternate_route, cjxh.b(cjxf.SMALL), cjxh.b(cjxf.SMALL)), ibl.m());
            }
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cjxh.b(cjxf.SMALL), cjxh.b(cjxf.SMALL)), iva.b(ibl.s(), ibl.b()));
        } else if (atnaVar.ab().booleanValue()) {
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cqrp.d(36.0d), cqrp.d(36.0d)), ibl.m());
        } else {
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cqrp.d(36.0d), cqrp.d(36.0d)), iva.b(ibl.s(), ibl.b()));
        }
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

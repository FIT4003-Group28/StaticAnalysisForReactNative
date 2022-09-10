package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: atgh  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atgh implements cqlc {
    static final cqlc a = new atgh();

    private atgh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = athe.header;
        if (atnaVar.W().booleanValue()) {
            if (atnaVar.ab().booleanValue()) {
                return cqrt.j(iup.f(R.raw.ic_alternate_route, cjxh.b(cjxf.SMALL), cjxh.b(cjxf.SMALL)), ibl.ag());
            }
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cjxh.b(cjxf.SMALL), cjxh.b(cjxf.SMALL)), ibm.x());
        } else if (atnaVar.ab().booleanValue()) {
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cqrp.d(36.0d), cqrp.d(36.0d)), ibl.ag());
        } else {
            return cqrt.j(iup.f(R.raw.ic_alternate_route, cqrp.d(36.0d), cqrp.d(36.0d)), ibm.x());
        }
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

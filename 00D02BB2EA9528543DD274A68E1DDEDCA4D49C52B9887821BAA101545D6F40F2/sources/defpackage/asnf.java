package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asnf  reason: default package */
/* loaded from: classes2.dex */
public final class asnf extends cqiw<asun> {
    public static final /* synthetic */ int a = 0;
    private final cqtv b;
    private final float c;
    private final boolean d;

    public asnf() {
        this(cqrp.d(64.0d), 1.5f, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<asun> a() {
        cqtd f;
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.ch(this.b);
        cqmpVarArr[1] = cqgr.bw(17);
        cqmpVarArr[2] = cqgr.J(true);
        cqmpVarArr[3] = cqgr.cW(cqgr.q(asmt.a));
        cqmpVarArr[4] = cqgr.aI(asmw.a);
        cqlc cqlcVar = asmx.a;
        cqgq n = cqgr.n();
        Float valueOf = Float.valueOf(1.0f);
        n.f = valueOf;
        n.g = valueOf;
        n.f();
        n.d = 500;
        n.h = asmy.a;
        cqnf b = n.b();
        cqgq n2 = cqgr.n();
        Float valueOf2 = Float.valueOf(0.0f);
        n2.f = valueOf2;
        n2.g = valueOf2;
        n2.f();
        n2.d = 500;
        n2.i = asmz.a;
        cqmpVarArr[5] = cqjv.l(cqlcVar, b, n2.b());
        cqmpVarArr[6] = cqgr.gc(cqic.f(asna.a, new cqmp[0]), cqjv.n(asnb.a, cqmn.a(cqgr.ch(cqrp.d(56.0d)), cqgr.eD(2131231689)), cqmn.a(cqgr.ch(this.b), cqgr.eD(2131231621))), cqgr.bw(17), cqgr.eD(2131231621));
        cqmp[] cqmpVarArr2 = new cqmp[3];
        cqmpVarArr2[0] = cqjv.n(asnc.a, cqgr.ch(cqrp.d(48.0d)), cqgr.ch(cqsg.f(this.b, Float.valueOf(0.875f))));
        cqmpVarArr2[1] = cqgr.bw(17);
        if (this.d) {
            f = cqrt.f(R.drawable.dark_grey_circle);
        } else {
            f = cqrt.f(R.drawable.white_circle);
        }
        cqmpVarArr2[2] = cqgr.eE(f);
        cqmpVarArr[7] = cqgr.gc(cqmpVarArr2);
        cqmpVarArr[8] = cqgr.fY(cqjv.n(asnd.a, cqgr.ch(cqrp.d(56.0d)), cqgr.ch(this.b)), cqgr.bw(17), new cqmh(csaw.class, cqgr.bw(17), cqgr.ch(cqsg.f(this.b, Float.valueOf(this.c))), asva.b(asne.a), asva.c(asmu.a), asva.a(asmv.a)));
        return cqgr.fY(cqmpVarArr);
    }

    public asnf(cqtv cqtvVar, float f, boolean z) {
        this.b = cqtvVar;
        this.c = f;
        this.d = z;
    }
}

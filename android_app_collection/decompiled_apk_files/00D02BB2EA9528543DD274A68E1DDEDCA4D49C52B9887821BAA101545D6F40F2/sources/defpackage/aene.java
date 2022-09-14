package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aene  reason: default package */
/* loaded from: classes2.dex */
public final class aene extends cqiw<aenl> {
    public static final cqjg a = cqjg.a();
    public static final cqrp b = cqrp.f(7.0d);
    @dzsi
    private final cqmn<aenl> c;
    private final boolean d;

    public aene() {
        this(null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aenl> a() {
        cqmj<aenl> d = jgi.d(cqgr.aT(a), cqgr.fF(aemu.a), cqgr.x(ibm.b()), cqgr.aJ(49), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), jgi.e(cqrp.d(6.0d)), cqgr.fP(new aend(Integer.valueOf((int) R.string.HOTEL_CHECK_IN), this.d), aemv.a, new cqmp[0]), cqgr.fP(new aend(Integer.valueOf((int) R.string.HOTEL_CHECK_OUT), this.d), aemw.a, new cqmp[0]));
        cqmn<aenl> cqmnVar = this.c;
        if (cqmnVar != null) {
            d.g(cqmnVar);
        }
        return d;
    }

    public aene(@dzsi cqmn<aenl> cqmnVar, boolean z) {
        super(cqmnVar, Boolean.valueOf(z));
        this.c = cqmnVar;
        this.d = z;
    }
}

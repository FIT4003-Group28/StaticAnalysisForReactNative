package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdeg  reason: default package */
/* loaded from: classes4.dex */
public final class cdeg extends cqiw<cdei> {
    public static final cqrp a = cqrp.d(90.0d);
    public static final cqjg b = cqjg.a();
    public static final cqjg c = cqjg.a();
    public static final cqjg d = cqjg.a();
    public static final cqjg e = cqjg.a();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cdei cdeiVar, Context context, cqiv cqivVar) {
        cdei cdeiVar2 = cdeiVar;
        cdeh t = cdeiVar2.t();
        if (t != null) {
            cqivVar.a(new cdbw(), t);
        }
        for (cdfb cdfbVar : cdeiVar2.e()) {
            if (cdfbVar.c()) {
                cqivVar.a(new cdco(), cdfbVar);
            }
        }
        if (cdeiVar2.r().intValue() == 0) {
            cqivVar.a(new cdcd(), new cdbr());
        }
        cqivVar.a(new cdef(), cdeiVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdei> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.z(ibm.b()), cqgr.fP(new cdcc(), cdbk.a, new cqmp[0]), iue.i(new cqmp[0]), cqgr.fP(new cdbj(), cdbl.a, new cqmp[0]), cqgr.fY(cqgr.aF(cdbm.a), cqgr.cd(-1), cqgr.bp(-1), cqgr.gg(cqgr.bw(1), cqgr.bV(irh.b()), cqgr.ce(cqrp.d(48.0d)), cqgr.bq(cqrp.d(48.0d)), cqgr.aI(cdbn.a)), cqgr.fP(new gna(), cdbo.a, new cqmp[0]), jih.a(C(), cqgr.aR(Integer.valueOf((int) R.id.list_view)), cqqx.F(), cqqx.v(cdbp.a), cqgr.L(false), cqgr.P(false), cqgr.bp(-1), cqgr.cd(-1), cqgr.fu(false), cqgr.aF(cdbq.a))));
    }
}

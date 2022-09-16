package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxic  reason: default package */
/* loaded from: classes4.dex */
public final class bxic extends cqiw<bxoe> {
    public static final /* synthetic */ int a = 0;
    private static final cqkp b = new ixw().a();

    @Override // defpackage.cqiw
    protected final Type ND() {
        return bxoe.class;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bxoe bxoeVar, Context context, cqiv cqivVar) {
        bxnw j;
        bxnz h;
        bxoe bxoeVar2 = bxoeVar;
        if (i == 0) {
            bxnx c = bxoeVar2.c();
            if (!c.a().booleanValue()) {
                return;
            }
            bxfc bxfcVar = new bxfc();
            ixw ixwVar = new ixw();
            ixwVar.a = context.getResources().getString(R.string.SEARCH_DID_YOU_MEAN);
            ixwVar.c = false;
            cqivVar.a(bxfcVar, ixwVar.a());
            cqivVar.a(new oao(), b);
            bxoa b2 = c.b();
            if (b2 != null && b2.F().booleanValue()) {
                cqivVar.a(new bxjh(), b2);
            }
            if (c.c().isEmpty()) {
                return;
            }
            List<? extends bxoi> c2 = c.c();
            cqivVar.a(new bxjh(), c2.get(0));
            for (int i2 = 1; i2 < c2.size(); i2++) {
                cqivVar.a(new oao(), b);
                cqivVar.a(new bxjh(), c2.get(i2));
            }
        } else if (i == 1) {
            cqiw<bxoi> b3 = bxoeVar2.b();
            List<? extends bxoi> a2 = bxoeVar2.a();
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            jbf l = bxoeVar2.l();
            if (l != null) {
                cqivVar.a(new bxib(), l);
            }
            cqivVar.a(b3, a2.get(0));
            for (int i3 = 1; i3 < a2.size(); i3++) {
                cqivVar.a(new oao(), b);
                cqivVar.a(b3, a2.get(i3));
            }
            dksg dksgVar = dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
            bxod bxodVar = bxod.PARTIAL;
            int ordinal = bxoeVar2.d().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                cqivVar.a(new oao(), b);
                bxoi q = bxoeVar2.q();
                if (q == null) {
                    return;
                }
                cqivVar.a(new bxjh(), q);
                return;
            }
            int ordinal2 = bxoeVar2.r().ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 5) {
                    return;
                }
                cqivVar.a(new oao(), b);
                cqivVar.a(new bxhl(), bxoeVar2.s());
                return;
            }
            cqivVar.a(new bxhx(), bxoeVar2.e());
            bxhz bxhzVar = new bxhz();
            ixw ixwVar2 = new ixw();
            ixwVar2.a = context.getResources().getString(R.string.POOR_CONNECTION);
            ixwVar2.c = false;
            cqivVar.a(bxhzVar, ixwVar2.a());
            bxhz bxhzVar2 = new bxhz();
            ixw ixwVar3 = new ixw();
            ixwVar3.a = context.getResources().getString(R.string.SHOWING_LIMITED_RESULTS);
            ixwVar3.c = false;
            cqivVar.a(bxhzVar2, ixwVar3.a());
        } else if (i == 2) {
            bxoi f = bxoeVar2.f();
            if (f == null) {
                return;
            }
            cqivVar.a(new bxjh(), f);
        } else if (i == 3) {
            if (!bxoeVar2.m().booleanValue()) {
                return;
            }
            cqivVar.a(new bxjo(), bxoeVar2.i());
        } else if (i == 5) {
            if (!bxoeVar2.n().booleanValue() || (j = bxoeVar2.j()) == null) {
                return;
            }
            cqivVar.a(new bxjh(), j);
        } else if (i == 7 && bxoeVar2.g().booleanValue() && (h = bxoeVar2.h()) != null && !h.a().isEmpty()) {
            bxib bxibVar = new bxib();
            ixw ixwVar4 = new ixw();
            ixwVar4.a = context.getText(R.string.FROM_LOCATION_HISTORY_ATTRIBUTION);
            ixwVar4.c = false;
            cqivVar.a(bxibVar, ixwVar4.a());
            dcdc<bxoi> a3 = h.a();
            int size = a3.size();
            for (int i4 = 0; i4 < size; i4++) {
                cqivVar.a(new bxjh(), a3.get(i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bxoe> a() {
        return cqgr.gk(cqgr.cd(-1), cqgr.bp(-1), iuy.i(), cqgr.aF(bxhm.a), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.af(null), cqgr.gq(cqgr.aI(bxho.a), cqgr.bR(cqsg.d(irh.m(), cjyl.e())), cqgr.bG(cqsg.d(irh.m(), cjyl.e())), cqgr.dU(irh.h()), cqgr.eM(bxhp.a)), cjyl.d(cqgr.aI(bxhq.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(0)))), cjyl.d(cqgr.aI(bxhr.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(3)))), cjyl.d(cqgr.aF(cqjv.x(bxhs.a)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(1)))), cjyl.d(cqic.c(cqjv.x(bxht.a), new cqmp[0]), cqgr.fR(new bxjh(), bxhu.a, new cqmp[0])), cjyl.d(cqgr.aI(bxhv.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(5)))), cjyl.d(cqgr.aI(bxhw.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(7)))), cjyl.d(cqgr.aI(bxhn.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(D(2))))));
    }
}

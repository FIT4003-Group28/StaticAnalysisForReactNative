package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bqcu  reason: default package */
/* loaded from: classes4.dex */
public final class bqcu {
    public static final dcqe a = dcqe.c("bqcu");
    public final dcka<bqcv, bqcw> b = dbyv.N();
    public final List<bqcw> c = new ArrayList();

    public final dced<bqcv, bqcw> a() {
        return dced.k(this.b);
    }

    public final dcdc<bqcw> b() {
        return dcdc.r(this.c);
    }

    public final bqcv c(bqhj bqhjVar, @dzsi Long l) {
        dbsg dbsgVar;
        Iterator<bqcv> it = this.b.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                dbsgVar = dbpy.a;
                break;
            }
            bqcv next = it.next();
            if (l == null || !l.equals(next.b())) {
                if (akqq.v(next.a(), bqhjVar.a(), 1.0E-6d)) {
                    dbsgVar = dbsg.i(next);
                    break;
                }
            } else {
                dbsgVar = dbsg.i(next);
                break;
            }
        }
        if (dbsgVar.a()) {
            return (bqcv) dbsgVar.b();
        }
        if (l == null) {
            return bqcv.c(bqhjVar.a());
        }
        return bqcv.d(bqhjVar.a(), l.longValue());
    }
}

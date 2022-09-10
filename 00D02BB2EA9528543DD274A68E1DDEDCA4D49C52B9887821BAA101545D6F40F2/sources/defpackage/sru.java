package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: sru  reason: default package */
/* loaded from: classes7.dex */
final class sru implements degu<List<btzv>> {
    final /* synthetic */ srv a;

    public sru(srv srvVar) {
        this.a = srvVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.i(new RuntimeException(th));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<btzv> list) {
        srv srvVar = this.a;
        for (btzv btzvVar : list) {
            if (btzvVar != null) {
                Long a = btzvVar.a();
                Long b = btzvVar.b();
                if (a != null && b != null) {
                    ((ckcp) srvVar.b.a(ckeq.e)).a(b.longValue() - a.longValue());
                }
                Long q = btzvVar.q();
                Long r = btzvVar.r();
                if (q != null && r != null) {
                    ((ckcp) srvVar.b.a(ckeq.c)).a(r.longValue() - q.longValue());
                }
                Long s = btzvVar.s();
                Long t = btzvVar.t();
                if (s != null && t != null) {
                    ((ckcp) srvVar.b.a(ckeq.h)).a(t.longValue() - s.longValue());
                }
                Long u = btzvVar.u();
                Long v = btzvVar.v();
                if (u != null && v != null) {
                    ((ckcp) srvVar.b.a(ckeq.d)).a(v.longValue() - u.longValue());
                }
                Long w = btzvVar.w();
                if (w != null) {
                    ((ckcp) srvVar.b.a(ckeq.f)).a(w.longValue());
                    if (t != null && u != null) {
                        ((ckcp) srvVar.b.a(ckeq.g)).a((u.longValue() - t.longValue()) - w.longValue());
                    }
                }
            }
        }
    }
}

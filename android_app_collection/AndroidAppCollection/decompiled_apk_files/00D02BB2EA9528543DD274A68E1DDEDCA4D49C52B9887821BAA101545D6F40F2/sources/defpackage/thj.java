package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: thj  reason: default package */
/* loaded from: classes7.dex */
public final class thj<T> extends btrh<T> {
    public thj(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        tgk tgkVar;
        thh thhVar = (thh) this.a;
        srf srfVar = (srf) obj;
        if (srfVar.a == thhVar.b && !srfVar.b.b()) {
            b(thhVar.e.b, thhVar);
            thhVar.e.c = null;
            dbsg j = dbsg.j(srfVar.b.n());
            dcdc e = dcdc.e();
            if (j.a()) {
                amsy amsyVar = ((amte) j.b()).a;
                Activity activity = thhVar.a;
                dcdc<amvh> dcdcVar = thhVar.d;
                dccx F = dcdc.F();
                int i = amsyVar.i();
                dbsk.a(dcdcVar.size() == i);
                for (int i2 = 0; i2 < i; i2++) {
                    F.g(amvj.b(amsyVar.c(), activity, dcdcVar.get(i2), amsyVar.h(i2)));
                }
                e = F.f();
            }
            deig<tgl> deigVar = thhVar.c;
            tgj c = FetchState.c();
            if (j.a()) {
                tgkVar = tgk.COMPLETED;
            } else {
                tgkVar = tgk.ERROR;
            }
            ((tga) c).a = FetchState.Fetch.d(tgkVar, dbpy.a);
            deigVar.j(new tge(c.a(), j, e));
        }
    }
}

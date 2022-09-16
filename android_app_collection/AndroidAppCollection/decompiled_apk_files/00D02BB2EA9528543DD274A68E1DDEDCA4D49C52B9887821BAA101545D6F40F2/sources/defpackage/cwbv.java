package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: cwbv  reason: default package */
/* loaded from: classes5.dex */
final class cwbv extends cvxj {
    final /* synthetic */ cwby a;

    public cwbv(cwby cwbyVar) {
        this.a = cwbyVar;
    }

    @Override // defpackage.cvxj
    public final void a(Object obj) {
        dcdc<cwbn> f;
        cwbt cwcyVar;
        cwby cwbyVar = this.a;
        if (obj == null) {
            f = dcdc.e();
        } else {
            dccx dccxVar = new dccx();
            List list = cwbyVar.e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cwbn a = ((cwbe) list.get(i)).a().a();
                a.j = cwbyVar.f;
                a.f();
                dccxVar.g(a);
            }
            f = dccxVar.f();
        }
        cwbyVar.a(f);
        dccx F = dcdc.F();
        int size2 = f.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cwbn cwbnVar = f.get(i2);
            Context context = cwbyVar.a;
            if (cwbnVar instanceof cwbg) {
                cwcyVar = new cwbh(context, (cwbg) cwbnVar);
            } else if (cwbnVar instanceof cwcq) {
                cwcyVar = new cwcy(context, (cwcp) cwbnVar);
            } else if (cwbnVar instanceof cwcd) {
                cwcyVar = new cwci(context, (cwcc) cwbnVar);
            } else if (cwbnVar instanceof cwcl) {
                cwcyVar = new cwci(context, new cwco((cwcl) cwbnVar, context));
            } else if (cwbnVar instanceof cwau) {
                cwcyVar = new cwcy(context, new cwaz((cwau) cwbnVar));
            } else {
                throw new IllegalArgumentException("Unsupported card type");
            }
            F.g(cwcyVar);
        }
        cwbyVar.h = F.f();
        cwbyVar.s();
    }
}

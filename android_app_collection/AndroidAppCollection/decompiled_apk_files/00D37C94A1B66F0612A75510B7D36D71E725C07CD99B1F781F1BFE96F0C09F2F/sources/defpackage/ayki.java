package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ayki  reason: default package */
/* loaded from: classes2.dex */
final class ayki extends ayai {
    public final ayab b;
    private ayag c;

    public ayki(ayab ayabVar) {
        this.b = ayabVar;
    }

    @Override // defpackage.ayai
    public final void a(Status status) {
        ayag ayagVar = this.c;
        if (ayagVar != null) {
            ayagVar.b();
            this.c = null;
        }
        this.b.b(axyt.TRANSIENT_FAILURE, new aykf(ayac.b(status)));
    }

    @Override // defpackage.ayai
    public final void b(ayaf ayafVar) {
        List list = ayafVar.a;
        ayag ayagVar = this.c;
        if (ayagVar == null) {
            ayab ayabVar = this.b;
            axzy axzyVar = new axzy();
            aqxo.q(!list.isEmpty(), "addrs is empty");
            axzyVar.a = Collections.unmodifiableList(new ArrayList(list));
            axzz axzzVar = new axzz(axzyVar.a, axzyVar.b, axzyVar.c);
            ayiv ayivVar = (ayiv) ayabVar;
            ayivVar.c.o.d();
            aqxo.z(!ayivVar.c.C, "Channel is being terminated");
            ayag ayagVar2 = new ayag(ayivVar.c, axzzVar, ayivVar);
            ayke aykeVar = new ayke(this, ayagVar2);
            ayagVar2.j.o.d();
            aqxo.z(!ayagVar2.g, "already started");
            aqxo.z(!ayagVar2.h, "already shutdown");
            aqxo.z(!ayagVar2.j.C, "Channel is being terminated");
            ayagVar2.g = true;
            List list2 = ayagVar2.a.a;
            String b = ayagVar2.j.b();
            ayji ayjiVar = ayagVar2.j;
            String str = ayjiVar.r;
            ayet ayetVar = ayjiVar.j;
            ScheduledExecutorService b2 = ayetVar.b();
            aybx aybxVar = ayagVar2.j.o;
            ayhu ayhuVar = new ayhu(ayagVar2, aykeVar);
            ayji ayjiVar2 = ayagVar2.j;
            ayia ayiaVar = new ayia(list2, b, str, ayetVar, b2, aybxVar, ayhuVar, ayjiVar2.H, ayjiVar2.U.a(), ayagVar2.c, ayagVar2.d);
            ayeg ayegVar = ayagVar2.j.F;
            axzj axzjVar = new axzj();
            axzjVar.a = "Child Subchannel started";
            axzjVar.b = axzk.CT_INFO;
            axzjVar.b(ayagVar2.j.n.a());
            axzjVar.c = ayiaVar;
            ayegVar.b(axzjVar.a());
            ayagVar2.f = ayiaVar;
            axzn.a(ayagVar2.j.H.c, ayiaVar);
            ayagVar2.j.v.add(ayiaVar);
            this.c = ayagVar2;
            this.b.b(axyt.CONNECTING, new aykf(ayac.c(ayagVar2)));
            ayagVar2.a();
            return;
        }
        ayagVar.j.o.d();
        ayia ayiaVar2 = ayagVar.f;
        list.getClass();
        ayia.j(list);
        aqxo.q(true ^ list.isEmpty(), "newAddressGroups is empty");
        ayiaVar2.e.execute(new ayho(ayiaVar2, Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // defpackage.ayai
    public final void c() {
        ayag ayagVar = this.c;
        if (ayagVar != null) {
            ayagVar.b();
        }
    }
}

package defpackage;

import android.os.Handler;
import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: aqag  reason: default package */
/* loaded from: classes2.dex */
final class aqag implements degu<dbsg<augc>> {
    final /* synthetic */ Notification a;
    final /* synthetic */ apyy b;
    final /* synthetic */ ctyy c;
    final /* synthetic */ aqak d;

    public aqag(aqak aqakVar, Notification notification, apyy apyyVar, ctyy ctyyVar) {
        this.d = aqakVar;
        this.a = notification;
        this.b = apyyVar;
        this.c = ctyyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckco) this.d.l.a(ckgs.C)).a(aqcp.EXCEPTION_THROWN.k);
        this.d.m.l(this.b.b(this.c, this.a, dbsg.i(ddci.EXCEPTION_THROWN)));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<augc> dbsgVar) {
        dbsg<augc> dbsgVar2 = dbsgVar;
        if (!dbsgVar2.a()) {
            Handler handler = aqak.q;
            return;
        }
        augc b = dbsgVar2.b();
        augj a = b.a();
        if (this.b.d(this.a, this.c)) {
            this.d.k.a().b(a);
            return;
        }
        Handler handler2 = aqak.q;
        auhh auhhVar = this.d.c.j(a).b;
        if (auhhVar == auhh.SHOWN) {
            aqak aqakVar = this.d;
            Notification notification = this.a;
            ctyy ctyyVar = this.c;
            apyy a2 = aqakVar.b.a();
            if (aqakVar.j.a().f()) {
                deha.q(a2.o(b, ctyyVar, notification), new aqaj(aqakVar, a2, notification), dege.a);
            }
        }
        aqak aqakVar2 = this.d;
        apyy apyyVar = this.b;
        ctyy ctyyVar2 = this.c;
        Notification notification2 = this.a;
        ((ckhe) aqakVar2.l.a(ckgs.G)).c();
        ((ckhe) aqakVar2.l.a(ckgs.H)).c();
        if (auhhVar == auhh.SHOWN) {
            ((ckcn) aqakVar2.l.a(ckgs.B)).a();
            aqakVar2.m.l(apyyVar.b(ctyyVar2, notification2, dbpy.a));
            return;
        }
        ((ckco) aqakVar2.l.a(ckgs.C)).a((aqak.r.containsKey(auhhVar) ? aqak.r.get(auhhVar) : aqcp.UNKNOWN).k);
        aqakVar2.m.l(apyyVar.b(ctyyVar2, notification2, dbsg.i(aqak.s.getOrDefault(auhhVar, ddci.UNKNOWN))));
    }
}

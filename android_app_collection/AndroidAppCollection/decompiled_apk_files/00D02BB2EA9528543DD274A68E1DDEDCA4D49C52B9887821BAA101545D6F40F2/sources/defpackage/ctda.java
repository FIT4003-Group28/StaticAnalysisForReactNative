package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctda  reason: default package */
/* loaded from: classes5.dex */
public final class ctda implements csum {
    public static final dcdn<Integer, Integer> a = dcdn.n(10, 133, 30, 134, 40, 135, 20, 136);
    public static final dcdn<Integer, Integer> b = dcdn.n(10, 137, 30, 138, 40, 139, 20, 140);
    public final Context c;
    public final cted d;
    public final cusx e;
    public final csyc f;
    public final csuh g;
    public final dehp h = cstu.b().a;
    public csul i;
    public csud j;
    public csuy k;
    public cswi l;
    public cswh m;
    public final Map<String, ctuk> n;
    private final ctgc o;
    private final ctog p;

    public ctda(Context context, cted ctedVar, cusx cusxVar, ctgc ctgcVar, csyc csycVar, csuh csuhVar, Map<String, ctuk> map) {
        this.c = context;
        this.d = ctedVar;
        this.e = cusxVar;
        this.o = ctgcVar;
        this.f = csycVar;
        this.g = csuhVar;
        this.n = map;
        this.p = ctog.a(context);
    }

    @Override // defpackage.csum
    public final boolean a(MessageReceivedNotification messageReceivedNotification, ctyy ctyyVar) {
        cusm d = d(ctyyVar);
        String b2 = messageReceivedNotification.b();
        return d.b(b2, cugo.INCOMING_READ) || d.b(b2, cugo.INCOMING_READ_RECEIPT_SENT);
    }

    @Override // defpackage.csum
    public final void b(final ctyy ctyyVar, final dbsl<Notification> dbslVar) {
        c(ctyyVar, null, 0).k(new cusr(this, dbslVar, ctyyVar) { // from class: ctcx
            private final ctda a;
            private final dbsl b;
            private final ctyy c;

            {
                this.a = this;
                this.b = dbslVar;
                this.c = ctyyVar;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                ctda ctdaVar = this.a;
                dbsl dbslVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                dcdc dcdcVar = (dcdc) obj;
                dccx F = dcdc.F();
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    Notification notification = (Notification) dcdcVar.get(i);
                    if (dbslVar2.a(notification)) {
                        F.g(notification.a());
                    }
                }
                ctdaVar.h.a(new Runnable(ctdaVar, ctyyVar2, F.f()) { // from class: ctcw
                    private final ctda a;
                    private final ctyy b;
                    private final dcdc c;

                    {
                        this.a = ctdaVar;
                        this.b = ctyyVar2;
                        this.c = r3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ctda ctdaVar2 = this.a;
                        ctyy ctyyVar3 = this.b;
                        ctdaVar2.d(ctyyVar3).Q(this.c);
                    }
                });
            }
        });
    }

    @Override // defpackage.csum
    public final cuss<dcdc<Notification>> c(ctyy ctyyVar, final dbsl<Notification> dbslVar, int i) {
        return cusl.d(d(ctyyVar).av(), new dbrn(dbslVar) { // from class: ctcv
            private final dbsl a;

            {
                this.a = dbslVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsl dbslVar2 = this.a;
                dcdc dcdcVar = (dcdc) obj;
                dcdn<Integer, Integer> dcdnVar = ctda.a;
                return dbslVar2 == null ? dcdcVar : dcdc.q(dcft.i(dcdcVar, dbslVar2));
            }
        });
    }

    public final cusm d(ctyy ctyyVar) {
        return this.o.a(ctyyVar);
    }

    public final void e(int i, dbsg<ctyy> dbsgVar, dbsg<MessageReceivedNotification> dbsgVar2, int i2) {
        ctxm r = ctxn.r();
        r.g(i);
        r.f(i2);
        if (dbsgVar.a()) {
            r.o(dbsgVar.b().c().J());
        }
        if (dbsgVar2.a()) {
            MessageReceivedNotification b2 = dbsgVar2.b();
            r.n(b2.a().a());
            r.p(b2.b());
            r.d(b2.a());
        }
        this.p.b(r.a());
    }
}

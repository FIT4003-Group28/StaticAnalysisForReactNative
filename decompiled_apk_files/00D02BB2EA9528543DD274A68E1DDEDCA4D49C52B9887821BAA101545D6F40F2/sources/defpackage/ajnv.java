package defpackage;

import android.app.Application;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajnv  reason: default package */
/* loaded from: classes2.dex */
public final class ajnv {
    public static final dcdn<dqym, ckgc> a;
    public final ckcw b;
    public final bvrb c;
    public final cjnx d;
    private final bwrg<ajob> f;
    private final Map<Long, ajnz> g = new HashMap();
    public boolean e = false;

    static {
        dcdg p = dcdn.p();
        p.f(dqym.APP_FOREGROUNDED, ckgc.APP_FOREGROUNDED);
        p.f(dqym.SILENT_OVENFRESH_RECEIVED, ckgc.OVENFRESH);
        p.f(dqym.JOURNEY_SHARE_COMPLETED, ckgc.JOURNEY_SHARE_COMPLETED);
        p.f(dqym.REPORTING_RULE_DEVICE_ON_THE_MOVE, ckgc.ON_THE_MOVE);
        p.f(dqym.REPORTING_RULE_DEVICE_STILL, ckgc.STILL);
        p.f(dqym.REPORTING_RULE_GEOFENCE_ALERT_REGION, ckgc.GEOFENCE_ALERT_REGION);
        p.f(dqym.REPORTING_RULE_OVENFRESH_RECEIVED_RECENTLY, ckgc.OVENFRESH_ONGOING);
        p.f(dqym.REPORTING_RULE_SHARE_CREATED_RECENTLY, ckgc.SHORT_TEMPORARY_SHARE);
        p.f(dqym.REPORTING_RULE_SHARE_WILL_FINISH_SOON, ckgc.SHORT_TEMPORARY_SHARE);
        p.f(dqym.CONFIGURED_DEFAULT_BURST, ckgc.DEFAULT_BURST_RATE);
        p.f(dqym.APP_IN_FOREGROUND, ckgc.APP_IN_FOREGROUND);
        a = p.b();
    }

    public ajnv(Application application, Executor executor, ckcw ckcwVar, bvrb bvrbVar, cjnx cjnxVar) {
        this.b = ckcwVar;
        this.c = bvrbVar;
        this.d = cjnxVar;
        bwrg<ajob> bwrgVar = new bwrg<>((dssr) ajob.b.cu(7), application, bwre.PERSISTENT_FILE, "location_uploader_persistence", executor);
        this.f = bwrgVar;
        bwrgVar.h(new dbsz(this) { // from class: ajno
            private final ajnv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ajnv ajnvVar = this.a;
                ajob ajobVar = (ajob) obj;
                synchronized (ajnvVar) {
                    ajnvVar.e = true;
                    ajnvVar.e();
                }
                if (ajobVar == null) {
                    return;
                }
                for (ajnz ajnzVar : ajobVar.a) {
                    dcen N = dcep.N();
                    for (String str : ajnzVar.e) {
                        try {
                            N.b(ckgc.a(str));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    new ajnu(ajnvVar, ajnzVar.c, ajnzVar.d, ajnzVar.f, N.f(), ajnzVar.b, dbpy.a).a();
                }
            }
        });
    }

    public static dcep<ckgc> a(dcep<dqym> dcepVar) {
        return dcep.L(dcft.o(dcepVar, ajnp.a));
    }

    public static String f(boolean z, Iterable<ckgc> iterable, dbsg<String> dbsgVar) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("LOCATION_SHARING_FORCE_PRIMARY_DEVICE");
            sb.append(" ");
        }
        Iterator<ckgc> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().o);
            if (it.hasNext()) {
                sb.append("+");
            }
        }
        if (dbsgVar.a()) {
            sb.append(" {");
            sb.append(dbsgVar.b());
            sb.append("}");
        }
        return sb.toString();
    }

    public final dehn<Boolean> b(final btlu btluVar, final boolean z, final dcep<dqym> dcepVar, final dbsg<String> dbsgVar) {
        final deig d = deig.d();
        final dehn<Boolean> e = this.d.e(btluVar);
        e.Pk(new Runnable(this, e, d, dcepVar, btluVar, z, dbsgVar) { // from class: ajnq
            private final ajnv a;
            private final dehn b;
            private final deig c;
            private final dcep d;
            private final btlu e;
            private final boolean f;
            private final dbsg g;

            {
                this.a = this;
                this.b = e;
                this.c = d;
                this.d = dcepVar;
                this.e = btluVar;
                this.f = z;
                this.g = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ajnv ajnvVar = this.a;
                dehn dehnVar = this.b;
                final deig deigVar = this.c;
                dcep dcepVar2 = this.d;
                btlu btluVar2 = this.e;
                boolean z2 = this.f;
                dbsg dbsgVar2 = this.g;
                if (!((Boolean) deha.s(dehnVar)).booleanValue()) {
                    deigVar.j(false);
                    return;
                }
                dcep<ckgc> a2 = ajnv.a(dcepVar2);
                dcpd<ckgc> it = a2.iterator();
                while (it.hasNext()) {
                    ((ckco) ajnvVar.b.a(ckgd.f)).a(it.next().n);
                }
                final dehn<Boolean> o = ajnvVar.d.o(btluVar2, ajnv.f(z2, a2, dbsgVar2));
                o.Pk(new Runnable(ajnvVar, o, deigVar) { // from class: ajnr
                    private final ajnv a;
                    private final dehn b;
                    private final deig c;

                    {
                        this.a = ajnvVar;
                        this.b = o;
                        this.c = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ajnv ajnvVar2 = this.a;
                        dehn dehnVar2 = this.b;
                        deig deigVar2 = this.c;
                        boolean booleanValue = ((Boolean) deha.s(dehnVar2)).booleanValue();
                        ((ckco) ajnvVar2.b.a(ckgd.c)).a(booleanValue ? ckfy.a(1) : ckfy.a(2));
                        deigVar2.j(Boolean.valueOf(booleanValue));
                    }
                }, ajnvVar.c.h());
            }
        }, this.c.h());
        return d;
    }

    public final synchronized void c(ajnz ajnzVar) {
        this.g.put(Long.valueOf(ajnzVar.b), ajnzVar);
        e();
    }

    public final synchronized void d(Long l) {
        this.g.remove(l);
        e();
    }

    public final void e() {
        if (!this.e) {
            return;
        }
        bwrg<ajob> bwrgVar = this.f;
        ajoa bZ = ajob.b.bZ();
        Collection<ajnz> values = this.g.values();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ajob ajobVar = (ajob) bZ.b;
        dsrj<ajnz> dsrjVar = ajobVar.a;
        if (!dsrjVar.a()) {
            ajobVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(values, ajobVar.a);
        bwrgVar.e(bZ.bK());
    }
}

package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import com.google.android.apps.gmm.geofence.GeofenceBroadcastReceiver;
import com.google.android.filament.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: aizx  reason: default package */
/* loaded from: classes2.dex */
public final class aizx implements aizs {
    private double b;
    private double c;
    private final ahya e;
    private final cokf f;
    private boolean a = true;
    private String d = "My location alert";

    public aizx(ahya ahyaVar, cqhn cqhnVar, cokf cokfVar) {
        this.e = ahyaVar;
        this.f = cokfVar;
    }

    @Override // defpackage.aizs
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.aizs
    public void b(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aizs
    public double c() {
        return this.b;
    }

    @Override // defpackage.aizs
    public double d() {
        return this.c;
    }

    @Override // defpackage.aizs
    public String e() {
        return this.d;
    }

    @Override // defpackage.aizs
    public cqgl f() {
        return new aizt(this);
    }

    @Override // defpackage.aizs
    public cqgl g() {
        return new aizu(this);
    }

    @Override // defpackage.aizs
    public cqgl h() {
        return new aizv(this);
    }

    @Override // defpackage.aizs
    public cqkl i() {
        acke ackeVar;
        if (a()) {
            ahya ahyaVar = this.e;
            ahxz ahxzVar = new ahxz(e(), c(), d());
            acjv bZ = acjw.m.bZ();
            String str = ahxzVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            acjw acjwVar = (acjw) bZ.b;
            str.getClass();
            acjwVar.a |= 128;
            acjwVar.l = str;
            dpul bZ2 = dpum.d.bZ();
            double d = ahxzVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpum dpumVar = (dpum) bZ2.b;
            int i = dpumVar.a | 1;
            dpumVar.a = i;
            dpumVar.b = d;
            double d2 = ahxzVar.c;
            dpumVar.a = i | 2;
            dpumVar.c = d2;
            dpum bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            acjw acjwVar2 = (acjw) bZ.b;
            bK.getClass();
            acjwVar2.d = bK;
            int i2 = acjwVar2.a | 1;
            acjwVar2.a = i2;
            acjwVar2.a = i2 | 2;
            acjwVar2.e = 100.0f;
            bZ.a(dztd.a(new acjq[]{acjq.ENTER, acjq.DWELL, acjq.EXIT}));
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            acjw acjwVar3 = (acjw) bZ.b;
            int i3 = acjwVar3.a | 8;
            acjwVar3.a = i3;
            acjwVar3.i = 5000;
            acjwVar3.a = i3 | 16;
            acjwVar3.j = 0;
            acjw acjwVar4 = (acjw) bZ.b;
            acjwVar4.k = 1;
            acjwVar4.a |= 32;
            ackd bZ3 = acke.c.bZ();
            String str2 = ahxzVar.a;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            acke ackeVar2 = (acke) bZ3.b;
            str2.getClass();
            ackeVar2.a |= 1;
            ackeVar2.b = str2;
            acke bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            acjw acjwVar5 = (acjw) bZ.b;
            bK2.getClass();
            acjwVar5.c = bK2;
            acjwVar5.b = 8;
            acjw bK3 = bZ.bK();
            dzvx.b(bK3, "GmmGeofence.newBuilder()…  }.build()\n    }.build()");
            acjn acjnVar = ahyaVar.a;
            List<acjw> a = dzti.a(bK3);
            final acje acjeVar = (acje) acjnVar;
            if (!acjeVar.c.a("android.permission.ACCESS_FINE_LOCATION")) {
                deha.b(new SecurityException("Missing ACCESS_FINE_LOCATION permission"));
            } else {
                final ArrayList<acjz> arrayList = new ArrayList(a.size());
                for (acjw acjwVar6 : a) {
                    dzvx.c(acjwVar6, "$this$toGmmGeofenceInternal");
                    dbsk.l(1 == (acjwVar6.a & 1));
                    dbsk.l((acjwVar6.a & 2) != 0);
                    dbsk.l(acjwVar6.f.size() > 0);
                    acjy bZ4 = acjz.m.bZ();
                    dpum dpumVar2 = acjwVar6.d;
                    if (dpumVar2 == null) {
                        dpumVar2 = dpum.d;
                    }
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    acjz acjzVar = (acjz) bZ4.b;
                    dpumVar2.getClass();
                    acjzVar.d = dpumVar2;
                    int i4 = acjzVar.a | 1;
                    acjzVar.a = i4;
                    float f = acjwVar6.e;
                    int i5 = i4 | 2;
                    acjzVar.a = i5;
                    acjzVar.e = f;
                    long j = acjwVar6.h;
                    int i6 = i5 | 4;
                    acjzVar.a = i6;
                    acjzVar.h = j;
                    int i7 = acjwVar6.i;
                    int i8 = i6 | 8;
                    acjzVar.a = i8;
                    acjzVar.i = i7;
                    int i9 = acjwVar6.j;
                    acjzVar.a = i8 | 16;
                    acjzVar.j = i9;
                    int a2 = acjt.a(acjwVar6.k);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    acjz acjzVar2 = (acjz) bZ4.b;
                    acjzVar2.k = a2 - 1;
                    acjzVar2.a |= 32;
                    String uuid = (acjwVar6.a & 128) != 0 ? acjwVar6.l : UUID.nameUUIDFromBytes(acjwVar6.bS()).toString();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    acjz acjzVar3 = (acjz) bZ4.b;
                    uuid.getClass();
                    acjzVar3.a |= 512;
                    acjzVar3.l = uuid;
                    dsrh<acjq> dsrhVar = new dsrh(acjwVar6.f, acjw.g);
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    acjz acjzVar4 = (acjz) bZ4.b;
                    dsrf dsrfVar = acjzVar4.f;
                    if (!dsrfVar.a()) {
                        acjzVar4.f = dsqw.cg(dsrfVar);
                    }
                    for (acjq acjqVar : dsrhVar) {
                        acjzVar4.f.h(acjqVar.e);
                    }
                    int i10 = acjwVar6.b;
                    int i11 = i10 != 0 ? i10 != 8 ? 0 : 1 : 2;
                    if (i11 != 0) {
                        if (i11 - 1 == 0) {
                            if (i10 == 8) {
                                ackeVar = (acke) acjwVar6.c;
                            } else {
                                ackeVar = acke.c;
                            }
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            acjz acjzVar5 = (acjz) bZ4.b;
                            ackeVar.getClass();
                            acjzVar5.c = ackeVar;
                            acjzVar5.b = 9;
                        } else {
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            acjz acjzVar6 = (acjz) bZ4.b;
                            acjzVar6.b = 0;
                            acjzVar6.c = null;
                        }
                    }
                    acjz bK4 = bZ4.bK();
                    dzvx.b(bK4, "builder.build()");
                    arrayList.add(bK4);
                }
                coko cokoVar = new coko();
                for (acjz acjzVar7 : arrayList) {
                    cokg cokgVar = new cokg();
                    dpum dpumVar3 = acjzVar7.d;
                    if (dpumVar3 == null) {
                        dpumVar3 = dpum.d;
                    }
                    double d3 = dpumVar3.b;
                    dpum dpumVar4 = acjzVar7.d;
                    if (dpumVar4 == null) {
                        dpumVar4 = dpum.d;
                    }
                    cokgVar.b(d3, dpumVar4.c, acjzVar7.e);
                    int i12 = 0;
                    for (acjq acjqVar2 : new dsrh(acjzVar7.f, acjz.g)) {
                        i12 |= acje.a.get(acjqVar2).intValue();
                    }
                    cokgVar.b = i12;
                    long j2 = acjzVar7.h;
                    if (j2 == 0) {
                        j2 = -1;
                    }
                    cokgVar.c(j2);
                    cokgVar.a = acjzVar7.l;
                    int i13 = acjzVar7.a;
                    if ((i13 & 8) != 0) {
                        cokgVar.d = acjzVar7.i;
                    }
                    if ((i13 & 16) != 0) {
                        cokgVar.c = acjzVar7.j;
                    }
                    cokoVar.b(cokgVar.a());
                }
                final GeofencingRequest a3 = cokoVar.a();
                acjo acjoVar = acjeVar.g;
                cokm geofencingClient = LocationServices.getGeofencingClient(acjeVar.b);
                Application application = acjeVar.b;
                Intent intent = new Intent(application, GeofenceBroadcastReceiver.class);
                intent.setAction("ACTION_RECEIVE_GEOFENCE_TRANSITION");
                final PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 134217728);
                cntc builder = cntd.builder();
                builder.a = new cnsr(a3, broadcast) { // from class: cokj
                    private final GeofencingRequest a;
                    private final PendingIntent b;

                    {
                        this.a = a3;
                        this.b = broadcast;
                    }

                    @Override // defpackage.cnsr
                    public final void a(Object obj, Object obj2) {
                        ((conr) obj).S(this.a, this.b, new cokl((cpct) obj2));
                    }
                };
                builder.c = 2424;
                deew.h(deew.h(degp.q(csac.a(geofencingClient.d(builder.a()))), new dbrn(arrayList) { // from class: acix
                    private final List a;

                    {
                        this.a = arrayList;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        List list = this.a;
                        Void r2 = (Void) obj;
                        dcdn<acjq, Integer> dcdnVar = acje.a;
                        return list;
                    }
                }, acjeVar.f), new dbrn(acjeVar) { // from class: aciy
                    private final acje a;

                    {
                        this.a = acjeVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        acje acjeVar2 = this.a;
                        List<acjz> list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (final acjz acjzVar8 : list) {
                            final acjm acjmVar = acjeVar2.d;
                            final long b = (acjzVar8.a & 4) != 0 ? acjmVar.b.b() + acjzVar8.h : 0L;
                            deew.g(acjmVar.a.h(bwrj.GEOFENCE_DATA, acjzVar8.l, acjzVar8), new defg(acjmVar, acjzVar8, b) { // from class: acjf
                                private final acjm a;
                                private final acjz b;
                                private final long c;

                                {
                                    this.a = acjmVar;
                                    this.b = acjzVar8;
                                    this.c = b;
                                }

                                @Override // defpackage.defg
                                public final dehn a(Object obj2) {
                                    final acjm acjmVar2 = this.a;
                                    acjz acjzVar9 = this.b;
                                    final long j3 = this.c;
                                    Void r6 = (Void) obj2;
                                    final String str3 = acjzVar9.l;
                                    return deew.g(acjmVar2.a(), new defg(acjmVar2, str3, j3) { // from class: acjh
                                        private final acjm a;
                                        private final String b;
                                        private final long c;

                                        {
                                            this.a = acjmVar2;
                                            this.b = str3;
                                            this.c = j3;
                                        }

                                        @Override // defpackage.defg
                                        public final dehn a(Object obj3) {
                                            acjm acjmVar3 = this.a;
                                            String str4 = this.b;
                                            long j4 = this.c;
                                            ackc ackcVar = (ackc) obj3;
                                            dsqp dsqpVar = (dsqp) ackcVar.cu(5);
                                            dsqpVar.bC(ackcVar);
                                            acka ackaVar = (acka) dsqpVar;
                                            str4.getClass();
                                            if (ackaVar.c) {
                                                ackaVar.bF();
                                                ackaVar.c = false;
                                            }
                                            ackc ackcVar2 = ackc.b;
                                            ((ackc) ackaVar.b).b().put(str4, Long.valueOf(j4));
                                            return acjmVar3.c(ackaVar.bK());
                                        }
                                    }, dege.a);
                                }
                            }, dege.a).Pk(new Runnable(acjzVar8) { // from class: acjb
                                private final acjz a;

                                {
                                    this.a = acjzVar8;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    acjz acjzVar9 = this.a;
                                    dcdn<acjq, Integer> dcdnVar = acje.a;
                                    String str3 = acjzVar9.l;
                                }
                            }, dege.a);
                            arrayList2.add(acjr.a(acjzVar8));
                        }
                        return arrayList2;
                    }
                }, acjeVar.f);
            }
        } else {
            ahya ahyaVar2 = this.e;
            String e = e();
            dzvx.c(e, "label");
            acjn acjnVar2 = ahyaVar2.a;
            final List a4 = dzti.a(e);
            acje acjeVar2 = (acje) acjnVar2;
            if (!acjeVar2.c.a("android.permission.ACCESS_FINE_LOCATION")) {
                deha.b(new SecurityException("Missing ACCESS_FINE_LOCATION permission"));
            } else {
                acjo acjoVar2 = acjeVar2.g;
                cokm geofencingClient2 = LocationServices.getGeofencingClient(acjeVar2.b);
                cntc builder2 = cntd.builder();
                builder2.a = new cnsr(a4) { // from class: cokk
                    private final List a;

                    {
                        this.a = a4;
                    }

                    @Override // defpackage.cnsr
                    public final void a(Object obj, Object obj2) {
                        List list = this.a;
                        conr conrVar = (conr) obj;
                        cokl coklVar = new cokl((cpct) obj2);
                        conrVar.K();
                        cnwc.e(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
                        ((cond) conrVar.L()).f((String[]) list.toArray(new String[0]), new conp(coklVar), conrVar.c.getPackageName());
                    }
                };
                builder2.c = 2425;
                deha.q(csac.a(geofencingClient2.d(builder2.a())), new acjd(acjeVar2, a4), acjeVar2.f);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aizs
    public cqkl j() {
        final cokf cokfVar = this.f;
        LocationRequest create = LocationRequest.create();
        create.setPriority(100);
        create.setInterval(0L);
        create.setFastestInterval(0L);
        create.setExpirationDuration(30000L);
        final LocationRequestInternal a = LocationRequestInternal.a(create);
        a.j = true;
        if (a.b.getMaxWaitTime() > a.b.getInterval()) {
            long interval = a.b.getInterval();
            long maxWaitTime = a.b.getMaxWaitTime();
            StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedHeightMajor);
            sb.append("could not set max age when location batching is requested, interval=");
            sb.append(interval);
            sb.append("maxWaitTime=");
            sb.append(maxWaitTime);
            throw new IllegalArgumentException(sb.toString());
        }
        a.l = 10000L;
        cnsr<A, cpct<ResultT>> cnsrVar = new cnsr(cokfVar, a) { // from class: cojt
            private final cokf a;
            private final LocationRequestInternal b;

            {
                this.a = cokfVar;
                this.b = a;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                cokf cokfVar2 = this.a;
                conr conrVar = (conr) obj;
                cpct cpctVar = (cpct) obj2;
                cpcq<Void> k = cokfVar2.k(this.b, new cojy(cokfVar2, cpctVar), Looper.getMainLooper(), new cojr(cpctVar), 2437);
                k.q(new cpbu(cpctVar, k) { // from class: cojs
                    private final cpct a;
                    private final cpcq b;

                    {
                        this.a = cpctVar;
                        this.b = k;
                    }

                    @Override // defpackage.cpbu
                    public final Object a(cpcq cpcqVar) {
                        cpct cpctVar2 = this.a;
                        cpcq cpcqVar2 = this.b;
                        if (!cpcqVar.b()) {
                            if (cpcqVar.e() != null) {
                                cpctVar2.c(cpcqVar2.e());
                            } else {
                                cpctVar2.b(null);
                            }
                        }
                        return cpctVar2.a;
                    }
                });
            }
        };
        cntc builder = cntd.builder();
        builder.a = cnsrVar;
        builder.b = new Feature[]{cojn.d};
        builder.c = 2415;
        cokfVar.c(builder.a()).m(new aizw(this));
        return cqkl.a;
    }
}

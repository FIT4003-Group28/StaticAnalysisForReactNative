package com.google.android.apps.gmm.car.androidauto;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class CarNavigationProviderService extends cnj {
    @dzsi
    jze d;
    @dzsi
    dxio<bvrv> e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    @dzsi
    public final cnm b() {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            return jzeVar.t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    @dzsi
    public final cns c() {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            return jzeVar.n.d;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    public final int d() {
        return 1;
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        jze jzeVar = this.d;
        if (jzeVar != null) {
            jzeVar.g.a().NX("", printWriter);
            jzeVar.g.a().o();
            jzeVar.h.a().dumpInternal("", printWriter, dcdc.f(dvgn.CAR));
            kaj kajVar = jzeVar.y;
            printWriter.println("".concat("ArrivalTracker:"));
            String str2 = "never expired";
            if (kajVar.d.a()) {
                long j = kajVar.d.b().a;
                String valueOf = String.valueOf(kajVar.d.b().c());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("ms = ");
                sb.append(j);
                sb.append(", time = ");
                sb.append(valueOf);
                str = sb.toString();
            } else {
                str = str2;
            }
            StringBuilder sb2 = new StringBuilder(25 + String.valueOf(str).length());
            sb2.append("");
            sb2.append("  mostRecentArrivalTime: ");
            sb2.append(str);
            printWriter.println(sb2.toString());
            if (kajVar.e.a()) {
                long j2 = kajVar.e.b().a;
                String valueOf2 = String.valueOf(kajVar.e.b().c());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                sb3.append("ms = ");
                sb3.append(j2);
                sb3.append(", time = ");
                sb3.append(valueOf2);
                str2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(38 + String.valueOf(str2).length());
            sb4.append("");
            sb4.append("  mostRecentArrivalInfoExpiredTimeMs: ");
            sb4.append(str2);
            printWriter.println(sb4.toString());
            long j3 = kajVar.b().b;
            StringBuilder sb5 = new StringBuilder(45);
            sb5.append("");
            sb5.append("  arrival timeout in ms: ");
            sb5.append(j3);
            printWriter.println(sb5.toString());
            jzeVar.i.a().a("", printWriter);
            jzeVar.u.F("", printWriter);
            lxp lxpVar = jzeVar.r;
            printWriter.println("".concat("CarNavRestoreLoader:"));
            int i = lxpVar.p;
            String valueOf3 = String.valueOf(i != 0 ? Integer.valueOf(lxo.a(i)) : null);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb6.append("");
            sb6.append("  mostRecentOutcome: ");
            sb6.append(valueOf3);
            printWriter.println(sb6.toString());
            String k = lxp.k(lxpVar.f.w(bvjk.ed, 0L));
            StringBuilder sb7 = new StringBuilder(40 + String.valueOf(k).length());
            sb7.append("");
            sb7.append("  mostRecentNavRestoreAttemptTimestamp: ");
            sb7.append(k);
            printWriter.println(sb7.toString());
            String k2 = lxp.k(lxpVar.f.w(bvjk.ee, 0L));
            StringBuilder sb8 = new StringBuilder(50 + String.valueOf(k2).length());
            sb8.append("");
            sb8.append("  mostRecentNavRestoreSuccessfulAttemptTimestamp: ");
            sb8.append(k2);
            printWriter.println(sb8.toString());
            String k3 = lxp.k(lxpVar.f.w(bvjk.ef, 0L));
            StringBuilder sb9 = new StringBuilder(52 + String.valueOf(k3).length());
            sb9.append("");
            sb9.append("  mostRecentNavRestoreSuccessfulProtoLoadTimestamp: ");
            sb9.append(k3);
            printWriter.println(sb9.toString());
            String k4 = lxp.k(lxpVar.f.w(bvjk.ea, 0L));
            StringBuilder sb10 = new StringBuilder(String.valueOf(k4).length() + 31);
            sb10.append("");
            sb10.append("  navSessionCreationTimestamp: ");
            sb10.append(k4);
            printWriter.println(sb10.toString());
            String k5 = lxp.k(lxpVar.f.w(bvjk.ec, 0L));
            StringBuilder sb11 = new StringBuilder(37 + String.valueOf(k5).length());
            sb11.append("");
            sb11.append("  projectedSessionCreationTimestamp: ");
            sb11.append(k5);
            printWriter.println(sb11.toString());
            String k6 = lxp.k(lxpVar.f.w(bvjk.eb, 0L));
            StringBuilder sb12 = new StringBuilder(33 + String.valueOf(k6).length());
            sb12.append("");
            sb12.append("  phoneSessionCreationTimestamp: ");
            sb12.append(k6);
            printWriter.println(sb12.toString());
            lye lyeVar = jzeVar.o;
            bvrj.UI_THREAD.c();
            printWriter.println("".concat("NavigationManager:"));
            boolean z = lyeVar.h;
            StringBuilder sb13 = new StringBuilder(22);
            sb13.append("");
            sb13.append("  isInitialized: ");
            sb13.append(z);
            printWriter.println(sb13.toString());
            String valueOf4 = String.valueOf(lyeVar.i);
            StringBuilder sb14 = new StringBuilder(18 + String.valueOf(valueOf4).length());
            sb14.append("");
            sb14.append("  navigationMode: ");
            sb14.append(valueOf4);
            printWriter.println(sb14.toString());
            boolean z2 = lyeVar.k != null;
            StringBuilder sb15 = new StringBuilder(27);
            sb15.append("");
            sb15.append("  pendingNav present: ");
            sb15.append(z2);
            printWriter.println(sb15.toString());
            String valueOf5 = String.valueOf(lyeVar.j);
            StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf5).length() + 14);
            sb16.append("");
            sb16.append("  startLocks: ");
            sb16.append(valueOf5);
            printWriter.println(sb16.toString());
            String valueOf6 = String.valueOf(lyeVar.c.e());
            StringBuilder sb17 = new StringBuilder(43 + String.valueOf(valueOf6).length());
            sb17.append("");
            sb17.append("  navigationServiceController.currentMode: ");
            sb17.append(valueOf6);
            printWriter.println(sb17.toString());
            lww lwwVar = jzeVar.t;
            bvrj.UI_THREAD.c();
            printWriter.println("".concat("CarNavigationStateManager:"));
            String concat = "".concat("  ");
            boolean z3 = lwwVar.g;
            StringBuilder sb18 = new StringBuilder(String.valueOf(concat).length() + 14);
            sb18.append(concat);
            sb18.append("started: ");
            sb18.append(z3);
            printWriter.println(sb18.toString());
            int i2 = lwwVar.h.get();
            StringBuilder sb19 = new StringBuilder(String.valueOf(concat).length() + 41);
            sb19.append(concat);
            sb19.append("navigationSummariesSentCount: ");
            sb19.append(i2);
            printWriter.println(sb19.toString());
            int i3 = lwwVar.i.get();
            StringBuilder sb20 = new StringBuilder(String.valueOf(concat).length() + 32);
            sb20.append(concat);
            sb20.append("turnEventsSentCount: ");
            sb20.append(i3);
            printWriter.println(sb20.toString());
            lxa lxaVar = lwwVar.e;
            bvrj.UI_THREAD.c();
            printWriter.println(String.valueOf(concat).concat("CarNavigationStateManagerImpl:"));
            int i4 = lxaVar.g.get();
            StringBuilder sb21 = new StringBuilder(String.valueOf(concat).length() + 29);
            sb21.append(concat);
            sb21.append("  imageCacheHits: ");
            sb21.append(i4);
            printWriter.println(sb21.toString());
            int i5 = lxaVar.h.get();
            StringBuilder sb22 = new StringBuilder(String.valueOf(concat).length() + 31);
            sb22.append(concat);
            sb22.append("  imageCacheMisses: ");
            sb22.append(i5);
            printWriter.println(sb22.toString());
            jzeVar.w.a().NX("", printWriter);
            ktf ktfVar = jzeVar.x;
            String a = ktf.a(ktfVar.b.b());
            StringBuilder sb23 = new StringBuilder(21 + String.valueOf(a).length());
            sb23.append("");
            sb23.append("Overlay state log @ ");
            sb23.append(a);
            sb23.append(":");
            printWriter.println(sb23.toString());
            dcdc r = dcdc.r(ktfVar.a);
            int size = r.size();
            for (int i6 = 0; i6 < size; i6++) {
                kte kteVar = (kte) r.get(i6);
                String a2 = ktf.a(kteVar.c);
                String str3 = kteVar.b;
                String str4 = kteVar.a.e;
                StringBuilder sb24 = new StringBuilder(6 + String.valueOf(a2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb24.append("");
                sb24.append("  ");
                sb24.append(a2);
                sb24.append(" : ");
                sb24.append(str3);
                sb24.append(" ");
                sb24.append(str4);
                printWriter.println(sb24.toString());
            }
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    public final int e() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    public final void f(ClientMode clientMode) {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            Bundle bundle = a().a;
            bvrj.UI_THREAD.c();
            dbsk.s(clientMode);
            dbsk.l(jzeVar.B);
            int i = clientMode.a;
            ClientMode clientMode2 = jzeVar.C;
            if (clientMode2 != null) {
                int i2 = clientMode2.a;
                if (i2 == i) {
                    return;
                }
                if (i2 == 1) {
                    jzeVar.D = false;
                    jzeVar.E = -1;
                    jzeVar.f();
                    jzeVar.c();
                } else if (i2 == 2) {
                    jzeVar.f();
                    jzeVar.d();
                }
            }
            jzeVar.C = clientMode;
            int i3 = clientMode.a;
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                asio a = jzeVar.k.a();
                if (!a.b) {
                    a.b = true;
                    a.a.b(new asin());
                }
                jzeVar.e(clientMode);
                return;
            }
            jzeVar.D = bundle.getBoolean("MULTI_REGION_ENABLED", false);
            jzeVar.E = bundle.getInt("MULTI_REGION_EXPERIMENT_ID", -1);
            jzeVar.A = bundle.getBoolean("MULTI_REGION_ELIGIBLE");
            jzeVar.q.a(true);
            jzeVar.p.b.c();
            jzeVar.o.n(jzeVar.s);
            ktx ktxVar = jzeVar.l;
            int i4 = jzeVar.E;
            dccx F = dcdc.F();
            dccx F2 = dcdc.F();
            if (i4 != -1) {
                if (i4 == 22163236) {
                    F.g(1383876);
                } else if (i4 == 22163240) {
                    F.g(1383877);
                    i4 = 22163240;
                }
                F2.g(Integer.valueOf(i4));
            }
            ktxVar.a.a(btyx.ANDROID_AUTO, F.f());
            ktxVar.b = F2.f();
            kaj kajVar = jzeVar.y;
            btrm btrmVar = kajVar.a;
            dceq a2 = dcet.a();
            a2.b(crhq.class, new kak(crhq.class, kajVar, bvrj.UI_THREAD));
            btrmVar.g(kajVar, a2.a());
            jzeVar.e(clientMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnj
    public final void g() {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            bvrj.UI_THREAD.c();
            dbsk.l(jzeVar.B);
            ClientMode clientMode = jzeVar.C;
            if (clientMode == null) {
                return;
            }
            jzeVar.b(clientMode);
            jzeVar.l.a();
        }
    }

    @Override // defpackage.cnj, android.app.Service
    public final IBinder onBind(Intent intent) {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            jzd jzdVar = Objects.equals(intent.getAction(), "com.google.android.apps.gmm.INTERNAL") ? jzeVar.m : null;
            if (jzdVar != null) {
                return jzdVar;
            }
        }
        return this.c;
    }

    @Override // defpackage.cnj, android.app.Service
    public final void onCreate() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        jzg jzgVar = new jzg();
        jzgVar.a = this;
        kgh kghVar = (kgh) btsr.a(kgh.class);
        dxjg.b(kghVar);
        jzgVar.b = kghVar;
        iqz iqzVar = (iqz) btsr.a(iqz.class);
        dxjg.b(iqzVar);
        jzgVar.c = iqzVar;
        mvt mvtVar = (mvt) btsr.a(mvt.class);
        dxjg.b(mvtVar);
        jzgVar.d = mvtVar;
        dxjg.a(jzgVar.a, Service.class);
        dxjg.a(jzgVar.b, kgh.class);
        dxjg.a(jzgVar.c, iqz.class);
        dxjg.a(jzgVar.d, mvt.class);
        jyz jyzVar = (jyz) btsr.b(new jzi(jzgVar.b, jzgVar.c, jzgVar.a));
        this.d = jyzVar.a();
        this.e = jyzVar.b();
        jze jzeVar = this.d;
        if (jzeVar != null) {
            ((ckhe) jzeVar.f.a(ckee.q)).a();
            ((ckhe) jzeVar.f.a(ckee.o)).a();
            lye lyeVar = jzeVar.o;
            bvrj.UI_THREAD.c();
            dbsk.l(!lyeVar.j.contains("CarNavigationProviderServiceImpl"));
            boolean isEmpty = lyeVar.j.isEmpty();
            lyeVar.j.add("CarNavigationProviderServiceImpl");
            if (isEmpty) {
                lyeVar.f.C().a(lyeVar.m, lyeVar.g);
                lyt lytVar = lyeVar.d;
                lys lysVar = lyeVar.o;
                dbsk.s(lysVar);
                lytVar.c = lysVar;
                dbsk.l(!lytVar.f);
                lytVar.d = crhp.a();
                btrm btrmVar = lytVar.b;
                dceq a = dcet.a();
                a.b(crhq.class, new lyu(0, crhq.class, lytVar, bvrj.UI_THREAD));
                a.b(crhp.class, new lyu(1, crhp.class, lytVar, bvrj.UI_THREAD));
                btrmVar.g(lytVar, a.a());
                lytVar.e = lytVar.a.e();
                if (lytVar.e != lyt.c(lytVar.b())) {
                    lytVar.f = true;
                }
                lysVar.a(lytVar.b());
            }
            jzeVar.G.a();
            jzeVar.e.a(new jzb(), bvrj.BACKGROUND_THREADPOOL, 2000L);
            jzeVar.c.a().a(jzeVar.F, jzeVar.d);
            jzeVar.f.f(ckhc.CAR_NAVIGATION_PROVIDER_SERVICE);
            jzeVar.B = true;
            mgl mglVar = jzeVar.v;
            jza jzaVar = jzeVar.H;
            bvrj.UI_THREAD.c();
            mglVar.a.add(jzaVar);
            ((ckcp) jzeVar.f.a(ckee.p)).a(jzeVar.b.e() - elapsedRealtime);
        }
    }

    @Override // defpackage.cnj, android.app.Service
    public final void onDestroy() {
        jze jzeVar = this.d;
        if (jzeVar != null) {
            jzeVar.c.a().c(jzeVar.F);
            ClientMode clientMode = jzeVar.C;
            if (clientMode != null) {
                jzeVar.b(clientMode);
            }
            jzeVar.B = false;
            mgl mglVar = jzeVar.v;
            jza jzaVar = jzeVar.H;
            bvrj.UI_THREAD.c();
            mglVar.a.remove(jzaVar);
            jzeVar.f.g(ckhc.CAR_NAVIGATION_PROVIDER_SERVICE);
            jzeVar.G.b();
            lye lyeVar = jzeVar.o;
            bvrj.UI_THREAD.c();
            dbsk.l(lyeVar.j.contains("CarNavigationProviderServiceImpl"));
            lyeVar.j.remove("CarNavigationProviderServiceImpl");
            if (lyeVar.j.isEmpty()) {
                if (lyeVar.e()) {
                    lxp.e(lyeVar.b);
                }
                if (lyeVar.i != null || lyeVar.k != null) {
                    lyeVar.c.d(false);
                }
                lyt lytVar = lyeVar.d;
                lytVar.b.a(lytVar);
                lytVar.f = false;
                lytVar.d = null;
                lytVar.c = null;
                lyeVar.f.C().c(lyeVar.m);
                lyeVar.i = null;
                lyeVar.h = false;
            }
            jzeVar.j.a().a();
        }
        this.d = null;
        dxio<bvrv> dxioVar = this.e;
        if (dxioVar != null) {
            dxioVar.a().a();
        }
        this.e = null;
        super.onDestroy();
    }
}

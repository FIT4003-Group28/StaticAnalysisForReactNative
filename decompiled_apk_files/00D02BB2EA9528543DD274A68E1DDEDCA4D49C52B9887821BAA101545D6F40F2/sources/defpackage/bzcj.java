package defpackage;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.gmm.transit.go.service.TransitTripService;
import java.io.File;
import java.util.Date;
/* compiled from: PG */
/* renamed from: bzcj  reason: default package */
/* loaded from: classes4.dex */
public final class bzcj implements bzch {
    public static final String a = String.valueOf(bzcj.class.getCanonicalName()).concat(".ACTION_START_TRIP");
    private final bzcb b;
    private final dxio<bzfh> c;

    public bzcj(bzcb bzcbVar, dxio<bzfh> dxioVar) {
        this.b = bzcbVar;
        this.c = dxioVar;
    }

    public static boolean c(Intent intent) {
        return a.equals(intent.getAction());
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        dbsk.l(c(intent));
        final bzcb bzcbVar = this.b;
        bzfh a2 = this.c.a();
        bvrj.UI_THREAD.c();
        if (bzcbVar.f == null) {
            return;
        }
        bzcbVar.c = a2.a(bzcbVar.f.a, bzcbVar.f.c, bzcbVar.f.b);
        bzcbVar.h = 3;
        dbsk.m(bzcbVar.d.c(), "A trip is already tracked.");
        bvrj.UI_THREAD.c();
        final bzem bzemVar = bzcbVar.c;
        dbsk.s(bzemVar);
        if (((bzdo) ((bzfg) bzemVar).r).c != bzdj.STOPPED) {
            bzemVar.d(new bzgf(bzcbVar, bzemVar) { // from class: bzbz
                private final bzcb a;
                private final bzem b;

                {
                    this.a = bzcbVar;
                    this.b = bzemVar;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    bzcb bzcbVar2 = this.a;
                    bzdk bzdkVar = ((bzfg) this.b).r;
                    if (bzdkVar.h() == bzdj.STOPPED) {
                        bzcbVar2.d.b();
                        if (bzdkVar.o().f) {
                            Application application = bzcbVar2.a;
                            application.stopService(new Intent(application, TransitTripService.class));
                        }
                    }
                    bzcbVar2.b.a();
                }
            }, bzcbVar.d, bzcbVar.g);
        }
        bzcbVar.b.a();
        dbsk.s(bzcbVar.c);
        if (bzcbVar.e) {
            final bzfg bzfgVar = (bzfg) bzcbVar.c;
            bzfgVar.l();
            bzfgVar.p(new Runnable(bzfgVar) { // from class: bzfc
                private final bzfg a;

                {
                    this.a = bzfgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bzfg bzfgVar2 = this.a;
                    bzel.a();
                    bzfgVar2.t++;
                    try {
                        bzfgVar2.j();
                        try {
                            Application application = bzfgVar2.g;
                            String str = "xml";
                            if (true == dbsj.d(str)) {
                                str = "txt";
                            }
                            bzfgVar2.s = new File(application.getExternalFilesDir(null), "transit-track-" + bvod.a(new Date()) + "." + str).getAbsolutePath();
                        } catch (Exception unused) {
                            bzfgVar2.s = null;
                        }
                        if (bzfgVar2.s != null) {
                            bzfgVar2.A = 2;
                            ckoq.b();
                            int i = ckoj.a;
                        }
                        bzfgVar2.t--;
                        bzfgVar2.q();
                    } catch (Throwable th) {
                        bzfgVar2.t--;
                        throw th;
                    }
                }
            });
        } else {
            final bzfg bzfgVar2 = (bzfg) bzcbVar.c;
            bzfgVar2.l();
            bzfgVar2.p(new Runnable(bzfgVar2) { // from class: bzez
                private final bzfg a;

                {
                    this.a = bzfgVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j();
                }
            });
        }
        bzcbVar.f = null;
        bzcbVar.e = false;
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return c(intent);
    }
}

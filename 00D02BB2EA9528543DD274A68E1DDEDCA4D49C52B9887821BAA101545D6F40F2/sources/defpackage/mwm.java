package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import java.io.PrintWriter;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mwm  reason: default package */
/* loaded from: classes7.dex */
public final class mwm implements ktu {
    @dzsi
    public jti a;
    private final btrm b;
    private final bvrb c;
    private final axru d;
    private final ktk e;
    private final LocationManager f;
    private final PowerManager g;
    private boolean h;
    @dzsi
    private bvpk i;
    private int k;
    private final crzo<dcep<ktr>> j = new crzo<>(ktr.g);
    private final mwl l = new mwl(this);

    public mwm(btrm btrmVar, Context context, bvrb bvrbVar, ktk ktkVar, axru axruVar) {
        this.b = btrmVar;
        this.c = bvrbVar;
        this.d = axruVar;
        this.e = ktkVar;
        Object systemService = context.getSystemService("location");
        dbsk.s(systemService);
        this.f = (LocationManager) systemService;
        Object systemService2 = context.getSystemService("power");
        dbsk.s(systemService2);
        this.g = (PowerManager) systemService2;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("Lockouts"));
        String valueOf = String.valueOf(this.j.a.l());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("  currentLockouts: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        boolean z = this.h;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
        sb2.append(str);
        sb2.append("  isPhoneGpsDisabled: ");
        sb2.append(z);
        printWriter.println(sb2.toString());
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(valueOf2).length());
        sb3.append(str);
        sb3.append("  locationPermissionGrantedCallback:");
        sb3.append(valueOf2);
        printWriter.println(sb3.toString());
        ktk ktkVar = this.e;
        String concat = String.valueOf(str).concat("  ");
        bvrj.UI_THREAD.c();
        String g = ktk.a.g(ktkVar.c.b());
        StringBuilder sb4 = new StringBuilder(String.valueOf(concat).length() + 15 + String.valueOf(g).length());
        sb4.append(concat);
        sb4.append("Lockout log @ ");
        sb4.append(g);
        sb4.append(":");
        printWriter.println(sb4.toString());
        for (ktj ktjVar : ktkVar.b) {
            String g2 = ktk.a.g(ktjVar.a);
            String valueOf3 = String.valueOf(ktjVar.b);
            int length = String.valueOf(concat).length();
            StringBuilder sb5 = new StringBuilder(length + 5 + String.valueOf(g2).length() + String.valueOf(valueOf3).length());
            sb5.append(concat);
            sb5.append("  ");
            sb5.append(g2);
            sb5.append(" : ");
            sb5.append(valueOf3);
            printWriter.println(sb5.toString());
        }
    }

    @Override // defpackage.ktu
    public final crzm<dcep<ktr>> a() {
        return this.j.a;
    }

    @Override // defpackage.ktu
    public final void b() {
        dbsk.l(this.k >= 0);
        if (this.k == 0) {
            this.i = bvpk.a(new Runnable(this) { // from class: mwk
                private final mwm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mwm mwmVar = this.a;
                    if (mwmVar.g()) {
                        mwmVar.e();
                        jti jtiVar = mwmVar.a;
                        if (jtiVar == null) {
                            return;
                        }
                        jtu jtuVar = jtiVar.a;
                        jtuVar.j.a().m();
                        mgl mglVar = jtuVar.Q;
                        bvrj.UI_THREAD.c();
                        for (jza jzaVar : mglVar.a) {
                            Executor executor = mglVar.b;
                            jzaVar.getClass();
                            executor.execute(new Runnable(jzaVar) { // from class: mgk
                                private final jza a;

                                {
                                    this.a = jzaVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.a.a(false);
                                }
                            });
                        }
                        mglVar.a.clear();
                        return;
                    }
                    mwmVar.h();
                }
            });
            btrm btrmVar = this.b;
            mwl mwlVar = this.l;
            dceq a = dcet.a();
            a.b(ahjy.class, new mwn(ahjy.class, mwlVar, bvrj.UI_THREAD));
            btrmVar.g(mwlVar, a.a());
        }
        this.k++;
    }

    @Override // defpackage.ktu
    public final void d() {
        dbsk.l(this.k > 0);
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            this.b.a(this.l);
            bvpk bvpkVar = this.i;
            if (bvpkVar != null) {
                bvpkVar.b();
                this.i = null;
            }
        }
        this.a = null;
    }

    @Override // defpackage.ktu
    public final void e() {
        dcep<ktr> a;
        this.h = !this.f.isProviderEnabled("gps");
        if (!g()) {
            h();
            a = dcnm.a(ktr.LOCATION_PERMISSION_NOT_ACCEPTED, new ktr[0]);
        } else if (this.h) {
            if (Build.VERSION.SDK_INT < 28 || this.g.getLocationPowerSaveMode() != 2 || this.g.isInteractive()) {
                a = dcnm.a(ktr.GPS_DISABLED, new ktr[0]);
            } else {
                a = dcnm.a(ktr.GPS_DISABLED_BY_POWER_SAVE_MODE, new ktr[0]);
            }
        } else if (!"Asia/Seoul".equals(TimeZone.getDefault().getID())) {
            a = ktr.g;
        } else {
            a = dcnm.a(ktr.KR_NOT_ALLOWED, new ktr[0]);
        }
        if (!a.equals(this.j.a.l())) {
            ktk ktkVar = this.e;
            bvrj.UI_THREAD.c();
            Queue<ktj> queue = ktkVar.b;
            long b = ktkVar.c.b();
            dbsk.s(a);
            queue.add(new ktj(b, a));
        }
        this.j.a(a);
    }

    @Override // defpackage.ktu
    public final void f(@dzsi jti jtiVar) {
        this.a = jtiVar;
    }

    public final boolean g() {
        return this.d.a("android.permission.ACCESS_FINE_LOCATION");
    }

    public final void h() {
        bvpk bvpkVar = this.i;
        if (bvpkVar == null) {
            return;
        }
        this.c.a(bvpkVar, bvrj.UI_THREAD, 1000L);
    }
}

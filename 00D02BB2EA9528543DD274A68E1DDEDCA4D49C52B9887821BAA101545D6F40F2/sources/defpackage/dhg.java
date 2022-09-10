package defpackage;

import android.app.Application;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dhg  reason: default package */
/* loaded from: classes6.dex */
public final class dhg {
    public static final /* synthetic */ int g = 0;
    private static final cjtd h = cjtd.a(dtxj.bt);
    private static final cjtd i = cjtd.a(dtxj.bu);
    public final Application a;
    public final ArCoreApk b;
    public final btvo c;
    public final dehq d;
    public final Object e;
    @dzsi
    public dehn<czk> f;
    private final cjqy j;

    public dhg(Application application, btvo btvoVar, cjqy cjqyVar, dehq dehqVar) {
        ArCoreApk arCoreApk = ArCoreApk.getInstance();
        this.e = new Object();
        this.f = null;
        this.a = application;
        this.b = arCoreApk;
        this.c = btvoVar;
        this.j = cjqyVar;
        this.d = dehqVar;
    }

    @dzsi
    public static czk a(ArCoreApk.Availability availability) {
        ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
        ArCoreApk.Availability availability2 = ArCoreApk.Availability.UNKNOWN_ERROR;
        switch (availability.ordinal()) {
            case 0:
                return czk.UNKNOWN;
            case 1:
                return null;
            case 2:
                return czk.TIMED_OUT;
            case 3:
                return czk.DEVICE_NOT_COMPATIBLE;
            case 4:
                return czk.REQUIRES_INSTALL;
            case 5:
                return czk.REQUIRES_UPDATE;
            case 6:
                return czk.READY;
            default:
                String valueOf = String.valueOf(availability);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Unknown availability type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public final dehn<czk> b() {
        synchronized (this.e) {
            dehn<czk> dehnVar = this.f;
            if (dehnVar != null) {
                return dehnVar;
            }
            dehn<czk> c = c(5);
            this.f = c;
            c.Pk(new Runnable(this) { // from class: dhc
                private final dhg a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dhg dhgVar = this.a;
                    synchronized (dhgVar.e) {
                        dhgVar.f = null;
                    }
                }
            }, this.d);
            return c;
        }
    }

    public final dehn<czk> c(final int i2) {
        if (i2 <= 0) {
            return deha.a(czk.TIMED_OUT);
        }
        return deew.g(this.d.e(new Callable(this) { // from class: dhd
            private final dhg a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhg dhgVar = this.a;
                return dhgVar.b.checkAvailability(dhgVar.a);
            }
        }, 500L, TimeUnit.MILLISECONDS), new defg(this, i2) { // from class: dhe
            private final dhg a;
            private final int b;

            {
                this.a = this;
                this.b = i2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dhg dhgVar = this.a;
                int i3 = this.b;
                czk a = dhg.a((ArCoreApk.Availability) obj);
                if (a == null) {
                    return dhgVar.c(i3 - 1);
                }
                return deha.a(a);
            }
        }, this.d);
    }

    public final dehn<dhf> d(final czk czkVar, final ff ffVar, boolean z) {
        cjql cjqlVar;
        ggc ggcVar;
        cjql cjqlVar2;
        boolean z2 = czkVar == czk.REQUIRES_INSTALL || czkVar == czk.REQUIRES_UPDATE;
        Iterator<fd> it = ffVar.g().q().iterator();
        while (true) {
            cjqlVar = null;
            if (!it.hasNext()) {
                ggcVar = null;
                break;
            }
            fd next = it.next();
            if (next instanceof ggc) {
                ggcVar = (ggc) next;
                break;
            }
        }
        if (!z2 || ggcVar == null || !ggcVar.bd().a()) {
            cjqlVar2 = null;
        } else {
            cjqp b = ggcVar.bd().b();
            cjql d = b.d(h);
            cjql d2 = b.d(i);
            b.f();
            cjqlVar2 = d;
            cjqlVar = d2;
        }
        try {
            ArCoreApk.InstallStatus requestInstall = this.b.requestInstall(ffVar, z, ArCoreApk.InstallBehavior.OPTIONAL, ArCoreApk.UserMessageType.FEATURE);
            ArCoreApk.InstallStatus installStatus = ArCoreApk.InstallStatus.INSTALLED;
            ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            int ordinal = requestInstall.ordinal();
            if (ordinal == 0) {
                return deha.a(dhf.INSTALLED);
            }
            if (ordinal != 1) {
                String valueOf = String.valueOf(requestInstall);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Unknown install status: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (z) {
                if (cjqlVar2 != null) {
                    this.j.j(cjqlVar2, h);
                }
                final deig d3 = deig.d();
                ffVar.g.a(new e() { // from class: com.google.android.apps.gmm.ar.common.installer.ArInstaller$1
                    boolean a = true;

                    @Override // defpackage.f
                    public final void a(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void b(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void c(m mVar) {
                        if (this.a) {
                            this.a = false;
                            return;
                        }
                        int i2 = dhg.g;
                        d3.p(dhg.this.d(czkVar, ffVar, false));
                        ffVar.g.b(this);
                    }

                    @Override // defpackage.f
                    public final void d(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void e(m mVar) {
                    }

                    @Override // defpackage.f
                    public final void f(m mVar) {
                    }
                });
                return d3;
            } else {
                return deha.a(dhf.UNKNOWN);
            }
        } catch (UnavailableDeviceNotCompatibleException unused) {
            return deha.a(dhf.DEVICE_NOT_COMPATIBLE);
        } catch (UnavailableUserDeclinedInstallationException unused2) {
            if (cjqlVar != null) {
                this.j.j(cjqlVar, i);
            }
            return deha.a(dhf.USER_DECLINED_INSTALLATION);
        }
    }
}

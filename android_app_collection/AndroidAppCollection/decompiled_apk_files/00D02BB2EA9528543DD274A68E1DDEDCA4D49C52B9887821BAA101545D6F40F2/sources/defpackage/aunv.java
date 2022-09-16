package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aunv  reason: default package */
/* loaded from: classes2.dex */
public final class aunv implements aunw {
    private final dxio<akfa> a;
    private final dxio<ausy> b;
    private final dxio<axru> c;
    private final auhq d;
    private final bvjj e;
    private final cqat f;
    private final Application g;

    public aunv(dxio<akfa> dxioVar, dxio<ausy> dxioVar2, dxio<axru> dxioVar3, auhq auhqVar, bvjj bvjjVar, cqat cqatVar, Application application) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = auhqVar;
        this.e = bvjjVar;
        this.f = cqatVar;
        this.g = application;
    }

    private final boolean b(dlgf dlgfVar) {
        dplx dplxVar = dlgfVar.f;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        Intent a = bvrq.a(dplxVar);
        PackageManager packageManager = this.g.getPackageManager();
        if ((dlgfVar.a & 32) == 0) {
            return !c(packageManager.queryIntentActivities(a, 0));
        }
        int a2 = dlga.a(dlgfVar.h);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        return (i == 1 || i == 2) ? !c(packageManager.queryIntentActivities(a, 0)) : i != 3 ? i == 4 && !c(packageManager.queryBroadcastReceivers(a, 0)) : !c(packageManager.queryIntentServices(a, 0));
    }

    private static boolean c(List<?> list) {
        return list == null || list.isEmpty();
    }

    @Override // defpackage.aunw
    public final boolean a(@dzsi String str, @dzsi dlfv dlfvVar) {
        boolean z;
        bvrj.UI_THREAD.d();
        if (dlfvVar == null) {
            this.d.f(dpyv.GENERIC_UNKNOWN.dm);
            return true;
        } else if ((dlfvVar.a & 32) == 0) {
            this.d.f(dpyv.GENERIC_UNKNOWN.dm);
            return true;
        } else {
            Integer d = this.b.a().d(dlfvVar);
            if (d == null) {
                this.d.f(dpyv.GENERIC_UNKNOWN.dm);
                return true;
            }
            aujb e = this.b.a().e(d.intValue());
            if (e != null) {
                e.q(dlfvVar);
            }
            PackageManager packageManager = this.g.getPackageManager();
            dlgn dlgnVar = dlfvVar.g;
            if (dlgnVar == null) {
                dlgnVar = dlgn.G;
            }
            if ((dlgnVar.a & 8192) != 0) {
                dlgn dlgnVar2 = dlfvVar.g;
                if (dlgnVar2 == null) {
                    dlgnVar2 = dlgn.G;
                }
                dplx dplxVar = dlgnVar2.r;
                if (dplxVar == null) {
                    dplxVar = dplx.g;
                }
                Intent a = bvrq.a(dplxVar);
                z = !c(packageManager.queryIntentActivities(a, 0));
                if (!z) {
                    a.getComponent();
                    a.getAction();
                }
            } else {
                z = true;
            }
            dlgn dlgnVar3 = dlfvVar.g;
            if (dlgnVar3 == null) {
                dlgnVar3 = dlgn.G;
            }
            dlgf dlgfVar = dlgnVar3.g;
            if (dlgfVar == null) {
                dlgfVar = dlgf.l;
            }
            if ((dlgfVar.a & 16) != 0) {
                dlgn dlgnVar4 = dlfvVar.g;
                if (dlgnVar4 == null) {
                    dlgnVar4 = dlgn.G;
                }
                dlgf dlgfVar2 = dlgnVar4.g;
                if (dlgfVar2 == null) {
                    dlgfVar2 = dlgf.l;
                }
                z = z && b(dlgfVar2);
            }
            dlgn dlgnVar5 = dlfvVar.g;
            if (dlgnVar5 == null) {
                dlgnVar5 = dlgn.G;
            }
            dlgf dlgfVar3 = dlgnVar5.h;
            if (dlgfVar3 == null) {
                dlgfVar3 = dlgf.l;
            }
            if ((dlgfVar3.a & 16) != 0) {
                dlgn dlgnVar6 = dlfvVar.g;
                if (dlgnVar6 == null) {
                    dlgnVar6 = dlgn.G;
                }
                dlgf dlgfVar4 = dlgnVar6.h;
                if (dlgfVar4 == null) {
                    dlgfVar4 = dlgf.l;
                }
                z = z && b(dlgfVar4);
            }
            if (z) {
                dlgn dlgnVar7 = dlfvVar.g;
                if (dlgnVar7 == null) {
                    dlgnVar7 = dlgn.G;
                }
                if (!dlgnVar7.p || !btpf.b(this.g)) {
                    btlu k = this.a.a().k();
                    if (!dlgnVar7.l || k.l()) {
                        btlu n = !dbsj.d(str) ? this.a.a().n(str) : null;
                        if (dlgnVar7.m || dlgnVar7.n) {
                            if (dbsj.d(str)) {
                                ((ckco) this.d.a.a(ckht.B)).a(d.intValue());
                                return true;
                            } else if (n == null || n.s().name == null) {
                                ((ckco) this.d.a.a(ckht.A)).a(d.intValue());
                                return true;
                            }
                        }
                        if (!dlgnVar7.m || n == null || n.equals(k)) {
                            if ((dlgnVar7.a & 1024) != 0) {
                                if (this.f.b() - this.e.w(bvjk.go, 0L) >= TimeUnit.SECONDS.toMillis(dlgnVar7.o)) {
                                    ((ckco) this.d.a.a(ckht.q)).a(d.intValue());
                                    return true;
                                }
                            }
                            if ((dlgnVar7.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0 || dlgnVar7.v >= this.f.b()) {
                                if (!dlgnVar7.q || this.c.a().a("android.permission.ACCESS_FINE_LOCATION")) {
                                    if (e == null || !e.r(dlfvVar, n)) {
                                        return false;
                                    }
                                    ((ckco) this.d.a.a(ckht.x)).a(d.intValue());
                                    return true;
                                }
                                ((ckco) this.d.a.a(ckht.s)).a(d.intValue());
                                return true;
                            }
                            ((ckco) this.d.a.a(ckht.r)).a(d.intValue());
                            return true;
                        }
                        ((ckco) this.d.a.a(ckht.z)).a(d.intValue());
                        return true;
                    }
                    this.d.g(d.intValue());
                    return true;
                }
                ((ckco) this.d.a.a(ckht.C)).a(d.intValue());
                return true;
            }
            this.d.f(d.intValue());
            return true;
        }
    }
}

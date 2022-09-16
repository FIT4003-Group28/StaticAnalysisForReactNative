package defpackage;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.apps.auto.sdk.nav.ClientMode;
import com.google.android.apps.gmm.shared.feedback.GmmLifecycleObserver;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btsc  reason: default package */
/* loaded from: classes.dex */
public final class btsc implements btsg {
    public static final Map<String, GmmLifecycleObserver> a = new dzqz();
    public final dxio<btvo> b;
    private final dxio<btsf> c;
    private final dxio<akfa> d;
    private final dxio<ckcw> e;
    private final dxio<cjqy> f;
    private final dxio<ktw> g;
    private final bvow h;
    private final String i;

    public btsc(Application application, dxio<btsf> dxioVar, dxio<akfa> dxioVar2, dxio<ckcw> dxioVar3, dxio<cjqy> dxioVar4, dxio<ktw> dxioVar5, bvow bvowVar, dxio<btvo> dxioVar6) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
        this.g = dxioVar5;
        this.h = bvowVar;
        this.b = dxioVar6;
        this.i = application.getApplicationContext().getPackageName();
    }

    public final void a(Throwable th, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        EnumMap k;
        String g;
        String g2;
        PackageInfo packageInfo;
        if (this.c.a() == null) {
            return;
        }
        cocw cocwVar = new cocw(th);
        dzrj values = ((dznt) a).values();
        String str4 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + str.length());
        sb.append(str4);
        sb.append(".");
        sb.append(str);
        cocwVar.d = sb.toString();
        String o = this.d.a().o();
        if (true == dbsj.d(o)) {
            o = "anonymous";
        }
        cocwVar.a = o;
        cocwVar.c = dbsj.e(th.getMessage());
        cocwVar.e = true;
        if (z) {
            try {
                str2 = Boolean.toString(this.h.a());
            } catch (bvov unused) {
                str2 = "process_not_found";
            }
            cocwVar.c("is_foreground", str2);
            try {
                bvow bvowVar = this.h;
                try {
                    packageInfo = bvowVar.a.getPackageManager().getPackageInfo(bvowVar.a.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new bvov("Package not found in PackageManager");
                }
            } catch (bvov unused3) {
                str3 = "process_not_found";
            }
            if (packageInfo == null) {
                throw new bvov("Package not found in PackageManager");
            }
            str3 = Long.toString(packageInfo.lastUpdateTime);
            cocwVar.c("last_update_time", str3);
            if (values != null && !values.isEmpty()) {
                dzrn it = ((dzqr) values).iterator();
                while (it.hasNext()) {
                    cjve cjveVar = ((GmmLifecycleObserver) it.next()).a;
                    if (cjveVar != null) {
                        cjur cjurVar = cjveVar.a.d;
                        k = new EnumMap(btsh.class);
                        synchronized (cjurVar.b) {
                            g = dbrz.f(',').g(cjur.a(dcdc.f(dcft.o(cjurVar.b, cjuo.a)), cjurVar.a.a().a));
                        }
                        k.put((EnumMap) btsh.LAST_VE_INTERACTION_KEY, (btsh) g);
                        synchronized (cjurVar.c) {
                            g2 = dbrz.f(',').g(cjur.a(dcdc.f(dcft.o(cjurVar.c, cjup.a)), cjurVar.a.a().b));
                        }
                        k.put((EnumMap) btsh.LAST_VE_PAGE_KEY, (btsh) g2);
                    } else {
                        k = dcjz.k(btsh.class);
                    }
                    if (!k.isEmpty()) {
                        for (btsh btshVar : k.keySet()) {
                            cocwVar.c(btshVar.d, (String) k.get(btshVar));
                        }
                    }
                }
            }
        }
        ClientMode clientMode = this.g.a().a;
        String str5 = null;
        if (clientMode != null) {
            int i = clientMode.a;
            if (i == 1) {
                str5 = "ANDROID_AUTO_PROJECTED";
            } else if (i == 2) {
                str5 = "ANDROID_AUTO_PHONE_SCREEN";
            }
        }
        if (str5 != null) {
            cocwVar.c("automotive_platform", str5);
        }
        cocwVar.c("account_type", btlu.i(this.d.a().j()).name());
        try {
            btsf a2 = this.c.a();
            cnwb.c(coct.b(a2.a.i, cocwVar.b())).m(a2.d);
        } catch (Throwable unused4) {
        }
        if (!z2) {
            return;
        }
        try {
            this.f.a().x(th, z);
        } catch (Throwable unused5) {
        }
        try {
            this.e.a().k(th instanceof OutOfMemoryError);
        } catch (Throwable unused6) {
        }
    }
}

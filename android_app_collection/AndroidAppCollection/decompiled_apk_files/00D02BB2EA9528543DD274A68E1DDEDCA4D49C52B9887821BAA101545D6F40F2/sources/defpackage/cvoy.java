package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.notifications.proxy.ActivityIntent;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvoy  reason: default package */
/* loaded from: classes5.dex */
public final class cvoy {
    private final Context a;
    private final cvjs b;
    private final dbsg<cvti> c;

    public cvoy(Context context, cvjs cvjsVar, dbsg<cvti> dbsgVar) {
        this.a = context;
        this.b = cvjsVar;
        this.c = dbsgVar;
    }

    public final PendingIntent a(String str, @dzsi cvkc cvkcVar, List<cvkj> list, @dzsi cvte cvteVar) {
        ActivityIntent b = this.c.a() ? this.c.b().b() : null;
        if (b != null) {
            return e(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", cvkcVar, list, cvpe.a(list), b, cvteVar, 2);
        }
        return f(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", true != ako.c() ? 1 : 2, cvkcVar, list, cvpe.a(list), cvteVar, null, 2);
    }

    public final PendingIntent b(String str, @dzsi cvkc cvkcVar, List<cvkj> list) {
        dsee bZ = dsef.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsef dsefVar = (dsef) bZ.b;
        dsefVar.e = 2;
        dsefVar.a |= 8;
        dsef dsefVar2 = (dsef) bZ.b;
        dsefVar2.d = 2;
        dsefVar2.a |= 4;
        return f(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", 2, cvkcVar, list, bZ.bK(), null, null, 4);
    }

    public final PendingIntent c(String str, @dzsi cvkc cvkcVar, cvkj cvkjVar, cvkg cvkgVar, @dzsi cvte cvteVar) {
        int i;
        int j = cvkgVar.j();
        int i2 = j - 1;
        if (j != 0) {
            int i3 = 2;
            if (i2 != 0) {
                i = i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 5 : 4 : 2;
            } else if (cvkgVar.a().isEmpty()) {
                throw new IllegalStateException("ChimeNotificationAction must have an action id or builtInActionType");
            } else {
                i = 1;
            }
            String valueOf = String.valueOf(cvkgVar.a());
            String concat = valueOf.length() != 0 ? "com.google.android.libraries.notifications.ACTION_ID:".concat(valueOf) : new String("com.google.android.libraries.notifications.ACTION_ID:");
            int a = dsdh.a(cvkgVar.e().b);
            ActivityIntent a2 = (a != 0 && a == 5 && this.c.a()) ? this.c.b().a() : null;
            if (a2 == null) {
                String b = dxya.a.a().b();
                if (!TextUtils.isEmpty(b)) {
                    for (String str2 : dbtm.c(",").g(b)) {
                        if (str2.equals(cvkgVar.a())) {
                            break;
                        }
                    }
                }
                int a3 = dsdh.a(cvkgVar.e().b);
                if (a3 != 0 && a3 == 5 && !ako.c()) {
                    i3 = 1;
                }
                return f(str, i, concat, i3, cvkcVar, Arrays.asList(cvkjVar), cvkgVar.e(), cvteVar, cvkgVar, 3);
            }
            return e(str, i, concat, cvkcVar, Arrays.asList(cvkjVar), cvkgVar.e(), a2, cvteVar, 3);
        }
        throw null;
    }

    public final Intent d() {
        return new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT").setClassName(this.a, this.b.e().k());
    }

    public final PendingIntent e(String str, int i, String str2, @dzsi cvkc cvkcVar, List<cvkj> list, dsef dsefVar, Intent intent, @dzsi cvte cvteVar, int i2) {
        cvov.b(intent, cvkcVar);
        cvov.c(intent, i);
        cvov.d(intent, str2);
        cvov.e(intent, dsefVar);
        cvov.f(intent, cvteVar);
        cvov.h(intent, i2);
        if (list.size() == 1) {
            cvov.a(intent, list.get(0));
        } else {
            cvov.g(intent, list.get(0));
        }
        return PendingIntent.getActivity(this.a, cvpd.c(str, str2, i), intent, 134217728);
    }

    public final PendingIntent f(String str, int i, String str2, int i2, @dzsi cvkc cvkcVar, List<cvkj> list, dsef dsefVar, @dzsi cvte cvteVar, @dzsi cvkg cvkgVar, int i3) {
        Intent d = d();
        cvov.b(d, cvkcVar);
        cvov.c(d, i);
        cvov.d(d, str2);
        cvov.e(d, dsefVar);
        cvov.f(d, cvteVar);
        if (cvkgVar != null) {
            d.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", cvkgVar.l().bS());
        }
        cvov.h(d, i3);
        if (list.size() == 1) {
            cvov.a(d, list.get(0));
        } else {
            cvov.g(d, list.get(0));
        }
        if (i2 != 1) {
            int a = dsdh.a(dsefVar.b);
            if (a != 0 && a == 5) {
                d.addFlags(268435456);
            }
            return PendingIntent.getBroadcast(this.a, cvpd.c(str, str2, i), d, 134217728);
        }
        d.setClassName(this.a, this.b.e().j());
        return PendingIntent.getActivity(this.a, cvpd.c(str, str2, i), d, 134217728);
    }
}

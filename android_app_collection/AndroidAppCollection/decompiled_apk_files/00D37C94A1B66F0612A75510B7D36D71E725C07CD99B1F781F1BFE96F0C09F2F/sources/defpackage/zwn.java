package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: zwn  reason: default package */
/* loaded from: classes4.dex */
public final class zwn {
    public acti a;
    public actj b;
    public Runnable c;
    public zdt d;
    private final dp e;
    private final Activity f;
    private final amuk g;
    private amuk h;
    private boolean i;

    public zwn(Activity activity, List list) {
        this.f = activity;
        list.getClass();
        this.g = amuk.o(list);
        this.h = amuk.q();
        this.e = null;
    }

    public static zwn a(dp dpVar, List list) {
        return new zwn(dpVar, list);
    }

    public static boolean d(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!e(context, ((PermissionDescriptor) it.next()).a)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Context context, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context == null) {
            zep.l("Cannot check permissions for null Context");
            return false;
        }
        return akdr.h(context, i);
    }

    private final Context g() {
        dp dpVar = this.e;
        return dpVar != null ? dpVar.rb() : this.f;
    }

    private final void h(PermissionDescriptor permissionDescriptor) {
        acup acupVar;
        acti actiVar = this.a;
        if (actiVar == null || permissionDescriptor == null || (acupVar = permissionDescriptor.c) == null) {
            return;
        }
        actiVar.H(3, new acte(acupVar), null);
    }

    private static boolean i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final void b(int i, String[] strArr, int[] iArr) {
        PermissionDescriptor permissionDescriptor;
        acup acupVar;
        boolean shouldShowRequestPermissionRationale;
        amuk amukVar = this.g;
        int size = amukVar.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                permissionDescriptor = (PermissionDescriptor) amukVar.get(i2);
                i2++;
                if (i == permissionDescriptor.a) {
                    break;
                }
            } else {
                amuk amukVar2 = this.h;
                int size2 = amukVar2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        permissionDescriptor = null;
                        break;
                    }
                    permissionDescriptor = (PermissionDescriptor) amukVar2.get(i3);
                    i3++;
                    if (i == permissionDescriptor.a) {
                        break;
                    }
                }
            }
        }
        boolean z = iArr.length == 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] != 0) {
                String str = strArr[i4];
                if (i()) {
                    dp dpVar = this.e;
                    if (dpVar != null) {
                        shouldShowRequestPermissionRationale = dpVar.au(str);
                    } else {
                        Activity activity = this.f;
                        if (activity != null) {
                            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                        }
                    }
                    if (shouldShowRequestPermissionRationale) {
                        z = true;
                    }
                }
                z = true;
                z2 = true;
            }
        }
        if (!z) {
            acti actiVar = this.a;
            if (actiVar != null && permissionDescriptor != null && (acupVar = permissionDescriptor.b) != null) {
                actiVar.H(3, new acte(acupVar), null);
            }
            c();
        } else if (d(g(), this.g)) {
            h(permissionDescriptor);
            Runnable runnable = this.c;
            if (runnable == null) {
                return;
            }
            runnable.run();
        } else {
            if (this.d == null) {
                return;
            }
            h(permissionDescriptor);
            this.d.a(Boolean.valueOf(z2));
        }
    }

    public final void c() {
        PermissionDescriptor permissionDescriptor;
        actj actjVar;
        this.g.getClass();
        if (i()) {
            amuk amukVar = this.g;
            int size = amukVar.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    permissionDescriptor = null;
                    break;
                }
                permissionDescriptor = (PermissionDescriptor) amukVar.get(i2);
                i2++;
                if (!akdr.h(g(), permissionDescriptor.a)) {
                    break;
                }
            }
            if (permissionDescriptor == null) {
                amuk amukVar2 = this.h;
                int size2 = amukVar2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PermissionDescriptor permissionDescriptor2 = (PermissionDescriptor) amukVar2.get(i);
                    i++;
                    if (!akdr.h(g(), permissionDescriptor2.a)) {
                        permissionDescriptor = permissionDescriptor2;
                        break;
                    }
                }
            }
        } else {
            permissionDescriptor = null;
        }
        if (permissionDescriptor == null) {
            Runnable runnable = this.c;
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        acti actiVar = this.a;
        if (actiVar != null) {
            if (!this.i && (actjVar = this.b) != null) {
                actiVar.H(3, new acte(actjVar), null);
                this.i = true;
            }
            acup acupVar = permissionDescriptor.b;
            if (acupVar != null) {
                this.a.n(new acte(acupVar));
            }
            acup acupVar2 = permissionDescriptor.c;
            if (acupVar2 != null) {
                this.a.n(new acte(acupVar2));
            }
        }
        String[] l = akdr.l(permissionDescriptor.a);
        int i3 = permissionDescriptor.a;
        if (!i()) {
            return;
        }
        dp dpVar = this.e;
        if (dpVar != null) {
            dpVar.ab(l, i3);
            return;
        }
        Activity activity = this.f;
        if (activity == null) {
            return;
        }
        activity.requestPermissions(l, i3);
    }

    public final void f(List list) {
        this.h = amuk.o(list);
    }

    private zwn(dp dpVar, List list) {
        this.e = dpVar;
        list.getClass();
        this.g = amuk.o(list);
        this.h = amuk.q();
        this.f = null;
    }
}

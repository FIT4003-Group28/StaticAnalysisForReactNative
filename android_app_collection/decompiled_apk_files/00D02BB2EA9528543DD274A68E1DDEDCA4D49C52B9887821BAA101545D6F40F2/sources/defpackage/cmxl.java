package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmxl  reason: default package */
/* loaded from: classes5.dex */
public final class cmxl {
    private static final List<String> a = Collections.unmodifiableList(Arrays.asList("com.google.android.projection.bumblebee", "com.google.android.projection.gearhead"));

    public static String a(Context context, boolean z) {
        String packageName = context.getPackageName();
        List<String> list = a;
        if (list.contains(packageName)) {
            return context.getPackageName();
        }
        ComponentName resolveActivity = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK").resolveActivity(context.getPackageManager());
        if (resolveActivity != null && list.contains(resolveActivity.getPackageName())) {
            try {
                String packageName2 = resolveActivity.getPackageName();
                cmym.a(context, packageName2, z);
                return packageName2;
            } catch (PackageManager.NameNotFoundException | SecurityException unused) {
            }
        }
        ArrayList arrayList = null;
        for (String str : a) {
            try {
                cmym.a(context, str, z);
                return str;
            } catch (PackageManager.NameNotFoundException e) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Android Auto is not installed!");
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                deki.a(illegalStateException, (Exception) arrayList.get(i));
            }
        }
        throw illegalStateException;
    }

    public static String b(Context context) {
        return a(context, !"user".equals(Build.TYPE));
    }

    public static Context c(Context context) {
        String a2 = a(context, !"user".equals(Build.TYPE));
        if (!context.getPackageName().equals(a2)) {
            try {
                return context.createPackageContext(a2, 3);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(a2);
                throw new IllegalStateException(valueOf.length() != 0 ? "NameNotFoundException looking up ".concat(valueOf) : new String("NameNotFoundException looking up "), e);
            }
        }
        return context;
    }
}

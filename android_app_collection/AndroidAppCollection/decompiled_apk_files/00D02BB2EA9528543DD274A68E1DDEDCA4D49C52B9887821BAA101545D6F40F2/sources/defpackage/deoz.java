package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: deoz  reason: default package */
/* loaded from: classes.dex */
public final class deoz<T> {
    private final T a;
    private final deoy b;

    /* JADX WARN: Multi-variable type inference failed */
    public deoz(Object obj, deoy deoyVar) {
        this.a = obj;
        this.b = deoyVar;
    }

    private static List<depb> b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                Class<?> cls = Class.forName(str);
                if (depb.class.isAssignableFrom(cls)) {
                    arrayList.add((depb) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return arrayList;
    }

    public static deoz<Context> forContext(Context context, Class<? extends Service> cls) {
        return new deoz<>(context, new deoy(cls));
    }

    public final List<depb> a() {
        List arrayList;
        deoy deoyVar = this.b;
        T t = this.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = ((Context) t).getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName((Context) t, deoyVar.a), 128);
                if (serviceInfo == null) {
                    String valueOf = String.valueOf(deoyVar.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append(valueOf);
                    sb.append(" has no service info.");
                    sb.toString();
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        return b(arrayList);
    }
}

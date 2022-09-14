package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@Deprecated
/* renamed from: cofh  reason: default package */
/* loaded from: classes5.dex */
public final class cofh {
    public static cofl a;
    private static final Map<String, cofh> c = new aif();
    String b;

    static {
        TimeUnit.DAYS.toMillis(7L);
    }

    protected cofh(Context context, String str) {
        this.b = "";
        context.getApplicationContext();
        this.b = str;
    }

    public static synchronized cofh a(Context context, Bundle bundle) {
        synchronized (cofh.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (a == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                sb.toString();
                a = new cofl(applicationContext);
                new cofk();
            }
            try {
                int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                sb2.append("Never happens: can't find own package ");
                sb2.append(valueOf);
                sb2.toString();
            }
            Map<String, cofh> map = c;
            cofh cofhVar = map.get(string);
            if (cofhVar == null) {
                cofh cofhVar2 = new cofh(applicationContext, string);
                map.put(string, cofhVar2);
                return cofhVar2;
            }
            return cofhVar;
        }
    }
}

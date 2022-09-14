package c.e.a.b.d.g;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile y2<Boolean> f4209a = y2.c();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4210b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean a(Context context, Uri uri) {
        ProviderInfo resolveContentProvider;
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f4209a.a()) {
            synchronized (f4210b) {
                if (f4209a.a()) {
                    return f4209a.b().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName()) && ((resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) == null || !"com.google.android.gms".equals(resolveContentProvider.packageName))) {
                    z = false;
                    if (z && a(context)) {
                        z2 = true;
                    }
                    f4209a = y2.a(Boolean.valueOf(z2));
                }
                z = true;
                if (z) {
                    z2 = true;
                }
                f4209a = y2.a(Boolean.valueOf(z2));
            }
        }
        return f4209a.b().booleanValue();
    }
}

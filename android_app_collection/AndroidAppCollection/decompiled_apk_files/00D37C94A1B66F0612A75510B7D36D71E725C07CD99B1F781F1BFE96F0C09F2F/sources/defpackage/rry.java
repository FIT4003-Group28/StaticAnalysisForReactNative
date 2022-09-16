package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: rry  reason: default package */
/* loaded from: classes4.dex */
public final class rry {
    public static String b = "0";
    private static final String c = "rry";
    private static ras e;
    private static final qrr d = qrr.d;
    public static final Object a = new Object();

    private rry() {
    }

    public static ras a() {
        ras rasVar;
        synchronized (a) {
            rasVar = e;
        }
        return rasVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            qnm.n(context, "Context must not be null");
            ClassLoader classLoader = rry.class.getClassLoader();
            qnm.b(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                qse.d(context, 11925000);
                try {
                    ras e2 = ras.e(context, ras.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = e2.d.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == rry.class.getClassLoader()) {
                            Log.e(c, "ImplVersion class is missing from Cronet module.");
                            throw new qsc(8);
                        }
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) d(method, new Object[0]);
                        qnm.b(num);
                        int intValue = num.intValue();
                        String str = (String) d(method2, new Object[0]);
                        qnm.b(str);
                        b = str;
                        if (intValue < 3) {
                            Intent i = d.i(context, 2, "cr");
                            if (i != null) {
                                String str2 = b;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                                sb.append("Google Play Services update is required. The API Level of the client is ");
                                sb.append(3);
                                sb.append(". The API Level of the implementation is ");
                                sb.append(intValue);
                                sb.append(". The Cronet implementation version is ");
                                sb.append(str2);
                                throw new qsd(2, sb.toString(), i);
                            }
                            Log.e(c, "Unable to fetch error resolution intent");
                            throw new qsc(2);
                        }
                        e = e2;
                    } catch (Exception e3) {
                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e3);
                        throw ((qsc) new qsc(8).initCause(e3));
                    }
                } catch (rao e4) {
                    Log.e(c, "Unable to load Cronet module", e4);
                    throw ((qsc) new qsc(8).initCause(e4));
                }
            } catch (ClassNotFoundException e5) {
                Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                throw ((qsc) new qsc(10).initCause(e5));
            }
        }
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}

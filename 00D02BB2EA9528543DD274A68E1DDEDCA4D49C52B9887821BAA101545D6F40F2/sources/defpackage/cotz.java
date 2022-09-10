package defpackage;

import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cotz  reason: default package */
/* loaded from: classes.dex */
public final class cotz {
    private static final cnmr c = cnmr.d;
    public static final Object a = new Object();
    private static cobp d = null;
    public static String b = "0";

    private cotz() {
    }

    @Deprecated
    public static void a(Context context) {
        synchronized (a) {
            if (b()) {
                return;
            }
            cnwc.n(context, "Context must not be null");
            try {
                cotz.class.getClassLoader().loadClass("org.chromium.net.CronetEngine");
                cnnl.d(context, 11925000);
                try {
                    cobp a2 = cobp.a(context, cobp.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = a2.e.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() == cotz.class.getClassLoader()) {
                            throw new cnni();
                        }
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        int intValue = ((Integer) method.invoke(null, new Object[0])).intValue();
                        b = (String) method2.invoke(null, new Object[0]);
                        if (intValue < 3) {
                            Intent k = c.k(context, 2, "cr");
                            String str = b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(3);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(intValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str);
                            throw new cnnj(2, sb.toString(), k);
                        }
                        d = a2;
                    } catch (Exception e) {
                        throw ((cnni) new cnni().initCause(e));
                    }
                } catch (cobl e2) {
                    throw ((cnni) new cnni().initCause(e2));
                }
            } catch (ClassNotFoundException e3) {
                throw ((cnni) new cnni().initCause(e3));
            }
        }
    }

    public static boolean b() {
        return c() != null;
    }

    public static cobp c() {
        cobp cobpVar;
        synchronized (a) {
            cobpVar = d;
        }
        return cobpVar;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: cohu  reason: default package */
/* loaded from: classes5.dex */
public final class cohu {
    private static final Object a = new Object();
    @dzsi
    private static volatile cohr b;

    private cohu() {
    }

    public static <T extends IInterface> T a(Context context, String str, coht<T> cohtVar) {
        cobp cobpVar;
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = b(context);
                }
            }
        }
        try {
            synchronized (cohr.a) {
                if (cohr.b == null) {
                    try {
                        cohr.b = cobp.a(context, cobp.a, "com.google.android.gms.brella_dynamite");
                    } catch (cobl e) {
                        if (!cohr.c) {
                            context.sendBroadcast(new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()));
                            cohr.c = true;
                        }
                        throw e;
                    }
                }
                cobpVar = cohr.b;
            }
            IBinder e2 = cobpVar.e(str);
            T a2 = e2 == null ? null : cohtVar.a(e2);
            if (a2 != null) {
                return a2;
            }
            throw new cohs(str.length() != 0 ? "null impl for ".concat(str) : new String("null impl for "));
        } catch (cobl e3) {
            String message = e3.getMessage();
            StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(message).length());
            sb.append("Couldn't load impl ");
            sb.append(str);
            sb.append(": ");
            sb.append(message);
            throw new cohs(sb.toString(), e3);
        }
    }

    private static cohr b(Context context) {
        Class<?> loadClass;
        try {
            try {
                loadClass = cohu.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
            } catch (ClassNotFoundException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new cohs(valueOf.length() != 0 ? "No dynamite loader found: ".concat(valueOf) : new String("No dynamite loader found: "), e);
            }
        } catch (ClassNotFoundException unused) {
            loadClass = cohu.class.getClassLoader().loadClass("cohr");
        }
        try {
            return (cohr) loadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            throw new cohs(valueOf2.length() != 0 ? "Failed to create dynamite loader instance: ".concat(valueOf2) : new String("Failed to create dynamite loader instance: "), e2);
        }
    }
}

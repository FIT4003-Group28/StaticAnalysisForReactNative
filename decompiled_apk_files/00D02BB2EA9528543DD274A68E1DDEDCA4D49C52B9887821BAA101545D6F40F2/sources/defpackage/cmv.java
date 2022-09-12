package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cmv  reason: default package */
/* loaded from: classes5.dex */
public final class cmv implements LayoutInflater.Factory {
    private static final HashMap<String, Constructor<? extends View>> a = new HashMap<>();
    private static final ClassLoader b = LayoutInflater.class.getClassLoader();
    private static final Class<?>[] c = {Context.class, AttributeSet.class};

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        ClassLoader classLoader;
        if (str.startsWith("com.google.android.gms.car.support") || str.startsWith("android.support") || str.startsWith("com.google.android.apps.auto.sdk.ui")) {
            Constructor<? extends View> constructor = a.get(str);
            if (constructor != null && (classLoader = constructor.getDeclaringClass().getClassLoader()) != b) {
                ClassLoader classLoader2 = context.getClassLoader();
                while (true) {
                    if (classLoader == classLoader2) {
                        break;
                    }
                    classLoader2 = classLoader2.getParent();
                    if (classLoader2 == null) {
                        a.remove(str);
                        constructor = null;
                        break;
                    }
                }
            }
            if (constructor == null) {
                try {
                    constructor = context.getClassLoader().loadClass(str).asSubclass(View.class).getConstructor(c);
                    constructor.setAccessible(true);
                    a.put(str, constructor);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return constructor.newInstance(context, attributeSet);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Error creating view: ");
                sb.append(valueOf);
                sb.toString();
                return null;
            }
        }
        return null;
    }
}

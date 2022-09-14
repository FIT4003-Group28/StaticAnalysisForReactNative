package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cmk  reason: default package */
/* loaded from: classes5.dex */
abstract class cmk {
    protected Object q;

    public cmk(cmp cmpVar, Object... objArr) {
        Constructor<?> constructor;
        int i = 0;
        try {
            int a = cmp.a(cmpVar.a);
            int a2 = cmp.a(cmpVar.b);
            if (a > a2) {
                String packageName = cmpVar.b.getPackageName();
                String packageName2 = cmpVar.a.getPackageName();
                String str = cmpVar.b.getPackageManager().getPackageInfo(packageName, 0).versionName;
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 78 + String.valueOf(str).length() + String.valueOf(packageName2).length());
                sb.append("Older version of Android Auto detected.");
                sb.append(packageName);
                sb.append("(");
                sb.append(str);
                sb.append(", api=");
                sb.append(a2);
                sb.append(")\n");
                sb.append(packageName2);
                sb.append("(api=  ");
                sb.append(a);
                sb.append(")");
                sb.toString();
            }
        } catch (Exception unused) {
        }
        try {
            Class<?> loadClass = cmpVar.b.getClassLoader().loadClass("com.google.android.gearhead.appdecor.CarUiEntry");
            Constructor<?>[] constructors = loadClass.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (objArr.length == constructor.getParameterTypes().length) {
                    break;
                }
                i++;
            }
            if (constructor == null) {
                throw new IllegalStateException("Cannot find SDK entry constructor.");
            }
            try {
                this.q = constructor.newInstance(objArr);
                a(loadClass.getDeclaredMethods());
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new IllegalStateException("Unable to load SDK entry class.", e);
            }
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Unable to load SDK class com.google.android.gearhead.appdecor.CarUiEntry", e2);
        }
    }

    protected abstract void a(Method[] methodArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b(Method method, Object... objArr) {
        if (method != null) {
            try {
                return method.invoke(this.q, objArr);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                if (String.valueOf(method.getName()).length() == 0) {
                    new String("Error invoking: ");
                }
                return null;
            }
        }
        new Exception();
        return null;
    }
}

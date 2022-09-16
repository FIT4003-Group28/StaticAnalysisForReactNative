package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: dujb  reason: default package */
/* loaded from: classes6.dex */
public final class dujb {
    private Context a;
    private ILoadedInstanceCreator b;
    private final dujc c;

    public dujb(dujc dujcVar) {
        this.c = dujcVar;
    }

    private static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.dynamite.LoadedInstanceCreator", e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.dynamite.LoadedInstanceCreator", e3);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("No constructor for dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e5);
        }
    }

    public final synchronized ILoadedInstanceCreator a(Context context) {
        ILoadedInstanceCreator duixVar;
        if (this.b == null) {
            IBinder c = c(b(context).getClassLoader());
            if (c == null) {
                duixVar = null;
            } else {
                IInterface queryLocalInterface = c.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                    duixVar = (ILoadedInstanceCreator) queryLocalInterface;
                } else {
                    duixVar = new duix(c);
                }
            }
            this.b = duixVar;
        }
        return this.b;
    }

    public final synchronized Context b(Context context) {
        if (this.a == null) {
            try {
                this.a = context.createPackageContext(this.c.a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new duja();
            }
        }
        return this.a;
    }
}

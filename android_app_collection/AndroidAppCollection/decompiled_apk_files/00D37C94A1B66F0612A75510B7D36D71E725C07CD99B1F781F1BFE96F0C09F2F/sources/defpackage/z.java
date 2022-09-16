package defpackage;

import android.app.Application;
import android.arch.lifecycle.SavedStateHandleController;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: z  reason: default package */
/* loaded from: classes4.dex */
public final class z extends af {
    private static final Class[] a = {Application.class, x.class};
    private static final Class[] b = {x.class};
    private final Application c;
    private final ae d;
    private final Bundle e;
    private final apu f;
    private final blj g;

    public z(Application application, bll bllVar, Bundle bundle) {
        ae b2;
        this.g = bllVar.getSavedStateRegistry();
        this.f = bllVar.getLifecycle();
        this.e = bundle;
        this.c = application;
        if (application != null) {
            if (ad.a == null) {
                ad.a = new ad(application);
            }
            b2 = ad.a;
        } else {
            b2 = ag.b();
        }
        this.d = b2;
    }

    private static Constructor d(Class cls, Class[] clsArr) {
        Constructor<?>[] constructors;
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // defpackage.af, defpackage.ae
    public final ac a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b(canonicalName, cls);
    }

    @Override // defpackage.af
    public final ac b(String str, Class cls) {
        Constructor d;
        ac acVar;
        boolean isAssignableFrom = b.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.c == null) {
            d = d(cls, b);
        } else {
            d = d(cls, a);
        }
        if (d == null) {
            return this.d.a(cls);
        }
        SavedStateHandleController b2 = SavedStateHandleController.b(this.g, this.f, str, this.e);
        if (isAssignableFrom) {
            try {
                Application application = this.c;
                if (application != null) {
                    acVar = (ac) d.newInstance(application, b2.a);
                    acVar.c(b2);
                    return acVar;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        acVar = (ac) d.newInstance(b2.a);
        acVar.c(b2);
        return acVar;
    }

    @Override // defpackage.ah
    public final void c(ac acVar) {
        SavedStateHandleController.c(acVar, this.g, this.f);
    }
}

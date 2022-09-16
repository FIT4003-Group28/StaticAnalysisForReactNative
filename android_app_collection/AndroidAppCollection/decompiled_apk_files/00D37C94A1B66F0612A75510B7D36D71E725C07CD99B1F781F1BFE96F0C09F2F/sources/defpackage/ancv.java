package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancv  reason: default package */
/* loaded from: classes.dex */
public class ancv {
    public static int d(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String e(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static ancd f() {
        try {
            try {
                try {
                    return (ancd) ancn.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
                    return (ancd) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                return (ancd) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static Collection g(Collection collection, Object obj) {
        return new amzc(collection, obj);
    }

    public static Collection h(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return k((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return j((Set) collection, obj);
        }
        if (collection instanceof List) {
            return i((List) collection, obj);
        }
        return g(collection, obj);
    }

    public static List i(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return new amzi(list, obj);
        }
        return new amzd(list, obj);
    }

    public static Set j(Set set, Object obj) {
        return new amzj(set, obj);
    }

    public static SortedSet k(SortedSet sortedSet, Object obj) {
        return new amzk(sortedSet, obj);
    }

    public static anxq l(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!anxq.class.isAssignableFrom(cls)) {
                throw new anyd(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            }
            return (anxq) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e);
            return null;
        } catch (IllegalAccessException e2) {
            throw new anyd(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new anyd(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new anyd(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new anyd(String.format("Could not instantiate %s", str), e5);
        }
    }

    public static anwu m(Status status, String str) {
        qnm.b(status);
        String str2 = status.h;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.g) {
            case 17510:
                return new anww(str);
            case 17511:
                return new anwx(str);
            case 17512:
            default:
                return new anwu(str);
            case 17513:
                return new anwv(str);
            case 17514:
                return new anwt(str);
        }
    }

    public static Thing.Metadata n(boolean z, int i, String str, Bundle bundle) {
        return new Thing.Metadata(z, i, str, bundle, null);
    }

    public static int o(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public anbj a() {
        return anbi.a;
    }

    public andd b() {
        return andd.b;
    }

    public void c(String str, Level level, boolean z) {
    }
}

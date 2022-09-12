package defpackage;

import com.google.common.flogger.backend.google.GooglePlatform;
import java.lang.reflect.InvocationTargetException;
/* renamed from: dcsi  reason: default package */
/* loaded from: classes.dex */
public final class dcsi {
    public static dcsh a() {
        try {
            try {
                try {
                    return (dcsh) dcsu.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
                    return (dcsh) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                return (dcsh) dcth.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
            return null;
        }
    }
}

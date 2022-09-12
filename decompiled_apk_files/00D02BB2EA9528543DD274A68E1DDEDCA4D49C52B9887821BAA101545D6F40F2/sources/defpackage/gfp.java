package defpackage;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* renamed from: gfp  reason: default package */
/* loaded from: classes6.dex */
public final class gfp {
    public static final <T extends fd> T a(Class<T> cls, @dzsi Bundle bundle) {
        try {
            T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                newInstance.B(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(String.valueOf(cls.getSimpleName()).concat(" must have a public no-arg constructor"), e);
        }
    }
}

package defpackage;

import com.google.android.filament.Engine;
import com.google.android.filament.Scene;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: dbdo  reason: default package */
/* loaded from: classes5.dex */
public class dbdo {
    private static final Method a;
    private static final Method b;

    public String toString() {
        throw null;
    }

    static {
        try {
            Method declaredMethod = Engine.class.getDeclaredMethod("getNativeObject", new Class[0]);
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Scene.class.getDeclaredMethod("getNativeObject", new Class[0]);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception e) {
            throw new IllegalStateException("Couldn't get native getters", e);
        }
    }
}

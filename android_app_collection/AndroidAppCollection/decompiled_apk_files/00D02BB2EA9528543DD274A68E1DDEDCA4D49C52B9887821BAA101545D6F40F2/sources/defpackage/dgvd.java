package defpackage;

import java.lang.reflect.Modifier;
/* compiled from: PG */
/* renamed from: dgvd  reason: default package */
/* loaded from: classes6.dex */
public abstract class dgvd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (!Modifier.isAbstract(modifiers)) {
        } else {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public abstract <T> T a(Class<T> cls);
}

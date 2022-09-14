package defpackage;

import dalvik.system.PathClassLoader;
/* compiled from: PG */
/* renamed from: cobc  reason: default package */
/* loaded from: classes5.dex */
final class cobc extends PathClassLoader {
    public cobc(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}

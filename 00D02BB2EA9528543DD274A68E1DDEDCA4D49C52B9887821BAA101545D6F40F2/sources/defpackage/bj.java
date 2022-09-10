package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bj  reason: default package */
/* loaded from: classes3.dex */
public final class bj {
    public static <T extends bn> bk<T> a(Context context, Class<T> cls, String str) {
        if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new bk<>(context, cls, str);
    }

    public static <T extends bn> bk<T> b(Context context, Class<T> cls) {
        return new bk<>(context, cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, C> T c(Class<C> cls) {
        String str;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str2 = canonicalName.replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str2;
            } else {
                str = name + "." + str2;
            }
            return (T) Class.forName(str, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }
}

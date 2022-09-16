package defpackage;
/* compiled from: PG */
/* renamed from: azrq  reason: default package */
/* loaded from: classes2.dex */
public final class azrq {
    public static final /* synthetic */ int a = 0;

    static {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int l = ayme.l(property, 0, 6);
            try {
                if (l < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = l + 1;
                    int l2 = ayme.l(property, i2, 4);
                    if (l2 < 0) {
                        l2 = property.length();
                    }
                    String substring = property.substring(0, l);
                    substring.getClass();
                    String substring2 = property.substring(i2, l2);
                    substring2.getClass();
                    i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i >= 65544) {
            try {
                try {
                    Object newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                    newInstance.getClass();
                    try {
                        azrp azrpVar = (azrp) newInstance;
                        return;
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = azrp.class.getClassLoader();
                        Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                        initCause.getClass();
                        throw initCause;
                    }
                } catch (ClassNotFoundException unused2) {
                    Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    newInstance2.getClass();
                    try {
                        azrp azrpVar2 = (azrp) newInstance2;
                        return;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = azrp.class.getClassLoader();
                        Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                        initCause2.getClass();
                        throw initCause2;
                    }
                }
            } catch (ClassNotFoundException unused3) {
            }
        }
        if (i >= 65543) {
            try {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                    newInstance3.getClass();
                    try {
                        azrp azrpVar3 = (azrp) newInstance3;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader6 = azrp.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        initCause3.getClass();
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    newInstance4.getClass();
                    try {
                        azrp azrpVar4 = (azrp) newInstance4;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = azrp.class.getClassLoader();
                        Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                        initCause4.getClass();
                        throw initCause4;
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
        }
    }
}

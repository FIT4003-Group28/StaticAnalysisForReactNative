package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
/* compiled from: PG */
/* renamed from: dcsu  reason: default package */
/* loaded from: classes.dex */
public final class dcsu extends dcsh {
    private static final boolean a = dcst.a();
    private static final boolean b;
    private static final dcsg c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new dcss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return dcst.class.getName().equals(r());
        } catch (Throwable unused) {
            return false;
        }
    }

    static String r() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> s() {
        return VMStack.getStackClass2();
    }

    @Override // defpackage.dcsh
    protected dcsg b() {
        return c;
    }

    @Override // defpackage.dcsh
    protected dcrl d(String str) {
        if (dcsy.a.get() != null) {
            return dcsy.a.get().a(str);
        }
        dcsy dcsyVar = new dcsy(str.replace('$', '.'));
        dcsw.a.offer(dcsyVar);
        if (dcsy.a.get() == null) {
            return dcsyVar;
        }
        dcsy.e();
        return dcsyVar;
    }

    @Override // defpackage.dcsh
    protected String o() {
        return "platform: Android";
    }
}

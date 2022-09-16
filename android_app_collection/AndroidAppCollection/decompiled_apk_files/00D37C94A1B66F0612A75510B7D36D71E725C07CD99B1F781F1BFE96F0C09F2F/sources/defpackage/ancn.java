package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
/* compiled from: PG */
/* renamed from: ancn  reason: default package */
/* loaded from: classes.dex */
public final class ancn extends ancd {
    private static final boolean a = ancm.a();
    private static final boolean b;
    private static final ancc c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new ancl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return ancm.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.ancd
    protected anbf e(String str) {
        if (ancq.a.get() != null) {
            return ((anci) ancq.a.get()).a(str);
        }
        ancq ancqVar = new ancq(str.replace('$', '.'));
        anco.a.offer(ancqVar);
        if (ancq.a.get() == null) {
            return ancqVar;
        }
        ancq.e();
        return ancqVar;
    }

    @Override // defpackage.ancd
    protected ancc h() {
        return c;
    }

    @Override // defpackage.ancd
    protected ancv j() {
        return ancr.a;
    }

    @Override // defpackage.ancd
    protected String m() {
        return "platform: Android";
    }
}

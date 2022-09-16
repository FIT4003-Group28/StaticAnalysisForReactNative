package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aek  reason: default package */
/* loaded from: classes.dex */
public class aek {
    public aek() {
    }

    public aek(ahh ahhVar) {
        new WeakReference(ahhVar);
        agy.o(ahhVar.f46J);
        agy.o(ahhVar.K);
        agy.o(ahhVar.L);
        agy.o(ahhVar.M);
        agy.o(ahhVar.N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }

    public static int[] c() {
        return new int[]{1, 2, 3};
    }
}

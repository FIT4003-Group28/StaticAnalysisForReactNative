package defpackage;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afiq  reason: default package */
/* loaded from: classes.dex */
public final class afiq implements afip {
    private static final Set<String> a;

    static {
        HashSet c = dcnm.c();
        a = c;
        c.add("com.google.android.googlequicksearchbox");
        c.add("com.google.android.apps.gmm.tools.intent");
    }

    public static boolean c(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("sender");
        String targetPackage = pendingIntent != null ? pendingIntent.getTargetPackage() : null;
        return "google.navigation".equals(intent.getScheme()) && intent.getBooleanExtra("forcescreenon", false) && intent.getBooleanExtra("noconfirm", false) && (context.getPackageName().equals(targetPackage) || (a.contains(targetPackage) && targetPackage != null && btsj.a(context, targetPackage))) && d(context);
    }

    public static boolean d(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (powerManager == null || powerManager.isScreenOn()) {
            return keyguardManager != null && keyguardManager.isKeyguardLocked();
        }
        return true;
    }

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        Uri data = intent.getData();
        return data != null && "google.navigation".equalsIgnoreCase(data.getScheme());
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        afij afijVar = new afij(intent.getData().toString());
        if (afijVar.a()) {
            int intExtra = intent.getIntExtra("ve_type", -1);
            String stringExtra = intent.getStringExtra("ved");
            String stringExtra2 = intent.getStringExtra("ei");
            ddho d = cjth.d(intExtra);
            afhz afhzVar = new afhz();
            afhzVar.a = afijVar.a;
            afhzVar.i = afijVar.b;
            afhzVar.j = afijVar.c;
            afhzVar.k = afijVar.d;
            afhzVar.l = afijVar.h;
            afhzVar.m = afijVar.i;
            afhzVar.o = afijVar.k;
            afhzVar.s = afijVar.j;
            afhzVar.z = afhw.a(afijVar.e);
            afhzVar.A = afijVar.f;
            afhzVar.B = afijVar.g;
            afhzVar.G = str;
            afhzVar.O = d;
            afhzVar.P = stringExtra;
            afhzVar.Q = stringExtra2;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                afhzVar.N = extras.getBoolean("GMM_ENABLE_ONE_BACK_TAP", false);
            }
            return afhzVar.a();
        }
        return null;
    }
}

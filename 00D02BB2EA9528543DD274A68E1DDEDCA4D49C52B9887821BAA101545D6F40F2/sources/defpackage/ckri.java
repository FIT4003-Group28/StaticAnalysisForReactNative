package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: ckri  reason: default package */
/* loaded from: classes.dex */
public final class ckri {
    public static final Intent a = new Intent("com.google.android.search.core.action.PROXY_VOICE_BUTTON").setPackage("com.google.android.googlequicksearchbox").setFlags(268435456);
    public static final Intent b;
    public static final Intent c;
    public static final Intent d;

    static {
        new Intent("com.google.android.search.core.action.PROXY_VOICE_BUTTON").setPackage("com.google.android.googlequicksearchbox").setFlags(268435456).putExtra("prompt", true);
        b = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        c = new Intent("com.google.android.googlequicksearchbox.action.HOTWORD_DETECTION_SETTINGS").setPackage("com.google.android.googlequicksearchbox");
        d = new Intent("com.google.android.search.core.action.PROXY_VOICE_CANCEL").setPackage("com.google.android.googlequicksearchbox").putExtra("cancel", true);
    }

    public static boolean a(Context context, @dzsi akfa akfaVar, @dzsi dkiy dkiyVar) {
        return (akfaVar == null || !btlu.n(akfaVar.j())) && c(context) != null && dkiyVar != null && dkiyVar.v;
    }

    @dzsi
    public static Intent b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = b;
        if (afhl.a(packageManager, intent)) {
            return new Intent(intent);
        }
        return null;
    }

    @dzsi
    public static Intent c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = a;
        if (afhl.a(packageManager, intent)) {
            Intent intent2 = new Intent(intent);
            intent2.putExtra("com.google.android.search.core.extra.CLIENT_PACKAGE_NAME", context.getPackageName());
            return intent2;
        }
        return null;
    }

    @dzsi
    public static Intent d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = d;
        if (afhl.a(packageManager, intent)) {
            Intent intent2 = new Intent(intent);
            intent2.putExtra("com.google.android.search.core.extra.CLIENT_PACKAGE_NAME", context.getPackageName());
            return intent2;
        }
        return null;
    }

    public static boolean e(Context context) {
        return f(context) != null;
    }

    @dzsi
    public static Intent f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = c;
        if (afhl.a(packageManager, intent)) {
            return intent;
        }
        return null;
    }

    public static boolean g(@dzsi dmcf dmcfVar) {
        return (dmcfVar == null || dmcfVar == dmcf.ERROR || dmcfVar == dmcf.HELP || dmcfVar == dmcf.SEARCH) ? false : true;
    }
}

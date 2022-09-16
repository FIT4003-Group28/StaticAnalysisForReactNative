package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.vr.ndk.base.DaydreamApi;
/* compiled from: PG */
/* renamed from: ahss  reason: default package */
/* loaded from: classes.dex */
public final class ahss {
    private static final ComponentName a = new ComponentName("com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");
    private static final ComponentName b = new ComponentName("com.google.android.apps.youtube.vr.oculus", "com.google.android.apps.youtube.vr.activities.YouTubeVrActivity");

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.player.features.gl.vr.VrWelcomeActivity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Context context) {
        return (context == null || g(context, "com.oculus.horizon") == null) ? false : true;
    }

    public static boolean e(Context context, int i) {
        PackageInfo g;
        int i2 = i - 1;
        String str = i2 != 1 ? i2 != 2 ? null : "com.google.android.apps.youtube.vr.oculus" : "com.google.android.apps.youtube.vr";
        return !TextUtils.isEmpty(str) && (g = g(context, str)) != null && ((long) g.versionCode) > 10199000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Context context, int i) {
        if (context != null) {
            int i2 = i - 1;
            if (i2 == 1) {
                return DaydreamApi.isDaydreamReadyPlatform(context);
            }
            if (i2 == 2) {
                return b(context);
            }
            return false;
        }
        return false;
    }

    private static PackageInfo g(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static void h(airr airrVar, Intent intent) {
        if (airrVar == null || intent == null || TextUtils.isEmpty(airrVar.q())) {
            return;
        }
        aopa createBuilder = ory.a.createBuilder();
        int g = airrVar.g();
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        oryVar.b |= 4;
        oryVar.f = g;
        boolean d = airrVar.d();
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        oryVar2.b |= 1024;
        oryVar2.n = !d;
        long i = airrVar.i();
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 256;
        oryVar3.l = i;
        if (!TextUtils.isEmpty(airrVar.q())) {
            String q = airrVar.q();
            createBuilder.copyOnWrite();
            ory oryVar4 = (ory) createBuilder.instance;
            q.getClass();
            oryVar4.b |= 1;
            oryVar4.c = q;
        }
        if (!TextUtils.isEmpty(airrVar.p())) {
            String p = airrVar.p();
            createBuilder.copyOnWrite();
            ory oryVar5 = (ory) createBuilder.instance;
            p.getClass();
            oryVar5.b |= 2;
            oryVar5.e = p;
        }
        intent.putExtra("playback_start_descriptor_proto", ((ory) createBuilder.mo39build()).toByteArray());
        intent.setData(TextUtils.isEmpty(airrVar.q()) ? null : zgt.o(airrVar.q(), airrVar.p(), airrVar.g(), airrVar.i() / 1000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.oculus.com/experiences/gear-vr/1458129140982015/"));
            }
            return null;
        }
        return new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.youtube.vr")).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
    }

    public static void d(Context context, int i, DaydreamApi daydreamApi, airr airrVar) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2 && context != null) {
                Intent addFlags = new Intent().setComponent(b).addFlags(335609856);
                h(airrVar, addFlags);
                context.startActivity(addFlags);
            }
        } else if (daydreamApi != null) {
            Intent action = DaydreamApi.createVrIntent(a).setAction("android.intent.action.VIEW");
            h(airrVar, action);
            daydreamApi.launchInVr(action);
        }
        if (airrVar != null) {
            airrVar.a();
        }
    }
}

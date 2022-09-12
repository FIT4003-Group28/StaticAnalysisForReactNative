package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
/* renamed from: bwhl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bwhl {
    public static boolean a(Context context) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("sms:"));
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), intent.getFlags());
        return resolveActivityInfo != null && resolveActivityInfo.enabled && resolveActivityInfo.exported;
    }
}

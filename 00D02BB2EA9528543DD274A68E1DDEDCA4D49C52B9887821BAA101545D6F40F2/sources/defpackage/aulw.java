package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: aulw  reason: default package */
/* loaded from: classes2.dex */
public final class aulw {
    public final Context a;
    public final auhi b;
    public final dxio<akfa> c;
    public final bmdv d;
    public final auhj e;

    public aulw(Application application, auhi auhiVar, dxio<akfa> dxioVar, bmdv bmdvVar, auhj auhjVar) {
        this.a = application;
        this.b = auhiVar;
        this.c = dxioVar;
        this.d = bmdvVar;
        this.e = auhjVar;
    }

    public static boolean b(pap papVar) {
        return !papVar.b.isEmpty() && !papVar.c.isEmpty();
    }

    public static final int c() {
        return dpyv.TIMELINE_VISIT_CONFIRMATION.dm;
    }

    public final Intent a(String str, String str2, dljd dljdVar) {
        Intent intent = new Intent();
        String packageName = this.a.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 29);
        sb.append(packageName);
        sb.append(".");
        sb.append("TimelineNotificationActivity");
        intent.setComponent(new ComponentName(packageName, sb.toString()));
        intent.putExtra("action_type", str);
        intent.putExtra("obfuscated_gaia_id", str2);
        intent.putExtra("payload", dljdVar.bS());
        return intent;
    }
}

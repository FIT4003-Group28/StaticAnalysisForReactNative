package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bynu  reason: default package */
/* loaded from: classes.dex */
public final class bynu extends afhx {
    public final dxio<byej> a;
    public final boolean b;
    @dzsi
    public final dljj c;
    private final gga j;
    @dzsi
    private static final String e = afhw.b(ddjr.TRAFFIC_HUB_LAUNCHER_SHORTCUT);
    @dzsi
    private static final String i = afhw.b(ddjr.TRAFFIC_HUB_AREA_TRAFFIC_WARM_UP_NOTIFICATION);
    public static final dbsl<afga> d = bynt.a;

    public bynu(Intent intent, @dzsi String str, gga ggaVar, auhi auhiVar, dxio<byej> dxioVar, cjqy cjqyVar, byps bypsVar) {
        super(intent, str, afid.TRAFFIC_HUB);
        boolean z;
        Bundle extras = intent.getExtras();
        dljj dljjVar = null;
        if (extras != null) {
            z = extras.getBoolean("extra_show_notification_settings_promo_key");
            if (extras.getBoolean("extra_suppress_area_traffic_warm_up_key")) {
                bypsVar.a();
            }
            if (extras.getBoolean("extra_area_traffic_notification_opt_in_key")) {
                auhiVar.e(dpyv.AREA_TRAFFIC.dm, aufs.ENABLED);
            }
            if (extras.getBoolean("extra_traffic_hub_system_launcher_shortcut_key")) {
                cjqyVar.i(cjtd.a(dtxu.m));
            }
            if (extras.containsKey("extra_traffic_hub_params_key")) {
                dljjVar = (dljj) bvrs.f(extras, "extra_traffic_hub_params_key", (dssr) dljj.b.cu(7));
            }
        } else {
            z = false;
        }
        this.j = ggaVar;
        this.a = dxioVar;
        this.b = z;
        this.c = dljjVar;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 19);
        sb.append(packageName);
        sb.append(".");
        sb.append("TrafficHubActivity");
        intent.setComponent(new ComponentName(context, sb.toString()));
        intent.putExtra("extra_show_notification_settings_promo_key", true);
        intent.putExtra("extra_suppress_area_traffic_warm_up_key", true);
        intent.putExtra("extra_area_traffic_notification_opt_in_key", true);
        String str = i;
        if (str != null) {
            intent.putExtra("extra_traffic_hub_intent_source_key", str);
        }
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 19);
        sb.append(packageName);
        sb.append(".");
        sb.append("TrafficHubActivity");
        intent.setComponent(new ComponentName(context, sb.toString()));
        String str = e;
        if (str != null) {
            intent.putExtra("extra_traffic_hub_intent_source_key", str);
        }
        return intent;
    }

    @Override // defpackage.afhx
    public final void a() {
        affw.a(this.f, this.j, new Runnable(this) { // from class: byns
            private final bynu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bynu bynuVar = this.a;
                bynuVar.a.a().j(bynuVar.b, bynuVar.c);
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TRAFFIC_HUB;
    }

    @Override // defpackage.afhx
    @dzsi
    public final ddjr k() {
        if (this.f.getExtras() == null || this.f.getExtras().getString("extra_traffic_hub_intent_source_key") == null) {
            return null;
        }
        return afhw.a(this.f.getExtras().getString("extra_traffic_hub_intent_source_key"));
    }
}

package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: btbb  reason: default package */
/* loaded from: classes.dex */
public final class btbb extends afhx {
    public static final dbsl<afga> a = btba.a;
    private final dxio<bsvm> b;
    private final byps c;
    private final auhi d;

    public btbb(Intent intent, @dzsi String str, dxio<bsvm> dxioVar, byps bypsVar, auhi auhiVar) {
        super(intent, str, afid.NOTIFICATION_SETTINGS);
        this.b = dxioVar;
        this.c = bypsVar;
        this.d = auhiVar;
    }

    public static boolean d(Intent intent) {
        return intent.getCategories() != null && !intent.getCategories().isEmpty() && intent.getCategories().contains("android.intent.category.NOTIFICATION_PREFERENCES");
    }

    @Override // defpackage.afhx
    public final void a() {
        aufs aufsVar;
        Bundle extras = this.f.getExtras();
        if (extras != null && extras.containsKey("notification_id")) {
            int i = extras.getInt("notification_id", dpyv.UNKNOWN_NOTIFICATION_ID.dm);
            aujb g = this.d.g(i);
            if (g != null && extras.containsKey("notification_opting")) {
                auhi auhiVar = this.d;
                int i2 = g.a;
                if (extras.getBoolean("notification_opting", false)) {
                    aufsVar = aufs.ENABLED;
                } else {
                    aufsVar = aufs.DISABLED;
                }
                auhiVar.e(i2, aufsVar);
            }
            if (i == dpyv.AREA_TRAFFIC.dm || i == dpyv.AREA_TRAFFIC_WARM_UP.dm) {
                this.c.a();
                this.b.a().p();
                return;
            } else if (g != null && extras.containsKey("use_settings_leaf_page") && extras.getBoolean("use_settings_leaf_page", false)) {
                this.b.a().o(g);
                return;
            } else if (g != null) {
                this.b.a().m(g.w());
                return;
            }
        }
        this.b.a().m(null);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_NOTIFICATION_SETTINGS;
    }
}

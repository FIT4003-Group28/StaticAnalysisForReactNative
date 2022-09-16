package defpackage;
/* compiled from: PG */
/* renamed from: axqs  reason: default package */
/* loaded from: classes2.dex */
public final class axqs implements axqr {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;
    public static final vdg d;

    static {
        vdl f = new vdl("com.google.android.libraries.notifications").f();
        a = f.d("SystemTrayFeature__enable_html_tags", true);
        b = f.c("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = f.d("SystemTrayFeature__forced_notifications_storage_update", false);
        d = f.d("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }

    @Override // defpackage.axqr
    public final String a() {
        return (String) b.get();
    }

    @Override // defpackage.axqr
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axqr
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.axqr
    public final boolean d() {
        return ((Boolean) d.get()).booleanValue();
    }
}

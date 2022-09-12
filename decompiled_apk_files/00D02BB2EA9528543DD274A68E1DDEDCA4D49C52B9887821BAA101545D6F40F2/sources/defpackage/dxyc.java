package defpackage;
/* compiled from: PG */
/* renamed from: dxyc  reason: default package */
/* loaded from: classes6.dex */
public final class dxyc implements dxyb {
    public static final cxju<Boolean> a;
    public static final cxju<String> b;
    public static final cxju<Boolean> c;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        a = cxjsVar.h("SystemTrayFeature__drop_after_max_notification_count_reached", true);
        b = cxjsVar.j("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = cxjsVar.h("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }

    @Override // defpackage.dxyb
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxyb
    public final String b() {
        return b.f();
    }

    @Override // defpackage.dxyb
    public final boolean c() {
        return c.f().booleanValue();
    }
}

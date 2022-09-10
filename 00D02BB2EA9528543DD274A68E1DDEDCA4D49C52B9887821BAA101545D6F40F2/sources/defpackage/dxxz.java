package defpackage;
/* compiled from: PG */
/* renamed from: dxxz  reason: default package */
/* loaded from: classes6.dex */
public final class dxxz implements dxxx {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        cxjsVar.i("RichNotificationFeature__default_aspect_ratio", 1.777d);
        cxjsVar.h("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        a = cxjsVar.h("RichNotificationFeature__enable_reply", true);
        b = cxjsVar.h("RichNotificationFeature__enable_snooze_action", false);
        c = cxjsVar.h("RichNotificationFeature__enable_turn_off_action", false);
        try {
            cxjsVar.k("RichNotificationFeature__enlarged_image_layout", (cvta) dsqw.cq(cvta.a, new byte[]{8, 0}), dxxy.a);
            cxjsVar.i("RichNotificationFeature__max_aspect_ratio", 2.5d);
            cxjsVar.i("RichNotificationFeature__min_aspect_ratio", 0.75d);
        } catch (dsrm unused) {
            throw new AssertionError("Could not parse proto flag \"RichNotificationFeature__enlarged_image_layout\"");
        }
    }

    @Override // defpackage.dxxx
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dxxx
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dxxx
    public final boolean c() {
        return c.f().booleanValue();
    }
}

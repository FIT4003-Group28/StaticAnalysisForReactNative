package defpackage;
/* compiled from: PG */
/* renamed from: axqm  reason: default package */
/* loaded from: classes2.dex */
public final class axqm implements axql {
    public static final vdg a;
    public static final vdg b;
    public static final vdg c;
    public static final vdg d;
    public static final vdg e;
    public static final vdg f;
    public static final vdg g;
    public static final vdg h;

    static {
        vdl f2 = new vdl("com.google.android.libraries.notifications").f();
        a = f2.a("RichNotificationFeature__default_aspect_ratio", 1.777d);
        b = f2.d("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        c = f2.d("RichNotificationFeature__enable_reply", true);
        d = f2.d("RichNotificationFeature__enable_snooze_action", false);
        e = f2.d("RichNotificationFeature__enable_turn_off_action", false);
        try {
            f = f2.e("RichNotificationFeature__enlarged_image_layout", (uin) aopi.parseFrom(uin.a, new byte[]{8, 0}), vdh.f);
            g = f2.a("RichNotificationFeature__max_aspect_ratio", 2.5d);
            h = f2.a("RichNotificationFeature__min_aspect_ratio", 0.75d);
        } catch (aopx unused) {
            throw new AssertionError("Could not parse proto flag \"RichNotificationFeature__enlarged_image_layout\"");
        }
    }

    @Override // defpackage.axql
    public final double a() {
        return ((Double) a.get()).doubleValue();
    }

    @Override // defpackage.axql
    public final double b() {
        return ((Double) g.get()).doubleValue();
    }

    @Override // defpackage.axql
    public final double c() {
        return ((Double) h.get()).doubleValue();
    }

    @Override // defpackage.axql
    public final uin d() {
        return (uin) f.get();
    }

    @Override // defpackage.axql
    public final boolean e() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.axql
    public final boolean f() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.axql
    public final boolean g() {
        return ((Boolean) d.get()).booleanValue();
    }

    @Override // defpackage.axql
    public final boolean h() {
        return ((Boolean) e.get()).booleanValue();
    }
}

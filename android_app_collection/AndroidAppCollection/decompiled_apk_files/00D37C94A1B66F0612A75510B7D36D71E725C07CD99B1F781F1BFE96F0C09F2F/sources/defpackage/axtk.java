package defpackage;
/* compiled from: PG */
/* renamed from: axtk  reason: default package */
/* loaded from: classes2.dex */
public final class axtk implements axtj {
    public static final vbt a;
    public static final vbt b;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        a = vbrVar.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        vbrVar.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        b = vbrVar.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        vbrVar.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.axtj
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axtj
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}

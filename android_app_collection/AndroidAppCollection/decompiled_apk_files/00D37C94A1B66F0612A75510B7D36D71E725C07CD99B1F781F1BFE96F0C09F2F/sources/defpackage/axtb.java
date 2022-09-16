package defpackage;
/* compiled from: PG */
/* renamed from: axtb  reason: default package */
/* loaded from: classes2.dex */
public final class axtb implements axta {
    public static final vbt a;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        vbrVar.f("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        a = vbrVar.f("measurement.collection.redundant_engagement_removal_enabled", false);
        vbrVar.d("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // defpackage.axta
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}

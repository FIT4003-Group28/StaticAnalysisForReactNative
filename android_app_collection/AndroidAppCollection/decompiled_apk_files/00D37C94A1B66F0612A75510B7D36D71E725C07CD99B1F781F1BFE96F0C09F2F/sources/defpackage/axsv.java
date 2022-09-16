package defpackage;
/* compiled from: PG */
/* renamed from: axsv  reason: default package */
/* loaded from: classes2.dex */
public final class axsv implements axsu {
    public static final vbt a;
    public static final vbt b;
    public static final vbt c;

    static {
        vbr vbrVar = new vbr(vbi.a("com.google.android.gms.measurement"));
        vbrVar.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = vbrVar.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = vbrVar.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = vbrVar.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.axsu
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axsu
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axsu
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    @Override // defpackage.axsu
    public final void d() {
    }
}

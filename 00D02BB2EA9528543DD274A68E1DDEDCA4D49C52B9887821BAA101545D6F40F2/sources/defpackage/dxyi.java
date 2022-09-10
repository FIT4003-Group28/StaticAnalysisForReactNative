package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dxyi  reason: default package */
/* loaded from: classes6.dex */
public final class dxyi implements dxyh {
    public static final cxmb<Boolean> a;
    public static final cxmb<Long> b;
    public static final cxmb<Boolean> c;
    public static final cxmb<Long> d;
    public static final cxmb<Boolean> e;

    static {
        cxml a2 = new cxml("com.google.android.libraries.personalization.footprints").a();
        a = a2.d("FacsCacheLibraryFeature__dasu_logging_enabled", false);
        b = a2.c("FacsCacheLibraryFeature__dasu_logging_sampling_interval", 1000L);
        c = a2.d("FacsCacheLibraryFeature__event_logging_enabled", false);
        d = a2.c("FacsCacheLibraryFeature__event_logging_sampling_interval", 1000L);
        e = a2.d("FacsCacheLibraryFeature__use_execution_sequencer", true);
    }

    @Override // defpackage.dxyh
    public final boolean a(Context context) {
        return a.b(context).booleanValue();
    }

    @Override // defpackage.dxyh
    public final long b(Context context) {
        return b.b(context).longValue();
    }

    @Override // defpackage.dxyh
    public final boolean c(Context context) {
        return c.b(context).booleanValue();
    }

    @Override // defpackage.dxyh
    public final long d(Context context) {
        return d.b(context).longValue();
    }

    @Override // defpackage.dxyh
    public final boolean e(Context context) {
        return e.b(context).booleanValue();
    }
}

package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rvm  reason: default package */
/* loaded from: classes4.dex */
public final class rvm {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("usage_and_diagnostics_listener", 1L);
        a = feature;
        Feature feature2 = new Feature("usage_and_diagnostics_consents", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}

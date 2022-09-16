package defpackage;
/* compiled from: PG */
/* renamed from: dybe  reason: default package */
/* loaded from: classes6.dex */
public final class dybe implements dybd {
    public static final cxju<Boolean> a;
    public static final cxju<Long> b;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("LoadExtendedDeviceDataFeature__bypass_loader_when_disabled", true);
        cxjsVar.h("LoadExtendedDeviceDataFeature__enable_local_photo_index", false);
        cxjsVar.g("LoadExtendedDeviceDataFeature__local_photo_index_limit", 500L);
        b = cxjsVar.g("LoadExtendedDeviceDataFeature__max_sql_contact_ids", 500L);
    }

    @Override // defpackage.dybd
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dybd
    public final long b() {
        return b.f().longValue();
    }
}

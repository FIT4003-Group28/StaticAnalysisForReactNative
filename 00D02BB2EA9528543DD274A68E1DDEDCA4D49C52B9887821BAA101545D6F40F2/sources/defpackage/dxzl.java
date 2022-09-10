package defpackage;
/* compiled from: PG */
/* renamed from: dxzl  reason: default package */
/* loaded from: classes6.dex */
public final class dxzl implements dxzk {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs(cxjd.a("com.google.android.gms.ulr"));
        cxjsVar.h("Ulr__enable_clearcut_lr_autoenabling_logging", true);
        cxjsVar.h("Ulr__enable_clearcut_lr_autoenabling_logging_storage_path", true);
        cxjsVar.h("Ulr__enable_clearcut_response_error_logging", false);
        a = cxjsVar.h("Ulr__enable_settings_implicit_intent_vulnerability_fix", true);
        cxjsVar.h("Ulr__never_init_ble", true);
        cxjsVar.h("Ulr__stop_place_detection_with_connectionless", true);
        cxjsVar.h("Ulr__use_public_flp_api", true);
    }

    @Override // defpackage.dxzk
    public final boolean a() {
        return a.f().booleanValue();
    }
}

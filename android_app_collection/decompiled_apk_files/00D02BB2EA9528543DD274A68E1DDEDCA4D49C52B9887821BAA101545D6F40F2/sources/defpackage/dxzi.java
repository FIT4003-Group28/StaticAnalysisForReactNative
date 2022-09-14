package defpackage;
/* compiled from: PG */
/* renamed from: dxzi  reason: default package */
/* loaded from: classes6.dex */
public final class dxzi implements dxzh {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs(cxjd.a("com.google.android.gms.icing"));
        cxjsVar.h("block_action_upload_if_data_sharing_disabled", false);
        cxjsVar.h("drop_usage_reports_for_account_mismatch", false);
        cxjsVar.h("enable_additional_type_for_email", true);
        a = cxjsVar.h("enable_client_grant_slice_permission", true);
        cxjsVar.h("enable_custom_action_url_generation", false);
        cxjsVar.h("enable_failure_response_for_apitask_exceptions", false);
        cxjsVar.h("enable_on_device_sharing_control_ui", false);
        cxjsVar.h("enable_safe_app_indexing_package_removal", true);
        cxjsVar.h("enable_slice_authority_validation", false);
        cxjsVar.h("redirect_user_actions_from_persistent_to_main", false);
        cxjsVar.h("type_access_whitelist_enforce_platform_permissions", true);
    }

    @Override // defpackage.dxzh
    public final boolean a() {
        return a.f().booleanValue();
    }
}

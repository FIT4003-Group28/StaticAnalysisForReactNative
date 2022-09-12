package defpackage;
/* compiled from: PG */
/* renamed from: dybn  reason: default package */
/* loaded from: classes6.dex */
public final class dybn implements dybm {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("MetricLoggerFeature__log_action_after_autocomplete_session_closed", true);
        cxjsVar.h("MetricLoggerFeature__log_query_length", true);
    }

    @Override // defpackage.dybm
    public final boolean a() {
        return a.f().booleanValue();
    }
}

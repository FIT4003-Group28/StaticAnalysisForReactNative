package defpackage;
/* compiled from: PG */
/* renamed from: dxyf  reason: default package */
/* loaded from: classes6.dex */
public final class dxyf implements dxye {
    public static final cxju<Boolean> a;

    static {
        cxjs cxjsVar = new cxjs("com.google.android.libraries.notifications.GCM");
        a = cxjsVar.h("UserFeedbackFeature__enable_ihnr_surveys", false);
        cxjsVar.h("UserFeedbackFeature__enable_insat_surveys", false);
    }

    @Override // defpackage.dxye
    public final boolean a() {
        return a.f().booleanValue();
    }
}

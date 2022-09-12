package defpackage;
/* compiled from: PG */
/* renamed from: dxzf  reason: default package */
/* loaded from: classes6.dex */
public final class dxzf implements dxze {
    public static final cxju<Boolean> a;

    static {
        cxjs b = new cxjs(cxjd.a("com.google.android.gms.feedback")).b();
        b.h("AndroidFeedback__fix_suggested_article_crash", true);
        b.h("AndroidFeedback__select_last_chosen_account_in_email_spinner", true);
        a = b.h("AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        b.h("AndroidFeedback__trim_feedback_submission", true);
    }

    @Override // defpackage.dxze
    public final boolean a() {
        return a.f().booleanValue();
    }
}

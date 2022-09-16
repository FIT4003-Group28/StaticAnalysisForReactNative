package defpackage;
/* compiled from: PG */
/* renamed from: axro  reason: default package */
/* loaded from: classes2.dex */
public final class axro implements axrn {
    public static final vbt a;

    static {
        vbr b = new vbr(vbi.a("com.google.android.gms.feedback")).b();
        b.f("AndroidFeedback__fix_suggested_article_crash", true);
        b.f("AndroidFeedback__select_last_chosen_account_in_email_spinner", true);
        a = b.f("AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        b.f("AndroidFeedback__trim_feedback_submission", true);
    }

    @Override // defpackage.axrn
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}

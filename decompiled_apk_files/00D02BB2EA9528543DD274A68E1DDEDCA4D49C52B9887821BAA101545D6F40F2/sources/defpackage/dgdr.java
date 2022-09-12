package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dgdr  reason: default package */
/* loaded from: classes6.dex */
public enum dgdr implements dsrb {
    UNKNOWN_CTA_INTENT(0),
    OPEN_BUSINESS_HOURS_EDITOR(1),
    OPEN_BUSINESS_CATEGORY_EDITOR(2),
    OPEN_BUSINESS_PHONE_NUMBER_EDITOR(3),
    START_AWX_FLOW(4),
    START_AWX_FLOW_WITH_COUPON(5),
    DISMISS_TEMPORARY(6),
    OPEN_GET_VERIFIED(35),
    OPEN_PHOTO_UPLOADER(9),
    OPEN_REVIEWS_DIALOGS(10),
    OPEN_PROFILE_SHARING_DIALOG(11),
    OPEN_REVIEW(12),
    VIEW_PHOTOS(17),
    ENABLE_MESSAGING(19),
    CREATE_STANDARD_LOCAL_POST(20),
    OPEN_ATTRIBUTE_UPDATE_FLOW(21),
    OPEN_BUSINESS_INFO_EDITOR(25),
    START_HOTELIER_ACTIVATION(26),
    OPEN_HOTELIER_INSIGHTS(27),
    VIEW_AWX_RUNNING_PROMO(28),
    FIX_AWX_GENERAL_ISSUES(29),
    OPEN_CALLS(30),
    OPEN_SERVICES_BUNDLE_SPLASH_PAGE(32),
    OPEN_SERVICES_BUNDLE_ONBOARDING_PAGE(33),
    OPEN_HELP_CENTER_ADWORDS(7),
    OPEN_HELP_CENTER_MISSING_BUSINESS_INFO(8),
    OPEN_HELP_CENTER_PHOTOS(13),
    OPEN_HELP_CENTER_REVIEWS_SHARE(14),
    OPEN_HELP_CENTER_REVIEWS_REPLY(15),
    OPEN_HELP_CENTER_INSIGHTS(16),
    OPEN_HELP_CENTER_CUSTOMER_PHOTOS(18),
    OPEN_HELP_CENTER_LOCAL_POSTS(22),
    OPEN_HELP_CENTER_BUSINESS_ATTRIBUTES(23),
    OPEN_HELP_CENTER_MESSAGING(24),
    OPEN_HELP_CENTER_CALLS(31),
    OPEN_HELP_CENTER_BUNDLE(34),
    OPEN_HELP_CENTER_GET_VERIFIED(36);
    
    private final int L;

    dgdr(int i) {
        this.L = i;
    }

    public static dgdr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CTA_INTENT;
            case 1:
                return OPEN_BUSINESS_HOURS_EDITOR;
            case 2:
                return OPEN_BUSINESS_CATEGORY_EDITOR;
            case 3:
                return OPEN_BUSINESS_PHONE_NUMBER_EDITOR;
            case 4:
                return START_AWX_FLOW;
            case 5:
                return START_AWX_FLOW_WITH_COUPON;
            case 6:
                return DISMISS_TEMPORARY;
            case 7:
                return OPEN_HELP_CENTER_ADWORDS;
            case 8:
                return OPEN_HELP_CENTER_MISSING_BUSINESS_INFO;
            case 9:
                return OPEN_PHOTO_UPLOADER;
            case 10:
                return OPEN_REVIEWS_DIALOGS;
            case 11:
                return OPEN_PROFILE_SHARING_DIALOG;
            case 12:
                return OPEN_REVIEW;
            case 13:
                return OPEN_HELP_CENTER_PHOTOS;
            case 14:
                return OPEN_HELP_CENTER_REVIEWS_SHARE;
            case 15:
                return OPEN_HELP_CENTER_REVIEWS_REPLY;
            case 16:
                return OPEN_HELP_CENTER_INSIGHTS;
            case 17:
                return VIEW_PHOTOS;
            case 18:
                return OPEN_HELP_CENTER_CUSTOMER_PHOTOS;
            case 19:
                return ENABLE_MESSAGING;
            case 20:
                return CREATE_STANDARD_LOCAL_POST;
            case 21:
                return OPEN_ATTRIBUTE_UPDATE_FLOW;
            case 22:
                return OPEN_HELP_CENTER_LOCAL_POSTS;
            case 23:
                return OPEN_HELP_CENTER_BUSINESS_ATTRIBUTES;
            case 24:
                return OPEN_HELP_CENTER_MESSAGING;
            case 25:
                return OPEN_BUSINESS_INFO_EDITOR;
            case 26:
                return START_HOTELIER_ACTIVATION;
            case 27:
                return OPEN_HOTELIER_INSIGHTS;
            case 28:
                return VIEW_AWX_RUNNING_PROMO;
            case 29:
                return FIX_AWX_GENERAL_ISSUES;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return OPEN_CALLS;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return OPEN_HELP_CENTER_CALLS;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return OPEN_SERVICES_BUNDLE_SPLASH_PAGE;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return OPEN_SERVICES_BUNDLE_ONBOARDING_PAGE;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return OPEN_HELP_CENTER_BUNDLE;
            case 35:
                return OPEN_GET_VERIFIED;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return OPEN_HELP_CENTER_GET_VERIFIED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgdq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.L;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}

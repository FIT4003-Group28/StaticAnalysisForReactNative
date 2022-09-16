package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cyjp  reason: default package */
/* loaded from: classes5.dex */
public final class cyjp {
    public static duej a(int i) {
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        switch (i - 2) {
            case 1:
                return duej.PROFILE;
            case 2:
                return duej.CONTACT;
            case 3:
                return duej.CIRCLE;
            case 4:
                return duej.PLACE;
            case 5:
                return duej.ACCOUNT;
            case 6:
                return duej.EXTERNAL_ACCOUNT;
            case 7:
                return duej.DOMAIN_PROFILE;
            case 8:
                return duej.DOMAIN_CONTACT;
            case 9:
                return duej.DEVICE_CONTACT;
            case 10:
                return duej.GOOGLE_GROUP;
            case 11:
                return duej.AFFINITY;
            default:
                return duej.UNKNOWN_CONTAINER;
        }
    }

    public static int b(dued duedVar) {
        duey dueyVar = duey.UNKNOWN;
        switch (duedVar.ordinal()) {
            case 12:
                return 8;
            case 13:
                return 41;
            case 14:
                return 6;
            case 20:
                return 35;
            case 23:
                return 13;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return 20;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return 21;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return 24;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return 25;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return 9;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return 29;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return 30;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                return 32;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                return 37;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                return 50;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                return 33;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                return 44;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return 46;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                return 42;
            case 104:
                return 40;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return 47;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return 48;
            case 145:
                return 49;
            default:
                return 2;
        }
    }
}

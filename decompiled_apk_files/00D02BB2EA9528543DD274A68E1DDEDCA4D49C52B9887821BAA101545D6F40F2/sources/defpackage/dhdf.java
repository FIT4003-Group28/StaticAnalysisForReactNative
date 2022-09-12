package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dhdf  reason: default package */
/* loaded from: classes6.dex */
public enum dhdf implements dsrb {
    EXTENSION_UNSPECIFIED(0),
    CREATE_PERSON(1),
    FILTER_BY_NAME(2),
    MODIFY_NAMES(3),
    HANGOUTS_PHONE_DATA(4),
    INCLUDE_DOMAIN_INFO(5),
    HANGOUTS_ADDITIONAL_DATA(6),
    HANGOUTS_SUGGESTED_PEOPLE(7),
    GDATA_COMPATIBILITY(8),
    HANGOUTS_OFF_NETWORK_GAIA_GET(9),
    ABOUT_ME_ADDITIONAL_DATA(10),
    HANGOUTS_OFF_NETWORK_GAIA_LOOKUP(12),
    SANITIZE_ABOUT_HTML(13),
    FILTER_URL_IANTS(16),
    CORP_DESKBOOKING_FLEXIBLE_DESK_LOCATIONS(41),
    TLS_ADD_PLACEHOLDER_PEOPLE(14),
    TLS_FILL_FIELD(15),
    DYNAMITE_ADDITIONAL_DATA(17),
    DYNAMITE_ORGANIZATION_INFO(27),
    GPLUS_ADDITIONAL_DATA(20),
    CALLER_ID_LOOKUPS(21),
    POMEROY_TRUSTED_CONTACTS_EXTENSION(22),
    FILTER_UNVERIFIED_PROFILE_FIELDS(23),
    FILTER_OBSOLETE_CONTACT_EMAILS(35),
    REMOVE_NON_DOMAIN_EMAILS(24),
    TEAMS_ADDITIONAL_DATA(25),
    GPLUS_PROFILE_FILTER(26),
    PHOTOS_COMPARE_DATA(28),
    APPS_WALDO_AVAILABILITY_DATA(29),
    SIGN_PHOTOS_IANTS(30),
    FILTER_TO_PRIMARY(31),
    DESK_LOCATION_ADDITIONAL_DATA(32),
    FILTER_UNUSED_FIELDS(33),
    GMAIL_SECURITY_DATA(34),
    INCLUDE_EMAIL_LOOKUP_KEY(36),
    DYNAMITE_APPEND_ROOM_MEMBERSHIP_DATA(37),
    FILTER_NON_PRIMARY_SIGNUP_EMAIL(38),
    PAISA_ADDITIONAL_DATA(39),
    CUSTOMER_INFO_ADDITIONAL_DATA(40),
    ADD_PEOPLE_FOR_UNMATCHED_KEYS(42),
    PLAY_GAMES_PROFILE(43),
    JAM_MAPS_PROFILE(44),
    DEPRECATED_ADD_HANGOUTS_RELEVANT_PEOPLE(11),
    DEPRECATED_DYNAMITE_DM_BOTS(18),
    DEPRECATED_DYNAMITE_ROOM_BOTS(19),
    UNRECOGNIZED(-1);
    
    public static final dsrc<dhdf> U = new dsrc<dhdf>() { // from class: dhde
        @Override // defpackage.dsrc
        public final /* bridge */ /* synthetic */ dhdf a(int i) {
            return dhdf.b(i);
        }
    };
    private final int V;

    dhdf(int i) {
        this.V = i;
    }

    public static dhdf b(int i) {
        switch (i) {
            case 0:
                return EXTENSION_UNSPECIFIED;
            case 1:
                return CREATE_PERSON;
            case 2:
                return FILTER_BY_NAME;
            case 3:
                return MODIFY_NAMES;
            case 4:
                return HANGOUTS_PHONE_DATA;
            case 5:
                return INCLUDE_DOMAIN_INFO;
            case 6:
                return HANGOUTS_ADDITIONAL_DATA;
            case 7:
                return HANGOUTS_SUGGESTED_PEOPLE;
            case 8:
                return GDATA_COMPATIBILITY;
            case 9:
                return HANGOUTS_OFF_NETWORK_GAIA_GET;
            case 10:
                return ABOUT_ME_ADDITIONAL_DATA;
            case 11:
                return DEPRECATED_ADD_HANGOUTS_RELEVANT_PEOPLE;
            case 12:
                return HANGOUTS_OFF_NETWORK_GAIA_LOOKUP;
            case 13:
                return SANITIZE_ABOUT_HTML;
            case 14:
                return TLS_ADD_PLACEHOLDER_PEOPLE;
            case 15:
                return TLS_FILL_FIELD;
            case 16:
                return FILTER_URL_IANTS;
            case 17:
                return DYNAMITE_ADDITIONAL_DATA;
            case 18:
                return DEPRECATED_DYNAMITE_DM_BOTS;
            case 19:
                return DEPRECATED_DYNAMITE_ROOM_BOTS;
            case 20:
                return GPLUS_ADDITIONAL_DATA;
            case 21:
                return CALLER_ID_LOOKUPS;
            case 22:
                return POMEROY_TRUSTED_CONTACTS_EXTENSION;
            case 23:
                return FILTER_UNVERIFIED_PROFILE_FIELDS;
            case 24:
                return REMOVE_NON_DOMAIN_EMAILS;
            case 25:
                return TEAMS_ADDITIONAL_DATA;
            case 26:
                return GPLUS_PROFILE_FILTER;
            case 27:
                return DYNAMITE_ORGANIZATION_INFO;
            case 28:
                return PHOTOS_COMPARE_DATA;
            case 29:
                return APPS_WALDO_AVAILABILITY_DATA;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return SIGN_PHOTOS_IANTS;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return FILTER_TO_PRIMARY;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return DESK_LOCATION_ADDITIONAL_DATA;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return FILTER_UNUSED_FIELDS;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return GMAIL_SECURITY_DATA;
            case 35:
                return FILTER_OBSOLETE_CONTACT_EMAILS;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return INCLUDE_EMAIL_LOOKUP_KEY;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return DYNAMITE_APPEND_ROOM_MEMBERSHIP_DATA;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return FILTER_NON_PRIMARY_SIGNUP_EMAIL;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return PAISA_ADDITIONAL_DATA;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return CUSTOMER_INFO_ADDITIONAL_DATA;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return CORP_DESKBOOKING_FLEXIBLE_DESK_LOCATIONS;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return ADD_PEOPLE_FOR_UNMATCHED_KEYS;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return PLAY_GAMES_PROFILE;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return JAM_MAPS_PROFILE;
            default:
                return null;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.V;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}

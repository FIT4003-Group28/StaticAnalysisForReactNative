package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dgpw  reason: default package */
/* loaded from: classes6.dex */
public enum dgpw implements dsrb {
    OK(0),
    GENERIC_ERROR(1),
    NON_GPLUS_USER(2),
    INVALID_PANO(3),
    INVALID_GEO_INFO(4),
    ERR_IMPORT_LIMIT(5),
    NON_SUPPORTED_PHOTO(6),
    INVALID_FEATURE_ID(7),
    BLACKLISTED(16),
    IMAGE_NOT_QUALIFIED(17),
    ANIMATED_IMAGE(21),
    PS_GENERIC_ERROR(8),
    PS_QUOTA_EXCEEDED(9),
    PS_NOT_IMAGE(10),
    PS_BAD_IMAGE(11),
    PS_IMAGE_TOO_BIG(12),
    PS_ERR_ALBUM_LIMIT(13),
    PS_ERR_PHOTO_PER_ALBUM_LIMIT(14),
    VIEWS_GENERIC_ERROR(15),
    BIZ_BUILDER_GENERIC_ERROR(18),
    MAPFACTS_GENERIC_ERROR(19),
    SHOEBOX_GENERIC_ERROR(22),
    ZANZIBAR_GENERIC_ERROR(23),
    BLOBSTORE_GENERIC_ERROR(24),
    INVALID_USER_CREDENTIAL(25),
    UNICORN_ACCOUNT_ERROR(40),
    ERR_UPDATE_LIMIT(26),
    PARTIAL_SUCCESS(27),
    NOT_FOUND(20),
    PS_UPDATE_PARTIAL_SUCCESS(28),
    MAPFACTS_INVALID_FEATURE_ID(29),
    TRANSIENT_ERROR(30),
    INVALID_ARGUMENT(31),
    MS_NOT_FOUND(32),
    PS_DUPLICATE_PHOTO(33),
    PS_NO_PHOTO_PAGE_URL(34),
    PS_UNEXPECTED_PHOTO_NUMBER(35),
    PS_IMPORT_FAILURE(36),
    PS_REMOVE_LABEL_ERROR(37),
    BLOBSTORE_NO_BLOBREF(38),
    UGCS_CONTENT_STORE_GENERIC_ERROR(41),
    UGCS_MEDIA_SERVICE_GENERIC_ERROR(42);
    
    public final int Q;

    dgpw(int i) {
        this.Q = i;
    }

    public static dgpw c(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return GENERIC_ERROR;
            case 2:
                return NON_GPLUS_USER;
            case 3:
                return INVALID_PANO;
            case 4:
                return INVALID_GEO_INFO;
            case 5:
                return ERR_IMPORT_LIMIT;
            case 6:
                return NON_SUPPORTED_PHOTO;
            case 7:
                return INVALID_FEATURE_ID;
            case 8:
                return PS_GENERIC_ERROR;
            case 9:
                return PS_QUOTA_EXCEEDED;
            case 10:
                return PS_NOT_IMAGE;
            case 11:
                return PS_BAD_IMAGE;
            case 12:
                return PS_IMAGE_TOO_BIG;
            case 13:
                return PS_ERR_ALBUM_LIMIT;
            case 14:
                return PS_ERR_PHOTO_PER_ALBUM_LIMIT;
            case 15:
                return VIEWS_GENERIC_ERROR;
            case 16:
                return BLACKLISTED;
            case 17:
                return IMAGE_NOT_QUALIFIED;
            case 18:
                return BIZ_BUILDER_GENERIC_ERROR;
            case 19:
                return MAPFACTS_GENERIC_ERROR;
            case 20:
                return NOT_FOUND;
            case 21:
                return ANIMATED_IMAGE;
            case 22:
                return SHOEBOX_GENERIC_ERROR;
            case 23:
                return ZANZIBAR_GENERIC_ERROR;
            case 24:
                return BLOBSTORE_GENERIC_ERROR;
            case 25:
                return INVALID_USER_CREDENTIAL;
            case 26:
                return ERR_UPDATE_LIMIT;
            case 27:
                return PARTIAL_SUCCESS;
            case 28:
                return PS_UPDATE_PARTIAL_SUCCESS;
            case 29:
                return MAPFACTS_INVALID_FEATURE_ID;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return TRANSIENT_ERROR;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return INVALID_ARGUMENT;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return MS_NOT_FOUND;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return PS_DUPLICATE_PHOTO;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return PS_NO_PHOTO_PAGE_URL;
            case 35:
                return PS_UNEXPECTED_PHOTO_NUMBER;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return PS_IMPORT_FAILURE;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return PS_REMOVE_LABEL_ERROR;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return BLOBSTORE_NO_BLOBREF;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            default:
                return null;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return UNICORN_ACCOUNT_ERROR;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return UGCS_CONTENT_STORE_GENERIC_ERROR;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return UGCS_MEDIA_SERVICE_GENERIC_ERROR;
        }
    }

    public static dsrd d() {
        return dgpv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.Q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Q);
    }
}

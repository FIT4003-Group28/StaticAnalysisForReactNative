package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: duey  reason: default package */
/* loaded from: classes6.dex */
public enum duey implements dsrb {
    UNKNOWN(0),
    BABEL(6),
    YOUTUBE(11),
    WHOS_DOWN(13),
    YOUTUBE_MANGO(15),
    PHOTOS(16),
    GOOGLE_ASSISTANT(17),
    KABOO(19),
    COMMERCE_PLATFORM(20),
    SPACES(22),
    MAPS(24),
    LOUPE_UNUSED(27),
    POMEROY(28),
    LOUPE(29),
    PEOPLE_PLAYGROUND(30),
    NEWS_360(34),
    DUO(40);
    
    public final int r;

    duey(int i) {
        this.r = i;
    }

    public static duey b(int i) {
        if (i != 0) {
            if (i == 6) {
                return BABEL;
            }
            if (i == 11) {
                return YOUTUBE;
            }
            if (i == 13) {
                return WHOS_DOWN;
            }
            if (i == 22) {
                return SPACES;
            }
            if (i == 24) {
                return MAPS;
            }
            if (i == 34) {
                return NEWS_360;
            }
            if (i == 40) {
                return DUO;
            }
            if (i == 19) {
                return KABOO;
            }
            if (i == 20) {
                return COMMERCE_PLATFORM;
            }
            switch (i) {
                case 15:
                    return YOUTUBE_MANGO;
                case 16:
                    return PHOTOS;
                case 17:
                    return GOOGLE_ASSISTANT;
                default:
                    switch (i) {
                        case 27:
                            return LOUPE_UNUSED;
                        case 28:
                            return POMEROY;
                        case 29:
                            return LOUPE;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            return PEOPLE_PLAYGROUND;
                        default:
                            return null;
                    }
            }
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return duex.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}

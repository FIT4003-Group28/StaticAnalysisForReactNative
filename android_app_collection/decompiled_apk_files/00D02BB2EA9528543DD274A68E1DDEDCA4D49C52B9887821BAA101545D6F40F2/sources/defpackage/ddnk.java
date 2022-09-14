package defpackage;
/* compiled from: PG */
/* renamed from: ddnk  reason: default package */
/* loaded from: classes6.dex */
public enum ddnk implements dsrb {
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_UNKNOWN(0),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_NONE(1),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_APPLE_MUSIC(2),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_SPOTIFY(3),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_PLAY_MUSIC(4),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_YOUTUBE(5),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_PLAY_BOOKS(6),
    NAVIGATION_MEDIA_INTEGRATION_PROVIDER_P(7);
    
    public final int i;

    ddnk(int i) {
        this.i = i;
    }

    public static ddnk b(int i) {
        switch (i) {
            case 0:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_UNKNOWN;
            case 1:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_NONE;
            case 2:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_APPLE_MUSIC;
            case 3:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_SPOTIFY;
            case 4:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_PLAY_MUSIC;
            case 5:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_YOUTUBE;
            case 6:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_PLAY_BOOKS;
            case 7:
                return NAVIGATION_MEDIA_INTEGRATION_PROVIDER_P;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return ddnj.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}

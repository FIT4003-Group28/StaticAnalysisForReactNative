package defpackage;
/* compiled from: PG */
/* renamed from: dsnt  reason: default package */
/* loaded from: classes6.dex */
public enum dsnt implements dsrb {
    UNKNOWN_ID(0),
    DEVICE_INFO(7),
    DEVICE_INFO_DEVICE_LEVEL(9),
    LOCATION_HISTORY(2),
    LOCATION_REPORTING(15),
    VOICE_AND_AUDIO(5),
    WEB_AND_APP(1),
    SUPPL_WEB_AND_APP(8),
    SUPPL_WEB_AND_APP_DEVICE_LEVEL(10),
    YT_SEARCH_HISTORY(3),
    YT_WATCH_HISTORY(4);
    
    public final int l;

    dsnt(int i) {
        this.l = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

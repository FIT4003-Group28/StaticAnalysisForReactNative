package defpackage;
/* compiled from: PG */
/* renamed from: atag  reason: default package */
/* loaded from: classes2.dex */
public enum atag implements aopm {
    SYNC_MODE_UNKNOWN(0),
    SYNC_MODE_USER_BROWSING(1),
    SYNC_MODE_SYNCED_WITH_VIDEO(2);
    
    public final int d;

    atag(int i) {
        this.d = i;
    }

    public static aopo a() {
        return asut.u;
    }

    public static atag b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SYNC_MODE_USER_BROWSING;
            }
            if (i == 2) {
                return SYNC_MODE_SYNCED_WITH_VIDEO;
            }
            return null;
        }
        return SYNC_MODE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

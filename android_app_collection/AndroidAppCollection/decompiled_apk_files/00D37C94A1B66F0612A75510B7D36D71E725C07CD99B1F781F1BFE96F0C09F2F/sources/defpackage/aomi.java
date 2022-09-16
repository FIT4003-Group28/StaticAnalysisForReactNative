package defpackage;
/* compiled from: PG */
/* renamed from: aomi  reason: default package */
/* loaded from: classes.dex */
public enum aomi implements aopm {
    REGISTRATION_REASON_UNSPECIFIED(0),
    DEVICE_START(1),
    APP_UPDATED(2),
    ACCOUNT_CHANGED(3),
    SERVER_SYNC_INSTRUCTION(4),
    LOCALE_CHANGED(5),
    TIMEZONE_CHANGED(6),
    COLLABORATOR_API_CALL(7),
    GUNS_MIGRATION(8),
    REGISTRATION_ID_CHANGED(9),
    CHANNEL_BLOCK_STATE_CHANGED(10);
    
    public final int l;

    aomi(int i) {
        this.l = i;
    }

    public static aomi a(int i) {
        switch (i) {
            case 0:
                return REGISTRATION_REASON_UNSPECIFIED;
            case 1:
                return DEVICE_START;
            case 2:
                return APP_UPDATED;
            case 3:
                return ACCOUNT_CHANGED;
            case 4:
                return SERVER_SYNC_INSTRUCTION;
            case 5:
                return LOCALE_CHANGED;
            case 6:
                return TIMEZONE_CHANGED;
            case 7:
                return COLLABORATOR_API_CALL;
            case 8:
                return GUNS_MIGRATION;
            case 9:
                return REGISTRATION_ID_CHANGED;
            case 10:
                return CHANNEL_BLOCK_STATE_CHANGED;
            default:
                return null;
        }
    }

    public static aopo b() {
        return aoli.n;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}

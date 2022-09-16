package defpackage;
/* compiled from: PG */
/* renamed from: aomb  reason: default package */
/* loaded from: classes.dex */
public enum aomb implements aopm {
    FETCH_REASON_UNSPECIFIED(0),
    FULL_SYNC_INSTRUCTION(1),
    SYNC_INSTRUCTION(2),
    COLLABORATOR_API_CALL(3),
    GUNS_MIGRATION(4),
    INBOX(5),
    DELAYED_IMPRESSION(6),
    REMOTE_DELETED_MESSAGES(7),
    LOCALE_CHANGED(8);
    
    public final int j;

    aomb(int i) {
        this.j = i;
    }

    public static aomb a(int i) {
        switch (i) {
            case 0:
                return FETCH_REASON_UNSPECIFIED;
            case 1:
                return FULL_SYNC_INSTRUCTION;
            case 2:
                return SYNC_INSTRUCTION;
            case 3:
                return COLLABORATOR_API_CALL;
            case 4:
                return GUNS_MIGRATION;
            case 5:
                return INBOX;
            case 6:
                return DELAYED_IMPRESSION;
            case 7:
                return REMOTE_DELETED_MESSAGES;
            case 8:
                return LOCALE_CHANGED;
            default:
                return null;
        }
    }

    public static aopo b() {
        return aoli.l;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

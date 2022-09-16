package defpackage;
/* compiled from: PG */
/* renamed from: avkb  reason: default package */
/* loaded from: classes2.dex */
public enum avkb implements aopm {
    TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN(0),
    TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING(1),
    TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING(2),
    TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE(3),
    TRANSCRIPT_SEARCH_STATE_VALUE_FAILED(4);
    
    public final int f;

    avkb(int i) {
        this.f = i;
    }

    public static aopo a() {
        return avge.n;
    }

    public static avkb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING;
            }
            if (i == 2) {
                return TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING;
            }
            if (i == 3) {
                return TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE;
            }
            if (i == 4) {
                return TRANSCRIPT_SEARCH_STATE_VALUE_FAILED;
            }
            return null;
        }
        return TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}

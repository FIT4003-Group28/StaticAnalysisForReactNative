package defpackage;
/* compiled from: PG */
/* renamed from: avcc  reason: default package */
/* loaded from: classes2.dex */
public enum avcc implements aopm {
    SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN(0),
    SUGGEST_EDITABLE_TEXT_ACTION_INSERT(1),
    SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE(2);
    
    private final int e;

    avcc(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auwh.u;
    }

    public static avcc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUGGEST_EDITABLE_TEXT_ACTION_INSERT;
            }
            if (i == 2) {
                return SUGGEST_EDITABLE_TEXT_ACTION_BACKSPACE;
            }
            return null;
        }
        return SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}

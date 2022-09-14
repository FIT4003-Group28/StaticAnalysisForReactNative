package defpackage;
/* compiled from: PG */
/* renamed from: dtzy  reason: default package */
/* loaded from: classes6.dex */
public enum dtzy implements dsrb {
    PROMPT_STYLE_UNKNOWN(0),
    PROMPT_STYLE_FIRST_CARD_NON_MODAL(1),
    PROMPT_STYLE_FIRST_CARD_MODAL(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    dtzy(int i) {
        this.e = i;
    }

    public static dtzy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PROMPT_STYLE_FIRST_CARD_NON_MODAL;
            }
            if (i == 2) {
                return PROMPT_STYLE_FIRST_CARD_MODAL;
            }
            return null;
        }
        return PROMPT_STYLE_UNKNOWN;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aved  reason: default package */
/* loaded from: classes2.dex */
public enum aved implements aopm {
    SURVEY_STATE_TYPE_UNKNOWN(0),
    SURVEY_STATE_TYPE_SELECTED(1),
    SURVEY_STATE_TYPE_DISMISSED(2),
    SURVEY_STATE_TYPE_SUBMITTED(3);
    
    private final int f;

    aved(int i) {
        this.f = i;
    }

    public static aopo a() {
        return avcd.m;
    }

    public static aved b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SURVEY_STATE_TYPE_SELECTED;
            }
            if (i == 2) {
                return SURVEY_STATE_TYPE_DISMISSED;
            }
            if (i == 3) {
                return SURVEY_STATE_TYPE_SUBMITTED;
            }
            return null;
        }
        return SURVEY_STATE_TYPE_UNKNOWN;
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

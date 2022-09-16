package defpackage;
/* compiled from: PG */
/* renamed from: aqob  reason: default package */
/* loaded from: classes2.dex */
public enum aqob implements aopm {
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN(0),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CANCEL(1),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CONFIRM(2),
    DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_GET_PREMIUM(3);
    
    private final int f;

    aqob(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aqfh.t;
    }

    public static aqob b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CANCEL;
            }
            if (i == 2) {
                return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_CONFIRM;
            }
            if (i == 3) {
                return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_GET_PREMIUM;
            }
            return null;
        }
        return DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN;
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

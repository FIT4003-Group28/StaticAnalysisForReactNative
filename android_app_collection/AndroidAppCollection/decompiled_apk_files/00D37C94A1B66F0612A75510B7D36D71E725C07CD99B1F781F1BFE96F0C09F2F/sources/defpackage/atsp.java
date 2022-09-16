package defpackage;
/* compiled from: PG */
/* renamed from: atsp  reason: default package */
/* loaded from: classes2.dex */
public enum atsp implements aopm {
    OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN(0),
    OFFLINE_VIDEO_POLICY_ACTION_OK(1),
    OFFLINE_VIDEO_POLICY_ACTION_DISABLE(2),
    OFFLINE_VIDEO_POLICY_ACTION_DOWNLOAD_FAILED(3);
    
    public final int e;

    atsp(int i) {
        this.e = i;
    }

    public static aopo a() {
        return atti.b;
    }

    public static atsp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFLINE_VIDEO_POLICY_ACTION_OK;
            }
            if (i == 2) {
                return OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
            }
            if (i == 3) {
                return OFFLINE_VIDEO_POLICY_ACTION_DOWNLOAD_FAILED;
            }
            return null;
        }
        return OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN;
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

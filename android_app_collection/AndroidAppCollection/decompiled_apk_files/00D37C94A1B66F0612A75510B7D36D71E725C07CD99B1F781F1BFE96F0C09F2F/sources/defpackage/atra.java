package defpackage;
/* compiled from: PG */
/* renamed from: atra  reason: default package */
/* loaded from: classes2.dex */
public enum atra implements aopm {
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN(0),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE(1),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK(2),
    OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI(3);
    
    public final int e;

    atra(int i) {
        this.e = i;
    }

    public static aopo a() {
        return atqy.f;
    }

    public static atra b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NONE;
            }
            if (i == 2) {
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK;
            }
            if (i == 3) {
                return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI;
            }
            return null;
        }
        return OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN;
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

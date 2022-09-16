package defpackage;
/* compiled from: PG */
/* renamed from: apca  reason: default package */
/* loaded from: classes.dex */
public enum apca implements aopm {
    CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED(0),
    CONTROL_FLOW_MANAGER_LAYER_CORE(1),
    CONTROL_FLOW_MANAGER_LAYER_ADAPTER(2),
    CONTROL_FLOW_MANAGER_LAYER_SURFACE(3),
    CONTROL_FLOW_MANAGER_LAYER_EXTERNAL(4);
    
    public final int f;

    apca(int i) {
        this.f = i;
    }

    public static aopo a() {
        return aoxm.k;
    }

    public static apca b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CONTROL_FLOW_MANAGER_LAYER_CORE;
            }
            if (i == 2) {
                return CONTROL_FLOW_MANAGER_LAYER_ADAPTER;
            }
            if (i == 3) {
                return CONTROL_FLOW_MANAGER_LAYER_SURFACE;
            }
            if (i == 4) {
                return CONTROL_FLOW_MANAGER_LAYER_EXTERNAL;
            }
            return null;
        }
        return CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED;
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

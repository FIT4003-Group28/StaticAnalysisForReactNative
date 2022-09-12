package defpackage;
/* compiled from: PG */
/* renamed from: cpzl  reason: default package */
/* loaded from: classes5.dex */
public enum cpzl implements dsrb {
    UNSPECIFIED(0),
    SUPPORT_ON_VOICE_PLATE_STATE_CHANGED(1),
    SUPPORT_UNBIND_INTEGRATION_SERVICE(2);
    
    public final int d;

    cpzl(int i) {
        this.d = i;
    }

    public static cpzl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SUPPORT_ON_VOICE_PLATE_STATE_CHANGED;
            }
            if (i == 2) {
                return SUPPORT_UNBIND_INTEGRATION_SERVICE;
            }
            return null;
        }
        return UNSPECIFIED;
    }

    public static dsrd c() {
        return cpzk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}

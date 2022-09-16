package defpackage;
/* compiled from: PG */
/* renamed from: aulb  reason: default package */
/* loaded from: classes2.dex */
public enum aulb implements aopm {
    REEL_LOOP_BEHAVIOR_UNKNOWN(0),
    REEL_LOOP_BEHAVIOR_SINGLE_PLAY(1),
    REEL_LOOP_BEHAVIOR_REPEAT(2);
    
    private final int e;

    aulb(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auii.r;
    }

    public static aulb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REEL_LOOP_BEHAVIOR_SINGLE_PLAY;
            }
            if (i == 2) {
                return REEL_LOOP_BEHAVIOR_REPEAT;
            }
            return null;
        }
        return REEL_LOOP_BEHAVIOR_UNKNOWN;
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

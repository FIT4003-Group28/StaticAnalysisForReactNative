package defpackage;
/* compiled from: PG */
/* renamed from: dque  reason: default package */
/* loaded from: classes6.dex */
public enum dque implements dsrb {
    CONTEXT_DEFAULT(0),
    CONTEXT_DESKTOP_STEP_THROUGH(1),
    CONTEXT_MOBILE_STEP_THROUGH(2),
    CONTEXT_DARK_BACKGROUND(3),
    CONTEXT_MAP(4),
    CONTEXT_MAP_NIGHT_MODE(5);
    
    public final int g;

    dque(int i) {
        this.g = i;
    }

    public static dque b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CONTEXT_DESKTOP_STEP_THROUGH;
            }
            if (i == 2) {
                return CONTEXT_MOBILE_STEP_THROUGH;
            }
            if (i == 3) {
                return CONTEXT_DARK_BACKGROUND;
            }
            if (i == 4) {
                return CONTEXT_MAP;
            }
            if (i == 5) {
                return CONTEXT_MAP_NIGHT_MODE;
            }
            return null;
        }
        return CONTEXT_DEFAULT;
    }

    public static dsrd c() {
        return dqud.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}

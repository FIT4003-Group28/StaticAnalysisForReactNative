package defpackage;
/* compiled from: PG */
/* renamed from: agqn  reason: default package */
/* loaded from: classes.dex */
public enum agqn {
    OFFLINE_IMMEDIATELY(0),
    DEFER_FOR_DISCOUNTED_DATA(1),
    OFFLINE_SHARING(2),
    SIDELOAD(3),
    AUTO_OFFLINE(4);
    
    static final amup f;
    public final int g;

    static {
        agqn[] values;
        amum h2 = amup.h();
        for (agqn agqnVar : values()) {
            h2.f(Integer.valueOf(agqnVar.g), agqnVar);
        }
        f = h2.b();
    }

    agqn(int i) {
        this.g = i;
    }

    public static agqn a(int i) {
        agqn agqnVar = (agqn) f.get(Integer.valueOf(i));
        return agqnVar != null ? agqnVar : OFFLINE_IMMEDIATELY;
    }

    public final int b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 4;
            }
            if (ordinal == 3) {
                return 5;
            }
            return ordinal != 4 ? 1 : 6;
        }
        return 2;
    }
}

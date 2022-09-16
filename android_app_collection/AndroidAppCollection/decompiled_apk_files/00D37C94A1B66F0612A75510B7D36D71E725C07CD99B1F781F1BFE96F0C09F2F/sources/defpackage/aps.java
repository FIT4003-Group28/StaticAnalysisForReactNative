package defpackage;
/* compiled from: PG */
/* renamed from: aps  reason: default package */
/* loaded from: classes2.dex */
public enum aps {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static aps a(apt aptVar) {
        apt aptVar2 = apt.DESTROYED;
        int ordinal = aptVar.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ON_STOP;
            }
            if (ordinal == 4) {
                return ON_PAUSE;
            }
            return null;
        }
        return ON_DESTROY;
    }

    public static aps b(apt aptVar) {
        apt aptVar2 = apt.DESTROYED;
        int ordinal = aptVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal == 3) {
                return ON_RESUME;
            }
            return null;
        }
        return ON_CREATE;
    }

    public apt c() {
        apt aptVar = apt.DESTROYED;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return apt.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return apt.DESTROYED;
                        }
                        throw new IllegalArgumentException(this + " has no target state");
                    }
                }
            }
            return apt.STARTED;
        }
        return apt.CREATED;
    }
}

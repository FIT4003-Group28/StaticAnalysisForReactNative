package defpackage;
/* compiled from: PG */
/* renamed from: i  reason: default package */
/* loaded from: classes.dex */
public enum i {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static i a(j jVar) {
        j jVar2 = j.DESTROYED;
        int ordinal = jVar.ordinal();
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

    public static i b(j jVar) {
        j jVar2 = j.DESTROYED;
        int ordinal = jVar.ordinal();
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

    public final j c() {
        j jVar = j.DESTROYED;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return j.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return j.DESTROYED;
                        }
                        throw new IllegalArgumentException(this + " has no target state");
                    }
                }
            }
            return j.STARTED;
        }
        return j.CREATED;
    }
}

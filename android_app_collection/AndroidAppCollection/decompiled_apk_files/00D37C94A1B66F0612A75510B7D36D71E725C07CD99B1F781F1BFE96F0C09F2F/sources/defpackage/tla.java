package defpackage;
/* compiled from: PG */
/* renamed from: tla  reason: default package */
/* loaded from: classes4.dex */
public enum tla {
    START(true, false, 0),
    FIRST_QUARTILE(true, false, 1),
    MIDPOINT(true, false, 2),
    THIRD_QUARTILE(true, false, 3),
    COMPLETE(false, false, 4, true),
    RESUME(true),
    PAUSE(false, true),
    SUSPEND(false, true),
    ABANDON(false, true, -1, true),
    SKIP(false, true),
    MUTE,
    UNMUTE,
    VIEWABLE_IMPRESSION(false),
    MEASURABLE_IMPRESSION,
    GROUPM_VIEWABLE_IMPRESSION,
    FULLSCREEN(false),
    EXIT_FULLSCREEN(false);
    
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;

    tla() {
        this(false, false, -1, false);
    }

    public boolean a() {
        return this.t != -1;
    }

    public boolean b() {
        return this == SKIP || this == COMPLETE || this == ABANDON;
    }

    tla(boolean z) {
        this(z, false, -1, false);
    }

    tla(boolean z, boolean z2) {
        this(false, false, -1, true);
    }

    tla(boolean z, boolean z2, int i) {
        this(true, false, i, false);
    }

    tla(boolean z, boolean z2, int i, boolean z3) {
        this.r = z;
        this.s = z2;
        this.t = i;
        this.u = z3;
    }
}

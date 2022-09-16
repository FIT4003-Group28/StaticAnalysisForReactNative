package defpackage;
/* compiled from: PG */
/* renamed from: aika  reason: default package */
/* loaded from: classes.dex */
public enum aika {
    NEW,
    PLAYBACK_PENDING,
    PLAYBACK_LOADED,
    PLAYBACK_INTERRUPTED,
    INTERSTITIAL_REQUESTED,
    INTERSTITIAL_PLAYING,
    READY,
    VIDEO_REQUESTED,
    VIDEO_PLAYING,
    ENDED;

    public final boolean a(aika... aikaVarArr) {
        for (aika aikaVar : aikaVarArr) {
            if (this == aikaVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return a(INTERSTITIAL_REQUESTED, VIDEO_REQUESTED, PLAYBACK_PENDING);
    }

    public final boolean c(aika aikaVar) {
        return ordinal() >= aikaVar.ordinal();
    }

    public final boolean d() {
        return a(INTERSTITIAL_PLAYING, VIDEO_PLAYING);
    }

    public final boolean e() {
        return d() || b();
    }

    public final boolean f() {
        return a(VIDEO_REQUESTED, VIDEO_PLAYING);
    }

    public final boolean g() {
        return a(PLAYBACK_INTERRUPTED) || h();
    }

    public final boolean h() {
        return a(INTERSTITIAL_REQUESTED, INTERSTITIAL_PLAYING);
    }
}

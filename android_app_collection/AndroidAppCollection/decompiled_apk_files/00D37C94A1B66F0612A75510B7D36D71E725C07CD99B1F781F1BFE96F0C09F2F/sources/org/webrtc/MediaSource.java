package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaSource {
    private final baoa a;
    private long b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(long j) {
        this.a = new baoa(new bank(j));
        this.b = j;
    }

    private final void c() {
        if (this.b != 0) {
            return;
        }
        throw new IllegalStateException("MediaSource has been disposed.");
    }

    private static native State nativeGetState(long j);

    public final long a() {
        c();
        return this.b;
    }

    public void b() {
        c();
        this.a.release();
        this.b = 0L;
    }
}

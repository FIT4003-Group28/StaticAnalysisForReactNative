package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaStreamTrack {
    private long a;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        
        private final int d;

        MediaType(int i) {
            this.d = i;
        }

        static MediaType fromNativeIndex(int i) {
            MediaType[] values;
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native media type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNative() {
            return this.d;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum State {
        LIVE,
        ENDED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaStreamTrack b(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (!nativeGetKind.equals("video")) {
            return null;
        }
        return new VideoTrack(j);
    }

    private final void f() {
        if (this.a != 0) {
            return;
        }
        throw new IllegalStateException("MediaStreamTrack has been disposed.");
    }

    private static native boolean nativeGetEnabled(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetKind(long j);

    private static native State nativeGetState(long j);

    private static native boolean nativeSetEnabled(long j, boolean z);

    public final long a() {
        f();
        return this.a;
    }

    public void c() {
        f();
        JniCommon.nativeReleaseRef(this.a);
        this.a = 0L;
    }

    public final boolean d() {
        f();
        return nativeGetEnabled(this.a);
    }

    public final boolean e(boolean z) {
        f();
        return nativeSetEnabled(this.a, z);
    }
}

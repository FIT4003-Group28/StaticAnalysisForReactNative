package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.NativeAndroidVideoTrackSource;
/* compiled from: PG */
/* renamed from: baph  reason: default package */
/* loaded from: classes2.dex */
public final class baph extends MediaSource {
    public final NativeAndroidVideoTrackSource a;
    public final Object b;
    public final bamj c;

    public baph(long j) {
        super(j);
        this.b = new Object();
        this.c = new bapg(this);
        this.a = new NativeAndroidVideoTrackSource(j);
    }

    @Override // org.webrtc.MediaSource
    public final void b() {
        synchronized (this.b) {
        }
        super.b();
    }
}

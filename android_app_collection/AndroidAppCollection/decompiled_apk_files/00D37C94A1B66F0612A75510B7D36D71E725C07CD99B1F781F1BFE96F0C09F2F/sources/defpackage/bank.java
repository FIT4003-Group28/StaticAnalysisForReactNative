package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;
import org.webrtc.JniCommon;
/* compiled from: PG */
/* renamed from: bank  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class bank implements Runnable {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ bank(long j) {
        this.a = j;
    }

    public /* synthetic */ bank(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            JniCommon.nativeReleaseRef(this.a);
        } else {
            ExternalSurfaceManager.nativeCallback(this.a);
        }
    }
}

package defpackage;

import android.os.HandlerThread;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
/* compiled from: PG */
/* renamed from: avk  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class avk implements amqo {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ avk(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new HandlerThread(avm.d(this.a, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
            if (i == 2) {
                return new Pane(this.a);
            }
            return Integer.valueOf(this.a);
        }
        return new HandlerThread(avm.d(this.a, "ExoPlayer:MediaCodecQueueingThread:"));
    }
}

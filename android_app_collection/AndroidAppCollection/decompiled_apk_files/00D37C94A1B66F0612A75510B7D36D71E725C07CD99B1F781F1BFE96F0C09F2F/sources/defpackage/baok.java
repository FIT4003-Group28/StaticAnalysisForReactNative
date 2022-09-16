package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: baok  reason: default package */
/* loaded from: classes2.dex */
public final class baok implements Callable {
    final /* synthetic */ bamm a;
    final /* synthetic */ Handler b;
    final /* synthetic */ bapm c;
    final /* synthetic */ String d = "decoder-texture-thread";

    public baok(bamm bammVar, Handler handler, bapm bapmVar) {
        this.a = bammVar;
        this.b = handler;
        this.c = bapmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            return new baom(this.a, this.b, this.c);
        } catch (RuntimeException e) {
            Logging.c("SurfaceTextureHelper", this.d.concat(" create failure"), e);
            return null;
        }
    }
}

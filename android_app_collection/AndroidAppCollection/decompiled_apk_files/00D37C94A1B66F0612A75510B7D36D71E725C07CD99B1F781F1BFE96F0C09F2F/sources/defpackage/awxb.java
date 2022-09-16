package defpackage;

import android.util.Size;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: awxb  reason: default package */
/* loaded from: classes2.dex */
public class awxb extends ProcessorBase implements aoic, zpq {
    public static final Size a = new Size(-1, -1);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public awxb(long r2) {
        /*
            r1 = this;
            awwn r0 = defpackage.awwo.a()
            r0.b(r2)
            com.google.research.aimatter.drishti.DrishtiCache r2 = new com.google.research.aimatter.drishti.DrishtiCache
            r2.<init>()
            r0.a = r2
            awwo r2 = r0.a()
            r1.<init>(r2)
            com.google.research.xeno.effect.InputFrameSource r2 = com.google.research.xeno.effect.InputFrameSource.FRONT_CAMERA_MIRRORED
            android.util.Size r3 = defpackage.awxb.a
            r1.b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awxb.<init>(long):void");
    }

    @Override // defpackage.aoic
    public final void a(TextureFrame textureFrame) {
        long timestamp = textureFrame.getTimestamp();
        Packet a2 = this.f.a(textureFrame);
        nativeSendVideoProcessorFramePacket(this.c, a2.getNativeHandle(), timestamp);
        a2.release();
    }

    public final void b(InputFrameSource inputFrameSource, Size size) {
        nativeStartVideoProcessing(this.c, inputFrameSource.e, size.getWidth(), size.getHeight());
    }

    @Override // defpackage.zpq
    public final void f() {
        DrishtiCache drishtiCache = this.b.b;
        nativeStopVideoProcessing(this.c);
        d();
        if (drishtiCache.b.compareAndSet(true, false)) {
            drishtiCache.nativeReleaseCache(drishtiCache.a);
        }
    }

    public awxb(awwo awwoVar) {
        super(awwoVar);
        DrishtiCache drishtiCache = awwoVar.b;
        long j = 0;
        if (drishtiCache != null && drishtiCache.b.get()) {
            j = drishtiCache.a;
        }
        this.c = nativeNewVideoProcessor(this.e.a(), j, awwoVar.a, new awxd(this));
        this.d = new AtomicBoolean(true);
    }
}

package defpackage;

import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: axdf  reason: default package */
/* loaded from: classes2.dex */
public final class axdf implements axdc {
    private final GvrAudioSurround a;
    private final float[] b;
    private final axdi c;

    public axdf(int i, int i2, axdi axdiVar, int i3) {
        axds.c(i > 0);
        axds.c(true);
        axds.c(true);
        if (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11 || i2 == 16 || i2 == 18) {
            this.b = new float[4];
            this.c = axdiVar;
            this.a = new GvrAudioSurround(i3, i, i2, 1024);
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Number of input channels (");
        sb.append(i2);
        sb.append(") is not supported");
        throw new axdg(sb.toString());
    }

    private final void e() {
        this.c.a(this.b);
        GvrAudioSurround gvrAudioSurround = this.a;
        float[] fArr = this.b;
        gvrAudioSurround.updateNativeOrientation(fArr[3], fArr[0], fArr[1], fArr[2]);
    }

    @Override // defpackage.axdc
    public final void a() {
        this.a.flush();
    }

    @Override // defpackage.axdc
    public final boolean b(ByteBuffer byteBuffer) {
        e();
        byteBuffer.position(byteBuffer.position() + this.a.addInput(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        return !byteBuffer.hasRemaining();
    }

    @Override // defpackage.axdc
    public final boolean c(ByteBuffer byteBuffer) {
        e();
        byteBuffer.position(byteBuffer.position() + this.a.getOutput(byteBuffer, byteBuffer.position(), byteBuffer.remaining()));
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.flip();
            return true;
        }
        return false;
    }

    @Override // defpackage.axdc
    public final void d() {
    }
}

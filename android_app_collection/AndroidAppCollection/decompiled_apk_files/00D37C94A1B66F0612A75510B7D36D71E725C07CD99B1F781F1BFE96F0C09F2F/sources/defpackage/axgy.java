package defpackage;

import android.graphics.Matrix;
import org.webrtc.VideoFrame;
/* compiled from: PG */
/* renamed from: axgy  reason: default package */
/* loaded from: classes2.dex */
public final class axgy extends bapf {
    private final axgx b = new axgx();

    @Override // defpackage.bapf
    public final void a() {
        this.b.c();
        super.a();
    }

    @Override // defpackage.bapf
    public final void b(VideoFrame videoFrame, baob baobVar, Matrix matrix, int i, int i2) {
        baou baouVar;
        int i3;
        int i4;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int rotation = videoFrame.getRotation();
        if (buffer instanceof baou) {
            final axgx axgxVar = this.b;
            baou baouVar2 = (baou) buffer;
            axgxVar.b.a();
            aqxo.q(rotation % 90 == 0, "Frame rotation must be a multiple of 90.");
            if (rotation % 180 == 0) {
                i3 = baouVar2.a;
                i4 = baouVar2.b;
            } else {
                i3 = baouVar2.b;
                i4 = baouVar2.a;
            }
            if (i <= 0 || i2 <= 0 || i + i >= i3 || i2 + i2 >= i4) {
                baouVar2.retain();
                baouVar = baouVar2;
            } else {
                axgxVar.a.c = Math.max(i, i2);
                aqxo.y(!axgxVar.c);
                axgxVar.c = true;
                Matrix matrix2 = new Matrix();
                int i5 = baouVar2.a;
                int i6 = baouVar2.b;
                bapf.c(axgxVar, baouVar2, matrix2, i5, i6, 0, 0, i5, i6);
                banh banhVar = axgxVar.a.a;
                int i7 = banhVar.c;
                int i8 = banhVar.d;
                baouVar = new baou(i7, i8, i7, i8, 2, banhVar.b, baouVar2.c, baouVar2.d, baouVar2.e, new baor(new Runnable() { // from class: axgw
                    @Override // java.lang.Runnable
                    public final void run() {
                        axgx axgxVar2 = axgx.this;
                        axgxVar2.b.a();
                        axgxVar2.c = false;
                    }
                }));
            }
        } else {
            buffer.retain();
            baouVar = buffer;
        }
        VideoFrame videoFrame2 = new VideoFrame(baouVar, videoFrame.getRotation(), videoFrame.getTimestampNs());
        super.b(videoFrame2, baobVar, null, i, i2);
        videoFrame2.release();
    }
}

package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: acbb  reason: default package */
/* loaded from: classes.dex */
public final class acbb extends acbe {
    private final acbc f;
    private boolean g;
    private boolean h;
    private int i;

    public acbb(MediaFormat mediaFormat, acbc acbcVar, acbw acbwVar) {
        super(mediaFormat, acbwVar);
        this.f = acbcVar;
        acbcVar.f(this);
        acbcVar.e(this);
    }

    @Override // defpackage.acbt
    public final void a(int i) {
        throw null;
    }

    @Override // defpackage.acbe
    protected final void b() {
        this.g = true;
        this.f.d();
    }

    @Override // defpackage.acbe, defpackage.acbt
    public final boolean c() {
        int i = this.i;
        if (i > 0) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("Buffers still pending from audio input at release: count=");
            sb.append(i);
            Log.w("DefaultAudioEncoder", sb.toString());
        }
        if (!this.f.b()) {
            Log.w("DefaultAudioEncoder", "Error releasing audio input");
        }
        return super.c();
    }

    @Override // defpackage.acbe, defpackage.acbt
    public final boolean d() {
        if (!this.f.c()) {
            Log.e("DefaultAudioEncoder", "Failed to ensure audio input was started");
            return false;
        }
        return super.d();
    }

    @Override // defpackage.acbe, defpackage.acbt
    public final boolean e() {
        if (!this.f.d()) {
            Log.w("DefaultAudioEncoder", "Error stopping audio encoder");
        }
        return super.e();
    }

    public final void f(int i, int i2, int i3, long j) {
        this.i--;
        if (i3 >= 0) {
            try {
                if (!this.h && j()) {
                    boolean z = false;
                    this.b.queueInputBuffer(i, 0, this.e == 3 ? 0 : i3, j, i2);
                    if ((i2 & 4) != 0) {
                        z = true;
                    }
                    this.h = z;
                    if (!z || this.g) {
                        return;
                    }
                    Log.e("DefaultAudioEncoder", "Unexpected EOS from audio data");
                    i(7);
                    return;
                }
                StringBuilder sb = new StringBuilder(60);
                sb.append("Received full buffer after sending end: bufferId=");
                sb.append(i);
                Log.e("DefaultAudioEncoder", sb.toString());
            } catch (Exception e) {
                Log.e("DefaultAudioEncoder", "Error queuing input to audio encoder", e);
                i(7);
            }
        } else if (this.g) {
        } else {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Error reading audio data: ");
            sb2.append(i3);
            Log.e("DefaultAudioEncoder", sb2.toString());
            i(7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        ylr.b();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Unexpected buffer index for codec: ");
            sb.append(i);
            Log.e("DefaultAudioEncoder", sb.toString());
            return;
        }
        try {
            ByteBuffer inputBuffer = this.b.getInputBuffer(i);
            if (inputBuffer == null) {
                Log.e("DefaultAudioEncoder", "Got a null buffer valid buffer should be present");
                return;
            }
            this.i++;
            this.f.a(i, inputBuffer);
        } catch (Exception e) {
            Log.e("DefaultAudioEncoder", "Error obtaining input buffer for audio encoder", e);
            if (this.g) {
                return;
            }
            i(7);
        }
    }
}

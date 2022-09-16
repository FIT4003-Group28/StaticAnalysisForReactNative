package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.channels.Channels;
/* compiled from: PG */
/* renamed from: vra  reason: default package */
/* loaded from: classes4.dex */
public final class vra implements vrb {
    private vrm a;
    private long b = 0;
    private int c;
    private int d;
    private final vrh e;

    public vra(vrh vrhVar) {
        this.e = vrhVar;
    }

    private final void c() {
        vsf vsfVar;
        int i;
        int i2;
        while (true) {
            vrm vrmVar = this.a;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                int dequeueOutputBuffer = vrmVar.b.dequeueOutputBuffer(bufferInfo, 1000L);
                if (dequeueOutputBuffer >= 0) {
                    if ((bufferInfo.flags & 4) != 0) {
                        vrmVar.c = 2;
                    }
                    ByteBuffer[] outputBuffers = vrmVar.b.getOutputBuffers();
                    viu.g(dequeueOutputBuffer, outputBuffers.length);
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    vsfVar = new vsf(vrmVar, dequeueOutputBuffer, byteBuffer, bufferInfo);
                } else if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        if (dequeueOutputBuffer != -1) {
                            StringBuilder sb = new StringBuilder(26);
                            sb.append("Invalid index: ");
                            sb.append(dequeueOutputBuffer);
                            throw new vrl(sb.toString());
                        }
                        vsfVar = null;
                    } else if (vrmVar.a == null) {
                        vrmVar.a = vrmVar.b.getOutputFormat();
                    } else {
                        throw new vrl("Output format changed twice");
                    }
                }
            }
            if (vsfVar == null) {
                return;
            }
            vsfVar.a.position(vsfVar.b.offset);
            vsfVar.a.limit(vsfVar.b.offset + vsfVar.b.size);
            int i3 = this.c;
            int i4 = this.d;
            MediaFormat mediaFormat = this.a.a;
            if (mediaFormat != null) {
                i3 = mediaFormat.getInteger("sample-rate");
                i4 = mediaFormat.getInteger("channel-count");
            }
            vrh vrhVar = this.e;
            ByteBuffer byteBuffer2 = vsfVar.a;
            if (byteBuffer2.remaining() > 0) {
                int remaining = byteBuffer2.remaining();
                byte[] bArr = new byte[7];
                long a = vrh.a(vrh.a(vrh.a(vrh.a(vrh.a(0L, 12, 4095), 1, 0), 2, 0), 1, 1), 2, 0);
                switch (i3) {
                    case 7350:
                        i = 12;
                        break;
                    case 8000:
                        i = 11;
                        break;
                    case 11025:
                        i = 10;
                        break;
                    case 12000:
                        i = 9;
                        break;
                    case 16000:
                        i = 8;
                        break;
                    case 22050:
                        i = 7;
                        break;
                    case 24000:
                        i = 6;
                        break;
                    case 32000:
                        i = 5;
                        break;
                    case 44100:
                        i = 4;
                        break;
                    case 48000:
                        i = 3;
                        break;
                    case 64000:
                        i = 2;
                        break;
                    case 88200:
                        i = 1;
                        break;
                    case 96000:
                        i = 0;
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(32);
                        sb2.append("Invalid sample rate: ");
                        sb2.append(i3);
                        throw new IllegalArgumentException(sb2.toString());
                }
                long a2 = vrh.a(vrh.a(a, 4, i), 1, 0);
                switch (i4) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 6;
                        break;
                    case 7:
                    default:
                        StringBuilder sb3 = new StringBuilder(34);
                        sb3.append("Invalid channel count: ");
                        sb3.append(i4);
                        throw new IllegalArgumentException(sb3.toString());
                    case 8:
                        i2 = 7;
                        break;
                }
                long a3 = vrh.a(vrh.a(vrh.a(vrh.a(vrh.a(vrh.a(vrh.a(vrh.a(a2, 3, i2), 1, 0), 1, 0), 1, 0), 1, 0), 13, remaining + 7), 11, 2047), 2, 0);
                bArr[0] = (byte) ((a3 >>> 48) & 255);
                bArr[1] = (byte) ((a3 >>> 40) & 255);
                bArr[2] = (byte) ((a3 >>> 32) & 255);
                bArr[3] = (byte) ((a3 >>> 24) & 255);
                bArr[4] = (byte) ((a3 >>> 16) & 255);
                bArr[5] = (byte) ((a3 >>> 8) & 255);
                bArr[6] = (byte) a3;
                vrhVar.b.write(bArr, 0, 7);
                if (byteBuffer2.isDirect()) {
                    int remaining2 = byteBuffer2.remaining();
                    byte[] bArr2 = new byte[remaining2];
                    byteBuffer2.get(bArr2);
                    vrhVar.b.write(bArr2, 0, remaining2);
                } else {
                    vrhVar.b.write(byteBuffer2.array(), byteBuffer2.position(), byteBuffer2.remaining());
                }
            }
            vsfVar.d.b.releaseOutputBuffer(vsfVar.c, false);
        }
    }

    @Override // defpackage.vrb
    public final void a() {
        long j;
        vrq a;
        vrm vrmVar;
        if (this.a != null) {
            do {
                c();
                vrm vrmVar2 = this.a;
                j = this.b;
                a = vrq.a(vrmVar2.b);
            } while (a == null);
            a.b(ByteBuffer.allocate(0), j, 4);
            while (true) {
                vrmVar = this.a;
                if (vrmVar.c != 1) {
                    break;
                }
                c();
            }
            vrmVar.c = 3;
            vrmVar.b.stop();
            vrmVar.b.release();
            this.a = null;
        } else {
            vqy.b("Encoder not started!");
        }
        vrh vrhVar = this.e;
        try {
            byte[] byteArray = vrhVar.b.toByteArray();
            vrhVar.b.close();
            if (byteArray.length > 0) {
                axjt axjtVar = new axjt(new axjb(byteArray));
                axje axjeVar = new axje();
                axjeVar.b(axjtVar);
                axjeVar.c = vrhVar.d;
                axjeVar.b = vrhVar.d;
                new axjk().c(axjeVar).k(Channels.newChannel(vrhVar.a));
            } else {
                vqy.b("No audio data to write!");
            }
        } catch (IOException e) {
            vrhVar.c = e;
        }
        vui vuiVar = vrhVar.e;
        Exception exc = vrhVar.c;
        if (exc != null) {
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Audioswap mixing ended with error: ");
            sb.append(valueOf);
            vqy.b(sb.toString());
        }
        vuiVar.a.sendEmptyMessage(1);
    }

    @Override // defpackage.vrb
    public final void b(ShortBuffer shortBuffer, int i, int i2) {
        vrq a;
        if (this.a == null) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Creating encoder rate:");
            sb.append(i);
            sb.append(" channels:");
            sb.append(i2);
            vqy.a(sb.toString());
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat.setInteger("bitrate", 128000);
            try {
                this.a = new vrm(createAudioFormat);
                this.c = i;
                this.d = i2;
            } catch (IOException e) {
                throw new RuntimeException("Cannot create an audio encoder", e);
            }
        } else {
            int i3 = this.c;
            viu.c(i3 == i, "samplesPerSec changed from %s to %s", Integer.valueOf(i3), Integer.valueOf(i));
            int i4 = this.d;
            viu.c(i4 == i2, "channelCount changed from %s to %s", Integer.valueOf(i4), Integer.valueOf(i2));
        }
        do {
            c();
            long remaining = ((shortBuffer.remaining() * 1000000) / i) / i2;
            int position = shortBuffer.position();
            int remaining2 = shortBuffer.remaining();
            ByteBuffer allocate = ByteBuffer.allocate(remaining2 + remaining2);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.asShortBuffer().put(shortBuffer).flip();
            vrm vrmVar = this.a;
            long j = this.b;
            do {
                a = vrq.a(vrmVar.b);
                if (a == null) {
                    break;
                }
            } while (a.b(allocate, j, 0));
            this.b += remaining;
            shortBuffer.position(Math.min(position + (allocate.position() / 2), shortBuffer.limit()));
        } while (shortBuffer.remaining() > 0);
    }
}

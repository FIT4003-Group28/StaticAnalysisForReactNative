package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsf  reason: default package */
/* loaded from: classes5.dex */
public final class clsf {
    public final Format a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final clrh[] j;

    private final int e(long j) {
        int i;
        int i2 = this.g;
        switch (i2) {
            case 5:
                i = 80000;
                break;
            case 6:
            case 18:
                i = 768000;
                break;
            case 7:
                i = 192000;
                break;
            case 8:
                i = 2250000;
                break;
            case 9:
                i = 40000;
                break;
            case 10:
                i = 100000;
                break;
            case 11:
                i = 16000;
                break;
            case 12:
                i = 7000;
                break;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                i = 3062500;
                break;
            case 15:
                i = 8000;
                break;
            case 16:
                i = 256000;
                break;
            case 17:
                i = 336000;
                break;
        }
        if (i2 == 5) {
            i += i;
        }
        return (int) ((j * i) / 1000000);
    }

    private static AudioAttributes f(clrc clrcVar, boolean z) {
        if (!z) {
            if (clrcVar.c == null) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
                if (cmny.a >= 29) {
                    usage.setAllowedCapturePolicy(1);
                }
                clrcVar.c = usage.build();
            }
            return clrcVar.c;
        }
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public final long a(long j) {
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return (j * this.e) / 1000000;
    }

    public final AudioTrack c(boolean z, clrc clrcVar, int i) {
        AudioTrack audioTrack;
        try {
            if (cmny.a >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(f(clrcVar, z)).setAudioFormat(clsn.v(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            } else if (cmny.a < 21) {
                int i2 = clrcVar.b;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
                }
            } else {
                audioTrack = new AudioTrack(f(clrcVar, z), clsn.v(this.e, this.f, this.g), this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new clrv(state, this.e, this.f, this.h, d(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new clrv(0, this.e, this.f, this.h, d(), e);
        }
    }

    public final boolean d() {
        return this.c == 1;
    }

    public clsf(Format format, int i, int i2, int i3, int i4, int i5, int i6, boolean z, clrh[] clrhVarArr) {
        int B;
        this.a = format;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.i = z;
        this.j = clrhVarArr;
        boolean z2 = true;
        if (i2 == 0) {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            cmmn.c(minBufferSize == -2 ? false : z2);
            B = cmny.B(minBufferSize * 4, ((int) b(250000L)) * i3, Math.max(minBufferSize, ((int) b(750000L)) * i3));
        } else if (i2 != 1) {
            B = e(250000L);
        } else {
            B = e(50000000L);
        }
        this.h = B;
    }
}

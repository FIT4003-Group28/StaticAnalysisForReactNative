package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsa  reason: default package */
/* loaded from: classes5.dex */
public final class clsa {
    public long A;
    public long B;
    public boolean C;
    public long D;
    public long E;
    public final clsj F;
    public final long[] a;
    public AudioTrack b;
    public int c;
    public int d;
    public clrz e;
    public int f;
    public boolean g;
    public long h;
    public float i;
    public boolean j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public long w;
    public long x;
    public long y;
    public long z;

    public clsa(clsj clsjVar) {
        this.F = clsjVar;
        if (cmny.a >= 18) {
            try {
                this.m = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.a = new long[10];
    }

    public final boolean a(long j) {
        if (j <= e()) {
            if (!this.g) {
                return false;
            }
            AudioTrack audioTrack = this.b;
            cmmn.f(audioTrack);
            return audioTrack.getPlayState() == 2 && e() == 0;
        }
        return true;
    }

    public final long b(long j) {
        return (j * 1000000) / this.f;
    }

    public final void c() {
        this.k = 0L;
        this.v = 0;
        this.u = 0;
        this.l = 0L;
        this.B = 0L;
        this.E = 0L;
        this.j = false;
    }

    public final long d() {
        return b(e());
    }

    public final long e() {
        AudioTrack audioTrack = this.b;
        cmmn.f(audioTrack);
        if (this.w != -9223372036854775807L) {
            return Math.min(this.z, this.y + ((((SystemClock.elapsedRealtime() * 1000) - this.w) * this.f) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.g) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.t = this.r;
                }
                playState = 2;
            }
            playbackHeadPosition += this.t;
        }
        if (cmny.a <= 29) {
            if (playbackHeadPosition == 0 && this.r > 0 && playState == 3) {
                if (this.x == -9223372036854775807L) {
                    this.x = SystemClock.elapsedRealtime();
                }
                return this.r;
            }
            this.x = -9223372036854775807L;
        }
        if (this.r > playbackHeadPosition) {
            this.s++;
        }
        this.r = playbackHeadPosition;
        return playbackHeadPosition + (this.s << 32);
    }
}

package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: plr  reason: default package */
/* loaded from: classes4.dex */
public final class plr {
    public long A;
    public boolean B;
    public long C;
    public long D;
    public final pmb E;
    public final long[] a;
    public AudioTrack b;
    public int c;
    public plq d;
    public int e;
    public boolean f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public plr(pmb pmbVar) {
        this.E = pmbVar;
        int i = pxi.a;
        try {
            Class[] clsArr = null;
            this.l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.a = new long[10];
    }

    public final long a(long j) {
        return (j * 1000000) / this.e;
    }

    public final long b() {
        AudioTrack audioTrack = this.b;
        ptx.a(audioTrack);
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * this.e) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.s = this.q;
                }
                playState = 2;
            }
            playbackHeadPosition += this.s;
        }
        if (pxi.a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    public final long c() {
        return a(b());
    }

    public final void d() {
        this.j = 0L;
        this.u = 0;
        this.t = 0;
        this.k = 0L;
        this.A = 0L;
        this.D = 0L;
        this.i = false;
    }

    public final boolean e(long j) {
        if (j <= b()) {
            if (!this.f) {
                return false;
            }
            AudioTrack audioTrack = this.b;
            ptx.a(audioTrack);
            return audioTrack.getPlayState() == 2 && b() == 0;
        }
        return true;
    }
}

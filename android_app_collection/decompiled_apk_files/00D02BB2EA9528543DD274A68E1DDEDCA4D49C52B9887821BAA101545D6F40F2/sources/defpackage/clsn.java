package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: clsn  reason: default package */
/* loaded from: classes5.dex */
public final class clsn implements clrx {
    public int A;
    public clsb B;
    public boolean C;
    public long D;
    public boolean E;
    public final clsg F;
    public clsq G;
    private final clrh[] H;
    private final clsi<clrw> I;
    private ByteBuffer J;
    private int K;
    private long L;
    private long M;
    private clrh[] N;
    private ByteBuffer[] O;
    private ByteBuffer P;
    private byte[] Q;
    private int R;
    private int S;
    private boolean T;
    public final clrd a;
    public final clsd b;
    public final clsz c;
    public final clrh[] d;
    public final ConditionVariable e;
    public final clsa f;
    public final ArrayDeque<clsh> g;
    public clsm h;
    public final clsi<clrv> i;
    public clsf j;
    public clsf k;
    public AudioTrack l;
    public clrc m;
    public clsh n;
    public clsh o;
    public long p;
    public long q;
    public int r;
    public boolean s;
    public boolean t;
    public long u;
    public float v;
    public ByteBuffer w;
    public int x;
    public boolean y;
    public boolean z;

    public clsn(clrd clrdVar, clsg clsgVar) {
        this.a = clrdVar;
        this.F = clsgVar;
        int i = cmny.a;
        this.e = new ConditionVariable(true);
        this.f = new clsa(new clsj(this));
        clsd clsdVar = new clsd();
        this.b = clsdVar;
        clsz clszVar = new clsz();
        this.c = clszVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new clsv(), clsdVar, clszVar);
        Collections.addAll(arrayList, clsgVar.a);
        this.d = (clrh[]) arrayList.toArray(new clrh[0]);
        this.H = new clrh[]{new clsp()};
        this.v = 1.0f;
        this.m = clrc.a;
        this.A = 0;
        this.B = new clsb();
        this.o = new clsh(clod.a, false, 0L, 0L);
        this.S = -1;
        this.N = new clrh[0];
        this.O = new ByteBuffer[0];
        this.g = new ArrayDeque<>();
        this.i = new clsi<>();
        this.I = new clsi<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> s(com.google.android.exoplayer2.Format r9, defpackage.clrd r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r9.l
            defpackage.cmmn.f(r1)
            java.lang.String r2 = r9.i
            int r1 = defpackage.cmnf.h(r1, r2)
            r2 = 8
            r3 = 7
            r4 = 5
            r5 = 18
            r6 = 6
            if (r1 == r4) goto L2a
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L2a
            r7 = 17
            if (r1 == r7) goto L2a
            if (r1 == r3) goto L2a
            if (r1 == r2) goto L2a
            r7 = 14
            if (r1 != r7) goto L29
            goto L2a
        L29:
            return r0
        L2a:
            if (r1 != r5) goto L2e
            r9 = 6
            goto L30
        L2e:
            int r9 = r9.y
        L30:
            int r7 = r10.b
            if (r9 > r7) goto L8b
            int r7 = defpackage.cmny.a
            r8 = 28
            if (r7 > r8) goto L47
            if (r9 != r3) goto L3d
            goto L48
        L3d:
            r2 = 3
            if (r9 == r2) goto L45
            r2 = 4
            if (r9 == r2) goto L45
            if (r9 != r4) goto L47
        L45:
            r2 = 6
            goto L48
        L47:
            r2 = r9
        L48:
            int r9 = defpackage.cmny.a
            r3 = 26
            if (r9 > r3) goto L5c
            java.lang.String r9 = defpackage.cmny.b
            java.lang.String r3 = "fugu"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L5c
            r9 = 1
            if (r2 != r9) goto L5c
            r2 = 2
        L5c:
            int r9 = defpackage.cmny.P(r2)
            if (r9 != 0) goto L63
            return r0
        L63:
            boolean r2 = r10.b(r1)
            if (r2 == 0) goto L76
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        L76:
            if (r1 != r5) goto L8b
            boolean r10 = r10.b(r6)
            if (r10 == 0) goto L8b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsn.s(com.google.android.exoplayer2.Format, clrd):android.util.Pair");
    }

    public static boolean t(AudioTrack audioTrack) {
        return cmny.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static AudioFormat v(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private final void w() {
        int i = 0;
        while (true) {
            clrh[] clrhVarArr = this.N;
            if (i < clrhVarArr.length) {
                clrh clrhVar = clrhVarArr[i];
                clrhVar.g();
                this.O[i] = clrhVar.e();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
        if (r15 < r14) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsn.x(java.nio.ByteBuffer, long):void");
    }

    private final clsh y() {
        clsh clshVar = this.n;
        return clshVar != null ? clshVar : !this.g.isEmpty() ? this.g.getLast() : this.o;
    }

    private static int z(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @Override // defpackage.clrx
    public final boolean a(Format format) {
        return b(format) != 0;
    }

    @Override // defpackage.clrx
    public final int b(Format format) {
        if (!"audio/raw".equals(format.l)) {
            return s(format, this.a) != null ? 2 : 0;
        } else if (cmny.N(format.A)) {
            return format.A != 2 ? 1 : 2;
        } else {
            int i = format.A;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i);
            sb.toString();
            return 0;
        }
    }

    @Override // defpackage.clrx
    public final void c() {
        this.z = true;
        if (p()) {
            clrz clrzVar = this.f.e;
            cmmn.f(clrzVar);
            clrzVar.b();
            this.l.play();
        }
    }

    @Override // defpackage.clrx
    public final void d() {
        this.s = true;
    }

    @Override // defpackage.clrx
    public final boolean e() {
        return p() && this.f.a(r());
    }

    @Override // defpackage.clrx
    public final void f() {
        if (p()) {
            this.p = 0L;
            this.q = 0L;
            this.L = 0L;
            this.M = 0L;
            this.E = false;
            this.r = 0;
            this.o = new clsh(n(), k(), 0L, 0L);
            this.u = 0L;
            this.n = null;
            this.g.clear();
            this.w = null;
            this.x = 0;
            this.P = null;
            this.T = false;
            this.y = false;
            this.S = -1;
            this.J = null;
            this.K = 0;
            this.c.g = 0L;
            w();
            AudioTrack audioTrack = this.f.b;
            cmmn.f(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.l.pause();
            }
            if (t(this.l)) {
                clsm clsmVar = this.h;
                cmmn.f(clsmVar);
                this.l.unregisterStreamEventCallback(clsmVar.b);
                clsmVar.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.l;
            this.l = null;
            clsf clsfVar = this.j;
            if (clsfVar != null) {
                this.k = clsfVar;
                this.j = null;
            }
            clsa clsaVar = this.f;
            clsaVar.c();
            clsaVar.b = null;
            clsaVar.e = null;
            this.e.close();
            new clse(this, audioTrack2).start();
        }
        this.I.b();
        this.i.b();
    }

    @Override // defpackage.clrx
    public final void g() {
        f();
        for (clrh clrhVar : this.d) {
            clrhVar.h();
        }
        clrh[] clrhVarArr = this.H;
        int length = clrhVarArr.length;
        for (int i = 0; i <= 0; i++) {
            clrhVarArr[i].h();
        }
        this.A = 0;
        this.z = false;
    }

    public final void h(long j) {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.O[i - 1];
            } else {
                byteBuffer = this.w;
                if (byteBuffer == null) {
                    byteBuffer = clrh.a;
                }
            }
            if (i == length) {
                x(byteBuffer, j);
            } else {
                clrh clrhVar = this.N[i];
                clrhVar.c(byteBuffer);
                ByteBuffer e = clrhVar.e();
                this.O[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    public final void i() {
        this.k.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.S = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.S
            clrh[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.h(r7)
            boolean r0 = r4.f()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.S
            int r0 = r0 + r2
            r9.S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            r9.x(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsn.j():boolean");
    }

    public final boolean k() {
        return y().b;
    }

    public final void l() {
        if (!p()) {
            return;
        }
        if (cmny.a >= 21) {
            this.l.setVolume(this.v);
            return;
        }
        AudioTrack audioTrack = this.l;
        float f = this.v;
        audioTrack.setStereoVolume(f, f);
    }

    public final void m(clod clodVar, boolean z) {
        clsh y = y();
        if (!clodVar.equals(y.a) || z != y.b) {
            clsh clshVar = new clsh(clodVar, z, -9223372036854775807L, -9223372036854775807L);
            if (p()) {
                this.n = clshVar;
            } else {
                this.o = clshVar;
            }
        }
    }

    public final clod n() {
        return y().a;
    }

    public final void o(long j) {
        clod clodVar;
        final boolean z;
        final clrs clrsVar;
        Handler handler;
        if (this.k.i) {
            clsg clsgVar = this.F;
            clod n = n();
            clsy clsyVar = clsgVar.c;
            float f = n.b;
            if (clsyVar.b != f) {
                clsyVar.b = f;
                clsyVar.f = true;
            }
            float f2 = n.c;
            if (clsyVar.c != f2) {
                clsyVar.c = f2;
                clsyVar.f = true;
            }
            clodVar = new clod(f, f2);
        } else {
            clodVar = clod.a;
        }
        clod clodVar2 = clodVar;
        if (this.k.i) {
            clsg clsgVar2 = this.F;
            boolean k = k();
            clsgVar2.b.e = k;
            z = k;
        } else {
            z = false;
        }
        this.g.add(new clsh(clodVar2, z, Math.max(0L, j), this.k.a(r())));
        clrh[] clrhVarArr = this.k.j;
        ArrayList arrayList = new ArrayList();
        for (clrh clrhVar : clrhVarArr) {
            if (clrhVar.b()) {
                arrayList.add(clrhVar);
            } else {
                clrhVar.g();
            }
        }
        int size = arrayList.size();
        this.N = (clrh[]) arrayList.toArray(new clrh[size]);
        this.O = new ByteBuffer[size];
        w();
        clsq clsqVar = this.G;
        if (clsqVar == null || (handler = (clrsVar = clsqVar.a.d).a) == null) {
            return;
        }
        handler.post(new Runnable(clrsVar, z) { // from class: clrq
            private final clrs a;
            private final boolean b;

            {
                this.a = clrsVar;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                clrs clrsVar2 = this.a;
                boolean z2 = this.b;
                clrt clrtVar = clrsVar2.b;
                int i = cmny.a;
                clrtVar.I(z2);
            }
        });
    }

    public final boolean p() {
        return this.l != null;
    }

    public final long q() {
        clsf clsfVar = this.k;
        return clsfVar.c == 0 ? this.p / clsfVar.b : this.q;
    }

    public final long r() {
        clsf clsfVar = this.k;
        return clsfVar.c == 0 ? this.L / clsfVar.d : this.M;
    }

    public final void u() {
        if (!this.T) {
            this.T = true;
            clsa clsaVar = this.f;
            long r = r();
            clsaVar.y = clsaVar.e();
            clsaVar.w = SystemClock.elapsedRealtime() * 1000;
            clsaVar.z = r;
            this.l.stop();
            this.K = 0;
        }
    }
}

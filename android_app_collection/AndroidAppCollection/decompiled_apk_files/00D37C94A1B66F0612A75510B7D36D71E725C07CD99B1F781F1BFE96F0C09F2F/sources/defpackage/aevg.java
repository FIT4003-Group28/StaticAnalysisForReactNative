package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.view.Choreographer;
import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: aevg  reason: default package */
/* loaded from: classes.dex */
public final class aevg extends oud implements Choreographer.FrameCallback {
    private final Deque i;
    private final Deque j;
    private final boolean k;
    private final boolean l;
    private final aevf m;
    private final aevn n;
    private final long o;
    private long p;
    private long q;
    private long r;
    private long s;

    public aevg(Context context, oui ouiVar, otm otmVar, owy owyVar, Handler handler, aevf aevfVar, aevn aevnVar, boolean z, boolean z2, long j) {
        super(context, ouiVar, otmVar, 5000L, owyVar, true, handler, aevfVar, 10);
        this.l = z;
        this.k = z2;
        this.i = new ArrayDeque(32);
        this.j = new ArrayDeque(32);
        this.m = aevfVar;
        this.n = aevnVar;
        this.o = 1000 * j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj
    public final void A(long j, long j2, boolean z) {
        super.A(j, j2, z);
        this.p = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public final void C() {
        super.C();
        this.j.addAll(this.i);
        this.i.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots
    public final boolean D(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        return !this.l && super.D(mediaCodec, z, mediaFormat, mediaFormat2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud
    public final boolean I(long j, long j2) {
        long j3 = this.o;
        if ((j3 <= 0 || j2 - this.s <= j3) && super.I(j, j2)) {
            return true;
        }
        this.s = j2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final long b() {
        long b = super.b();
        this.n.b(b);
        return b;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        agel agelVar;
        Choreographer.getInstance().postFrameCallback(this);
        long j2 = this.q;
        if (j2 == -1) {
            this.q = j;
            j2 = j;
        }
        long j3 = (j - j2) + this.r;
        long j4 = (-30000000) + j3;
        long j5 = j3 + 11000000;
        Object poll = this.i.poll();
        while (true) {
            agelVar = (agel) poll;
            if (agelVar == null || j4 <= 0) {
                break;
            }
            o(null, 0);
            this.j.add(agelVar);
            poll = this.i.poll();
        }
        if (agelVar != null) {
            if (j5 >= 0) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
                G(null, 0);
                this.j.add(agelVar);
                return;
            }
            this.i.addFirst(agelVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots, defpackage.ouo
    public final boolean i() {
        if (super.i()) {
            this.n.e();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots, defpackage.ouj, defpackage.ouo
    public final void q() {
        super.q();
        this.j.addAll(this.i);
        this.i.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots, defpackage.ouj
    public final void r(long j) {
        super.r(j);
        this.p = j;
        this.r = j * 1000;
        this.q = -1L;
        this.j.addAll(this.i);
        this.i.clear();
        this.s = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots
    public final void s(oue oueVar) {
        super.s(oueVar);
        this.m.g(oueVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ots, defpackage.ouo
    public final void v() {
        super.v();
        this.q = -1L;
        this.r = this.p * 1000;
        this.n.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oud, defpackage.ouo
    public final void w() {
        super.w();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // defpackage.ots
    protected final long z() {
        return (!this.k || !this.i.isEmpty()) ? 0L : 16666L;
    }
}

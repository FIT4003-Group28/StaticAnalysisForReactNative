package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: psq  reason: default package */
/* loaded from: classes4.dex */
public final class psq extends phj implements Handler.Callback {
    public long a;
    private final Handler b;
    private final psp c;
    private final pit d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private Format i;
    private psl j;
    private psn k;
    private pso l;
    private pso m;
    private int q;

    public psq(psp pspVar, Looper looper) {
        super(3);
        ptx.a(pspVar);
        this.c = pspVar;
        this.b = looper == null ? null : pxi.r(looper, this);
        this.d = new pit();
        this.a = -9223372036854775807L;
    }

    private final long b() {
        if (this.q == -1) {
            return Long.MAX_VALUE;
        }
        ptx.a(this.l);
        if (this.q < this.l.a()) {
            return this.l.c(this.q);
        }
        return Long.MAX_VALUE;
    }

    private final void c() {
        k(Collections.emptyList());
    }

    private final void f(psm psmVar) {
        String valueOf = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        pns.e("TextRenderer", sb.toString(), psmVar);
        c();
        j();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r2.equals("text/x-ssa") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psq.g():void");
    }

    private final void h() {
        this.k = null;
        this.q = -1;
        pso psoVar = this.l;
        if (psoVar != null) {
            psoVar.release();
            this.l = null;
        }
        pso psoVar2 = this.m;
        if (psoVar2 != null) {
            psoVar2.release();
            this.m = null;
        }
    }

    private final void i() {
        h();
        psl pslVar = this.j;
        ptx.a(pslVar);
        pslVar.f();
        this.j = null;
        this.h = 0;
    }

    private final void j() {
        i();
        g();
    }

    private final void k(List list) {
        Handler handler = this.b;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            l();
        }
    }

    private final void l() {
        Iterator it = ((pkj) this.c).a.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).W();
        }
    }

    @Override // defpackage.pkd
    public final boolean H() {
        return this.f;
    }

    @Override // defpackage.pkd
    public final boolean I() {
        return true;
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        String str = format.l;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? format.E == null ? 4 : 2 : pwl.k(format.l) ? 1 : 0;
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            List list = (List) message.obj;
            l();
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.phj
    protected final void p() {
        this.i = null;
        this.a = -9223372036854775807L;
        c();
        i();
    }

    @Override // defpackage.phj
    protected final void s(long j, boolean z) {
        c();
        this.e = false;
        this.f = false;
        this.a = -9223372036854775807L;
        if (this.h != 0) {
            j();
            return;
        }
        h();
        psl pslVar = this.j;
        ptx.a(pslVar);
        pslVar.j();
    }

    @Override // defpackage.phj
    protected final void x(Format[] formatArr, long j, long j2) {
        this.i = formatArr[0];
        if (this.j != null) {
            this.h = 1;
        } else {
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (r10 != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1 A[EXC_TOP_SPLITTER, LOOP:1: B:83:0x00b1->B:95:0x00b1, LOOP_START, SYNTHETIC] */
    @Override // defpackage.pkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psq.z(long, long):void");
    }
}

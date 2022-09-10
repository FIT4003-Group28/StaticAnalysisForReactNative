package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgg  reason: default package */
/* loaded from: classes5.dex */
public final class cmgg extends clls implements Handler.Callback {
    private final Handler d;
    private final cmgf e;
    private final clng f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private Format k;
    private cmgb l;
    private cmgd m;
    private cmge n;
    private cmge o;
    private int p;

    public cmgg(cmgf cmgfVar, Looper looper) {
        super(3);
        cmmn.f(cmgfVar);
        this.e = cmgfVar;
        this.d = looper == null ? null : cmny.j(looper, this);
        this.f = new clng();
    }

    private final void O() {
        this.m = null;
        this.p = -1;
        cmge cmgeVar = this.n;
        if (cmgeVar != null) {
            cmgeVar.release();
            this.n = null;
        }
        cmge cmgeVar2 = this.o;
        if (cmgeVar2 != null) {
            cmgeVar2.release();
            this.o = null;
        }
    }

    private final void P() {
        O();
        cmgb cmgbVar = this.l;
        cmmn.f(cmgbVar);
        cmgbVar.e();
        this.l = null;
        this.j = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r2.equals("text/x-ssa") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgg.Q():void");
    }

    private final void R() {
        P();
        Q();
    }

    private final long S() {
        if (this.p == -1) {
            return Long.MAX_VALUE;
        }
        cmmn.f(this.n);
        if (this.p < this.n.b()) {
            return this.n.c(this.p);
        }
        return Long.MAX_VALUE;
    }

    private final void T(List<cmfw> list) {
        Handler handler = this.d;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            V(list);
        }
    }

    private final void U() {
        T(Collections.emptyList());
    }

    private final void V(List<cmfw> list) {
        this.e.J(list);
    }

    private final void W(cmgc cmgcVar) {
        String valueOf = String.valueOf(this.k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        cmna.a(sb.toString(), cmgcVar);
        U();
        R();
    }

    @Override // defpackage.clol, defpackage.clon
    public final String J() {
        return "TextRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r10 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0099 A[EXC_TOP_SPLITTER, LOOP:1: B:74:0x0099->B:88:0x0099, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.clol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmgg.K(long, long):void");
    }

    @Override // defpackage.clol
    public final boolean L() {
        return true;
    }

    @Override // defpackage.clol
    public final boolean M() {
        return this.h;
    }

    @Override // defpackage.clon
    public final int N(Format format) {
        String str = format.l;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? format.E == null ? 4 : 2 : cmnf.c(format.l) ? 1 : 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            V((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.clls
    protected final void v(Format[] formatArr, long j, long j2) {
        this.k = formatArr[0];
        if (this.l != null) {
            this.j = 1;
        } else {
            Q();
        }
    }

    @Override // defpackage.clls
    protected final void w(long j, boolean z) {
        U();
        this.g = false;
        this.h = false;
        if (this.j != 0) {
            R();
            return;
        }
        O();
        cmgb cmgbVar = this.l;
        cmmn.f(cmgbVar);
        cmgbVar.d();
    }

    @Override // defpackage.clls
    protected final void z() {
        this.k = null;
        U();
        P();
    }
}

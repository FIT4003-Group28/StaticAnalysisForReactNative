package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.cmle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cmld  reason: default package */
/* loaded from: classes5.dex */
public final class cmld<T extends cmle> extends Handler implements Runnable {
    public IOException a;
    public int b;
    final /* synthetic */ cmli c;
    private final T d;
    private final long e;
    private cmlb<T> f;
    private Thread g;
    private boolean h;
    private volatile boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cmld(cmli cmliVar, Looper looper, cmle cmleVar, cmlb cmlbVar, long j) {
        super(looper);
        this.c = cmliVar;
        this.d = cmleVar;
        this.f = cmlbVar;
        this.e = j;
    }

    private final void c() {
        this.a = null;
        cmli cmliVar = this.c;
        ExecutorService executorService = cmliVar.c;
        cmld<? extends cmle> cmldVar = cmliVar.d;
        cmmn.f(cmldVar);
        executorService.execute(cmldVar);
    }

    private final void d() {
        this.c.d = null;
    }

    public final void a(long j) {
        cmmn.c(this.c.d == null);
        this.c.d = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            c();
        }
    }

    public final void b(boolean z) {
        this.i = z;
        this.a = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.h = true;
                ((cmew) this.d).g = true;
                Thread thread = this.g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            d();
            SystemClock.elapsedRealtime();
            cmlb<T> cmlbVar = this.f;
            cmmn.f(cmlbVar);
            ((cmfb) cmlbVar).x((cmew) this.d, true);
            this.f = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        clvg clvgVar;
        cmla cmlaVar;
        long j;
        boolean z;
        cmlc a;
        clvg clvgVar2;
        if (this.i) {
            return;
        }
        if (message.what == 0) {
            c();
        } else if (message.what == 3) {
            throw ((Error) message.obj);
        } else {
            d();
            SystemClock.elapsedRealtime();
            cmlb<T> cmlbVar = this.f;
            cmmn.f(cmlbVar);
            if (this.h) {
                ((cmfb) cmlbVar).x((cmew) this.d, false);
                return;
            }
            int i = message.what;
            if (i == 1) {
                try {
                    T t = this.d;
                    if (((cmfb) cmlbVar).o == -9223372036854775807L && (clvgVar = ((cmfb) cmlbVar).n) != null) {
                        boolean a2 = clvgVar.a();
                        long w = ((cmfb) cmlbVar).w();
                        long j2 = w == Long.MIN_VALUE ? 0L : w + 10000;
                        ((cmfb) cmlbVar).o = j2;
                        ((cmfb) cmlbVar).e.b(j2, a2, ((cmfb) cmlbVar).p);
                    }
                    cmlm cmlmVar = ((cmew) t).c;
                    long j3 = ((cmew) t).a;
                    cmkj cmkjVar = ((cmew) t).j;
                    cmdz cmdzVar = new cmdz();
                    long j4 = ((cmew) t).a;
                    ((cmfb) cmlbVar).d.c(cmdzVar, new cmee(-1, null, cmeq.g(((cmew) t).i), cmeq.g(((cmfb) cmlbVar).o)));
                    ((cmfb) cmlbVar).u((cmew) t);
                    ((cmfb) cmlbVar).w = true;
                    cmef cmefVar = ((cmfb) cmlbVar).j;
                    cmmn.f(cmefVar);
                    cmefVar.e(cmlbVar);
                } catch (RuntimeException e) {
                    cmna.a("Unexpected exception handling load completed", e);
                    this.c.e = new cmlh(e);
                }
            } else if (i == 2) {
                IOException iOException = (IOException) message.obj;
                this.a = iOException;
                int i2 = this.b + 1;
                this.b = i2;
                cmew cmewVar = (cmew) this.d;
                cmfb cmfbVar = (cmfb) cmlbVar;
                cmfbVar.u(cmewVar);
                cmlm cmlmVar2 = cmewVar.c;
                long j5 = cmewVar.a;
                cmkj cmkjVar2 = cmewVar.j;
                cmdz cmdzVar2 = new cmdz();
                new cmee(-1, null, cllt.a(cmewVar.i), cllt.a(cmfbVar.o));
                IOException iOException2 = new cmla(iOException, i2).a;
                long min = ((iOException2 instanceof clob) || (iOException2 instanceof FileNotFoundException) || (iOException2 instanceof cmlh)) ? -9223372036854775807L : Math.min((cmlaVar.b - 1) * 1000, 5000);
                if (min == -9223372036854775807L) {
                    a = cmli.b;
                } else {
                    int v = cmfbVar.v();
                    if (v > cmfbVar.v) {
                        j = min;
                        z = true;
                    } else {
                        j = min;
                        z = false;
                    }
                    if (cmfbVar.s != -1 || ((clvgVar2 = cmfbVar.n) != null && clvgVar2.c() != -9223372036854775807L)) {
                        cmfbVar.v = v;
                    } else if (!cmfbVar.m || cmfbVar.r()) {
                        cmfbVar.r = cmfbVar.m;
                        cmfbVar.t = 0L;
                        cmfbVar.v = 0;
                        for (cmfj cmfjVar : cmfbVar.l) {
                            cmfjVar.g();
                        }
                        cmewVar.b(0L, 0L);
                    } else {
                        cmfbVar.u = true;
                        a = cmli.a;
                    }
                    a = cmli.a(z, j);
                }
                int i3 = a.a;
                boolean z2 = !(i3 == 0 || i3 == 1);
                cmfbVar.d.e(cmdzVar2, new cmee(-1, null, cmeq.g(cmewVar.i), cmeq.g(cmfbVar.o)), iOException, z2);
                if (z2) {
                    long j6 = cmewVar.a;
                }
                int i4 = a.a;
                if (i4 == 3) {
                    this.c.e = this.a;
                } else if (i4 != 2) {
                    if (i4 == 1) {
                        this.b = 1;
                    }
                    long j7 = a.b;
                    if (j7 == -9223372036854775807L) {
                        j7 = Math.min((this.b - 1) * 1000, 5000);
                    }
                    a(j7);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0277 A[Catch: all -> 0x02d0, TRY_ENTER, TryCatch #9 {all -> 0x02d0, blocks: (B:13:0x0035, B:14:0x0037, B:106:0x0277, B:108:0x0286, B:110:0x0297, B:115:0x02a5, B:117:0x02b4, B:118:0x02c4, B:119:0x02cb), top: B:171:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0274 A[EDGE_INSN: B:183:0x0274->B:104:0x0274 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134 A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0 A[Catch: all -> 0x02a2, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6 A[Catch: all -> 0x02a2, TRY_LEAVE, TryCatch #0 {all -> 0x02a2, blocks: (B:17:0x0041, B:19:0x006b, B:20:0x0071, B:22:0x008a, B:23:0x0090, B:39:0x00cc, B:41:0x00d6, B:43:0x00e2, B:45:0x00ec, B:47:0x00f8, B:49:0x0102, B:51:0x010e, B:53:0x0118, B:55:0x012a, B:57:0x0134, B:58:0x013a, B:73:0x0170, B:75:0x0179, B:77:0x0189, B:79:0x018d, B:81:0x01b2, B:83:0x01e0, B:85:0x01eb, B:86:0x01ef, B:88:0x01f6, B:61:0x0142, B:64:0x0150, B:68:0x015a, B:70:0x0166, B:27:0x009a, B:30:0x00a9, B:34:0x00b3, B:37:0x00c3), top: B:159:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Type inference failed for: r5v5, types: [cmdx, T extends cmle] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmld.run():void");
    }
}

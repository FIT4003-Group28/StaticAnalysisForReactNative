package defpackage;

import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acbz  reason: default package */
/* loaded from: classes.dex */
public final class acbz implements acbc {
    private acbb A;
    public volatile Thread a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    private final Handler f;
    private final AutomaticGainControl g;
    private final double h;
    private AudioRecord l;
    private acca m;
    private long n;
    private boolean o;
    private byte[] p;
    private volatile boolean q;
    private int r;
    private int s;
    private acbb z;
    private final Runnable i = new acbx(this);
    private final Runnable j = new acbx(this, 2, (byte[]) null);
    private final Runnable k = new acbx(this, 3, (char[]) null);
    private final Runnable t = new acbx(this, 4, (short[]) null);
    private final ConcurrentLinkedQueue u = new ConcurrentLinkedQueue();
    private final ConcurrentLinkedQueue v = new ConcurrentLinkedQueue();
    private final LinkedList w = new LinkedList();
    private final LinkedList x = new LinkedList();
    private final LinkedList y = new LinkedList();

    public acbz(AudioRecord audioRecord, int i, int i2, int i3, Handler handler) {
        int i4 = 2;
        this.f = handler;
        this.l = audioRecord;
        i4 = i != 12 ? 1 : i4;
        double d = i2;
        Double.isNaN(d);
        Double.isNaN(d);
        double d2 = i4;
        Double.isNaN(d2);
        this.h = 1000000.0d / ((d + d) * d2);
        if (AutomaticGainControl.isAvailable()) {
            AutomaticGainControl create = AutomaticGainControl.create(audioRecord.getAudioSessionId());
            this.g = create;
            create.setEnabled(true);
        } else {
            this.g = null;
        }
        for (int i5 = 0; i5 < 30; i5++) {
            acby acbyVar = new acby();
            acbyVar.b = -1;
            acbyVar.a = ByteBuffer.allocateDirect(i3);
            this.x.add(acbyVar);
        }
        this.n = Long.MIN_VALUE;
    }

    private final synchronized void m(acby acbyVar) {
        this.v.add(acbyVar);
        this.f.post(this.t);
    }

    @Override // defpackage.acbc
    public final void a(int i, ByteBuffer byteBuffer) {
        acby acbyVar = this.w.isEmpty() ? new acby() : (acby) this.w.removeFirst();
        acbyVar.a = byteBuffer;
        acbyVar.b = i;
        acbyVar.d = 0;
        acbyVar.e = 0;
        if (this.e) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("Received buffer fill request with pending error: bufferId=");
            sb.append(i);
            Log.w("MicInput", sb.toString());
            acbyVar.d = -1;
            m(acbyVar);
        } else if (this.c) {
            int i2 = acbyVar.b;
            acbyVar.e = 4;
            m(acbyVar);
        } else if (this.q) {
            this.u.add(acbyVar);
        } else {
            StringBuilder sb2 = new StringBuilder(74);
            sb2.append("Received buffer fill request before recorder started: bufferId=");
            sb2.append(i);
            Log.w("MicInput", sb2.toString());
            m(acbyVar);
        }
    }

    @Override // defpackage.acbc
    public final boolean b() {
        if (this.o) {
            return true;
        }
        d();
        try {
            AutomaticGainControl automaticGainControl = this.g;
            if (automaticGainControl != null) {
                automaticGainControl.release();
            }
            this.l.release();
            this.o = true;
        } catch (Exception unused) {
        }
        return this.o;
    }

    @Override // defpackage.acbc
    public final boolean c() {
        if (this.o) {
            Log.e("MicInput", "Cannot start once released");
            return false;
        } else if (this.c) {
            Log.e("MicInput", "Cannot restart once stopped");
            return false;
        } else if (this.q) {
            return true;
        } else {
            if (this.a != null) {
                Log.e("MicInput", "Mic capture thread already exists");
                return false;
            }
            try {
                this.l.startRecording();
                this.e = false;
                this.b = false;
                this.q = true;
                this.a = new Thread(new acbx(this, 1), "MicInputThread");
                this.a.start();
                return this.q;
            } catch (IllegalStateException e) {
                Log.e("MicInput", "Could not start audio recorder", e);
                return false;
            }
        }
    }

    @Override // defpackage.acbc
    public final boolean d() {
        if (this.o) {
            Log.e("MicInput", "Cannot stop once released");
            return false;
        } else if (!this.q) {
            Log.e("MicInput", "Encoder not started");
            return false;
        } else if (this.c) {
            return true;
        } else {
            Thread thread = this.a;
            if (thread == null) {
                this.c = true;
                return true;
            }
            this.b = true;
            while (true) {
                try {
                    thread.join(250L);
                    break;
                } catch (InterruptedException unused) {
                }
            }
            if (thread.isAlive()) {
                thread.interrupt();
                while (true) {
                    try {
                        thread.join(250L);
                        break;
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            if (!thread.isAlive()) {
                this.c = true;
                this.a = null;
            }
            return this.c;
        }
    }

    @Override // defpackage.acbc
    public final void e(acbb acbbVar) {
        this.A = acbbVar;
    }

    @Override // defpackage.acbc
    public final void f(acbb acbbVar) {
        this.z = acbbVar;
    }

    @Override // defpackage.acbq
    public final long g() {
        return TimeUnit.NANOSECONDS.toMillis(h());
    }

    @Override // defpackage.acbq
    public final long h() {
        long nanoTime = System.nanoTime();
        acca accaVar = this.m;
        long j = 0;
        if (accaVar != null && accaVar.a() >= 5000000) {
            j = (long) (this.m.a * 1000.0d);
        }
        long max = Math.max(nanoTime + j, this.n);
        this.n = max;
        return max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.media.audiofx.AutomaticGainControl] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbz.i():void");
    }

    public final void j() {
        ylr.b();
        this.f.removeCallbacks(this.t);
        while (!this.v.isEmpty()) {
            try {
                acby acbyVar = (acby) this.v.remove();
                acbb acbbVar = this.z;
                if (acbbVar != null) {
                    int i = acbyVar.b;
                    ByteBuffer byteBuffer = acbyVar.a;
                    acbbVar.f(i, acbyVar.e, acbyVar.d, acbyVar.c);
                }
                acbyVar.a = null;
                acbyVar.d = 0;
                acbyVar.c = 0L;
                acbyVar.b = -1;
                this.w.addLast(acbyVar);
            } catch (NoSuchElementException unused) {
                Log.e("MicInput", "Audio response queue unexpectedly empty");
                return;
            }
        }
    }

    public final void k(int i) {
        acbb acbbVar = this.A;
        if (acbbVar != null) {
            acbbVar.i(i);
        }
    }

    private final void l() {
        int i = this.r;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.r = i2;
        if (i2 == 0) {
            if (this.s == 0) {
                return;
            }
            this.s = 0;
            this.f.post(this.i);
        } else if (i2 != 30 || this.s == 1) {
        } else {
            Log.w("MicInput", "Audio buffer overflow improved.  Re-entering warning state");
            this.s = 1;
            this.f.post(this.j);
        }
    }
}

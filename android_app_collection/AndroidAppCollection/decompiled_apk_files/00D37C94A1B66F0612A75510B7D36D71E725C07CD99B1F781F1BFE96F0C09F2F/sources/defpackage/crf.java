package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crf  reason: default package */
/* loaded from: classes3.dex */
public final class crf {
    public final cgr a;
    public final List b;
    final cgg c;
    public boolean d;
    public crc e;
    public boolean f;
    public crc g;
    public Bitmap h;
    public crc i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final cld n;
    private boolean o;
    private cgd p;

    public crf(cfk cfkVar, cgr cgrVar, int i, int i2, cig cigVar, Bitmap bitmap) {
        cld cldVar = cfkVar.a;
        cgg c = cfk.c(cfkVar.a());
        cgd l = cfk.c(cfkVar.a()).b().l(((ctm) ((ctm) ctm.b(ckb.a).I()).K()).y(i, i2));
        this.b = new ArrayList();
        this.c = c;
        Handler handler = new Handler(Looper.getMainLooper(), new cre(this));
        this.n = cldVar;
        this.m = handler;
        this.p = l;
        this.a = cgrVar;
        e(cigVar, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((cgv) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        crc crcVar = this.i;
        if (crcVar != null) {
            this.i = null;
            c(crcVar);
            return;
        }
        this.o = true;
        cgv cgvVar = (cgv) this.a;
        cgt cgtVar = cgvVar.f;
        int i2 = cgtVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = cgvVar.e) >= 0) {
            i3 = i < i2 ? ((cgs) cgtVar.e.get(i)).i : -1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.a.b();
        this.g = new crc(this.m, ((cgv) this.a).e, uptimeMillis + i3);
        this.p.l(ctm.c(new cup(Double.valueOf(Math.random())))).h(this.a).p(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(crc crcVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, crcVar).sendToTarget();
        } else if (!this.d) {
            this.i = crcVar;
        } else {
            if (crcVar.b != null) {
                d();
                crc crcVar2 = this.e;
                this.e = crcVar;
                int size = this.b.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((crd) this.b.get(size)).c();
                }
                if (crcVar2 != null) {
                    this.m.obtainMessage(2, crcVar2).sendToTarget();
                }
            }
            b();
        }
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(cig cigVar, Bitmap bitmap) {
        hy.N(cigVar);
        hy.N(bitmap);
        this.h = bitmap;
        this.p = this.p.l(new ctm().G(cigVar));
        this.j = cvd.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}

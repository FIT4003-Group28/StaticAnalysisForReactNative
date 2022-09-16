package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lrd  reason: default package */
/* loaded from: classes3.dex */
public final class lrd implements alal {
    final /* synthetic */ lrj a;

    public lrd(lrj lrjVar) {
        this.a = lrjVar;
    }

    @Override // defpackage.alal
    public final void a(final String str, final boolean z, final boolean z2) {
        this.a.b.execute(new Runnable() { // from class: lqt
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                boolean z3 = z;
                boolean z4 = z2;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    b.a(z3, z4);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void b(final String str, final long j, final long j2) {
        this.a.b.execute(new Runnable() { // from class: lqw
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    if (j3 > 0) {
                        double d = j4;
                        double d2 = j3;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        double d3 = d / d2;
                        if (d3 < 0.0d || d3 > 1.0d) {
                            b.i = -1.0d;
                        } else {
                            b.i = d3;
                        }
                    }
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void c(final String str, final alda aldaVar) {
        this.a.b.execute(new Runnable() { // from class: lrb
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                alda aldaVar2 = aldaVar;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    String str3 = aldaVar2.c;
                    str3.getClass();
                    b.c = str3;
                    alcz a = alcz.a(aldaVar2.e);
                    if (a == null) {
                        a = alcz.PRIVATE;
                    }
                    b.y = lrj.l(a);
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final /* synthetic */ void d(String str, augw augwVar) {
    }

    @Override // defpackage.alal
    public final void e(final String str, final double d) {
        this.a.b.execute(new Runnable() { // from class: lqv
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                double d2 = d;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    if (d2 < 0.0d || d2 > 1.0d) {
                        b.h = -1.0d;
                    } else {
                        b.h = d2;
                    }
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void f(final String str, final long j, final long j2, final double d) {
        this.a.b.execute(new Runnable() { // from class: lqx
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                double d2 = d;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    if (j4 != -1) {
                        double d3 = j3;
                        double d4 = j4;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        b.j = d3 / d4;
                    }
                    b.k = d2;
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void g(final String str, final alct alctVar) {
        this.a.b.execute(new Runnable() { // from class: lqz
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                alct alctVar2 = alctVar;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    b.c(alctVar2);
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void h(final alcw alcwVar) {
        this.a.b.execute(new Runnable() { // from class: lqq
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                alcw alcwVar2 = alcwVar;
                if (alcwVar2.t || !alcwVar2.s) {
                    lrdVar.a.d(alcwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void i(final String str, final alcw alcwVar) {
        this.a.b.execute(new Runnable() { // from class: lra
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                alcw alcwVar2 = alcwVar;
                if (lrdVar.a.b(str2, null) == null) {
                    lrdVar.a.d(alcwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void j(final String str) {
        this.a.b.execute(new Runnable() { // from class: lqu
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                ggp b = lrdVar.a.b(str, null);
                if (b != null) {
                    b.b();
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void k(final String str, final boolean z) {
        this.a.b.execute(new Runnable() { // from class: lqs
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                boolean z2 = z;
                lrdVar.a.c.d(new ggn());
                ggp b = lrdVar.a.b(str2, null);
                if (b == null || !z2) {
                    return;
                }
                lrj lrjVar = lrdVar.a;
                lrj.k(lrjVar.i, b);
                lrj.k(lrjVar.j, b);
                lrj.k(lrjVar.k, b);
                lrjVar.h.remove(b);
                zag.q(lrdVar.a.a, R.string.delete_inprogress_upload_done, 1);
            }
        });
    }

    @Override // defpackage.alal
    public final void l(final String str, final avvd avvdVar) {
        this.a.b.execute(new Runnable() { // from class: lrc
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                avvd avvdVar2 = avvdVar;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    b.d(avvdVar2);
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void m(final String str, final String str2) {
        this.a.b.execute(new Runnable() { // from class: lqr
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str3 = str;
                String str4 = str2;
                ggp b = lrdVar.a.b(str3, null);
                if (b != null) {
                    zgh.m(str4);
                    if (TextUtils.isEmpty(b.g)) {
                        b.g = str4;
                    } else if (!str4.equals(b.g)) {
                        String str5 = b.g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 43 + String.valueOf(str4).length());
                        sb.append("Video id is not allowed to change from ");
                        sb.append(str5);
                        sb.append(" to ");
                        sb.append(str4);
                        throw new AssertionError(sb.toString());
                    }
                    lrdVar.a.i(b);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void n(String str, alcv alcvVar) {
    }

    @Override // defpackage.alal
    public final void o(final String str, final int i) {
        this.a.b.execute(new Runnable() { // from class: lqy
            @Override // java.lang.Runnable
            public final void run() {
                lrd lrdVar = lrd.this;
                String str2 = str;
                int i2 = i;
                ggp b = lrdVar.a.b(str2, null);
                if (b != null) {
                    b.g(i2);
                    lrdVar.a.i(b);
                }
            }
        });
    }
}

package defpackage;

import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ihk  reason: default package */
/* loaded from: classes3.dex */
public final class ihk implements alal {
    final /* synthetic */ ihl a;

    public ihk(ihl ihlVar) {
        this.a = ihlVar;
    }

    @Override // defpackage.alal
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void b(String str, long j, long j2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void c(String str, alda aldaVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void d(String str, augw augwVar) {
    }

    @Override // defpackage.alal
    public final void e(final String str, final double d) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihg
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                String str2 = str;
                double d2 = d;
                ggq ggqVar = (ggq) ihkVar.a.e.get(str2);
                if (ggqVar != null) {
                    ggqVar.e = d2;
                    ihkVar.a.k(str2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void f(final String str, final long j, final long j2, double d) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihh
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                String str2 = str;
                long j3 = j;
                long j4 = j2;
                ggq ggqVar = (ggq) ihkVar.a.e.get(str2);
                if (ggqVar != null) {
                    double d2 = j4;
                    if (d2 != -1.0d) {
                        double d3 = j3;
                        Double.isNaN(d3);
                        Double.isNaN(d2);
                        double d4 = d3 / d2;
                        ggqVar.f = d4;
                        if (d4 > 0.0d) {
                            ggqVar.e = 1.0d;
                        }
                    }
                    ihkVar.a.k(str2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void g(final String str, final alct alctVar) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihi
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                String str2 = str;
                alct alctVar2 = alctVar;
                ggq ggqVar = (ggq) ihkVar.a.e.get(str2);
                if (ggqVar != null) {
                    ggqVar.c(alctVar2);
                    ihkVar.a.l(ggqVar);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void h(final alcw alcwVar) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihe
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                alcw alcwVar2 = alcwVar;
                alcv a = alcv.a(alcwVar2.X);
                if (a == null) {
                    a = alcv.UNKNOWN;
                }
                if (a == alcv.UNKNOWN || a == alcv.NOT_CREATED) {
                    ihkVar.a.e(alcwVar2);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final /* synthetic */ void i(String str, alcw alcwVar) {
    }

    @Override // defpackage.alal
    public final void j(final String str) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihf
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                ggq ggqVar = (ggq) ihkVar.a.e.get(str);
                if (ggqVar != null) {
                    ggqVar.b();
                    ihkVar.a.l(ggqVar);
                }
            }
        });
    }

    @Override // defpackage.alal
    public final void k(final String str, final boolean z) {
        this.a.a.runOnUiThread(new Runnable() { // from class: ihj
            @Override // java.lang.Runnable
            public final void run() {
                ihk ihkVar = ihk.this;
                boolean z2 = z;
                String str2 = str;
                if (!z2) {
                    ihkVar.a.j();
                }
                ihkVar.a.d(str2);
                if (z2) {
                    zag.q(ihkVar.a.a, R.string.reel_upload_bottomsheet_upload_deleted, 1);
                }
                ihkVar.a.i();
            }
        });
    }

    @Override // defpackage.alal
    public final /* synthetic */ void l(String str, avvd avvdVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void n(String str, alcv alcvVar) {
    }

    @Override // defpackage.alal
    public final /* synthetic */ void o(String str, int i) {
    }
}

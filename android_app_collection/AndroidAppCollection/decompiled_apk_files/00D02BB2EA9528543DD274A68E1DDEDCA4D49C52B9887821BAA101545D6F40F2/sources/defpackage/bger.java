package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: bger  reason: default package */
/* loaded from: classes3.dex */
public class bger extends bgpt implements bega {
    public final gga a;
    public final bwqv b;
    public final cpv c;
    @dzsi
    public bwrs<ilo> d;
    private final bgez u;
    @dzsi
    private ilo v;

    public bger(cqhn cqhnVar, bhhf bhhfVar, bnjj bnjjVar, gga ggaVar, bwqv bwqvVar, cpv cpvVar, bgow bgowVar, bgpm bgpmVar, bgne bgneVar, apup apupVar) {
        super(cqhnVar, bhhfVar, bnjjVar, bgowVar, bgpmVar, bgneVar, apupVar);
        this.a = ggaVar;
        this.b = bwqvVar;
        this.u = new bgez(this) { // from class: bgep
            private final bger a;

            {
                this.a = this;
            }

            @Override // defpackage.bgez
            public final void a(dipk dipkVar, diov diovVar, int i, boolean z, boolean z2, int i2) {
                bwqv bwqvVar2;
                bwrs<ilo> bwrsVar;
                final bger bgerVar = this.a;
                Handler handler = new Handler();
                if (bgerVar.a == null || (bwqvVar2 = bgerVar.b) == null || (bwrsVar = bgerVar.d) == null) {
                    return;
                }
                final bgex g = bgex.g(bwqvVar2, dipkVar, diovVar, z, z2, i2, bwrsVar, i);
                bgerVar.a.D(g);
                if (bgerVar.c == null) {
                    return;
                }
                handler.postDelayed(new Runnable(bgerVar, g) { // from class: bgeq
                    private final bger a;
                    private final bgex b;

                    {
                        this.a = bgerVar;
                        this.b = g;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bger bgerVar2 = this.a;
                        bgerVar2.c.b(bgerVar2.a.findViewById(16908290), this.b.i());
                    }
                }, 500L);
            }
        };
        this.c = cpvVar;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            return;
        }
        this.d = bwrsVar;
        this.v = c;
        super.h(c, -1, this.u, bgnk.PLACESHEET_OVERVIEW_TAB);
        super.j();
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        this.v = null;
        super.i();
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = this.v;
        boolean z = false;
        if (iloVar != null && (iloVar.h().d & 256) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

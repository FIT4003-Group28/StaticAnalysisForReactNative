package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: crka  reason: default package */
/* loaded from: classes5.dex */
public final class crka implements crgx {
    public boolean a;
    private final bvjj b;
    private final bnwn c;

    public crka(bvjj bvjjVar, bnwn bnwnVar) {
        this.b = bvjjVar;
        dbsk.t(bnwnVar, "eventTrackManager");
        this.c = bnwnVar;
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.crgx
    public final void a() {
    }

    @Override // defpackage.crgx
    public final void b() {
        e();
    }

    public final void e() {
        if (this.a) {
            this.c.e();
            this.a = false;
        }
    }

    public final void d(btrm btrmVar, amub amubVar, boolean z, double d) {
        this.a = false;
        String z2 = this.b.z(z ? bvjk.av : bvjk.au, "0");
        dbsk.t(z2, "autodrivingSimulation");
        if ("0".equals(z2)) {
            return;
        }
        float parseFloat = Float.parseFloat(z2);
        btrmVar.b(new bvpc());
        this.c.f(amubVar, parseFloat, d);
        this.a = true;
    }
}

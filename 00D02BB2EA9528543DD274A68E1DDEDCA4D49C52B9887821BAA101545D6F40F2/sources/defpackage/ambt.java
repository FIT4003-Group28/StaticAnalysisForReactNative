package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ambt  reason: default package */
/* loaded from: classes2.dex */
public final class ambt implements btzi<dmxh, dmxv> {
    final /* synthetic */ ambs a;
    final /* synthetic */ ambu b;

    public ambt(ambu ambuVar, ambs ambsVar) {
        this.b = ambuVar;
        this.a = ambsVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dmxh> btzrVar, btzy btzyVar) {
        if (btzyVar.equals(btzy.b) || btzyVar.equals(btzy.d) || btzyVar.equals(btzy.k)) {
            akry akryVar = ambu.b;
            dsrj<dmyd> dsrjVar = btzrVar.a.b;
        } else {
            akry akryVar2 = ambu.b;
        }
        this.b.c(this.a, btzyVar);
        alza.c(this.b.c, btzrVar, btzyVar.d());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dmxh> btzrVar, dmxv dmxvVar) {
        dmxv dmxvVar2 = dmxvVar;
        try {
            ambs ambsVar = this.a;
            boolean z = true;
            if (dmxvVar2.a.size() != 1) {
                z = false;
            }
            dbsk.e(z, "The received painted region list does not contain same number of painted regions as expected. Expected: 1 Received: (%s)", dmxvVar2.a.size());
            dtro dtroVar = dmxvVar2.a.get(0).g;
            if (dtroVar == null) {
                dtroVar = dtro.a;
            }
            dsqv<dtro, dmxz> dsqvVar = dmxz.c;
            dtroVar.f(dsqvVar);
            if (dtroVar.V.k(dsqvVar.d)) {
                dtro dtroVar2 = dmxvVar2.a.get(0).g;
                if (dtroVar2 == null) {
                    dtroVar2 = dtro.a;
                }
                dsqv<dtro, dmxz> dsqvVar2 = dmxz.c;
                dtroVar2.f(dsqvVar2);
                Object l = dtroVar2.V.l(dsqvVar2.d);
                dmxz dmxzVar = (dmxz) (l == null ? dsqvVar2.b : dsqvVar2.b(l));
                ambsVar.c = dchl.f(dmxzVar.a.size());
                ambsVar.c.addAll(dmxzVar.a);
            }
        } catch (IllegalArgumentException e) {
            akry akryVar = ambu.b;
            this.b.c(this.a, btzy.a(e));
        }
        this.b.b(this.a);
        alza.c(this.b.c, btzrVar, ckjk.SUCCESS);
    }
}

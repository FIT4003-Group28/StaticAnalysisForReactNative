package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aibs  reason: default package */
/* loaded from: classes2.dex */
final class aibs implements aiby {
    @dzsi
    public dehn<dkbs> a;
    final /* synthetic */ aibu b;

    public aibs(aibu aibuVar) {
        this.b = aibuVar;
    }

    @Override // defpackage.aiby
    public final void a(doek doekVar, @dzsi GmmLocation gmmLocation) {
        if (!this.b.f.b()) {
            return;
        }
        dkbn bZ = dkbo.f.bZ();
        String str = this.b.f.e;
        dbsk.s(str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkbo dkboVar = (dkbo) bZ.b;
        str.getClass();
        int i = dkboVar.a | 1;
        dkboVar.a = i;
        dkboVar.b = str;
        doekVar.getClass();
        dkboVar.c = doekVar;
        dkboVar.a = i | 2;
        dqyd d = this.b.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkbo dkboVar2 = (dkbo) bZ.b;
        d.getClass();
        dkboVar2.d = d;
        dkboVar2.a |= 4;
        long b = this.b.b.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkbo dkboVar3 = (dkbo) bZ.b;
        dkboVar3.a |= 8;
        dkboVar3.e = b;
        dkbo bK = bZ.bK();
        dehn<dkbs> dehnVar = this.a;
        if (dehnVar != null && !dehnVar.isCancelled()) {
            this.a.cancel(false);
        }
        aibu aibuVar = this.b;
        aibg aibgVar = aibuVar.d;
        final dehn<dkbs> a = aibg.a(aibgVar.a.h(), aibgVar.d, aibuVar.f.b, gmmLocation).a(bK);
        this.a = a;
        a.Pk(new Runnable(this, a) { // from class: aibr
            private final aibs a;
            private final dehn b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dkbs dkbsVar;
                int a2;
                aibs aibsVar = this.a;
                dehn<dkbs> dehnVar2 = this.b;
                if (dehnVar2 == aibsVar.a) {
                    aibsVar.a = null;
                }
                if (!dehnVar2.isCancelled() && (dkbsVar = (dkbs) deha.s(dehnVar2)) != null) {
                    int a3 = dkbr.a(dkbsVar.a);
                    if ((a3 != 0 && a3 == 2) || (a2 = dkbr.a(dkbsVar.a)) == 0 || a2 != 4 || aibsVar.b.f.a()) {
                        return;
                    }
                    aibsVar.b.f.c(ahvn.CANCELLED);
                }
            }
        }, this.b.c.h());
    }

    @Override // defpackage.aiby
    public final void b(boolean z) {
        if (this.b.f.a()) {
            return;
        }
        this.b.f.c(z ? ahvn.ARRIVED : ahvn.CANCELLED);
    }
}

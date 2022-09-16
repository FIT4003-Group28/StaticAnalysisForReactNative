package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akgf  reason: default package */
/* loaded from: classes.dex */
public final class akgf implements akev {
    final /* synthetic */ avjf a;
    final /* synthetic */ akgg b;

    public akgf(akgg akggVar, avjf avjfVar) {
        this.b = akggVar;
        this.a = avjfVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        apzg apzgVar = null;
        if (i == 1) {
            auhc auhcVar = this.a.c;
            if (auhcVar == null) {
                auhcVar = auhc.a;
            }
            if ((auhcVar.b & 4) != 0) {
                auhc auhcVar2 = this.a.c;
                if (auhcVar2 == null) {
                    auhcVar2 = auhc.a;
                }
                apzgVar = auhcVar2.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
        } else {
            auhc auhcVar3 = this.a.c;
            if (auhcVar3 == null) {
                auhcVar3 = auhc.a;
            }
            if ((auhcVar3.b & 8) != 0) {
                auhc auhcVar4 = this.a.c;
                if (auhcVar4 == null) {
                    auhcVar4 = auhc.a;
                }
                apzgVar = auhcVar4.f;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            avjf avjfVar = this.a;
            if ((avjfVar.b & 8192) != 0) {
                aafo aafoVar = this.b.b;
                apzg apzgVar2 = avjfVar.o;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.c(apzgVar2, actk.h(this.a, false));
            }
        }
        if (apzgVar == null || i == 2) {
            return;
        }
        this.b.b.c(apzgVar, actk.h(this.a, true));
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
        this.b.c.oi().u(new acte(this.a.n), null);
        avjf avjfVar = this.a;
        if ((avjfVar.b & 1) != 0) {
            aafo aafoVar = this.b.b;
            auhc auhcVar = avjfVar.c;
            if (auhcVar == null) {
                auhcVar = auhc.a;
            }
            aafx.d(aafoVar, auhcVar.d, actk.h(this.a, false));
        }
    }
}

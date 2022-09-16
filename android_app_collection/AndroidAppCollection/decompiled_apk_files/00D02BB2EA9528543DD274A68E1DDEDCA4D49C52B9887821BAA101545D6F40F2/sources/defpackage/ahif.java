package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahif  reason: default package */
/* loaded from: classes2.dex */
public final class ahif implements degu<afzy> {
    final /* synthetic */ dirb a;
    final /* synthetic */ ahin b;

    public ahif(ahin ahinVar, dirb dirbVar) {
        this.b = ahinVar;
        this.a = dirbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.T(false);
        ges gesVar = this.b.m.get();
        if (gesVar == null || !gesVar.aD) {
            return;
        }
        agyk agykVar = this.b.k;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar = (agyp) agykVar.b;
        agyp agypVar2 = agyp.r;
        agypVar.c = 2;
        agypVar.a = 2 | agypVar.a;
        agyk agykVar2 = this.b.k;
        if (agykVar2.c) {
            agykVar2.bF();
            agykVar2.c = false;
        }
        agyp agypVar3 = (agyp) agykVar2.b;
        agypVar3.a |= 512;
        agypVar3.l = true;
        this.b.F(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi afzy afzyVar) {
        afzy afzyVar2 = afzyVar;
        this.b.T(false);
        ges gesVar = this.b.m.get();
        if (gesVar == null || !gesVar.aD) {
            return;
        }
        if (afzyVar2 == null) {
            a(new NullPointerException());
            return;
        }
        int size = this.b.l.size();
        if (size == 0) {
            this.b.i.b();
            size = 0;
        }
        this.b.K(afzyVar2);
        if (this.b.l.size() == size) {
            agyk agykVar = this.b.k;
            if ((((agyp) agykVar.b).a & 128) != 0) {
                if (agykVar.c) {
                    agykVar.bF();
                    agykVar.c = false;
                }
                agyp agypVar = (agyp) agykVar.b;
                agypVar.a &= -129;
                agypVar.j = agyp.r.j;
            }
        }
        this.b.F(false);
        if (size != 0) {
            return;
        }
        if (this.a == afzyVar2.b().a) {
            this.b.i.c(cklt.UPDATES_SERVER_RESULTS_LIST);
        } else {
            this.b.i.c(cklt.UPDATES_CACHE_RESULTS_LIST);
        }
    }
}

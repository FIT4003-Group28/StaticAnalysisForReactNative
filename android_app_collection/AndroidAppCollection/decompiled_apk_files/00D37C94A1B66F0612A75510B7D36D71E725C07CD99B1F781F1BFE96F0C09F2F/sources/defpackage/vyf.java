package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vyf  reason: default package */
/* loaded from: classes4.dex */
public final class vyf implements afzf {
    final /* synthetic */ aavf a;
    final /* synthetic */ vyh b;
    final /* synthetic */ aopa c;

    public vyf(vyh vyhVar, aavf aavfVar, aopa aopaVar) {
        this.b = vyhVar;
        this.a = aavfVar;
        this.c = aopaVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        aavf aavfVar = this.a;
        if (aavfVar != null) {
            aavfVar.e(cffVar);
            return;
        }
        awle awleVar = (awle) this.c.instance;
        if (awleVar.b != 1) {
            return;
        }
        awlf awlfVar = (awlf) awleVar.c;
        if ((awlfVar.b & 16) == 0) {
            return;
        }
        aafo aafoVar = this.b.a;
        apzg apzgVar = awlfVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final aavf aavfVar = this.a;
        final aopa aopaVar = this.c;
        Runnable runnable = new Runnable() { // from class: vye
            @Override // java.lang.Runnable
            public final void run() {
                vyf vyfVar = vyf.this;
                aavf aavfVar2 = aavfVar;
                aopa aopaVar2 = aopaVar;
                if (aavfVar2 == null) {
                    awle awleVar = (awle) aopaVar2.instance;
                    if (awleVar.b != 1) {
                        return;
                    }
                    awlf awlfVar = (awlf) awleVar.c;
                    if ((awlfVar.b & 8) == 0) {
                        return;
                    }
                    aafo aafoVar = vyfVar.b.a;
                    apzg apzgVar = awlfVar.d;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                    return;
                }
                aavfVar2.d();
            }
        };
        this.b.a((arms) obj, 2, runnable, null);
    }
}

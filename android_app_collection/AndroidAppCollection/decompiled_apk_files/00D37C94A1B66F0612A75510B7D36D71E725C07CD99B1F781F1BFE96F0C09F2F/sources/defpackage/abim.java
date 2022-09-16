package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abim  reason: default package */
/* loaded from: classes.dex */
public final class abim implements afzf {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ajfy b;
    final /* synthetic */ aaqs c;
    final /* synthetic */ abin d;

    public abim(abin abinVar, Runnable runnable, ajfy ajfyVar, aaqs aaqsVar) {
        this.d = abinVar;
        this.a = runnable;
        this.b = ajfyVar;
        this.c = aaqsVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        abkq o = this.d.d.o();
        if (o != null) {
            String b = this.d.d.n.b(cffVar);
            final aaqs aaqsVar = this.c;
            final ajfy ajfyVar = this.b;
            final Runnable runnable = this.a;
            o.z(b, new Runnable() { // from class: abil
                @Override // java.lang.Runnable
                public final void run() {
                    abim abimVar = abim.this;
                    abimVar.d.m(aaqsVar, ajfyVar, runnable);
                }
            });
        }
        abis abisVar = this.d.d.w;
        if (abisVar != null) {
            abisVar.f();
        }
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ajga ajgaVar = (ajga) obj;
        abkq o = this.d.d.o();
        if (o != null) {
            o.y();
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        this.d.k((assn) ajgaVar.b());
    }
}

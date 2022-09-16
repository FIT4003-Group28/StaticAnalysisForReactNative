package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajwy  reason: default package */
/* loaded from: classes.dex */
public final class ajwy implements afzf {
    final /* synthetic */ ajfz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ apzg c;
    final /* synthetic */ ajxo d;
    final /* synthetic */ ajxh e;

    public ajwy(ajxh ajxhVar, ajfz ajfzVar, boolean z, apzg apzgVar, ajxo ajxoVar) {
        this.e = ajxhVar;
        this.a = ajfzVar;
        this.b = z;
        this.c = apzgVar;
        this.d = ajxoVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        ajfz ajfzVar = this.a;
        ajxh ajxhVar = this.e;
        if (ajfzVar != ajxhVar.z) {
            return;
        }
        ajxhVar.z = null;
        this.d.b(cffVar, this.a);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ajga ajgaVar = (ajga) obj;
        ajfz ajfzVar = this.a;
        ajxh ajxhVar = this.e;
        if (ajfzVar != ajxhVar.z) {
            return;
        }
        ajxhVar.z = null;
        if (this.b) {
            this.e.x.clear();
        }
        if (ajgaVar == null) {
            this.e.v.remove(this.a.a());
        } else {
            if (this.e.S() != null) {
                ajvw S = this.e.S();
                ajfz ajfzVar2 = this.a;
                apzg apzgVar = this.c;
                ajwb ajwbVar = S.a;
                int i = S.b;
                ajwbVar.w.t();
                if (ajfzVar2.a() == ajfy.RELOAD) {
                    ajwbVar.w.d(acuo.a(i), apzgVar, null);
                }
                ajxh ajxhVar2 = this.e;
                for (acum acumVar : ajxhVar2.y) {
                    ajxhVar2.w.n(acumVar);
                }
            }
            ajxh ajxhVar3 = this.e;
            if (ajgaVar.b() != null) {
                byte[] d = ajgaVar.d();
                ajxhVar3.x.add(d);
                if (d != null) {
                    ajxhVar3.w.D(new acte(d));
                }
            }
        }
        ajxc ajxcVar = this.e.E;
        if (ajxcVar != null) {
            ajxcVar.a(ajgaVar);
        }
        this.d.a(ajgaVar.b(), this.a.a());
    }
}

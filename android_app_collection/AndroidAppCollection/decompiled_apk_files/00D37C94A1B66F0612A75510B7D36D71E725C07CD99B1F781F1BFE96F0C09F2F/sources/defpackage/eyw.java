package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eyw  reason: default package */
/* loaded from: classes3.dex */
public final class eyw implements afzf {
    final /* synthetic */ aapd a;
    final /* synthetic */ eyz b;

    public eyw(eyz eyzVar, aapd aapdVar) {
        this.b = eyzVar;
        this.a = aapdVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.f(cffVar);
        if (this.b.m(this.a)) {
            eyz eyzVar = this.b;
            eyzVar.d = cffVar;
            if (eyzVar.e == null) {
                return;
            }
            eyzVar.k(cffVar);
            this.b.j();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        this.b.g(obj);
        if (this.b.m(this.a)) {
            eyz eyzVar = this.b;
            eyzVar.b = obj;
            eyzVar.d = null;
            eyzVar.c = eyzVar.a.d();
            eyz eyzVar2 = this.b;
            if (eyzVar2.e == null) {
                return;
            }
            afzf b = eyzVar2.b();
            if (b != null) {
                b.lG(obj);
            }
            this.b.j();
        }
    }
}

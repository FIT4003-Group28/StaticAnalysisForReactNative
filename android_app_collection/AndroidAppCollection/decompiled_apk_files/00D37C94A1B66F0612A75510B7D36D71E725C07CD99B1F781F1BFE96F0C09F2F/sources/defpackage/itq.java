package defpackage;
/* compiled from: PG */
/* renamed from: itq  reason: default package */
/* loaded from: classes3.dex */
public final class itq implements afzf {
    final /* synthetic */ azkm a;
    private final /* synthetic */ int b;

    public itq(azkm azkmVar) {
        this.a = azkmVar;
    }

    public itq(azkm azkmVar, int i) {
        this.b = i;
        this.a = azkmVar;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (this.b == 0) {
            this.a.a(cffVar);
        } else if (this.a.e()) {
        } else {
            this.a.a(cffVar);
        }
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        if (this.b == 0) {
            this.a.c((aaws) obj);
            return;
        }
        artv artvVar = (artv) obj;
        if (this.a.e()) {
            return;
        }
        this.a.c(artvVar);
    }
}

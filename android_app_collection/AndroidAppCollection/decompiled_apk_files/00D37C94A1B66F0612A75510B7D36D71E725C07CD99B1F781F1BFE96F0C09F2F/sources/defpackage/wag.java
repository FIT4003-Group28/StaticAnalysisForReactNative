package defpackage;
/* compiled from: PG */
/* renamed from: wag  reason: default package */
/* loaded from: classes4.dex */
public final class wag implements afzf {
    final /* synthetic */ String a;
    final /* synthetic */ yiw b;

    public wag(String str, yiw yiwVar) {
        this.a = str;
        this.b = yiwVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        for (aarw aarwVar : ((aase) obj).c()) {
            if (aarwVar.l() && aarwVar.i().equals(this.a)) {
                this.b.b(this.a, aarwVar);
                return;
            }
        }
    }
}

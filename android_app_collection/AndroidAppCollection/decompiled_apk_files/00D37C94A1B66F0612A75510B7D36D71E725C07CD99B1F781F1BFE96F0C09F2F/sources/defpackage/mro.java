package defpackage;
/* compiled from: PG */
/* renamed from: mro  reason: default package */
/* loaded from: classes3.dex */
final class mro implements afzf {
    final /* synthetic */ mrq a;

    public mro(mrq mrqVar) {
        this.a = mrqVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error requesting TopicPickerRenderer continuation.", cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ajga ajgaVar = (ajga) obj;
        if (ajgaVar != null) {
            mrq mrqVar = this.a;
            if (ajgaVar.b() != null) {
                mrqVar.c.D(new acte(ajgaVar.d()));
            }
            mrq mrqVar2 = this.a;
            avjp avjpVar = (avjp) ajgaVar.b();
            if (avjpVar == null) {
                return;
            }
            mrqVar2.a.d(avjpVar.h);
        }
    }
}

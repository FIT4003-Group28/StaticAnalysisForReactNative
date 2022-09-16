package defpackage;
/* compiled from: PG */
/* renamed from: oix  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oix implements zdt {
    public final /* synthetic */ oiy a;
    private final /* synthetic */ int b;

    public /* synthetic */ oix(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            oiy oiyVar = this.a;
            zep.d("Picture-in-picture mode request failed. Finishing the app.", (Throwable) obj);
            oiyVar.d();
            return;
        }
        oiy oiyVar2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        oiyVar2.d();
    }
}

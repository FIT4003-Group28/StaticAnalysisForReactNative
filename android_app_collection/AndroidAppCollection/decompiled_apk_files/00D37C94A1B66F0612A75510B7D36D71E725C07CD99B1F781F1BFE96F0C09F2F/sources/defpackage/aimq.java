package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
/* compiled from: PG */
/* renamed from: aimq  reason: default package */
/* loaded from: classes.dex */
final class aimq implements afzf {
    final /* synthetic */ aimr a;
    private final afzf b;
    private final acvg c;

    public aimq(aimr aimrVar, afzf afzfVar, acvg acvgVar) {
        this.a = aimrVar;
        this.b = afzfVar;
        this.c = acvgVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.kV(cffVar);
    }

    @Override // defpackage.afzf
    public final void kW() {
        this.b.kW();
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
        aimr aimrVar = this.a;
        afzf afzfVar = this.b;
        acvg acvgVar = this.c;
        aimrVar.a.d(new ahhd());
        if (acvgVar != null) {
            acvgVar.c("wn_r");
        }
        afzfVar.lG(watchNextResponseModel);
    }
}

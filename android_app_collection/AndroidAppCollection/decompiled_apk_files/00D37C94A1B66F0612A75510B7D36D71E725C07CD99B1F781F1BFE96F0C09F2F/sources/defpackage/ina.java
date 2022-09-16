package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: ina  reason: default package */
/* loaded from: classes3.dex */
final class ina implements afzf {
    final /* synthetic */ afzf a;
    final /* synthetic */ inb b;

    public ina(inb inbVar, afzf afzfVar) {
        this.b = inbVar;
        this.a = afzfVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.kV(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final void lG(Object obj) {
        if (obj instanceof BrowseResponseModel) {
            this.b.a.b(((BrowseResponseModel) obj).a);
        }
        this.a.lG(obj);
    }
}

package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
/* compiled from: PG */
/* renamed from: iud  reason: default package */
/* loaded from: classes3.dex */
final class iud implements afzf {
    final /* synthetic */ afzf a;
    final /* synthetic */ iue b;

    public iud(iue iueVar, afzf afzfVar) {
        this.b = iueVar;
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
        if (obj instanceof WatchNextResponseModel) {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
            asgt asgtVar = watchNextResponseModel.a;
            this.b.a.a(asgtVar);
            if (asgtVar.u.size() != 0) {
                this.b.b.b(asgtVar.u);
            }
            if (this.b.c.h()) {
                ((nml) this.b.c.c()).l(watchNextResponseModel);
            }
        }
        this.a.lG(obj);
    }
}

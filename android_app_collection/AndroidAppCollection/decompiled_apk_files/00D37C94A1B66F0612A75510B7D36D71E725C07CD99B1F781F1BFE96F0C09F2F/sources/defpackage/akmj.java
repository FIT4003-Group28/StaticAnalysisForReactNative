package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: akmj  reason: default package */
/* loaded from: classes.dex */
final class akmj implements afzf {
    final /* synthetic */ Map a;
    final /* synthetic */ akml b;

    public akmj(akml akmlVar, Map map) {
        this.b = akmlVar;
        this.a = map;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.a.e(cffVar);
        akmk akmkVar = (akmk) zew.K(this.a, "com.google.android.libraries.youtube.innertube.endpoint.tag", akmk.class);
        if (akmkVar != null) {
            akmkVar.h();
        }
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        this.b.b(this.a, (arnc) obj);
    }
}

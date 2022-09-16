package defpackage;

import com.google.protos.youtube.api.innertube.GeoSearchDetailsRendererOuterClass;
/* compiled from: PG */
/* renamed from: kyr  reason: default package */
/* loaded from: classes3.dex */
public final class kyr extends ajwd {
    private final ajsm a;

    public kyr(aupp auppVar) {
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        aunb aunbVar = auppVar.b;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer)) {
            aunb aunbVar2 = auppVar.b;
            ajsmVar.add((aunbVar2 == null ? aunb.a : aunbVar2).qm(GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer));
        }
    }

    @Override // defpackage.ajyj
    public final ajqm lA() {
        return this.a;
    }
}

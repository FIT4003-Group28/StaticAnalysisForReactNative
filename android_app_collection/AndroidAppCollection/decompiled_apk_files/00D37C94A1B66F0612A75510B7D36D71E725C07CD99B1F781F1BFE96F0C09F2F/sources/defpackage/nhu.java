package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* compiled from: PG */
/* renamed from: nhu  reason: default package */
/* loaded from: classes3.dex */
public final class nhu extends ngo {
    public nhu(aafo aafoVar, luy luyVar, lva lvaVar, acti actiVar, BrowseResponseModel browseResponseModel, auwm auwmVar) {
        super(aafoVar, luyVar, lvaVar, actiVar, browseResponseModel, auwmVar);
    }

    @Override // defpackage.ngj
    public final CharSequence c() {
        arag aragVar;
        auwm auwmVar = (auwm) this.a;
        if ((auwmVar.b & 1) != 0) {
            aragVar = auwmVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.ngo
    public final avtn f() {
        auwn auwnVar = ((auwm) this.a).d;
        if (auwnVar == null) {
            auwnVar = auwn.a;
        }
        if (auwnVar.b == 63096351) {
            auwn auwnVar2 = ((auwm) this.a).d;
            if (auwnVar2 == null) {
                auwnVar2 = auwn.a;
            }
            if (auwnVar2.b == 63096351) {
                return (avtn) auwnVar2.c;
            }
            return avtn.a;
        }
        return null;
    }
}

package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: mrt  reason: default package */
/* loaded from: classes3.dex */
public final class mrt implements akbi {
    final /* synthetic */ mrx a;
    private final /* synthetic */ int b;

    public mrt(mrx mrxVar) {
        this.a = mrxVar;
    }

    public /* synthetic */ mrt(mrx mrxVar, int i) {
        this.b = i;
        this.a = mrxVar;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.b == 0) {
            mrx mrxVar = this.a;
            apzg apzgVar = ((apoj) aopcVar.instance).o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar != null && apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                aopa mo52toBuilder = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).mo52toBuilder();
                amuf f = amuk.f();
                f.j(mrxVar.h);
                apny apnyVar = ((apnv) mo52toBuilder.instance).h;
                if (apnyVar == null) {
                    apnyVar = apny.a;
                }
                if (apnyVar.d.size() != 0) {
                    apny apnyVar2 = ((apnv) mo52toBuilder.instance).h;
                    if (apnyVar2 == null) {
                        apnyVar2 = apny.a;
                    }
                    f.j(apnyVar2.d);
                }
                aopa createBuilder = apny.a.createBuilder();
                amuk g = f.g();
                createBuilder.copyOnWrite();
                apny apnyVar3 = (apny) createBuilder.instance;
                aopu aopuVar = apnyVar3.d;
                if (!aopuVar.c()) {
                    apnyVar3.d = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) g, (List) apnyVar3.d);
                mo52toBuilder.copyOnWrite();
                apnv apnvVar = (apnv) mo52toBuilder.instance;
                apny apnyVar4 = (apny) createBuilder.mo39build();
                apnyVar4.getClass();
                apnvVar.h = apnyVar4;
                apnvVar.b |= 64;
                aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
                aopcVar2.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) mo52toBuilder.mo39build());
                apzgVar = (apzg) aopcVar2.mo39build();
            }
            aopcVar.copyOnWrite();
            apoj apojVar = (apoj) aopcVar.instance;
            apzgVar.getClass();
            apojVar.o = apzgVar;
            apojVar.b |= 16384;
            this.a.a();
            return;
        }
        this.a.a();
    }
}

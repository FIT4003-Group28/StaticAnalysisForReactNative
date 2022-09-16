package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jmv  reason: default package */
/* loaded from: classes3.dex */
public final class jmv extends jlp {
    private final Context a;

    public jmv(Context context) {
        super(aqel.class);
        this.a = context;
    }

    private final arag f(int i) {
        return ajgl.h(this.a.getString(i));
    }

    @Override // defpackage.jlp
    public final /* bridge */ /* synthetic */ Object a(amup amupVar) {
        aopc aopcVar = (aopc) aqel.a.createBuilder();
        arag f = f(R.string.habanero_entry_point_title);
        aopcVar.copyOnWrite();
        aqel aqelVar = (aqel) aopcVar.instance;
        f.getClass();
        aqelVar.e = f;
        aqelVar.b |= 4;
        arag f2 = f(R.string.habanero_entry_point_subtitle);
        aopcVar.copyOnWrite();
        aqel aqelVar2 = (aqel) aopcVar.instance;
        f2.getClass();
        aqelVar2.f = f2;
        aqelVar2.b |= 8;
        aopc aopcVar2 = (aopc) arhs.a.createBuilder();
        arhr arhrVar = arhr.OFFLINE_COMMUTE;
        aopcVar2.copyOnWrite();
        arhs arhsVar = (arhs) aopcVar2.instance;
        arhsVar.c = arhrVar.pS;
        arhsVar.b |= 1;
        aopcVar.copyOnWrite();
        aqel aqelVar3 = (aqel) aopcVar.instance;
        arhs arhsVar2 = (arhs) aopcVar2.mo39build();
        arhsVar2.getClass();
        aqelVar3.d = arhsVar2;
        aqelVar3.c = 13;
        aopa createBuilder = apok.a.createBuilder();
        aopc aopcVar3 = (aopc) apoj.a.createBuilder();
        arag f3 = f(R.string.habanero_entry_point_cta_button);
        aopcVar3.copyOnWrite();
        apoj apojVar = (apoj) aopcVar3.instance;
        f3.getClass();
        apojVar.i = f3;
        apojVar.b |= 256;
        aopcVar3.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar3.instance;
        apojVar2.d = 13;
        apojVar2.c = 1;
        aopc aopcVar4 = (aopc) apzg.a.createBuilder();
        aopg aopgVar = BrowseEndpointOuterClass.browseEndpoint;
        aopa createBuilder2 = apnv.a.createBuilder();
        createBuilder2.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder2.instance;
        apnvVar.b |= 1;
        apnvVar.c = "FEcommute_onboarding_recs";
        aopcVar4.e(aopgVar, (apnv) createBuilder2.mo39build());
        aopcVar3.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar3.instance;
        apzg apzgVar = (apzg) aopcVar4.mo39build();
        apzgVar.getClass();
        apojVar3.p = apzgVar;
        apojVar3.b |= 32768;
        createBuilder.copyOnWrite();
        apok apokVar = (apok) createBuilder.instance;
        apoj apojVar4 = (apoj) aopcVar3.mo39build();
        apojVar4.getClass();
        apokVar.c = apojVar4;
        apokVar.b |= 1;
        aopcVar.copyOnWrite();
        aqel aqelVar4 = (aqel) aopcVar.instance;
        apok apokVar2 = (apok) createBuilder.mo39build();
        apokVar2.getClass();
        aqelVar4.i = apokVar2;
        aqelVar4.b |= 64;
        aopcVar.copyOnWrite();
        aqel aqelVar5 = (aqel) aopcVar.instance;
        aqelVar5.b |= 1024;
        aqelVar5.m = true;
        return (aqel) aopcVar.mo39build();
    }
}

package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jmh  reason: default package */
/* loaded from: classes3.dex */
public final class jmh extends jlq {
    private final Context a;

    public jmh(Context context) {
        super(agqh.class, aqdv.class);
        this.a = context;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        agqh agqhVar = (agqh) obj;
        agqf agqfVar = agqhVar.a;
        aopa createBuilder = aqdv.a.createBuilder();
        arag g = ajgl.g(agqfVar.b);
        createBuilder.copyOnWrite();
        aqdv aqdvVar = (aqdv) createBuilder.instance;
        g.getClass();
        aqdvVar.g = g;
        aqdvVar.b |= 1;
        arag g2 = ajgl.g(nni.o(this.a, agqhVar.a));
        createBuilder.copyOnWrite();
        aqdv aqdvVar2 = (aqdv) createBuilder.instance;
        g2.getClass();
        aqdvVar2.h = g2;
        aqdvVar2.b |= 2;
        aopa createBuilder2 = aqdx.a.createBuilder();
        aopa createBuilder3 = auem.a.createBuilder();
        avhn e = agqfVar.e.e();
        createBuilder3.copyOnWrite();
        auem auemVar = (auem) createBuilder3.instance;
        e.getClass();
        auemVar.c = e;
        auemVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqdx aqdxVar = (aqdx) createBuilder2.instance;
        auem auemVar2 = (auem) createBuilder3.mo39build();
        auemVar2.getClass();
        aqdxVar.d = auemVar2;
        aqdxVar.b |= 2;
        createBuilder.copyOnWrite();
        aqdv aqdvVar3 = (aqdv) createBuilder.instance;
        aqdx aqdxVar2 = (aqdx) createBuilder2.mo39build();
        aqdxVar2.getClass();
        aqdvVar3.i = aqdxVar2;
        aqdvVar3.b |= 32;
        aopa createBuilder4 = aqds.a.createBuilder();
        aopa createBuilder5 = aucf.a.createBuilder();
        String str = agqfVar.a;
        createBuilder5.copyOnWrite();
        aucf aucfVar = (aucf) createBuilder5.instance;
        aucfVar.b |= 1;
        aucfVar.c = str;
        createBuilder4.copyOnWrite();
        aqds aqdsVar = (aqds) createBuilder4.instance;
        aucf aucfVar2 = (aucf) createBuilder5.mo39build();
        aucfVar2.getClass();
        aqdsVar.c = aucfVar2;
        aqdsVar.b = 135739232;
        aqds aqdsVar2 = (aqds) createBuilder4.mo39build();
        createBuilder.copyOnWrite();
        aqdv aqdvVar4 = (aqdv) createBuilder.instance;
        aqdsVar2.getClass();
        aqdvVar4.k = aqdsVar2;
        aqdvVar4.b |= 32768;
        aopa createBuilder6 = aqdt.a.createBuilder();
        aopa createBuilder7 = aqdy.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(agqhVar.e);
        createBuilder7.copyOnWrite();
        aqdy aqdyVar = (aqdy) createBuilder7.instance;
        aqdyVar.b |= 1;
        aqdyVar.c = seconds;
        createBuilder6.copyOnWrite();
        aqdt aqdtVar = (aqdt) createBuilder6.instance;
        aqdy aqdyVar2 = (aqdy) createBuilder7.mo39build();
        aqdyVar2.getClass();
        aqdtVar.c = aqdyVar2;
        aqdtVar.b = 135744618;
        createBuilder.copyOnWrite();
        aqdv aqdvVar5 = (aqdv) createBuilder.instance;
        aqdt aqdtVar2 = (aqdt) createBuilder6.mo39build();
        aqdtVar2.getClass();
        aqdvVar5.l = aqdtVar2;
        aqdvVar5.b |= 65536;
        String str2 = agqfVar.a;
        aopa createBuilder8 = apnv.a.createBuilder();
        String concat = str2.length() != 0 ? "VL".concat(str2) : new String("VL");
        createBuilder8.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder8.instance;
        concat.getClass();
        apnvVar.b = 1 | apnvVar.b;
        apnvVar.c = concat;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder8.mo39build());
        apzg apzgVar = (apzg) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        aqdv aqdvVar6 = (aqdv) createBuilder.instance;
        apzgVar.getClass();
        aqdvVar6.d = apzgVar;
        aqdvVar6.c = 4;
        return (aqdv) createBuilder.mo39build();
    }
}

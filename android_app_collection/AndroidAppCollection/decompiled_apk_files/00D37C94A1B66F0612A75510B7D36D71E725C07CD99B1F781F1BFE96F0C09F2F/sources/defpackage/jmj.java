package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import j$.util.Collection;
/* compiled from: PG */
/* renamed from: jmj  reason: default package */
/* loaded from: classes3.dex */
public final class jmj extends jlq {
    private final Context a;
    private final aadd b;
    private final azqb c;
    private final axxi d;

    public jmj(Context context, aadd aaddVar, azqb azqbVar, axxi axxiVar) {
        super(agqh.class, aucu.class);
        this.a = context;
        this.b = aaddVar;
        this.c = azqbVar;
        this.d = axxiVar;
    }

    private static apzg a(String str) {
        aopa createBuilder = apnv.a.createBuilder();
        createBuilder.copyOnWrite();
        apnv apnvVar = (apnv) createBuilder.instance;
        str.getClass();
        apnvVar.b |= 1;
        apnvVar.c = str;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    private static apzg f(String str) {
        aopa createBuilder = attf.a.createBuilder();
        createBuilder.copyOnWrite();
        attf attfVar = (attf) createBuilder.instance;
        attfVar.b |= 2;
        attfVar.d = str;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(attg.a, (attf) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        String quantityString;
        agqf agqfVar = ((agqh) obj).a;
        aopa createBuilder = aucu.a.createBuilder();
        String str = agqfVar.a;
        createBuilder.copyOnWrite();
        aucu aucuVar = (aucu) createBuilder.instance;
        aucuVar.b |= 1;
        aucuVar.h = str;
        arag g = ajgl.g(agqfVar.b);
        createBuilder.copyOnWrite();
        aucu aucuVar2 = (aucu) createBuilder.instance;
        g.getClass();
        aucuVar2.n = g;
        aucuVar2.b |= 2048;
        avhn e = agqfVar.e.e();
        createBuilder.copyOnWrite();
        aucu aucuVar3 = (aucu) createBuilder.instance;
        e.getClass();
        aucuVar3.r = e;
        aucuVar3.b |= 65536;
        if (!eog.M(this.b) || agqfVar.g == 0) {
            Resources resources = this.a.getResources();
            int i = agqfVar.f;
            quantityString = resources.getQuantityString(R.plurals.video_count, i, Integer.valueOf(i));
        } else {
            quantityString = nni.m(this.a.getResources(), agqfVar.g, (int) Collection.EL.stream(((agrf) this.c.get()).a().i().l(agqfVar.a)).filter(gka.m).count());
        }
        arag g2 = ajgl.g(quantityString);
        createBuilder.copyOnWrite();
        aucu aucuVar4 = (aucu) createBuilder.instance;
        g2.getClass();
        aucuVar4.s = g2;
        aucuVar4.b |= 262144;
        if (this.d.b().booleanValue()) {
            aopc aopcVar = (aopc) apoj.a.createBuilder();
            aopc aopcVar2 = (aopc) arhs.a.createBuilder();
            arhr arhrVar = arhr.PLAY_ARROW;
            aopcVar2.copyOnWrite();
            arhs arhsVar = (arhs) aopcVar2.instance;
            arhsVar.c = arhrVar.pS;
            arhsVar.b |= 1;
            aopcVar.copyOnWrite();
            apoj apojVar = (apoj) aopcVar.instance;
            arhs arhsVar2 = (arhs) aopcVar2.mo39build();
            arhsVar2.getClass();
            apojVar.g = arhsVar2;
            apojVar.b |= 32;
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apojVar2.d = 35;
            apojVar2.c = 1;
            arag g3 = ajgl.g("PLAY");
            aopcVar.copyOnWrite();
            apoj apojVar3 = (apoj) aopcVar.instance;
            g3.getClass();
            apojVar3.i = g3;
            apojVar3.b |= 256;
            apzg f = f(agqfVar.a);
            aopcVar.copyOnWrite();
            apoj apojVar4 = (apoj) aopcVar.instance;
            f.getClass();
            apojVar4.o = f;
            apojVar4.b |= 16384;
            aopc aopcVar3 = (aopc) aunb.a.createBuilder();
            aopcVar3.e(ButtonRendererOuterClass.buttonRenderer, (apoj) aopcVar.mo39build());
            aunb aunbVar = (aunb) aopcVar3.mo39build();
            createBuilder.copyOnWrite();
            aucu aucuVar5 = (aucu) createBuilder.instance;
            aunbVar.getClass();
            aucuVar5.e = aunbVar;
            aucuVar5.d = 63;
        } else {
            aopa createBuilder2 = aucq.a.createBuilder();
            aopa createBuilder3 = arfu.a.createBuilder();
            aopc aopcVar4 = (aopc) arhs.a.createBuilder();
            arhr arhrVar2 = arhr.PLAY_ARROW;
            aopcVar4.copyOnWrite();
            arhs arhsVar3 = (arhs) aopcVar4.instance;
            arhsVar3.c = arhrVar2.pS;
            arhsVar3.b |= 1;
            createBuilder3.copyOnWrite();
            arfu arfuVar = (arfu) createBuilder3.instance;
            arhs arhsVar4 = (arhs) aopcVar4.mo39build();
            arhsVar4.getClass();
            arfuVar.e = arhsVar4;
            arfuVar.b |= 1;
            apzg f2 = f(agqfVar.a);
            createBuilder3.copyOnWrite();
            arfu arfuVar2 = (arfu) createBuilder3.instance;
            f2.getClass();
            arfuVar2.d = f2;
            arfuVar2.c = 3;
            createBuilder2.copyOnWrite();
            aucq aucqVar = (aucq) createBuilder2.instance;
            arfu arfuVar3 = (arfu) createBuilder3.mo39build();
            arfuVar3.getClass();
            aucqVar.c = arfuVar3;
            aucqVar.b |= 1;
            createBuilder.copyOnWrite();
            aucu aucuVar6 = (aucu) createBuilder.instance;
            aucq aucqVar2 = (aucq) createBuilder2.mo39build();
            aucqVar2.getClass();
            aucuVar6.K = aucqVar2;
            aucuVar6.c |= 524288;
        }
        agqa agqaVar = agqfVar.c;
        if (agqaVar != null) {
            aopc aopcVar5 = (aopc) arag.a.createBuilder();
            aopc aopcVar6 = (aopc) arai.a.createBuilder();
            String str2 = agqaVar.b;
            aopcVar6.copyOnWrite();
            arai araiVar = (arai) aopcVar6.instance;
            str2.getClass();
            araiVar.b = 1 | araiVar.b;
            araiVar.c = str2;
            apzg a = a(elk.b(agqaVar.a));
            aopcVar6.copyOnWrite();
            arai araiVar2 = (arai) aopcVar6.instance;
            a.getClass();
            araiVar2.m = a;
            araiVar2.b |= 512;
            aopcVar5.cs(aopcVar6);
            createBuilder.copyOnWrite();
            aucu aucuVar7 = (aucu) createBuilder.instance;
            arag aragVar = (arag) aopcVar5.mo39build();
            aragVar.getClass();
            aucuVar7.u = aragVar;
            aucuVar7.b |= 1048576;
            apzg a2 = a(elk.b(agqaVar.a));
            createBuilder.copyOnWrite();
            aucu aucuVar8 = (aucu) createBuilder.instance;
            a2.getClass();
            aucuVar8.v = a2;
            aucuVar8.b |= 2097152;
        }
        return (aucu) createBuilder.mo39build();
    }
}

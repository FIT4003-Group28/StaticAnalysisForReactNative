package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jmt  reason: default package */
/* loaded from: classes3.dex */
public final class jmt extends jlq {
    private final azqb a;
    private final azqb b;

    public jmt(azqb azqbVar, azqb azqbVar2) {
        super(agqo.class, auex.class);
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        agqo agqoVar = (agqo) obj;
        Integer num = (Integer) e(amupVar, "downloaded_video_list_index");
        String str = (String) e(amupVar, "downloaded_video_playlist_id");
        String f = agqoVar.f();
        jml jmlVar = (jml) this.a.get();
        agqv e = ((agrf) this.b.get()).a().m().e(f);
        if (e != null) {
            return (auex) jmlVar.g(agqv.class, auex.class, e, amup.l("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(num.intValue())));
        }
        avhn d = agqoVar.d();
        aopc aopcVar = (aopc) auex.a.createBuilder();
        aopcVar.copyOnWrite();
        auex auexVar = (auex) aopcVar.instance;
        f.getClass();
        auexVar.b |= 1;
        auexVar.c = f;
        if (d == null) {
            d = avhn.a;
        }
        aopcVar.copyOnWrite();
        auex auexVar2 = (auex) aopcVar.instance;
        d.getClass();
        auexVar2.d = d;
        auexVar2.b |= 2;
        arag g = ajgl.g(agqoVar.j());
        aopcVar.copyOnWrite();
        auex auexVar3 = (auex) aopcVar.instance;
        g.getClass();
        auexVar3.e = g;
        auexVar3.b |= 4;
        arag f2 = ajgl.f(num.intValue() + 1);
        aopcVar.copyOnWrite();
        auex auexVar4 = (auex) aopcVar.instance;
        f2.getClass();
        auexVar4.f = f2;
        auexVar4.b |= 8;
        arag g2 = ajgl.g(agqoVar.g());
        aopcVar.copyOnWrite();
        auex auexVar5 = (auex) aopcVar.instance;
        g2.getClass();
        auexVar5.h = g2;
        auexVar5.b |= 32;
        aopa createBuilder = auev.a.createBuilder();
        aopa createBuilder2 = avxe.a.createBuilder();
        createBuilder2.copyOnWrite();
        avxe avxeVar = (avxe) createBuilder2.instance;
        f.getClass();
        avxeVar.b |= 1;
        avxeVar.c = f;
        createBuilder.copyOnWrite();
        auev auevVar = (auev) createBuilder.instance;
        avxe avxeVar2 = (avxe) createBuilder2.mo39build();
        avxeVar2.getClass();
        auevVar.c = avxeVar2;
        auevVar.b = 135739233;
        aopcVar.copyOnWrite();
        auex auexVar6 = (auex) aopcVar.instance;
        auev auevVar2 = (auev) createBuilder.mo39build();
        auevVar2.getClass();
        auexVar6.x = auevVar2;
        auexVar6.b |= 67108864;
        apzg f3 = aikb.f(f, str, num.intValue(), 0.0f);
        aopcVar.copyOnWrite();
        auex auexVar7 = (auex) aopcVar.instance;
        f3.getClass();
        auexVar7.i = f3;
        auexVar7.b |= 64;
        aopa createBuilder3 = ates.a.createBuilder();
        aopa createBuilder4 = atep.a.createBuilder();
        aopa createBuilder5 = aten.a.createBuilder();
        ater d2 = jmlVar.d(agqoVar, str);
        d2.getClass();
        createBuilder5.copyOnWrite();
        aten atenVar = (aten) createBuilder5.instance;
        atenVar.d = d2;
        atenVar.b |= 2;
        createBuilder4.aC(createBuilder5);
        createBuilder3.copyOnWrite();
        ates atesVar = (ates) createBuilder3.instance;
        atep atepVar = (atep) createBuilder4.mo39build();
        atepVar.getClass();
        atesVar.c = atepVar;
        atesVar.b |= 1;
        aopcVar.copyOnWrite();
        auex auexVar8 = (auex) aopcVar.instance;
        ates atesVar2 = (ates) createBuilder3.mo39build();
        atesVar2.getClass();
        auexVar8.p = atesVar2;
        auexVar8.b |= 65536;
        aopa createBuilder6 = avhc.a.createBuilder();
        avgz avgzVar = avgz.a;
        createBuilder6.copyOnWrite();
        avhc avhcVar = (avhc) createBuilder6.instance;
        avgzVar.getClass();
        avhcVar.l = avgzVar;
        avhcVar.b |= 32768;
        aopcVar.cv(createBuilder6);
        agqa agqaVar = agqoVar.a;
        if (agqaVar != null) {
            aopc aopcVar2 = (aopc) arag.a.createBuilder();
            aopc aopcVar3 = (aopc) arai.a.createBuilder();
            String str2 = agqaVar.b;
            aopcVar3.copyOnWrite();
            arai araiVar = (arai) aopcVar3.instance;
            str2.getClass();
            araiVar.b |= 1;
            araiVar.c = str2;
            aopc aopcVar4 = (aopc) apzg.a.createBuilder();
            aopg aopgVar = BrowseEndpointOuterClass.browseEndpoint;
            aopa createBuilder7 = apnv.a.createBuilder();
            String b = elk.b(agqaVar.a);
            createBuilder7.copyOnWrite();
            apnv apnvVar = (apnv) createBuilder7.instance;
            b.getClass();
            apnvVar.b |= 1;
            apnvVar.c = b;
            aopcVar4.e(aopgVar, (apnv) createBuilder7.mo39build());
            aopcVar3.copyOnWrite();
            arai araiVar2 = (arai) aopcVar3.instance;
            apzg apzgVar = (apzg) aopcVar4.mo39build();
            apzgVar.getClass();
            araiVar2.m = apzgVar;
            araiVar2.b |= 512;
            aopcVar2.cs(aopcVar3);
            aopcVar.copyOnWrite();
            auex auexVar9 = (auex) aopcVar.instance;
            arag aragVar = (arag) aopcVar2.mo39build();
            aragVar.getClass();
            auexVar9.g = aragVar;
            auexVar9.b |= 16;
        }
        return (auex) aopcVar.mo39build();
    }
}

package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: jmr  reason: default package */
/* loaded from: classes3.dex */
public final class jmr extends jlq {
    private final Context a;
    private final azqb b;

    public jmr(Context context, azqb azqbVar) {
        super(agqv.class, auex.class);
        this.a = context;
        this.b = azqbVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        attp attpVar;
        agqv agqvVar = (agqv) obj;
        Integer num = (Integer) e(amupVar, "downloaded_video_list_index");
        String str = (String) e(amupVar, "downloaded_video_playlist_id");
        String m = agqvVar.m();
        long f = agqvVar.f();
        long j = agqvVar.h;
        float f2 = nni.f(f, j);
        avhn k = agqvVar.k();
        aopc aopcVar = (aopc) auex.a.createBuilder();
        aopcVar.copyOnWrite();
        auex auexVar = (auex) aopcVar.instance;
        m.getClass();
        auexVar.b |= 1;
        auexVar.c = m;
        if (k == null) {
            k = avhn.a;
        }
        aopcVar.copyOnWrite();
        auex auexVar2 = (auex) aopcVar.instance;
        k.getClass();
        auexVar2.d = k;
        auexVar2.b |= 2;
        arag g = ajgl.g(agqvVar.o(this.a));
        aopcVar.copyOnWrite();
        auex auexVar3 = (auex) aopcVar.instance;
        g.getClass();
        auexVar3.e = g;
        auexVar3.b |= 4;
        arag f3 = ajgl.f(num.intValue() + 1);
        aopcVar.copyOnWrite();
        auex auexVar4 = (auex) aopcVar.instance;
        f3.getClass();
        auexVar4.f = f3;
        auexVar4.b |= 8;
        arag g2 = ajgl.g(agqvVar.n());
        aopcVar.copyOnWrite();
        auex auexVar5 = (auex) aopcVar.instance;
        g2.getClass();
        auexVar5.h = g2;
        auexVar5.b |= 32;
        aopa createBuilder = ates.a.createBuilder();
        aopa createBuilder2 = atep.a.createBuilder();
        aopa createBuilder3 = aten.a.createBuilder();
        ater e = ((jml) this.b.get()).e(agqvVar, str);
        e.getClass();
        createBuilder3.copyOnWrite();
        aten atenVar = (aten) createBuilder3.instance;
        atenVar.d = e;
        atenVar.b |= 2;
        createBuilder2.aC(createBuilder3);
        createBuilder.copyOnWrite();
        ates atesVar = (ates) createBuilder.instance;
        atep atepVar = (atep) createBuilder2.mo39build();
        atepVar.getClass();
        atesVar.c = atepVar;
        atesVar.b |= 1;
        aopcVar.copyOnWrite();
        auex auexVar6 = (auex) aopcVar.instance;
        ates atesVar2 = (ates) createBuilder.mo39build();
        atesVar2.getClass();
        auexVar6.p = atesVar2;
        auexVar6.b |= 65536;
        aopa createBuilder4 = auev.a.createBuilder();
        aopa createBuilder5 = avxe.a.createBuilder();
        createBuilder5.copyOnWrite();
        avxe avxeVar = (avxe) createBuilder5.instance;
        m.getClass();
        avxeVar.b |= 1;
        avxeVar.c = m;
        createBuilder4.copyOnWrite();
        auev auevVar = (auev) createBuilder4.instance;
        avxe avxeVar2 = (avxe) createBuilder5.mo39build();
        avxeVar2.getClass();
        auevVar.c = avxeVar2;
        auevVar.b = 135739233;
        aopcVar.copyOnWrite();
        auex auexVar7 = (auex) aopcVar.instance;
        auev auevVar2 = (auev) createBuilder4.mo39build();
        auevVar2.getClass();
        auexVar7.x = auevVar2;
        auexVar7.b |= 67108864;
        aopa createBuilder6 = avhc.a.createBuilder();
        avgz avgzVar = avgz.a;
        createBuilder6.copyOnWrite();
        avhc avhcVar = (avhc) createBuilder6.instance;
        avgzVar.getClass();
        avhcVar.l = avgzVar;
        avhcVar.b |= 32768;
        aopcVar.cv(createBuilder6);
        aopa createBuilder7 = avhc.a.createBuilder();
        aopa createBuilder8 = avha.a.createBuilder();
        createBuilder8.copyOnWrite();
        avha avhaVar = (avha) createBuilder8.instance;
        avhaVar.b |= 1;
        avhaVar.c = nni.g(f, j);
        createBuilder7.copyOnWrite();
        avhc avhcVar2 = (avhc) createBuilder7.instance;
        avha avhaVar2 = (avha) createBuilder8.mo39build();
        avhaVar2.getClass();
        avhcVar2.f = avhaVar2;
        avhcVar2.b |= 128;
        aopcVar.cv(createBuilder7);
        apzg f4 = aikb.f(m, str, num.intValue(), f2);
        aopcVar.copyOnWrite();
        auex auexVar8 = (auex) aopcVar.instance;
        f4.getClass();
        auexVar8.i = f4;
        auexVar8.b |= 64;
        asaa asaaVar = agqvVar.k;
        if (asaaVar != null) {
            arzv arzvVar = asaaVar.l;
            if (arzvVar == null) {
                arzvVar = arzv.a;
            }
            if (arzvVar.b == 60572968) {
                aopa createBuilder9 = auew.a.createBuilder();
                arzv arzvVar2 = asaaVar.l;
                if (arzvVar2 == null) {
                    arzvVar2 = arzv.a;
                }
                if (arzvVar2.b == 60572968) {
                    attpVar = (attp) arzvVar2.c;
                } else {
                    attpVar = attp.a;
                }
                createBuilder9.copyOnWrite();
                auew auewVar = (auew) createBuilder9.instance;
                attpVar.getClass();
                auewVar.c = attpVar;
                auewVar.b |= 1;
                aopcVar.copyOnWrite();
                auex auexVar9 = (auex) aopcVar.instance;
                auew auewVar2 = (auew) createBuilder9.mo39build();
                auewVar2.getClass();
                auexVar9.q = auewVar2;
                auexVar9.b |= 131072;
            }
        }
        agqa h = agqvVar.h();
        if (h != null) {
            aopc aopcVar2 = (aopc) arag.a.createBuilder();
            aopc aopcVar3 = (aopc) arai.a.createBuilder();
            String str2 = h.b;
            aopcVar3.copyOnWrite();
            arai araiVar = (arai) aopcVar3.instance;
            str2.getClass();
            araiVar.b |= 1;
            araiVar.c = str2;
            aopc aopcVar4 = (aopc) apzg.a.createBuilder();
            aopg aopgVar = BrowseEndpointOuterClass.browseEndpoint;
            aopa createBuilder10 = apnv.a.createBuilder();
            String b = elk.b(h.a);
            createBuilder10.copyOnWrite();
            apnv apnvVar = (apnv) createBuilder10.instance;
            b.getClass();
            apnvVar.b |= 1;
            apnvVar.c = b;
            aopcVar4.e(aopgVar, (apnv) createBuilder10.mo39build());
            aopcVar3.copyOnWrite();
            arai araiVar2 = (arai) aopcVar3.instance;
            apzg apzgVar = (apzg) aopcVar4.mo39build();
            apzgVar.getClass();
            araiVar2.m = apzgVar;
            araiVar2.b |= 512;
            aopcVar2.cs(aopcVar3);
            aopcVar.copyOnWrite();
            auex auexVar10 = (auex) aopcVar.instance;
            arag aragVar = (arag) aopcVar2.mo39build();
            aragVar.getClass();
            auexVar10.g = aragVar;
            auexVar10.b |= 16;
        }
        return (auex) aopcVar.mo39build();
    }
}

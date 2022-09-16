package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: jmp  reason: default package */
/* loaded from: classes3.dex */
public final class jmp extends jlq {
    private final Context a;
    private final azqb b;
    private final fbx c;
    private final snc d;

    public jmp(Context context, azqb azqbVar, fbx fbxVar, snc sncVar) {
        super(agqv.class, aqfa.class);
        this.a = context;
        this.b = azqbVar;
        this.c = fbxVar;
        this.d = sncVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        apzg j;
        agqv agqvVar = (agqv) obj;
        Integer num = (Integer) e(amupVar, "downloads_page_item_index");
        actj actjVar = (actj) e(amupVar, "downloads_page_item_ve_type");
        jml jmlVar = (jml) this.b.get();
        boolean z = amupVar != null && ((Boolean) amupVar.getOrDefault("is_candidate_video", false)).booleanValue();
        avhn k = agqvVar.k();
        aopc aopcVar = (aopc) aqfa.a.createBuilder();
        arag g = ajgl.g(agqvVar.o(this.a));
        aopcVar.copyOnWrite();
        aqfa aqfaVar = (aqfa) aopcVar.instance;
        g.getClass();
        aqfaVar.e = g;
        aqfaVar.b |= 4;
        arag g2 = ajgl.g(agqvVar.n());
        aopcVar.copyOnWrite();
        aqfa aqfaVar2 = (aqfa) aopcVar.instance;
        g2.getClass();
        aqfaVar2.k = g2;
        aqfaVar2.b |= 2048;
        if (k == null) {
            k = avhn.a;
        }
        aopcVar.copyOnWrite();
        aqfa aqfaVar3 = (aqfa) aopcVar.instance;
        k.getClass();
        aqfaVar3.d = k;
        aqfaVar3.b |= 2;
        if (z) {
            j = nni.j(agqvVar, true, 0.0f, 0, "");
        } else {
            j = nni.j(agqvVar, false, nni.f(agqvVar.f(), agqvVar.h), 0, "PPSV");
        }
        aopc aopcVar2 = (aopc) j.mo52toBuilder();
        aopg aopgVar = atno.b;
        aopa createBuilder = atnp.a.createBuilder();
        int intValue = num.intValue();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 4;
        atnpVar.e = intValue;
        int i = actjVar.II;
        createBuilder.copyOnWrite();
        atnp atnpVar2 = (atnp) createBuilder.instance;
        atnpVar2.b |= 2;
        atnpVar2.d = i;
        aopcVar2.e(aopgVar, (atnp) createBuilder.mo39build());
        aopcVar.copyOnWrite();
        aqfa aqfaVar4 = (aqfa) aopcVar.instance;
        apzg apzgVar = (apzg) aopcVar2.mo39build();
        apzgVar.getClass();
        aqfaVar4.m = apzgVar;
        aqfaVar4.b |= 4096;
        aopa createBuilder2 = ates.a.createBuilder();
        aopa createBuilder3 = atep.a.createBuilder();
        aopa createBuilder4 = aten.a.createBuilder();
        ater e = jmlVar.e(agqvVar, null);
        e.getClass();
        createBuilder4.copyOnWrite();
        aten atenVar = (aten) createBuilder4.instance;
        atenVar.d = e;
        atenVar.b |= 2;
        createBuilder3.aC(createBuilder4);
        createBuilder2.copyOnWrite();
        ates atesVar = (ates) createBuilder2.instance;
        atep atepVar = (atep) createBuilder3.mo39build();
        atepVar.getClass();
        atesVar.c = atepVar;
        atesVar.b |= 1;
        aopcVar.copyOnWrite();
        aqfa aqfaVar5 = (aqfa) aopcVar.instance;
        ates atesVar2 = (ates) createBuilder2.mo39build();
        atesVar2.getClass();
        aqfaVar5.v = atesVar2;
        aqfaVar5.b |= 134217728;
        aopa createBuilder5 = avxe.a.createBuilder();
        String m = agqvVar.m();
        createBuilder5.copyOnWrite();
        avxe avxeVar = (avxe) createBuilder5.instance;
        m.getClass();
        avxeVar.b |= 1;
        avxeVar.c = m;
        aopcVar.copyOnWrite();
        aqfa aqfaVar6 = (aqfa) aopcVar.instance;
        avxe avxeVar2 = (avxe) createBuilder5.mo39build();
        avxeVar2.getClass();
        aqfaVar6.u = avxeVar2;
        aqfaVar6.b |= 2097152;
        aopa createBuilder6 = avhc.a.createBuilder();
        avgz avgzVar = avgz.a;
        createBuilder6.copyOnWrite();
        avhc avhcVar = (avhc) createBuilder6.instance;
        avgzVar.getClass();
        avhcVar.l = avgzVar;
        avhcVar.b |= 32768;
        aopcVar.cr(createBuilder6);
        if (this.c.b()) {
            ampq u = nni.u(agqvVar, z, this.d, nni.f(agqvVar.f(), agqvVar.h), 0, "PPSV");
            if (u.h()) {
                aopc aopcVar3 = (aopc) ((apzg) u.c()).mo52toBuilder();
                aopg aopgVar2 = atno.b;
                aopa createBuilder7 = atnp.a.createBuilder();
                int intValue2 = num.intValue();
                createBuilder7.copyOnWrite();
                atnp atnpVar3 = (atnp) createBuilder7.instance;
                atnpVar3.b |= 4;
                atnpVar3.e = intValue2;
                int i2 = actjVar.II;
                createBuilder7.copyOnWrite();
                atnp atnpVar4 = (atnp) createBuilder7.instance;
                atnpVar4.b |= 2;
                atnpVar4.d = i2;
                aopcVar3.e(aopgVar2, (atnp) createBuilder7.mo39build());
                aopcVar.copyOnWrite();
                aqfa aqfaVar7 = (aqfa) aopcVar.instance;
                apzg apzgVar2 = (apzg) aopcVar3.mo39build();
                apzgVar2.getClass();
                aqfaVar7.m = apzgVar2;
                aqfaVar7.b |= 4096;
            }
        }
        if (agqvVar.j() != null) {
            aopa createBuilder8 = aqez.a.createBuilder();
            attp j2 = agqvVar.j();
            j2.getClass();
            createBuilder8.copyOnWrite();
            aqez aqezVar = (aqez) createBuilder8.instance;
            aqezVar.c = j2;
            aqezVar.b |= 1;
            aopcVar.copyOnWrite();
            aqfa aqfaVar8 = (aqfa) aopcVar.instance;
            aqez aqezVar2 = (aqez) createBuilder8.mo39build();
            aqezVar2.getClass();
            aqfaVar8.t = aqezVar2;
            aqfaVar8.b |= 1048576;
        }
        if (!z) {
            long f = agqvVar.f();
            long j3 = agqvVar.h;
            aopa createBuilder9 = avhc.a.createBuilder();
            aopa createBuilder10 = avha.a.createBuilder();
            createBuilder10.copyOnWrite();
            avha avhaVar = (avha) createBuilder10.instance;
            avhaVar.b |= 1;
            avhaVar.c = nni.g(f, j3);
            createBuilder9.copyOnWrite();
            avhc avhcVar2 = (avhc) createBuilder9.instance;
            avha avhaVar2 = (avha) createBuilder10.mo39build();
            avhaVar2.getClass();
            avhcVar2.f = avhaVar2;
            avhcVar2.b |= 128;
            aopcVar.cr(createBuilder9);
        }
        agqa h = agqvVar.h();
        if (h != null) {
            arag g3 = ajgl.g(h.b);
            aopcVar.copyOnWrite();
            aqfa aqfaVar9 = (aqfa) aopcVar.instance;
            g3.getClass();
            aqfaVar9.f = g3;
            aqfaVar9.b |= 16;
            avhn e2 = h.c.e();
            aopcVar.copyOnWrite();
            aqfa aqfaVar10 = (aqfa) aopcVar.instance;
            e2.getClass();
            aqfaVar10.h = e2;
            aqfaVar10.b |= 64;
        }
        return (aqfa) aopcVar.mo39build();
    }
}

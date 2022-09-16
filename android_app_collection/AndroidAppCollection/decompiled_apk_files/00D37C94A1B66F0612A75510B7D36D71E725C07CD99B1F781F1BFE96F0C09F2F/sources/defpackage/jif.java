package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: jif  reason: default package */
/* loaded from: classes3.dex */
public final class jif implements jic {
    private final Context a;
    private final aagi b;
    private final aahf c;
    private final jin d;
    private final fbw e;

    public jif(Context context, aagi aagiVar, aahf aahfVar, jin jinVar, fbw fbwVar) {
        this.a = context;
        this.b = aagiVar;
        this.c = aahfVar;
        this.d = jinVar;
        this.e = fbwVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 137;
    }

    @Override // defpackage.jic
    public final int b() {
        return 199;
    }

    @Override // defpackage.jic
    public final /* bridge */ /* synthetic */ jia c(aajj aajjVar, String str, jib jibVar) {
        awkx b;
        asyq asyqVar = (asyq) aajjVar;
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqpu.a.createBuilder();
        createBuilder.copyOnWrite();
        aqpu aqpuVar = (aqpu) createBuilder.instance;
        aqpuVar.c |= 1;
        aqpuVar.d = str;
        aqpr aqprVar = new aqpr(createBuilder);
        if (asyqVar != null && (b = asyqVar.b()) != null) {
            awji b2 = b.b();
            avhn thumbnail = b.getThumbnail();
            aopa aopaVar = aqprVar.a;
            aopaVar.copyOnWrite();
            aqpu aqpuVar2 = (aqpu) aopaVar.instance;
            thumbnail.getClass();
            aqpuVar2.e = thumbnail;
            aqpuVar2.c |= 2;
            String title = b.getTitle();
            aopa aopaVar2 = aqprVar.a;
            aopaVar2.copyOnWrite();
            aqpu aqpuVar3 = (aqpu) aopaVar2.instance;
            title.getClass();
            aqpuVar3.c |= 4;
            aqpuVar3.f = title;
            String title2 = b2 == null ? "" : b2.getTitle();
            aopa aopaVar3 = aqprVar.a;
            aopaVar3.copyOnWrite();
            aqpu aqpuVar4 = (aqpu) aopaVar3.instance;
            title2.getClass();
            aqpuVar4.c |= 8;
            aqpuVar4.g = title2;
            Integer lengthSeconds = b.getLengthSeconds();
            aopa aopaVar4 = aqprVar.a;
            int intValue = lengthSeconds.intValue();
            aopaVar4.copyOnWrite();
            aqpu aqpuVar5 = (aqpu) aopaVar4.instance;
            aqpuVar5.c |= 16;
            aqpuVar5.h = intValue;
            String charSequence = zgt.z(this.a.getResources(), zgh.i(b.getLengthSeconds().intValue())).toString();
            aopa aopaVar5 = aqprVar.a;
            aopaVar5.copyOnWrite();
            aqpu aqpuVar6 = (aqpu) aopaVar5.instance;
            charSequence.getClass();
            aqpuVar6.c |= 32;
            aqpuVar6.i = charSequence;
            aopc aopcVar = (aopc) awbp.a.createBuilder();
            String videoId = b.getVideoId();
            aopcVar.copyOnWrite();
            awbp awbpVar = (awbp) aopcVar.instance;
            videoId.getClass();
            awbpVar.b |= 1;
            awbpVar.c = videoId;
            aopcVar.copyOnWrite();
            awbp awbpVar2 = (awbp) aopcVar.instance;
            awbpVar2.b |= 2;
            awbpVar2.d = 155;
            String f = emn.f((awbp) aopcVar.mo39build());
            aopa aopaVar6 = aqprVar.a;
            aopaVar6.copyOnWrite();
            aqpu aqpuVar7 = (aqpu) aopaVar6.instance;
            f.getClass();
            aqpuVar7.c |= 64;
            aqpuVar7.j = f;
            String videoId2 = b.getVideoId();
            aopa aopaVar7 = aqprVar.a;
            aopaVar7.copyOnWrite();
            aqpu aqpuVar8 = (aqpu) aopaVar7.instance;
            videoId2.getClass();
            aqpuVar8.c |= 128;
            aqpuVar8.k = videoId2;
            String str2 = b.getLocalizedStrings().c;
            aopa aopaVar8 = aqprVar.a;
            aopaVar8.copyOnWrite();
            aqpu aqpuVar9 = (aqpu) aopaVar8.instance;
            str2.getClass();
            aqpuVar9.c |= 256;
            aqpuVar9.l = str2;
            List<aqnl> formats = asyqVar.getFormats();
            if (formats != null && !formats.isEmpty()) {
                for (aqnl aqnlVar : formats) {
                    aopa aopaVar9 = aqprVar.a;
                    aopaVar9.copyOnWrite();
                    aqpu aqpuVar10 = (aqpu) aopaVar9.instance;
                    aqnlVar.getClass();
                    aopu aopuVar = aqpuVar10.m;
                    if (!aopuVar.c()) {
                        aqpuVar10.m = aopi.mutableCopy(aopuVar);
                    }
                    aqpuVar10.m.add(aqnlVar);
                }
            }
            aoob scoringTrackingParams = asyqVar.getScoringTrackingParams();
            aopa aopaVar10 = aqprVar.a;
            aopaVar10.copyOnWrite();
            aqpu aqpuVar11 = (aqpu) aopaVar10.instance;
            scoringTrackingParams.getClass();
            aqpuVar11.c |= 512;
            aqpuVar11.n = scoringTrackingParams;
        }
        return jia.a(aqprVar.a(this.b.c()));
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.e);
        return k == null ? amon.a : ampq.j(emn.v(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        aahe c = this.c.c();
        awbp k = hhw.k(str, this.e);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String v = emn.v(str2);
        String y = emn.y(str2);
        HashSet g = amyv.g(this.d.a(v), this.d.a(y));
        awkx awkxVar = (awkx) c.f(y).g(awkx.class).W();
        String f = awkxVar != null ? awkxVar.f() : null;
        if (f != null) {
            g.add(this.d.a(f));
        }
        return amvn.p(g);
    }

    @Override // defpackage.jic
    public final Class f() {
        return asyq.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqpt.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(1, str);
    }
}

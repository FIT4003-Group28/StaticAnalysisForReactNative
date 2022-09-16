package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: jlz  reason: default package */
/* loaded from: classes3.dex */
public final class jlz extends jlq {
    public jlz() {
        super(jbc.class, audk.class);
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        jbc jbcVar = (jbc) obj;
        int intValue = ((Integer) e(amupVar, "downloaded_video_list_index")).intValue();
        boolean z = ((Integer) e(amupVar, "downloaded_playlist_selected_video_index")).intValue() == intValue;
        aopc aopcVar = (aopc) audk.a.createBuilder();
        aopcVar.copyOnWrite();
        audk audkVar = (audk) aopcVar.instance;
        audkVar.b |= 128;
        audkVar.k = z;
        String str = jbcVar.a;
        aopcVar.copyOnWrite();
        audk audkVar2 = (audk) aopcVar.instance;
        str.getClass();
        audkVar2.b |= 4096;
        audkVar2.o = str;
        avhn avhnVar = jbcVar.f;
        aopcVar.copyOnWrite();
        audk audkVar3 = (audk) aopcVar.instance;
        avhnVar.getClass();
        audkVar3.f = avhnVar;
        audkVar3.b |= 8;
        arag g = ajgl.g(ahdq.a(jbcVar.c.intValue()));
        aopcVar.copyOnWrite();
        audk audkVar4 = (audk) aopcVar.instance;
        g.getClass();
        audkVar4.g = g;
        audkVar4.b |= 16;
        arag g2 = ajgl.g(jbcVar.b);
        aopcVar.copyOnWrite();
        audk audkVar5 = (audk) aopcVar.instance;
        g2.getClass();
        audkVar5.c = g2;
        audkVar5.b |= 1;
        arag f = ajgl.f(intValue + 1);
        aopcVar.copyOnWrite();
        audk audkVar6 = (audk) aopcVar.instance;
        f.getClass();
        audkVar6.j = f;
        audkVar6.b |= 64;
        apzg d = aguy.d((String) e(amupVar, "downloaded_video_playlist_id"), jbcVar.a, intValue, (String) e(amupVar, "watch_command_params"), (aoob) e(amupVar, "watch_command_click_tracking_params"));
        aopcVar.copyOnWrite();
        audk audkVar7 = (audk) aopcVar.instance;
        d.getClass();
        audkVar7.m = d;
        audkVar7.b |= 256;
        if (!TextUtils.isEmpty(jbcVar.d)) {
            arag g3 = ajgl.g(jbcVar.d);
            aopcVar.copyOnWrite();
            audk audkVar8 = (audk) aopcVar.instance;
            g3.getClass();
            audkVar8.e = g3;
            audkVar8.b |= 4;
        }
        if (z) {
            aopcVar.cn(aguy.e(jbcVar.a, true));
            aopcVar.cn(aguy.e(jbcVar.a, false));
        }
        aopa createBuilder = asxl.a.createBuilder();
        createBuilder.copyOnWrite();
        asxl asxlVar = (asxl) createBuilder.instance;
        asxlVar.c = 2;
        asxlVar.b |= 1;
        aopcVar.copyOnWrite();
        audk audkVar9 = (audk) aopcVar.instance;
        asxl asxlVar2 = (asxl) createBuilder.mo39build();
        asxlVar2.getClass();
        audkVar9.t = asxlVar2;
        audkVar9.b |= 2097152;
        return (audk) aopcVar.mo39build();
    }
}

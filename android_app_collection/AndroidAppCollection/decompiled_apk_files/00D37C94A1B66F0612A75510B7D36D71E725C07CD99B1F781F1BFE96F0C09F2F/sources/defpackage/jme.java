package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jme  reason: default package */
/* loaded from: classes3.dex */
public final class jme extends jlq {
    private final jgn a;

    public jme(jgn jgnVar) {
        super(asyq.class, aqtb.class);
        this.a = jgnVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        jgn jgnVar = this.a;
        aopc aopcVar = (aopc) awbp.a.createBuilder();
        String g = aakj.g(((asyq) obj).d());
        aopcVar.copyOnWrite();
        awbp awbpVar = (awbp) aopcVar.instance;
        awbpVar.b |= 1;
        awbpVar.c = g;
        aopcVar.copyOnWrite();
        awbp awbpVar2 = (awbp) aopcVar.instance;
        awbpVar2.b |= 2;
        awbpVar2.d = 137;
        jgo jgoVar = jgnVar.f;
        aopg aopgVar = aqpv.b;
        aopa createBuilder = aqpv.a.createBuilder();
        String m = emn.m(aqpu.b, ((awbp) aopcVar.mo39build()).toByteString());
        createBuilder.copyOnWrite();
        aqpv aqpvVar = (aqpv) createBuilder.instance;
        m.getClass();
        aqpvVar.c |= 8;
        aqpvVar.d = m;
        boolean y = zew.y(jgnVar.a);
        createBuilder.copyOnWrite();
        aqpv aqpvVar2 = (aqpv) createBuilder.instance;
        aqpvVar2.c |= 128;
        aqpvVar2.e = y;
        createBuilder.copyOnWrite();
        aqpv aqpvVar3 = (aqpv) createBuilder.instance;
        aqpvVar3.c |= 256;
        aqpvVar3.f = true;
        aopa createBuilder2 = aqoc.a.createBuilder();
        String string = jgnVar.a.getString(R.string.accessibility_offline_button_save);
        createBuilder2.copyOnWrite();
        aqoc aqocVar = (aqoc) createBuilder2.instance;
        string.getClass();
        aqocVar.b = 1 | aqocVar.b;
        aqocVar.c = string;
        String string2 = jgnVar.a.getString(R.string.accessibility_offline_button_cancel);
        createBuilder2.copyOnWrite();
        aqoc aqocVar2 = (aqoc) createBuilder2.instance;
        string2.getClass();
        aqocVar2.b |= 2;
        aqocVar2.d = string2;
        String string3 = jgnVar.a.getString(R.string.accessibility_offline_button_remove_video);
        createBuilder2.copyOnWrite();
        aqoc aqocVar3 = (aqoc) createBuilder2.instance;
        string3.getClass();
        aqocVar3.b |= 4;
        aqocVar3.e = string3;
        aqoc aqocVar4 = (aqoc) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqpv aqpvVar4 = (aqpv) createBuilder.instance;
        aqocVar4.getClass();
        aqpvVar4.g = aqocVar4;
        aqpvVar4.c |= 512;
        return (aqtb) jgoVar.b(R.raw.downloads_page_recommended_video_element_android, aopgVar, (aqpv) createBuilder.mo39build()).f();
    }
}

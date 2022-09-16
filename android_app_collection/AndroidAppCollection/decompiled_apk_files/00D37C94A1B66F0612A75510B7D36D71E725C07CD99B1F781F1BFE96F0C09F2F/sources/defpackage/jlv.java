package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jlv  reason: default package */
/* loaded from: classes3.dex */
public final class jlv extends jlq {
    private final jgn a;

    public jlv(jgn jgnVar) {
        super(awjr.class, aqtb.class);
        this.a = jgnVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        jgn jgnVar = this.a;
        aopc aopcVar = (aopc) awbp.a.createBuilder();
        String g = aakj.g(((awjr) obj).d());
        aopcVar.copyOnWrite();
        awbp awbpVar = (awbp) aopcVar.instance;
        awbpVar.b |= 1;
        awbpVar.c = g;
        aopcVar.copyOnWrite();
        awbp awbpVar2 = (awbp) aopcVar.instance;
        awbpVar2.b |= 2;
        awbpVar2.d = 155;
        aopa createBuilder = aqqi.a.createBuilder();
        aopa createBuilder2 = aqni.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqni.a((aqni) createBuilder2.instance);
        createBuilder.copyOnWrite();
        aqqi aqqiVar = (aqqi) createBuilder.instance;
        aqni aqniVar = (aqni) createBuilder2.mo39build();
        aqniVar.getClass();
        aqqiVar.c = aqniVar;
        aqqiVar.b |= 1;
        boolean booleanValue = jgnVar.d.a().booleanValue();
        createBuilder.copyOnWrite();
        aqqi aqqiVar2 = (aqqi) createBuilder.instance;
        aqqiVar2.b |= 2;
        aqqiVar2.d = booleanValue;
        aqqi aqqiVar3 = (aqqi) createBuilder.mo39build();
        jgo jgoVar = jgnVar.f;
        aopg aopgVar = aqqj.b;
        aopa createBuilder3 = aqqj.a.createBuilder();
        String k = emn.k((awbp) aopcVar.mo39build());
        createBuilder3.copyOnWrite();
        aqqj aqqjVar = (aqqj) createBuilder3.instance;
        k.getClass();
        aqqjVar.c |= 4;
        aqqjVar.d = k;
        createBuilder3.copyOnWrite();
        aqqj aqqjVar2 = (aqqj) createBuilder3.instance;
        aqqiVar3.getClass();
        aqqjVar2.e = aqqiVar3;
        aqqjVar2.c |= 64;
        return (aqtb) jgoVar.b(R.raw.downloads_page_video_element_android, aopgVar, (aqqj) createBuilder3.mo39build()).f();
    }
}

package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jum  reason: default package */
/* loaded from: classes3.dex */
public final class jum implements jut {
    private final jgo a;
    private final ampq b;

    public jum(jgo jgoVar, ampq ampqVar) {
        this.a = jgoVar;
        this.b = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        ampq b;
        ampq ampqVar = this.b;
        if (!ampqVar.h()) {
            b = amon.a;
        } else {
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
            aqqi aqqiVar2 = (aqqi) createBuilder.mo39build();
            jgo jgoVar = this.a;
            aopg aopgVar = aqqj.b;
            aopa createBuilder3 = aqqj.a.createBuilder();
            aopc aopcVar = (aopc) awbp.a.createBuilder();
            String g = aakj.g(((asze) ampqVar.c()).d());
            aopcVar.copyOnWrite();
            awbp awbpVar = (awbp) aopcVar.instance;
            awbpVar.b |= 1;
            awbpVar.c = g;
            aopcVar.copyOnWrite();
            awbp awbpVar2 = (awbp) aopcVar.instance;
            awbpVar2.b |= 2;
            awbpVar2.d = 261;
            String k = emn.k((awbp) aopcVar.mo39build());
            createBuilder3.copyOnWrite();
            aqqj aqqjVar = (aqqj) createBuilder3.instance;
            k.getClass();
            aqqjVar.c |= 4;
            aqqjVar.d = k;
            createBuilder3.copyOnWrite();
            aqqj aqqjVar2 = (aqqj) createBuilder3.instance;
            aqqiVar2.getClass();
            aqqjVar2.e = aqqiVar2;
            aqqjVar2.c |= 64;
            b = jgoVar.b(R.raw.downloads_page_video_element_android, aopgVar, (aqqj) createBuilder3.mo39build());
        }
        if (b.h()) {
            aopa createBuilder4 = aslt.a.createBuilder();
            createBuilder4.copyOnWrite();
            aslt asltVar = (aslt) createBuilder4.instance;
            asltVar.av = (aqtb) b.c();
            asltVar.h |= 1048576;
            return amuk.r(new jur((aslt) createBuilder4.mo39build()));
        }
        return amuk.q();
    }
}

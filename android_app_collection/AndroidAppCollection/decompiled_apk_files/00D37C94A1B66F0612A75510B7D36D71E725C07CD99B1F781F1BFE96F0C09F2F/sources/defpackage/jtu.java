package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jtu  reason: default package */
/* loaded from: classes3.dex */
public final class jtu implements jut {
    private final jgn a;
    private final /* synthetic */ int b;

    public jtu(jgn jgnVar) {
        this.a = jgnVar;
    }

    public jtu(jgn jgnVar, int i) {
        this.b = i;
        this.a = jgnVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        if (this.b == 0) {
            jgn jgnVar = this.a;
            jgo jgoVar = jgnVar.f;
            aopg aopgVar = aqpf.b;
            aopa createBuilder = aqpf.a.createBuilder();
            boolean a = yic.a(jgnVar.b);
            createBuilder.copyOnWrite();
            aqpf aqpfVar = (aqpf) createBuilder.instance;
            aqpfVar.c |= 2;
            aqpfVar.d = a;
            String string = jgnVar.a.getString(R.string.habanero_entry_point_title);
            createBuilder.copyOnWrite();
            aqpf aqpfVar2 = (aqpf) createBuilder.instance;
            string.getClass();
            aqpfVar2.c |= 4;
            aqpfVar2.e = string;
            String string2 = jgnVar.a.getString(R.string.habanero_entry_point_subtitle);
            createBuilder.copyOnWrite();
            aqpf aqpfVar3 = (aqpf) createBuilder.instance;
            string2.getClass();
            aqpfVar3.c |= 8;
            aqpfVar3.f = string2;
            String string3 = jgnVar.a.getString(R.string.habanero_entry_point_cta_button);
            createBuilder.copyOnWrite();
            aqpf aqpfVar4 = (aqpf) createBuilder.instance;
            string3.getClass();
            aqpfVar4.c |= 16;
            aqpfVar4.g = string3;
            String string4 = jgnVar.a.getString(R.string.habanero_entry_point_offline_message);
            createBuilder.copyOnWrite();
            aqpf aqpfVar5 = (aqpf) createBuilder.instance;
            string4.getClass();
            aqpfVar5.c |= 32;
            aqpfVar5.h = string4;
            ampq b = jgoVar.b(R.raw.downloads_page_habanero_entry_point_element_android, aopgVar, (aqpf) createBuilder.mo39build());
            if (!b.h()) {
                return amuk.q();
            }
            aopa createBuilder2 = aslt.a.createBuilder();
            createBuilder2.copyOnWrite();
            aslt asltVar = (aslt) createBuilder2.instance;
            asltVar.av = (aqtb) b.c();
            asltVar.h |= 1048576;
            return amuk.r(new jur((aslt) createBuilder2.mo39build()));
        }
        jgo jgoVar2 = this.a.f;
        aopg aopgVar2 = aqoq.b;
        aopa createBuilder3 = aqoq.a.createBuilder();
        aopg aopgVar3 = aqop.b;
        aopc aopcVar = (aopc) awbp.a.createBuilder();
        aopcVar.copyOnWrite();
        awbp awbpVar = (awbp) aopcVar.instance;
        awbpVar.b |= 2;
        awbpVar.d = 164;
        String m = emn.m(aopgVar3, ((awbp) aopcVar.mo39build()).toByteString());
        createBuilder3.copyOnWrite();
        aqoq aqoqVar = (aqoq) createBuilder3.instance;
        m.getClass();
        aqoqVar.c |= 32768;
        aqoqVar.d = m;
        ampq b2 = jgoVar2.b(R.raw.downloads_page_banner_element_android, aopgVar2, (aqoq) createBuilder3.mo39build());
        if (b2.h()) {
            aopa createBuilder4 = aslt.a.createBuilder();
            createBuilder4.copyOnWrite();
            aslt asltVar2 = (aslt) createBuilder4.instance;
            asltVar2.av = (aqtb) b2.c();
            asltVar2.h |= 1048576;
            return amuk.r(new jur((aslt) createBuilder4.mo39build()));
        }
        return amuk.q();
    }
}

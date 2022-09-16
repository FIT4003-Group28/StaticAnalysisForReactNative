package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jlu  reason: default package */
/* loaded from: classes3.dex */
public final class jlu extends jlq {
    private final jgn a;
    private final azqb b;

    public jlu(jgn jgnVar, azqb azqbVar) {
        super(awjm.class, aqtb.class);
        this.a = jgnVar;
        this.b = azqbVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        Boolean bool;
        awjm awjmVar = (awjm) obj;
        aopc aopcVar = (aopc) awbp.a.createBuilder();
        String g = aakj.g(awjmVar.d());
        aopcVar.copyOnWrite();
        awbp awbpVar = (awbp) aopcVar.instance;
        awbpVar.b |= 1;
        awbpVar.c = g;
        aopcVar.copyOnWrite();
        awbp awbpVar2 = (awbp) aopcVar.instance;
        awbpVar2.b |= 2;
        awbpVar2.d = 156;
        awkg b = awjmVar.b();
        b.getClass();
        ampq i = ampq.i(((fci) this.b.get()).a.get(eog.f(b.getPlaylistId())));
        if (i.h()) {
            aopg aopgVar = aqpo.b;
            aopa createBuilder = aqpo.a.createBuilder();
            createBuilder.copyOnWrite();
            aqpo aqpoVar = (aqpo) createBuilder.instance;
            aqpoVar.d = ((awkj) i.c()).f;
            aqpoVar.c |= 1;
            aopcVar.e(aopgVar, (aqpo) createBuilder.mo39build());
        }
        jgn jgnVar = this.a;
        jgo jgoVar = jgnVar.f;
        aopg aopgVar2 = aqpq.b;
        aopa createBuilder2 = aqpq.a.createBuilder();
        String m = emn.m(aqpn.b, ((awbp) aopcVar.mo39build()).toByteString());
        createBuilder2.copyOnWrite();
        aqpq aqpqVar = (aqpq) createBuilder2.instance;
        m.getClass();
        aqpqVar.c |= 4;
        aqpqVar.d = m;
        aopa createBuilder3 = aqpp.a.createBuilder();
        aqxe aqxeVar = jgnVar.d.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353720L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353720L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353720L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        createBuilder3.copyOnWrite();
        aqpp aqppVar = (aqpp) createBuilder3.instance;
        aqppVar.b = 1 | aqppVar.b;
        aqppVar.c = booleanValue;
        boolean booleanValue2 = jgnVar.d.a().booleanValue();
        createBuilder3.copyOnWrite();
        aqpp aqppVar2 = (aqpp) createBuilder3.instance;
        aqppVar2.b |= 2;
        aqppVar2.d = booleanValue2;
        createBuilder2.copyOnWrite();
        aqpq aqpqVar2 = (aqpq) createBuilder2.instance;
        aqpp aqppVar3 = (aqpp) createBuilder3.mo39build();
        aqppVar3.getClass();
        aqpqVar2.e = aqppVar3;
        aqpqVar2.c |= 128;
        return (aqtb) jgoVar.b(R.raw.downloads_page_playlist_element_android, aopgVar2, (aqpq) createBuilder2.mo39build()).f();
    }
}

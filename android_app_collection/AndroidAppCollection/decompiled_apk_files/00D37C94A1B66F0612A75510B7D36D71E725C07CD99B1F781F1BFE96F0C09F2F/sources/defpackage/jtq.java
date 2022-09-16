package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jtq  reason: default package */
/* loaded from: classes3.dex */
public final class jtq implements jut {
    private final jgn a;
    private final ampq b;

    public jtq(jgn jgnVar, ampq ampqVar) {
        this.a = jgnVar;
        this.b = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aqpa b;
        Long l;
        aqot aqotVar;
        if (!jnbVar.b.h()) {
            b = aqpa.b(((aqpb) jnbVar.c.instance).c);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
        } else {
            aqoy aqoyVar = (aqoy) jnbVar.b.c();
            if (aqoyVar.b == 2) {
                aqotVar = (aqot) aqoyVar.c;
            } else {
                aqotVar = aqot.a;
            }
            b = aqpa.b(aqotVar.d);
            if (b == null) {
                b = aqpa.FILTER_TYPE_UNSPECIFIED;
            }
        }
        if (this.b.h()) {
            jgn jgnVar = this.a;
            int intValue = ((Integer) this.b.c()).intValue();
            jgo jgoVar = jgnVar.f;
            aopg aopgVar = aqpc.b;
            aopa createBuilder = aqpc.a.createBuilder();
            String h = akzj.h(jgnVar.a.getString(R.string.expand_button_message, Integer.valueOf(intValue)));
            createBuilder.copyOnWrite();
            aqpc aqpcVar = (aqpc) createBuilder.instance;
            h.getClass();
            aqpcVar.c |= 8;
            aqpcVar.d = h;
            createBuilder.copyOnWrite();
            aqpc aqpcVar2 = (aqpc) createBuilder.instance;
            aqpcVar2.e = b.e;
            aqpcVar2.c |= 16;
            String j = emn.j();
            createBuilder.copyOnWrite();
            aqpc aqpcVar3 = (aqpc) createBuilder.instance;
            j.getClass();
            aqpcVar3.c |= 64;
            aqpcVar3.g = j;
            int i = actj.DOWNLOADS_PAGE_DOWNLOADS_SECTION_EXPAND_BUTTON.II;
            createBuilder.copyOnWrite();
            aqpc aqpcVar4 = (aqpc) createBuilder.instance;
            aqpcVar4.c |= 32;
            aqpcVar4.f = i;
            aqxe aqxeVar = jgnVar.e.a.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            long j2 = 0;
            if (aqxeVar.a(45354176L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45354176L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45354176L);
                if (aqxfVar.b == 2) {
                    j2 = ((Long) aqxfVar.c).longValue();
                }
                l = Long.valueOf(j2);
            } else {
                l = 0L;
            }
            long longValue = l.longValue();
            int i2 = (int) longValue;
            if (longValue == i2) {
                int f = aqvb.f(i2);
                createBuilder.copyOnWrite();
                aqpc aqpcVar5 = (aqpc) createBuilder.instance;
                int i3 = f - 1;
                if (f != 0) {
                    aqpcVar5.h = i3;
                    aqpcVar5.c |= 128;
                    ampq b2 = jgoVar.b(R.raw.downloads_page_expand_button_element_android, aopgVar, (aqpc) createBuilder.mo39build());
                    if (b2.h()) {
                        aopa createBuilder2 = aslt.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aslt asltVar = (aslt) createBuilder2.instance;
                        asltVar.av = (aqtb) b2.c();
                        asltVar.h |= 1048576;
                        return amuk.r(new jur((aslt) createBuilder2.mo39build()));
                    }
                } else {
                    throw null;
                }
            } else {
                throw new ArithmeticException();
            }
        }
        return amuk.q();
    }
}

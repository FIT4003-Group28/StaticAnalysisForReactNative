package defpackage;

import android.content.Context;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cunn  reason: default package */
/* loaded from: classes5.dex */
public final class cunn implements ctuj {
    private final Context a;

    public cunn(Context context) {
        this.a = context;
    }

    @Override // defpackage.ctuj
    public final dxqg a(cugu cuguVar) {
        dbsg<cupx> a = cumv.a(cuguVar);
        if (!a.a()) {
            cstl.a("RichCardMsgConv");
            dxqg bZ = dxqi.t.bZ();
            dxos dxosVar = dxos.UNKNOWN;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxqi) bZ.b).l = dxosVar.a();
            return bZ;
        }
        cupx b = a.b();
        dxqg bZ2 = dxqi.t.bZ();
        try {
            dxos dxosVar2 = dxos.RICH_CARD;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dxqi) bZ2.b).l = dxosVar2.a();
            cuqp cuqpVar = cuqp.RICH_TEXT;
            cuqi cuqiVar = cuqi.STACK_COMPONENT;
            cupw cupwVar = cupw.STACK_CARD;
        } catch (Exception unused) {
            cstl.a("RichCardMsgConv");
            dxos dxosVar3 = dxos.UNKNOWN;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dxqi) bZ2.b).l = dxosVar3.a();
        }
        if (b.b().ordinal() == 0) {
            dxrh bZ3 = dxri.d.bZ();
            cuqd c = b.c();
            dxrn bZ4 = dxro.b.bZ();
            dcdc a2 = cstr.a(c.a(), cuno.a);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dxro dxroVar = (dxro) bZ4.b;
            dsrj<dxrw> dsrjVar = dxroVar.a;
            if (!dsrjVar.a()) {
                dxroVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(a2, dxroVar.a);
            dxro bK = bZ4.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxri dxriVar = (dxri) bZ3.b;
            bK.getClass();
            dxriVar.b = bK;
            dxriVar.a = R.styleable.AppCompatTheme_switchStyle;
            ((dxri) bZ3.b).c = dxoz.a(3);
            dxri bK2 = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dxqi dxqiVar = (dxqi) bZ2.b;
            bK2.getClass();
            dxqiVar.d = bK2;
            dxqiVar.c = R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            return bZ2;
        }
        throw new IllegalArgumentException("Got unknown rich card model type");
    }

    @Override // defpackage.ctuj
    public final cugm b(ctyy ctyyVar, dxqi dxqiVar) {
        dxri dxriVar;
        dxro dxroVar;
        cupx a;
        dxrs dxrsVar;
        dxqy dxqyVar;
        Context context = this.a;
        String str = dxqiVar.g;
        dxos b = dxos.b(dxqiVar.l);
        if (b == null) {
            b = dxos.UNRECOGNIZED;
        }
        if (!b.equals(dxos.RICH_CARD) || dxqiVar.c != 107) {
            cstl.a("RichCardMsgConv");
            return cuas.d(dspd.b);
        }
        cugk c = cugl.c();
        if (dxqiVar.c == 107) {
            dxriVar = (dxri) dxqiVar.d;
        } else {
            dxriVar = dxri.d;
        }
        ctog a2 = ctog.a(context);
        cuqp cuqpVar = cuqp.RICH_TEXT;
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        cupw cupwVar = cupw.STACK_CARD;
        int i = dxriVar.c;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            if (dxriVar.a == 101) {
                dxroVar = (dxro) dxriVar.b;
            } else {
                dxroVar = dxro.b;
            }
            a = cuoa.a(cunv.a(ctyyVar, context, dxroVar, str, a2));
        } else if (i3 == 2) {
            if (dxriVar.a == 102) {
                dxrsVar = (dxrs) dxriVar.b;
            } else {
                dxrsVar = dxrs.c;
            }
            cuqe c2 = cuqf.c();
            c2.b(dxrsVar.a);
            dxro dxroVar2 = dxrsVar.b;
            if (dxroVar2 == null) {
                dxroVar2 = dxro.b;
            }
            c2.c(cunv.a(ctyyVar, context, dxroVar2, str, a2));
            a = cuoa.b(c2.a());
        } else if (i3 == 3) {
            if (dxriVar.a == 103) {
                dxqyVar = (dxqy) dxriVar.b;
            } else {
                dxqyVar = dxqy.d;
            }
            dccx dccxVar = new dccx();
            for (dxro dxroVar3 : dxqyVar.c) {
                dccxVar.g(cunv.a(ctyyVar, context, dxroVar3, str, a2));
            }
            cupl d = cupm.d();
            d.d(dxqyVar.a);
            d.b(dxqyVar.b);
            d.c(dccxVar.f());
            a = cuoa.c(d.a());
        } else {
            StringBuilder sb = new StringBuilder(39);
            sb.append("Got unknown rich card type: ");
            sb.append(i);
            throw new ctui(sb.toString(), 221);
        }
        c.b(cumv.b(a));
        ((cudv) c).a = "rich_card";
        return cuas.b(c.a());
    }
}

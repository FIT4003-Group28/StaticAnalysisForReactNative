package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ldc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldc implements View.OnClickListener {
    public final /* synthetic */ ldi a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldc(ldi ldiVar) {
        this.a = ldiVar;
    }

    public /* synthetic */ ldc(ldi ldiVar, int i) {
        this.b = i;
        this.a = ldiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        auro auroVar;
        auro auroVar2;
        if (this.b == 0) {
            ldi ldiVar = this.a;
            String str = ldiVar.ak;
            Iterator it = ldiVar.ai.e.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    auroVar = null;
                    break;
                }
                for (aurp aurpVar : ((aurw) it.next()).c) {
                    if (aurpVar.b == 64166933) {
                        auroVar = (auro) aurpVar.c;
                    } else {
                        auroVar = auro.a;
                    }
                    if (auroVar.c.equals(str)) {
                        break loop0;
                    }
                }
            }
            if (auroVar != null) {
                if (ldiVar.af.t()) {
                    aafo aafoVar = ldiVar.ae;
                    apzg apzgVar = auroVar.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
                ldiVar.ao.a.b(new fct(auroVar.e, 4), anjk.a).qY(bhj.g, anjk.a);
                aopa createBuilder = awbu.a.createBuilder();
                String aH = ldiVar.aH();
                createBuilder.copyOnWrite();
                aH.getClass();
                ((awbu) createBuilder.instance).b = aH;
                String str2 = auroVar.e;
                createBuilder.copyOnWrite();
                str2.getClass();
                ((awbu) createBuilder.instance).c = str2;
                acrr acrrVar = ldiVar.ag;
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).ed((awbu) createBuilder.mo39build());
                acrrVar.c((arrh) a.mo39build());
                if (ldiVar.aj != null) {
                    String str3 = auroVar.c;
                    String str4 = auroVar.e;
                    if (str4.isEmpty()) {
                        str4 = ldiVar.aH();
                        Iterator it2 = ldiVar.ai.e.iterator();
                        loop2: while (true) {
                            if (it2.hasNext()) {
                                for (aurp aurpVar2 : ((aurw) it2.next()).c) {
                                    if (aurpVar2.b == 64166933) {
                                        auroVar2 = (auro) aurpVar2.c;
                                    } else {
                                        auroVar2 = auro.a;
                                    }
                                    if (akzj.i(auroVar2.e, str4)) {
                                        str3 = auroVar2.c;
                                        break loop2;
                                    }
                                }
                            } else {
                                List h = amqf.b('-').h(str4);
                                str3 = new Locale((String) h.get(0), akzj.h((String) h.get(1))).getDisplayName();
                                break;
                            }
                        }
                    }
                    ldiVar.aj.c(str3, str4);
                }
            }
            ldiVar.ah.H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_SELECTION), null);
            ldiVar.dismiss();
            return;
        }
        ldi ldiVar2 = this.a;
        ldiVar2.ah.H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_CANCEL_BUTTON), null);
        ldiVar2.dismiss();
    }
}

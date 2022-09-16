package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xwg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xwg implements View.OnClickListener {
    public final /* synthetic */ xwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ xwg(xwk xwkVar) {
        this.a = xwkVar;
    }

    public /* synthetic */ xwg(xwk xwkVar, int i) {
        this.b = i;
        this.a = xwkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            xwk xwkVar = this.a;
            ayoi.w(new xxd(xwkVar.aj, xwkVar.rb(), 1)).g(new xwi(xwkVar, 1)).Q();
        } else if (i != 1) {
            if (i == 2) {
                xwk xwkVar2 = this.a;
                ayoi.w(new xxd(xwkVar2.rb(), xwkVar2.aj)).g(new xwi(xwkVar2)).Q();
                return;
            }
            this.a.ai.cancel();
        } else {
            xwk xwkVar3 = this.a;
            aagh c = xwkVar3.ag.c();
            aopa createBuilder = aviu.a.createBuilder();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(xwkVar3.aj.a);
            createBuilder.copyOnWrite();
            aviu aviuVar = (aviu) createBuilder.instance;
            aviuVar.b = 1 | aviuVar.b;
            aviuVar.c = seconds;
            avip avipVar = xwkVar3.al;
            avipVar.b((aviu) createBuilder.mo39build());
            avir c2 = avipVar.c();
            aahb c3 = ((aagu) c).c();
            c3.d(c2);
            c3.b().Q();
            xwkVar3.ai.cancel();
        }
    }
}

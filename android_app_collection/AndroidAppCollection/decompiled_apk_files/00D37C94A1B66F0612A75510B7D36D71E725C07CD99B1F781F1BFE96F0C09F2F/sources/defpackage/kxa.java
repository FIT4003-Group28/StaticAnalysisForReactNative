package defpackage;

import com.google.protos.youtube.api.innertube.LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kxa  reason: default package */
/* loaded from: classes3.dex */
public final class kxa implements aafl {
    private final acrr a;
    private final acth b;

    public kxa(acrr acrrVar, acth acthVar) {
        this.a = acrrVar;
        this.b = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arrf a = arrh.a();
        apjy a2 = apjz.a();
        int t = akzj.t(((LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand) apzgVar.qm(LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.logBackToAppEventCommand)).b);
        if (t == 0) {
            t = 1;
        }
        int i = t - 1;
        int i2 = i != 1 ? i != 2 ? i != 3 ? 83769 : 3832 : 6827 : 4724;
        a2.copyOnWrite();
        ((apjz) a2.instance).d(i2);
        a.copyOnWrite();
        ((arrh) a.instance).ca((apjz) a2.mo39build());
        this.a.c((arrh) a.mo39build());
        acti oi = this.b.oi();
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asjm.a.createBuilder();
        aopa createBuilder3 = asjl.a.createBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder3.copyOnWrite();
        asjl asjlVar = (asjl) createBuilder3.instance;
        asjlVar.b = 1 | asjlVar.b;
        asjlVar.c = currentTimeMillis;
        createBuilder2.copyOnWrite();
        asjm asjmVar = (asjm) createBuilder2.instance;
        asjl asjlVar2 = (asjl) createBuilder3.mo39build();
        asjlVar2.getClass();
        aopu aopuVar = asjmVar.b;
        if (!aopuVar.c()) {
            asjmVar.b = aopi.mutableCopy(aopuVar);
        }
        asjmVar.b.add(asjlVar2);
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjm asjmVar2 = (asjm) createBuilder2.mo39build();
        asjmVar2.getClass();
        asjjVar.F = asjmVar2;
        asjjVar.c |= 33554432;
        oi.w(new acte(apzgVar.c), (asjj) createBuilder.mo39build());
    }
}

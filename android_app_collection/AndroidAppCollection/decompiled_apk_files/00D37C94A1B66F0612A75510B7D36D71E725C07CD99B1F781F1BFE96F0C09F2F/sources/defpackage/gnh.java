package defpackage;

import com.google.protos.youtube.api.innertube.LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnh  reason: default package */
/* loaded from: classes3.dex */
public final class gnh implements aafl {
    private final acth a;

    public gnh(acth acthVar) {
        this.a = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.logAdClickTerminationCommand)) {
            return;
        }
        if (map == null || !map.containsKey(enc.a)) {
            acti oi = this.a.oi();
            acte acteVar = new acte(apzgVar.c);
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asit.a.createBuilder();
            aopa createBuilder3 = asin.a.createBuilder();
            createBuilder3.copyOnWrite();
            asin.a((asin) createBuilder3.instance);
            asin asinVar = (asin) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            asit asitVar = (asit) createBuilder2.instance;
            asinVar.getClass();
            asitVar.d = asinVar;
            asitVar.c = 10;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asit asitVar2 = (asit) createBuilder2.mo39build();
            asitVar2.getClass();
            asjjVar.t = asitVar2;
            asjjVar.c |= 1024;
            oi.w(acteVar, (asjj) createBuilder.mo39build());
            return;
        }
        acte acteVar2 = new acte(apzgVar.c);
        aopa createBuilder4 = asjj.a.createBuilder();
        aopa createBuilder5 = asit.a.createBuilder();
        aopa createBuilder6 = asin.a.createBuilder();
        createBuilder6.copyOnWrite();
        asin.a((asin) createBuilder6.instance);
        asin asinVar2 = (asin) createBuilder6.mo39build();
        createBuilder5.copyOnWrite();
        asit asitVar3 = (asit) createBuilder5.instance;
        asinVar2.getClass();
        asitVar3.d = asinVar2;
        asitVar3.c = 10;
        createBuilder4.copyOnWrite();
        asjj asjjVar2 = (asjj) createBuilder4.instance;
        asit asitVar4 = (asit) createBuilder5.mo39build();
        asitVar4.getClass();
        asjjVar2.t = asitVar4;
        asjjVar2.c |= 1024;
        this.a.oi().x((String) map.get(enc.a), acteVar2, (asjj) createBuilder4.mo39build());
    }
}

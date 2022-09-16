package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xuk  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xuk implements ampg {
    public final /* synthetic */ xuz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xuk(xuz xuzVar, int i) {
        this.b = i;
        this.a = xuzVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            xuz xuzVar = this.a;
            awtg awtgVar = (awtg) obj;
            if (xuzVar.ai.c() == null) {
                return awtgVar;
            }
            xuzVar.ai.c().b();
            aopa mo52toBuilder = awtgVar.mo52toBuilder();
            mo52toBuilder.ba(xuzVar.ai.c().b());
            return (awtg) mo52toBuilder.mo39build();
        }
        xuz xuzVar2 = this.a;
        Map unmodifiableMap = Collections.unmodifiableMap(((awtg) obj).d);
        if (xuzVar2.ai.c() == null) {
            return amon.a;
        }
        xuzVar2.ai.c().b();
        String b = xuzVar2.ai.c().b();
        return !unmodifiableMap.containsKey(b) ? amon.a : ampq.j((Boolean) unmodifiableMap.get(b));
    }
}

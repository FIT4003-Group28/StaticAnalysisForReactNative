package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xvd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvd implements ampg {
    public final /* synthetic */ xvj a;
    private final /* synthetic */ int b;

    public /* synthetic */ xvd(xvj xvjVar) {
        this.a = xvjVar;
    }

    public /* synthetic */ xvd(xvj xvjVar, int i) {
        this.b = i;
        this.a = xvjVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            xvj xvjVar = this.a;
            awtg awtgVar = (awtg) obj;
            if (xvjVar.ai.c() == null) {
                return awtgVar;
            }
            xvjVar.ai.c().b();
            aopa mo52toBuilder = awtgVar.mo52toBuilder();
            mo52toBuilder.ba(xvjVar.ai.c().b());
            return (awtg) mo52toBuilder.mo39build();
        }
        xvj xvjVar2 = this.a;
        Map unmodifiableMap = Collections.unmodifiableMap(((awtg) obj).d);
        if (xvjVar2.ai.c() == null) {
            return amon.a;
        }
        xvjVar2.ai.c().b();
        String b = xvjVar2.ai.c().b();
        return !unmodifiableMap.containsKey(b) ? amon.a : ampq.j((Boolean) unmodifiableMap.get(b));
    }
}

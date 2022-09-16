package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: znw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class znw implements ampg {
    public final /* synthetic */ Map a;
    private final /* synthetic */ int b;

    public /* synthetic */ znw(Map map) {
        this.a = map;
    }

    public /* synthetic */ znw(Map map, int i) {
        this.b = i;
        this.a = map;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            Map map = this.a;
            aopa mo52toBuilder = ((awti) obj).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ((awti) mo52toBuilder.instance).a().putAll(map);
            return (awti) mo52toBuilder.mo39build();
        }
        Map map2 = this.a;
        actj actjVar = gvt.a;
        aopa mo52toBuilder2 = ((hwp) obj).mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        hwp hwpVar = (hwp) mo52toBuilder2.instance;
        aoqp aoqpVar = hwpVar.p;
        if (!aoqpVar.b) {
            hwpVar.p = aoqpVar.a();
        }
        hwpVar.p.putAll(map2);
        return (hwp) mo52toBuilder2.mo39build();
    }
}

package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: tmd  reason: default package */
/* loaded from: classes7.dex */
public abstract class tmd {
    /* JADX WARN: Multi-variable type inference failed */
    public static tmc j() {
        tlm tlmVar = new tlm();
        tlmVar.a = dbpy.a;
        tlmVar.f(dcmn.a);
        return tlmVar;
    }

    public abstract btlu a();

    public abstract dbsg<String> b();

    public abstract tme c();

    public abstract dcdc<String> d();

    public abstract dcdn<String, tlv> e();

    public abstract tmc f();

    public dcdc<tlv> g() {
        throw null;
    }

    public final dbsg<tlv> h(String str) {
        return dbsg.j(e().get(str));
    }

    public final tmc i() {
        tmc f = f();
        dcpd<Map.Entry<String, tlv>> it = e().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, tlv> next = it.next();
            f.b.put(next.getKey(), next.getValue().k());
        }
        return f;
    }
}

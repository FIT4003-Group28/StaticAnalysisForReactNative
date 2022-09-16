package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: enc  reason: default package */
/* loaded from: classes3.dex */
public final class enc {
    public static final String a = String.valueOf(enc.class.getName()).concat(".csn");
    private static final String d = "enc";
    public final Map b = new HashMap();
    public final aafo c;
    private final acth e;

    public enc(fqd fqdVar, aafo aafoVar, acth acthVar) {
        aafoVar.getClass();
        this.c = aafoVar;
        this.e = acthVar;
        fqdVar.g(new emz(this));
    }

    public final void a(ena enaVar, List list, Map map) {
        enaVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = (List) this.b.get(enaVar);
        if (list2 == null) {
            list2 = new ArrayList();
            this.b.put(enaVar, list2);
        }
        map.put(a, this.e.oi().k());
        list2.add(new enb(list, map));
    }
}

package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ghu  reason: default package */
/* loaded from: classes3.dex */
public final class ghu {
    private final Set a;
    private final aafo b;

    public ghu(aafo aafoVar, Set set) {
        this.a = set;
        this.b = aafoVar;
    }

    public final void a(apzg apzgVar, Map map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("triggered_on_ui_ready", true);
        for (ght ghtVar : this.a) {
            if (ghtVar.g(apzgVar, hashMap)) {
                return;
            }
        }
        this.b.c(apzgVar, hashMap);
    }
}

package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcqi  reason: default package */
/* loaded from: classes.dex */
final class dcqi extends dcqy<dctw> {
    public dcqi(Class cls) {
        super("tags", cls);
    }

    @Override // defpackage.dcqy
    public final /* bridge */ /* synthetic */ void a(dctw dctwVar, dcqx dcqxVar) {
        for (Map.Entry<String, Set<Object>> entry : dctwVar.c.d) {
            if (!entry.getValue().isEmpty()) {
                for (Object obj : entry.getValue()) {
                    dcqxVar.a(entry.getKey(), obj);
                }
            } else {
                dcqxVar.a(entry.getKey(), null);
            }
        }
    }
}

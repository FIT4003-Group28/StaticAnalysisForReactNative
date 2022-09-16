package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: agne  reason: default package */
/* loaded from: classes.dex */
public final class agne implements aerh {
    private final aahe a;
    private final aahn b;
    private final ahdf c;

    public agne(aahe aaheVar, aahn aahnVar, ahdf ahdfVar) {
        this.a = aaheVar;
        this.b = aahnVar;
        this.c = ahdfVar;
    }

    @Override // defpackage.aerh
    public final aerg a(String str) {
        aqqz aqqzVar;
        try {
            aqqv aqqvVar = (aqqv) this.a.f(aakj.f(146, str)).g(aqqv.class).W();
            if (aqqvVar == null && this.c.i()) {
                aahn aahnVar = this.b;
                ArrayList arrayList = new ArrayList();
                aahq aahqVar = agni.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
                sb.append("%");
                sb.append(str);
                sb.append("%");
                aahp.d(aahqVar, 7, sb.toString(), aahnVar, arrayList);
                List list = (List) this.a.e(aahp.b(aahnVar, arrayList)).U();
                if (list.isEmpty()) {
                    return null;
                }
                aqqvVar = (aqqv) this.a.f((String) list.get(0)).g(aqqv.class).W();
            }
            if (aqqvVar != null && !aqqvVar.getLicenses().isEmpty()) {
                try {
                    Iterator it = aqqvVar.getLicenses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aqqzVar = null;
                            break;
                        }
                        aqqzVar = (aqqz) it.next();
                        if (aqqzVar.i.equals(str)) {
                            break;
                        }
                    }
                    if (aqqzVar == null) {
                        return null;
                    }
                    return new aerg(str, aqqzVar.k.I(), aqqzVar.j, aqqzVar.g, aqqzVar.l);
                } catch (RuntimeException e) {
                    afus.c(2, 28, "Couldn't retrieve OfflineDrmData", e);
                }
            }
            return null;
        } catch (RuntimeException unused) {
            zep.b("[Offline] Stale drm store");
            return null;
        }
    }
}

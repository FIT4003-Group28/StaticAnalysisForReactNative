package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vlk  reason: default package */
/* loaded from: classes4.dex */
public final class vlk {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final vjb d;
    private final anir e;
    private final Map f;
    private final vnk g;

    public vlk(Executor executor, vjb vjbVar, vnk vnkVar, Map map) {
        executor.getClass();
        this.c = executor;
        vjbVar.getClass();
        this.d = vjbVar;
        this.g = vnkVar;
        this.f = map;
        aqxo.p(!map.isEmpty());
        this.e = urc.d;
    }

    public final synchronized vne a(vlj vljVar) {
        vne vneVar;
        Uri uri = vljVar.a;
        vneVar = (vne) this.a.get(uri);
        if (vneVar == null) {
            Uri uri2 = vljVar.a;
            aqxo.u(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String d = amps.d(uri2.getLastPathSegment());
            int lastIndexOf = d.lastIndexOf(46);
            boolean z = true;
            aqxo.u((lastIndexOf == -1 ? "" : d.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            aqxo.q(vljVar.b != null, "Proto schema cannot be null");
            aqxo.q(vljVar.c != null, "Handler cannot be null");
            String a = vljVar.e.a();
            vng vngVar = (vng) this.f.get(a);
            if (vngVar == null) {
                z = false;
            }
            aqxo.u(z, "No XDataStoreVariantFactory registered for ID %s", a);
            String d2 = amps.d(vljVar.a.getLastPathSegment());
            int lastIndexOf2 = d2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                d2 = d2.substring(0, lastIndexOf2);
            }
            vne vneVar2 = new vne(vngVar.a(vljVar, d2, this.c, this.d), anii.i(anlz.q(vljVar.a), this.e, anjk.a), vljVar.g, vljVar.h);
            amuk amukVar = vljVar.d;
            if (!amukVar.isEmpty()) {
                vneVar2.c(vlh.b(amukVar, this.c));
            }
            this.a.put(uri, vneVar2);
            this.b.put(uri, vljVar);
            vneVar = vneVar2;
        } else {
            aqxo.u(vljVar.equals((vlj) this.b.get(uri)), "Arguments must match previous call for Uri: %s", uri);
        }
        return vneVar;
    }
}

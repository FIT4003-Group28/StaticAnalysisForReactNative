package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends bqb {
    @Override // defpackage.bqb
    public final bpx a(List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap2.putAll(((bpx) it.next()).c());
        }
        bpd.b(hashMap2, hashMap);
        return bpd.a(hashMap);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defx  reason: default package */
/* loaded from: classes.dex */
public final class defx<V> extends defz<V, List<V>> {
    public defx(dccr<? extends dehn<? extends V>> dccrVar, boolean z) {
        super(dccrVar, z);
        d();
    }

    @Override // defpackage.defz
    public final /* bridge */ /* synthetic */ Object t(List list) {
        ArrayList f = dchl.f(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            defy defyVar = (defy) it.next();
            f.add(defyVar != null ? defyVar.a : null);
        }
        return Collections.unmodifiableList(f);
    }
}

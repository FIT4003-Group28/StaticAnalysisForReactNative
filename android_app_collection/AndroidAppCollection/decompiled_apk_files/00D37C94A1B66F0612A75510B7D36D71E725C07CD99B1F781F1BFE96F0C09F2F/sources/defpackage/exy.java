package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: exy  reason: default package */
/* loaded from: classes3.dex */
public final class exy implements aafo {
    public WeakReference a;

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        WeakReference weakReference = this.a;
        aafo aafoVar = weakReference != null ? (aafo) weakReference.get() : null;
        if (aafoVar == null) {
            String valueOf = String.valueOf(apzgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Attempting to route command without a resolver ");
            sb.append(valueOf);
            afus.b(1, 1, sb.toString());
            return;
        }
        aafoVar.c(apzgVar, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: gnq  reason: default package */
/* loaded from: classes3.dex */
public final class gnq implements aafo {
    private final Context a;
    private final Set b;

    public gnq(Context context, Set set) {
        this.a = context;
        this.b = set;
    }

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
        if (aafp.a(apzgVar) == null || !this.b.contains(aafp.a(apzgVar).getClass())) {
            afus.b(2, 5, "Command not supported when delegating to WWA");
            return;
        }
        Intent d = etk.d(this.a);
        d.putExtra("navigation_endpoint", apzgVar.toByteArray());
        this.a.startActivity(d);
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

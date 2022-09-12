package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hya  reason: default package */
/* loaded from: classes6.dex */
public abstract class hya implements hxy {
    public static hxz f(cqhn cqhnVar) {
        hxq hxqVar = new hxq();
        if (cqhnVar != null) {
            hxqVar.b = cqhnVar;
            hxqVar.a = cqrp.f(10.0d);
            hxqVar.d(null);
            return hxqVar;
        }
        throw new NullPointerException("Null curvularBinder");
    }

    @Override // defpackage.hxy
    @dzsi
    public abstract CharSequence b();

    @Override // defpackage.hxy
    public abstract cqtv c();

    public abstract cqhn d();

    @Override // defpackage.hxy
    @dzsi
    public Integer e() {
        View o = cqkx.o(this);
        if (o == null) {
            return null;
        }
        return Integer.valueOf(o.getWidth());
    }
}

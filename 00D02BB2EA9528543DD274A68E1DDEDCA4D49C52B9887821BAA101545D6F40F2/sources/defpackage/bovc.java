package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bovc  reason: default package */
/* loaded from: classes3.dex */
public final class bovc implements bvwz {
    public final gga a;
    public final dxio<begg> b;

    public bovc(Activity activity, dxio<begg> dxioVar) {
        this.a = gga.L(activity);
        this.b = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bovb(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.ops";
    }
}

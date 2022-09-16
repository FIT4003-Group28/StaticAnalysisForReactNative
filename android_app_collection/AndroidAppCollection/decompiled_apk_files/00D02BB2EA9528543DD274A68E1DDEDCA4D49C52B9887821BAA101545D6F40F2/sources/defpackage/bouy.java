package defpackage;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bouy  reason: default package */
/* loaded from: classes3.dex */
public final class bouy implements bvwz {
    public final gga a;
    @dzsi
    public final bwrs<ilo> b;

    public bouy(Activity activity) {
        this.a = gga.L(activity);
        this.b = null;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new boux(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        if (!(obj instanceof bomv)) {
            return null;
        }
        deig d = deig.d();
        bomv bomvVar = (bomv) obj;
        akqq a = bomvVar.a();
        HashMap hashMap = new HashMap();
        hashMap.put("lat", Double.valueOf(a.a));
        hashMap.put("lng", Double.valueOf(a.b));
        if (bomvVar.b() != null) {
            bomn b = bomvVar.b();
            dbsk.s(b);
            hashMap.put("address", b.a);
        }
        d.j(hashMap);
        return d;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.llp";
    }

    public bouy(Activity activity, bwrs<ilo> bwrsVar) {
        this.a = gga.L(activity);
        this.b = bwrsVar;
    }
}

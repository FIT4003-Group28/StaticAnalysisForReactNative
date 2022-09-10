package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: boul  reason: default package */
/* loaded from: classes3.dex */
public final class boul implements bvwz {
    public final gga a;
    public final cklf b;

    public boul(Activity activity, cklf cklfVar) {
        this.a = gga.L(activity);
        this.b = cklfVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new bouk(this);
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rap.lhs";
    }
}

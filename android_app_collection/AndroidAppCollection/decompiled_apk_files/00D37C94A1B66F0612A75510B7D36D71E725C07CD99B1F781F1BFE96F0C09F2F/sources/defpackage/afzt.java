package defpackage;

import android.content.SharedPreferences;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afzt  reason: default package */
/* loaded from: classes.dex */
public final class afzt implements afzu {
    private final SharedPreferences a;
    private final afvn b;

    public afzt(SharedPreferences sharedPreferences, afvn afvnVar) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = afvnVar;
    }

    @Override // defpackage.afxq
    public final aswe a() {
        return aswe.VISITOR_ID;
    }

    @Override // defpackage.afxq
    public final boolean d() {
        return true;
    }

    @Override // defpackage.afxq
    public final void b(Map map, afye afyeVar) {
        String string;
        if (afyeVar.z()) {
            string = afyeVar.u();
        } else if (this.b.c().g()) {
            string = this.a.getString("incognito_visitor_id", null);
        } else {
            string = this.a.getString("visitor_id", null);
        }
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }
}

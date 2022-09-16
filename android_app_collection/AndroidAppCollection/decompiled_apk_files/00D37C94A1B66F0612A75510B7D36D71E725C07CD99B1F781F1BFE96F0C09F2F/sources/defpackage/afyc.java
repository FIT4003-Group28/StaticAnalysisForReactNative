package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afyc  reason: default package */
/* loaded from: classes.dex */
public final class afyc implements afxq {
    public afyc(Context context, afsu afsuVar) {
        context.getClass();
        afsuVar.getClass();
    }

    @Override // defpackage.afxq
    public final aswe a() {
        return aswe.PLUS_PAGE_ID;
    }

    @Override // defpackage.afxq
    public final void b(Map map, afye afyeVar) {
        aqxo.y(zgt.m(afyeVar.g()));
        afvm e = afyeVar.e();
        if (e.w()) {
            map.put("X-Goog-PageId", e.e());
        }
    }

    @Override // defpackage.afxq
    public final boolean d() {
        return true;
    }
}

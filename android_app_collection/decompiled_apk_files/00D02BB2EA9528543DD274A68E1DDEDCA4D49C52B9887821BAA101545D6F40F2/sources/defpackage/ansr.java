package defpackage;

import android.webkit.URLUtil;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ansr  reason: default package */
/* loaded from: classes2.dex */
final class ansr implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ anss a;

    public ansr(anss anssVar) {
        this.a = anssVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (map2 == null || !map2.containsKey("ouit_url") || !(map2.get("ouit_url") instanceof String) || !URLUtil.isNetworkUrl((String) map2.get("ouit_url"))) {
            bvoo.h("stringObjectMap must contain %s as a valid network URL of type String, but got: %s", "ouit_url", map2);
        } else {
            String str = (String) map2.get("ouit_url");
            dbsk.s(str);
            this.a.b.a().r(str, 4);
        }
        return bvwy.a;
    }
}

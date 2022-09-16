package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csdj  reason: default package */
/* loaded from: classes5.dex */
public final class csdj {
    public final Map<String, String> a = new HashMap();
    public final Map<String, String> b = new HashMap();

    public csdj(String str) {
        b("site_id", str);
        b("survey_url", "https://www.google.com/insights/consumersurveys/async_survey");
        b("locale", "en-US");
    }

    public final String a(String str) {
        return this.a.get(str);
    }

    public final void b(String str, String str2) {
        this.a.put(str, str2);
    }
}

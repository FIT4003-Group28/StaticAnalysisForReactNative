package defpackage;

import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adkn  reason: default package */
/* loaded from: classes.dex */
public final class adkn {
    public static final String a;
    public final JSONObject b;
    public final int c;

    static {
        String valueOf = String.valueOf(adkn.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adkn(JSONObject jSONObject, int i) {
        this.b = jSONObject;
        this.c = i;
    }
}

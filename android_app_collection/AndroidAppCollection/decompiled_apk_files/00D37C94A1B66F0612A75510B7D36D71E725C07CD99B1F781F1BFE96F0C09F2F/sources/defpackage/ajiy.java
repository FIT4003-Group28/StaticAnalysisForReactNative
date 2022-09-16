package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ajiy  reason: default package */
/* loaded from: classes.dex */
public final class ajiy {
    private final String a;
    private final Object b = new Object();
    private final Random c;
    private volatile Map d;
    private volatile Map e;

    public ajiy(String str, Random random) {
        this.a = str;
        this.c = random;
    }

    public final boolean a(thq thqVar) {
        if (this.d == null || this.e == null) {
            synchronized (this.b) {
                if (this.d == null) {
                    String str = this.a;
                    HashMap hashMap = new HashMap();
                    if (str != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = jSONObject.get(next);
                                if (obj instanceof Double) {
                                    hashMap.put(akzj.g(next), Float.valueOf(((Double) obj).floatValue()));
                                } else if (obj instanceof Integer) {
                                    hashMap.put(akzj.g(next), Float.valueOf(((Integer) obj).floatValue()));
                                }
                            }
                        } catch (JSONException e) {
                            afus.c(2, 23, "Error parsing ElementsPerformanceMetricSubSampleRateJsonConfig", e);
                        }
                    }
                    this.d = hashMap;
                }
                if (this.e == null) {
                    this.e = new HashMap();
                }
            }
        }
        String g = akzj.g(thqVar.m);
        Float f = (Float) this.d.get(g);
        boolean z = false;
        if (f == null || f.floatValue() > 1.0f) {
            return true;
        }
        if (f.floatValue() == 0.0f) {
            return false;
        }
        Float f2 = (Float) this.e.get(g);
        if (f2 == null) {
            f2 = Float.valueOf(this.c.nextFloat());
        }
        Float valueOf = Float.valueOf(f2.floatValue() + f.floatValue());
        if (valueOf.floatValue() >= 1.0f) {
            valueOf = Float.valueOf(valueOf.floatValue() - 1.0f);
            z = true;
        }
        this.e.put(g, valueOf);
        return z;
    }
}

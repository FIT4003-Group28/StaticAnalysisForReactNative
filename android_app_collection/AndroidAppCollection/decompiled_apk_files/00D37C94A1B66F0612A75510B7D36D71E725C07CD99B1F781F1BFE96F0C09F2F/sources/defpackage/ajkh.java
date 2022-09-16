package defpackage;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajkh  reason: default package */
/* loaded from: classes.dex */
public final class ajkh {
    public final String a;
    private final Object b;
    private final ajkf c;
    private final amup d;

    private ajkh(String str, Object obj, ajkf ajkfVar, amup amupVar) {
        this.a = str;
        this.b = obj;
        this.c = ajkfVar;
        this.d = amupVar;
    }

    public static ajkh c(String str, Object obj, ajkf ajkfVar) {
        return new ajkh(str, obj, ajkfVar, null);
    }

    public static ajkh d(String str, Object obj, ajkf ajkfVar, amup amupVar) {
        return new ajkh(str, obj, ajkfVar, amupVar);
    }

    private final void e(Object obj, Object obj2) {
        this.c.a(obj, obj2);
    }

    public final void a(Object obj) {
        this.c.a(obj, this.b);
    }

    public final void b(JSONObject jSONObject, Object obj, String str) {
        String valueOf = String.valueOf(str);
        String str2 = this.a;
        String concat = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
        if (!jSONObject.has(concat)) {
            return;
        }
        amup amupVar = this.d;
        if (amupVar != null) {
            Object obj2 = amupVar.get(jSONObject.getString(concat));
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder("null".length() + 22);
                sb.append("Invalid mapped value: ");
                sb.append("null");
                throw new ajkg(sb.toString());
            }
            e(obj, obj2);
            return;
        }
        Object obj3 = this.b;
        if (obj3 instanceof String) {
            e(obj, jSONObject.getString(concat));
        } else if (obj3 instanceof Integer) {
            e(obj, Integer.valueOf(jSONObject.getInt(concat)));
        } else if (obj3 instanceof Long) {
            e(obj, Long.valueOf(jSONObject.getLong(concat)));
        } else if (obj3 instanceof Float) {
            e(obj, Float.valueOf((float) jSONObject.getDouble(concat)));
        } else if (obj3 instanceof Double) {
            e(obj, Double.valueOf(jSONObject.getDouble(concat)));
        } else if (!(obj3 instanceof Boolean)) {
        } else {
            e(obj, Boolean.valueOf(jSONObject.getBoolean(concat)));
        }
    }
}

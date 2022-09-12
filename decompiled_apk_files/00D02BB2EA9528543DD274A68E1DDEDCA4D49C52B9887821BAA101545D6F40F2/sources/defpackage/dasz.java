package defpackage;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dasz  reason: default package */
/* loaded from: classes5.dex */
public abstract class dasz {
    private final void r(boolean z, Object obj) {
        boolean z2;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (daub.b(obj)) {
            g();
        } else if (obj instanceof String) {
            h((String) obj);
        } else {
            boolean z3 = true;
            if (obj instanceof Number) {
                if (z) {
                    h(obj.toString());
                } else if (obj instanceof BigDecimal) {
                    o((BigDecimal) obj);
                } else if (obj instanceof BigInteger) {
                    l((BigInteger) obj);
                } else if (obj instanceof Long) {
                    k(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    float floatValue = ((Number) obj).floatValue();
                    if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                        z3 = false;
                    }
                    dbsk.a(z3);
                    m(floatValue);
                } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    j(((Number) obj).intValue());
                } else {
                    double doubleValue = ((Number) obj).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        z3 = false;
                    }
                    dbsk.a(z3);
                    n(doubleValue);
                }
            } else if (obj instanceof Boolean) {
                i(((Boolean) obj).booleanValue());
            } else if (obj instanceof daug) {
                h(((daug) obj).a());
            } else if ((obj instanceof Iterable) || cls.isArray()) {
                b();
                for (Object obj2 : dava.l(obj)) {
                    r(z, obj2);
                }
                c();
            } else if (cls.isEnum()) {
                String str = dauh.a((Enum) obj).c;
                if (str == null) {
                    g();
                } else {
                    h(str);
                }
            } else {
                d();
                boolean z4 = (obj instanceof Map) && !(obj instanceof daul);
                daty a = z4 ? null : daty.a(cls);
                for (Map.Entry<String, Object> entry : daub.c(obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String key = entry.getKey();
                        if (z4) {
                            z2 = z;
                        } else {
                            dauh c = a.c(key);
                            Field field = c == null ? null : c.b;
                            z2 = (field == null || field.getAnnotation(datf.class) == null) ? false : true;
                        }
                        f(key);
                        r(z2, value);
                    }
                }
                e();
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f(String str);

    public abstract void g();

    public abstract void h(String str);

    public abstract void i(boolean z);

    public abstract void j(int i);

    public abstract void k(long j);

    public abstract void l(BigInteger bigInteger);

    public abstract void m(float f);

    public abstract void n(double d);

    public abstract void o(BigDecimal bigDecimal);

    public final void p(Object obj) {
        r(false, obj);
    }

    public void q() {
        throw null;
    }
}

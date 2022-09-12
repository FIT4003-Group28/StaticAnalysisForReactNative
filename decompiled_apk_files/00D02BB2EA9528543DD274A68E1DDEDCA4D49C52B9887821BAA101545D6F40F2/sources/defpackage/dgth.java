package defpackage;

import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: dgth  reason: default package */
/* loaded from: classes6.dex */
public final class dgth extends dgtc {
    private static final Class<?>[] b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    public Object a;

    public dgth(Boolean bool) {
        a(bool);
    }

    private static boolean k(dgth dgthVar) {
        Object obj = dgthVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    final void a(Object obj) {
        if (obj instanceof Character) {
            this.a = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = false;
        if (!(obj instanceof Number) && !(obj instanceof String)) {
            Class<?> cls = obj.getClass();
            Class<?>[] clsArr = b;
            for (int i = 0; i < 16; i++) {
                if (!clsArr[i].isAssignableFrom(cls)) {
                }
            }
            dgtr.a(z);
            this.a = obj;
        }
        z = true;
        dgtr.a(z);
        this.a = obj;
    }

    public final boolean b() {
        return this.a instanceof Boolean;
    }

    @Override // defpackage.dgtc
    public final String c() {
        if (i()) {
            return j().toString();
        }
        if (b()) {
            return g().toString();
        }
        return (String) this.a;
    }

    @Override // defpackage.dgtc
    public final int d() {
        return i() ? j().intValue() : Integer.parseInt(c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dgth dgthVar = (dgth) obj;
        if (this.a == null) {
            return dgthVar.a == null;
        } else if (k(this) && k(dgthVar)) {
            return j().longValue() == dgthVar.j().longValue();
        } else {
            Object obj2 = this.a;
            if (!(obj2 instanceof Number) || !(dgthVar.a instanceof Number)) {
                return obj2.equals(dgthVar.a);
            }
            double doubleValue = j().doubleValue();
            double doubleValue2 = dgthVar.j().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
    }

    final Boolean g() {
        return (Boolean) this.a;
    }

    public final boolean h() {
        if (b()) {
            return g().booleanValue();
        }
        return Boolean.parseBoolean(c());
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (k(this)) {
            doubleToLongBits = j().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(j().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean i() {
        return this.a instanceof Number;
    }

    public final Number j() {
        Object obj = this.a;
        return obj instanceof String ? new dgun((String) obj) : (Number) obj;
    }

    public dgth(Number number) {
        a(number);
    }

    public dgth(String str) {
        a(str);
    }
}

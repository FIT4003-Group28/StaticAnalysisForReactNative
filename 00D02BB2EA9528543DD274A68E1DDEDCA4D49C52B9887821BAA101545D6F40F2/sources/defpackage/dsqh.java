package defpackage;

import defpackage.dsqu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsqh  reason: default package */
/* loaded from: classes.dex */
public final class dsqh<T extends dsqu> {
    public static final dsqh d = new dsqh(null);
    final dstl<T, Object> a = dstl.a(16);
    public boolean b;
    public boolean c;

    private dsqh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(dspp dsppVar, dsur dsurVar, int i, Object obj) {
        if (dsurVar != dsur.GROUP) {
            dsppVar.aB(i, dsurVar.t);
            dsus dsusVar = dsus.INT;
            switch (dsurVar.ordinal()) {
                case 0:
                    dsppVar.M(((Double) obj).doubleValue());
                    return;
                case 1:
                    dsppVar.L(((Float) obj).floatValue());
                    return;
                case 2:
                    dsppVar.u(((Long) obj).longValue());
                    return;
                case 3:
                    dsppVar.u(((Long) obj).longValue());
                    return;
                case 4:
                    dsppVar.r(((Integer) obj).intValue());
                    return;
                case 5:
                    dsppVar.v(((Long) obj).longValue());
                    return;
                case 6:
                    dsppVar.t(((Integer) obj).intValue());
                    return;
                case 7:
                    dsppVar.q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof dspd) {
                        dsppVar.l((dspd) obj);
                        return;
                    } else {
                        dsppVar.x((String) obj);
                        return;
                    }
                case 9:
                    dsppVar.ap((dssj) obj);
                    return;
                case 10:
                    dsppVar.p((dssj) obj);
                    return;
                case 11:
                    if (obj instanceof dspd) {
                        dsppVar.l((dspd) obj);
                        return;
                    } else {
                        dsppVar.N((byte[]) obj);
                        return;
                    }
                case 12:
                    dsppVar.s(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof dsrb) {
                        dsppVar.r(((dsrb) obj).a());
                        return;
                    } else {
                        dsppVar.r(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    dsppVar.t(((Integer) obj).intValue());
                    return;
                case 15:
                    dsppVar.v(((Long) obj).longValue());
                    return;
                case 16:
                    dsppVar.J(((Integer) obj).intValue());
                    return;
                case 17:
                    dsppVar.K(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        dssj dssjVar = (dssj) obj;
        dsrk.j(dssjVar);
        dsppVar.aB(i, 3);
        dsppVar.ap(dssjVar);
        dsppVar.aB(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(dsur dsurVar, int i, Object obj) {
        int Y = dspp.Y(i);
        if (dsurVar == dsur.GROUP) {
            dsrk.j((dssj) obj);
            Y += Y;
        }
        return Y + j(dsurVar, obj);
    }

    static int j(dsur dsurVar, Object obj) {
        dsur dsurVar2 = dsur.DOUBLE;
        dsus dsusVar = dsus.INT;
        switch (dsurVar.ordinal()) {
            case 0:
                Double d2 = (Double) obj;
                boolean z = dspp.e;
                return 8;
            case 1:
                Float f = (Float) obj;
                boolean z2 = dspp.e;
                return 4;
            case 2:
                return dspp.ac(((Long) obj).longValue());
            case 3:
                return dspp.ac(((Long) obj).longValue());
            case 4:
                return dspp.Z(((Integer) obj).intValue());
            case 5:
                Long l = (Long) obj;
                boolean z3 = dspp.e;
                return 8;
            case 6:
                Integer num = (Integer) obj;
                boolean z4 = dspp.e;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                boolean z5 = dspp.e;
                return 1;
            case 8:
                if (obj instanceof dspd) {
                    return dspp.ag((dspd) obj);
                }
                return dspp.ae((String) obj);
            case 9:
                return dspp.ar((dssj) obj);
            case 10:
                if (obj instanceof dsrq) {
                    return dspp.af((dsrq) obj);
                }
                return dspp.ai((dssj) obj);
            case 11:
                if (obj instanceof dspd) {
                    return dspp.ag((dspd) obj);
                }
                return dspp.ah((byte[]) obj);
            case 12:
                return dspp.aa(((Integer) obj).intValue());
            case 13:
                if (obj instanceof dsrb) {
                    return dspp.Z(((dsrb) obj).a());
                }
                return dspp.Z(((Integer) obj).intValue());
            case 14:
                Integer num2 = (Integer) obj;
                boolean z6 = dspp.e;
                return 4;
            case 15:
                Long l2 = (Long) obj;
                boolean z7 = dspp.e;
                return 8;
            case 16:
                return dspp.ab(((Integer) obj).intValue());
            case 17:
                return dspp.ad(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int o(dsqu dsquVar, Object obj) {
        dsur dsurVar = dsquVar.c;
        int i = dsquVar.b;
        if (dsquVar.d) {
            int i2 = 0;
            if (dsquVar.e) {
                for (Object obj2 : (List) obj) {
                    i2 += j(dsurVar, obj2);
                }
                return dspp.Y(i) + i2 + dspp.aa(i2);
            }
            for (Object obj3 : (List) obj) {
                i2 += i(dsurVar, i, obj3);
            }
            return i2;
        }
        return i(dsurVar, i, obj);
    }

    private static <T extends dsqu> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.a() == dsus.MESSAGE) {
            if (key.d) {
                for (dssj dssjVar : (List) entry.getValue()) {
                    if (!dssjVar.Qv()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof dssj) {
                    if (!((dssj) value).Qv()) {
                        return false;
                    }
                } else if (value instanceof dsrq) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static Object q(Object obj) {
        if (obj instanceof dsso) {
            return ((dsso) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(defpackage.dsur r1, java.lang.Object r2) {
        /*
            defpackage.dsrk.h(r2)
            dsur r0 = defpackage.dsur.DOUBLE
            dsus r0 = defpackage.dsus.INT
            dsus r1 = r1.s
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L23;
                case 7: goto L1a;
                case 8: goto L11;
                default: goto L10;
            }
        L10:
            goto L40
        L11:
            boolean r1 = r2 instanceof defpackage.dssj
            if (r1 != 0) goto L3f
            boolean r1 = r2 instanceof defpackage.dsrq
            if (r1 == 0) goto L40
            goto L3f
        L1a:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L3f
            boolean r1 = r2 instanceof defpackage.dsrb
            if (r1 == 0) goto L40
            goto L3f
        L23:
            boolean r1 = r2 instanceof defpackage.dspd
            if (r1 != 0) goto L3f
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L40
            goto L3f
        L2c:
            boolean r1 = r2 instanceof java.lang.String
            goto L3d
        L2f:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L3d
        L32:
            boolean r1 = r2 instanceof java.lang.Double
            goto L3d
        L35:
            boolean r1 = r2 instanceof java.lang.Float
            goto L3d
        L38:
            boolean r1 = r2 instanceof java.lang.Long
            goto L3d
        L3b:
            boolean r1 = r2 instanceof java.lang.Integer
        L3d:
            if (r1 == 0) goto L40
        L3f:
            return
        L40:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsqh.r(dsur, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isEmpty();
    }

    public final void b() {
        Map map;
        Map map2;
        if (this.b) {
            return;
        }
        dstl<T, Object> dstlVar = this.a;
        if (!dstlVar.c) {
            for (int i = 0; i < dstlVar.b(); i++) {
                Map.Entry<T, Object> c = dstlVar.c(i);
                if (c.getKey().d) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry<T, Object> entry : dstlVar.d()) {
                if (entry.getKey().d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!dstlVar.c) {
            if (dstlVar.b.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(dstlVar.b);
            }
            dstlVar.b = map;
            if (dstlVar.d.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(dstlVar.d);
            }
            dstlVar.d = map2;
            dstlVar.c = true;
        }
        this.b = true;
    }

    /* renamed from: c */
    public final dsqh<T> clone() {
        dsqh<T> dsqhVar = new dsqh<>();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry<T, Object> c = this.a.c(i);
            dsqhVar.m(c.getKey(), c.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.d()) {
            dsqhVar.m(entry.getKey(), entry.getValue());
        }
        dsqhVar.c = this.c;
        return dsqhVar;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        if (this.c) {
            return new dsrp(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean e() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!p(this.a.c(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.d()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dsqh) {
            return this.a.equals(((dsqh) obj).a);
        }
        return false;
    }

    public final void f(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof dsrq) {
            dsrq dsrqVar = (dsrq) value;
            throw null;
        } else if (key.d) {
            Object l = l(key);
            if (l == null) {
                l = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) l).add(q(obj));
            }
            this.a.put(key, l);
        } else if (key.a() == dsus.MESSAGE) {
            Object l2 = l(key);
            if (l2 == null) {
                this.a.put(key, q(value));
            } else if (l2 instanceof dsso) {
                dsso dssoVar = (dsso) l2;
                dsso dssoVar2 = (dsso) value;
                throw new UnsupportedOperationException();
            } else {
                dsqp dsqpVar = (dsqp) ((dssj) l2).Nn();
                dsqpVar.bC((dsqw) ((dssj) value));
                this.a.put(key, dsqpVar.bK());
            }
        } else {
            this.a.put(key, q(value));
        }
    }

    public final int h(Map.Entry<T, Object> entry) {
        int P;
        int Y;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.a() != dsus.MESSAGE || key.d || key.e) {
            return o(key, value);
        }
        if (value instanceof dsrq) {
            int i = entry.getKey().b;
            int Y2 = dspp.Y(1);
            P = Y2 + Y2 + dspp.P(2, i);
            Y = dspp.X(3, (dsrq) value);
        } else {
            int i2 = entry.getKey().b;
            int Y3 = dspp.Y(1);
            P = Y3 + Y3 + dspp.P(2, i2);
            Y = dspp.Y(3) + dspp.ai((dssj) value);
        }
        return P + Y;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean k(T t) {
        if (!t.d) {
            return this.a.get(t) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final Object l(T t) {
        Object obj = this.a.get(t);
        if (!(obj instanceof dsrq)) {
            return obj;
        }
        dsrq dsrqVar = (dsrq) obj;
        throw null;
    }

    public final void n(T t, Object obj) {
        List list;
        if (t.d) {
            r(t.c, obj);
            Object l = l(t);
            if (l == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) l;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    private dsqh(byte[] bArr) {
        b();
        b();
    }

    public final void m(T t, Object obj) {
        if (!t.d) {
            r(t.c, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                r(t.c, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof dsrq) {
            this.c = true;
        }
        this.a.put(t, obj);
    }
}

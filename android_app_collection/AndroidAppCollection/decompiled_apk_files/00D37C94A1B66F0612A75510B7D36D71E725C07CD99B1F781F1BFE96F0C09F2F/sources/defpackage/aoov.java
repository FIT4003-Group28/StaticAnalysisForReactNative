package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aoov  reason: default package */
/* loaded from: classes.dex */
public final class aoov {
    public static final aoov a = new aoov(null);
    public final aoru b = aoru.b(16);
    public boolean c;
    public boolean d;

    private aoov() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aosj aosjVar, int i, Object obj) {
        int ac = aool.ac(i);
        if (aosjVar == aosj.GROUP) {
            aopv.j((aoqu) obj);
            ac += ac;
        }
        return ac + b(aosjVar, obj);
    }

    static int b(aosj aosjVar, Object obj) {
        aosj aosjVar2 = aosj.DOUBLE;
        aosk aoskVar = aosk.INT;
        switch (aosjVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                boolean z = aool.e;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                boolean z2 = aool.e;
                return 4;
            case 2:
                return aool.ag(((Long) obj).longValue());
            case 3:
                return aool.ag(((Long) obj).longValue());
            case 4:
                return aool.O(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                boolean z3 = aool.e;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                boolean z4 = aool.e;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                boolean z5 = aool.e;
                return 1;
            case 8:
                if (obj instanceof aoob) {
                    return aool.J((aoob) obj);
                }
                return aool.ab((String) obj);
            case 9:
                return aool.M((aoqu) obj);
            case 10:
                if (obj instanceof aoqc) {
                    return aool.R((aoqc) obj);
                }
                return aool.T((aoqu) obj);
            case 11:
                if (obj instanceof aoob) {
                    return aool.J((aoob) obj);
                }
                return aool.H((byte[]) obj);
            case 12:
                return aool.ae(((Integer) obj).intValue());
            case 13:
                if (obj instanceof aopm) {
                    return aool.O(((aopm) obj).getNumber());
                }
                return aool.O(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                boolean z6 = aool.e;
                return 4;
            case 15:
                ((Long) obj).longValue();
                boolean z7 = aool.e;
                return 8;
            case 16:
                return aool.X(((Integer) obj).intValue());
            case 17:
                return aool.Z(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(aool aoolVar, aosj aosjVar, int i, Object obj) {
        if (aosjVar != aosj.GROUP) {
            aoolVar.B(i, aosjVar.t);
            aosk aoskVar = aosk.INT;
            switch (aosjVar.ordinal()) {
                case 0:
                    aoolVar.aq(((Double) obj).doubleValue());
                    return;
                case 1:
                    aoolVar.as(((Float) obj).floatValue());
                    return;
                case 2:
                    aoolVar.F(((Long) obj).longValue());
                    return;
                case 3:
                    aoolVar.F(((Long) obj).longValue());
                    return;
                case 4:
                    aoolVar.u(((Integer) obj).intValue());
                    return;
                case 5:
                    aoolVar.s(((Long) obj).longValue());
                    return;
                case 6:
                    aoolVar.q(((Integer) obj).intValue());
                    return;
                case 7:
                    aoolVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof aoob) {
                        aoolVar.o((aoob) obj);
                        return;
                    } else {
                        aoolVar.A((String) obj);
                        return;
                    }
                case 9:
                    aoolVar.at((aoqu) obj);
                    return;
                case 10:
                    aoolVar.w((aoqu) obj);
                    return;
                case 11:
                    if (obj instanceof aoob) {
                        aoolVar.o((aoob) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    aoolVar.G(bArr, bArr.length);
                    return;
                case 12:
                    aoolVar.D(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof aopm) {
                        aoolVar.u(((aopm) obj).getNumber());
                        return;
                    } else {
                        aoolVar.u(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    aoolVar.q(((Integer) obj).intValue());
                    return;
                case 15:
                    aoolVar.s(((Long) obj).longValue());
                    return;
                case 16:
                    aoolVar.av(((Integer) obj).intValue());
                    return;
                case 17:
                    aoolVar.ax(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        aoqu aoquVar = (aoqu) obj;
        aopv.j(aoquVar);
        aoolVar.B(i, 3);
        aoolVar.at(aoquVar);
        aoolVar.B(i, 4);
    }

    public static int k(aopf aopfVar, Object obj) {
        aosj aosjVar = aopfVar.c;
        int i = aopfVar.b;
        if (aopfVar.d) {
            int i2 = 0;
            if (aopfVar.e) {
                for (Object obj2 : (List) obj) {
                    i2 += b(aosjVar, obj2);
                }
                return aool.ac(i) + i2 + aool.ae(i2);
            }
            for (Object obj3 : (List) obj) {
                i2 += a(aosjVar, i, obj3);
            }
            return i2;
        }
        return a(aosjVar, i, obj);
    }

    private static Object o(Object obj) {
        if (obj instanceof aoqy) {
            return ((aoqy) obj).a();
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

    private static boolean p(Map.Entry entry) {
        aopf aopfVar = (aopf) entry.getKey();
        if (aopfVar.a() == aosk.MESSAGE) {
            if (aopfVar.d) {
                for (aoqu aoquVar : (List) entry.getValue()) {
                    if (!aoquVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof aoqu) {
                    if (!((aoqu) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof aoqc) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(defpackage.aopf r4, java.lang.Object r5) {
        /*
            aosj r0 = r4.c
            defpackage.aopv.h(r5)
            aosj r1 = defpackage.aosj.DOUBLE
            aosk r1 = defpackage.aosk.INT
            aosk r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r0 = r5 instanceof defpackage.aoqu
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.aoqc
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.aopm
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof defpackage.aoob
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            aosj r4 = r4.c
            aosk r4 = r4.s
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoov.q(aopf, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int ad;
        int ac;
        aopf aopfVar = (aopf) entry.getKey();
        Object value = entry.getValue();
        if (aopfVar.a() != aosk.MESSAGE || aopfVar.d || aopfVar.e) {
            return k(aopfVar, value);
        }
        if (value instanceof aoqc) {
            int i = ((aopf) entry.getKey()).b;
            int ac2 = aool.ac(1);
            ad = ac2 + ac2 + aool.ad(2, i);
            ac = aool.Q(3, (aoqc) value);
        } else {
            int i2 = ((aopf) entry.getKey()).b;
            int ac3 = aool.ac(1);
            ad = ac3 + ac3 + aool.ad(2, i2);
            ac = aool.ac(3) + aool.T((aoqu) value);
        }
        return ad + ac;
    }

    /* renamed from: d */
    public final aoov clone() {
        aoov aoovVar = new aoov();
        for (int i = 0; i < this.b.a(); i++) {
            Map.Entry f = this.b.f(i);
            aoovVar.n((aopf) f.getKey(), f.getValue());
        }
        for (Map.Entry entry : this.b.c()) {
            aoovVar.n((aopf) entry.getKey(), entry.getValue());
        }
        aoovVar.d = this.d;
        return aoovVar;
    }

    public final Iterator e() {
        if (this.d) {
            return new aoqb(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aoov) {
            return this.b.equals(((aoov) obj).b);
        }
        return false;
    }

    public final void f() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.c) {
            return;
        }
        aoru aoruVar = this.b;
        if (!aoruVar.c) {
            for (int i = 0; i < aoruVar.a(); i++) {
                Map.Entry f = aoruVar.f(i);
                if (((aopf) f.getKey()).d) {
                    f.setValue(Collections.unmodifiableList((List) f.getValue()));
                }
            }
            for (Map.Entry entry : aoruVar.c()) {
                if (((aopf) entry.getKey()).d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!aoruVar.c) {
            if (aoruVar.b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(aoruVar.b);
            }
            aoruVar.b = unmodifiableMap;
            if (aoruVar.d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(aoruVar.d);
            }
            aoruVar.d = unmodifiableMap2;
            aoruVar.c = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        aopf aopfVar = (aopf) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aoqc) {
            aoqc aoqcVar = (aoqc) value;
            throw null;
        } else if (aopfVar.d) {
            Object l = l(aopfVar);
            if (l == null) {
                l = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) l).add(o(obj));
            }
            this.b.put(aopfVar, l);
        } else if (aopfVar.a() == aosk.MESSAGE) {
            Object l2 = l(aopfVar);
            if (l2 == null) {
                this.b.put(aopfVar, o(value));
            } else if (l2 instanceof aoqy) {
                aoqy aoqyVar = (aoqy) l2;
                aoqy aoqyVar2 = (aoqy) value;
                throw new UnsupportedOperationException();
            } else {
                this.b.put(aopfVar, ((aopa) ((aoqu) l2).mo52toBuilder()).mergeFrom((aopi) ((aoqu) value)).mo39build());
            }
        } else {
            this.b.put(aopfVar, o(value));
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!p(this.b.f(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.b.c()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Object l(aopf aopfVar) {
        Object obj = this.b.get(aopfVar);
        if (!(obj instanceof aoqc)) {
            return obj;
        }
        aoqc aoqcVar = (aoqc) obj;
        throw null;
    }

    public final void n(aopf aopfVar, Object obj) {
        if (aopfVar.d) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q(aopfVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            q(aopfVar, obj);
        }
        if (obj instanceof aoqc) {
            this.d = true;
        }
        this.b.put(aopfVar, obj);
    }

    private aoov(byte[] bArr) {
        f();
        f();
    }

    public final void m(aopf aopfVar, Object obj) {
        List list;
        if (!aopfVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        q(aopfVar, obj);
        Object l = l(aopfVar);
        if (l == null) {
            list = new ArrayList();
            this.b.put(aopfVar, list);
        } else {
            list = (List) l;
        }
        list.add(obj);
    }
}

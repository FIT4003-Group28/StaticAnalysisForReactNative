package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.ay;
import com.google.protobuf.q.a;
import com.google.protobuf.t;
import com.google.protobuf.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
public final class q<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    private static final q f4693d = new q(true);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4695b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4696c = false;

    /* renamed from: a  reason: collision with root package name */
    private final ao<FieldDescriptorType, Object> f4694a = ao.a(16);

    /* compiled from: FieldSet.java */
    /* loaded from: classes.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        ac.a a(ac.a aVar, ac acVar);

        int f();

        ay.b h();

        ay.a k();

        boolean p();

        boolean q();
    }

    private q() {
    }

    private q(boolean z) {
        c();
    }

    public static <T extends a<T>> q<T> a() {
        return new q<>();
    }

    public static <T extends a<T>> q<T> b() {
        return f4693d;
    }

    public void c() {
        if (this.f4695b) {
            return;
        }
        this.f4694a.a();
        this.f4695b = true;
    }

    public boolean d() {
        return this.f4695b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f4694a.equals(((q) obj).f4694a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4694a.hashCode();
    }

    /* renamed from: e */
    public q<FieldDescriptorType> clone() {
        q<FieldDescriptorType> a2 = a();
        for (int i = 0; i < this.f4694a.c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b2 = this.f4694a.b(i);
            a2.a((q<FieldDescriptorType>) b2.getKey(), b2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            a2.a((q<FieldDescriptorType>) entry.getKey(), entry.getValue());
        }
        a2.f4696c = this.f4696c;
        return a2;
    }

    public Map<FieldDescriptorType, Object> f() {
        if (!this.f4696c) {
            return this.f4694a.b() ? this.f4694a : Collections.unmodifiableMap(this.f4694a);
        }
        ao a2 = ao.a(16);
        for (int i = 0; i < this.f4694a.c(); i++) {
            a(a2, this.f4694a.b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            a(a2, entry);
        }
        if (this.f4694a.b()) {
            a2.a();
        }
        return a2;
    }

    private void a(Map<FieldDescriptorType, Object> map, Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof v) {
            map.put(key, ((v) value).a());
        } else {
            map.put(key, value);
        }
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> g() {
        if (this.f4696c) {
            return new v.b(this.f4694a.entrySet().iterator());
        }
        return this.f4694a.entrySet().iterator();
    }

    public boolean a(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.p()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f4694a.get(fielddescriptortype) != null;
    }

    public Object b(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f4694a.get(fielddescriptortype);
        return obj instanceof v ? ((v) obj).a() : obj;
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.p()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                b(fielddescriptortype.k(), obj2);
            }
            obj = arrayList;
        } else {
            b(fielddescriptortype.k(), obj);
        }
        if (obj instanceof v) {
            this.f4696c = true;
        }
        this.f4694a.a((ao<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    public void c(FieldDescriptorType fielddescriptortype) {
        this.f4694a.remove(fielddescriptortype);
        if (this.f4694a.isEmpty()) {
            this.f4696c = false;
        }
    }

    public int d(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.p()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object b2 = b((q<FieldDescriptorType>) fielddescriptortype);
        if (b2 != null) {
            return ((List) b2).size();
        }
        return 0;
    }

    public Object a(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.p()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object b2 = b((q<FieldDescriptorType>) fielddescriptortype);
        if (b2 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) b2).get(i);
    }

    public void b(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.p()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        b(fielddescriptortype.k(), obj);
        Object b2 = b((q<FieldDescriptorType>) fielddescriptortype);
        if (b2 == null) {
            list = new ArrayList();
            this.f4694a.a((ao<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) list);
        } else {
            list = (List) b2;
        }
        list.add(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.protobuf.t.a) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.protobuf.v) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(com.google.protobuf.ay.a r2, java.lang.Object r3) {
        /*
            com.google.protobuf.t.a(r3)
            int[] r0 = com.google.protobuf.q.AnonymousClass1.f4697a
            com.google.protobuf.ay$b r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L42
        L15:
            boolean r2 = r3 instanceof com.google.protobuf.ac
            if (r2 != 0) goto L1d
            boolean r2 = r3 instanceof com.google.protobuf.v
            if (r2 == 0) goto L42
        L1d:
            r1 = 1
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1d
            boolean r2 = r3 instanceof com.google.protobuf.t.a
            if (r2 == 0) goto L42
            goto L1d
        L28:
            boolean r2 = r3 instanceof com.google.protobuf.f
            if (r2 != 0) goto L1d
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L42
            goto L1d
        L31:
            boolean r1 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r1 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r1 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r1 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r1 = r3 instanceof java.lang.Integer
        L42:
            if (r1 != 0) goto L4c
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q.b(com.google.protobuf.ay$a, java.lang.Object):void");
    }

    public boolean h() {
        for (int i = 0; i < this.f4694a.c(); i++) {
            if (!a((Map.Entry) this.f4694a.b(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            if (!a((Map.Entry) entry)) {
                return false;
            }
        }
        return true;
    }

    private boolean a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.h() == ay.b.MESSAGE) {
            if (key.p()) {
                for (ac acVar : (List) entry.getValue()) {
                    if (!acVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof ac) {
                    if (!((ac) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof v) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(ay.a aVar, boolean z) {
        if (z) {
            return 2;
        }
        return aVar.b();
    }

    public void a(q<FieldDescriptorType> qVar) {
        for (int i = 0; i < qVar.f4694a.c(); i++) {
            b(qVar.f4694a.b(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : qVar.f4694a.e()) {
            b(entry);
        }
    }

    private Object a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private void b(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof v) {
            value = ((v) value).a();
        }
        if (key.p()) {
            Object b2 = b((q<FieldDescriptorType>) key);
            if (b2 == null) {
                b2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) b2).add(a(obj));
            }
            this.f4694a.a((ao<FieldDescriptorType, Object>) key, (FieldDescriptorType) b2);
        } else if (key.h() == ay.b.MESSAGE) {
            Object b3 = b((q<FieldDescriptorType>) key);
            if (b3 == null) {
                this.f4694a.a((ao<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
                return;
            }
            this.f4694a.a((ao<FieldDescriptorType, Object>) key, (FieldDescriptorType) key.a(((ac) b3).D(), (ac) value).t());
        } else {
            this.f4694a.a((ao<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
        }
    }

    public void a(h hVar) {
        for (int i = 0; i < this.f4694a.c(); i++) {
            Map.Entry<FieldDescriptorType, Object> b2 = this.f4694a.b(i);
            a((a<?>) b2.getKey(), b2.getValue(), hVar);
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            a((a<?>) entry.getKey(), entry.getValue(), hVar);
        }
    }

    public void b(h hVar) {
        for (int i = 0; i < this.f4694a.c(); i++) {
            a(this.f4694a.b(i), hVar);
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            a(entry, hVar);
        }
    }

    private void a(Map.Entry<FieldDescriptorType, Object> entry, h hVar) {
        FieldDescriptorType key = entry.getKey();
        if (key.h() == ay.b.MESSAGE && !key.p() && !key.q()) {
            Object value = entry.getValue();
            if (value instanceof v) {
                value = ((v) value).a();
            }
            hVar.b(entry.getKey().f(), (ac) value);
            return;
        }
        a((a<?>) key, entry.getValue(), hVar);
    }

    static void a(h hVar, ay.a aVar, int i, Object obj) {
        if (aVar == ay.a.GROUP) {
            hVar.e(i, (ac) obj);
            return;
        }
        hVar.a(i, a(aVar, false));
        a(hVar, aVar, obj);
    }

    static void a(h hVar, ay.a aVar, Object obj) {
        switch (aVar) {
            case DOUBLE:
                hVar.a(((Double) obj).doubleValue());
                return;
            case FLOAT:
                hVar.a(((Float) obj).floatValue());
                return;
            case INT64:
                hVar.a(((Long) obj).longValue());
                return;
            case UINT64:
                hVar.b(((Long) obj).longValue());
                return;
            case INT32:
                hVar.b(((Integer) obj).intValue());
                return;
            case FIXED64:
                hVar.d(((Long) obj).longValue());
                return;
            case FIXED32:
                hVar.e(((Integer) obj).intValue());
                return;
            case BOOL:
                hVar.a(((Boolean) obj).booleanValue());
                return;
            case GROUP:
                hVar.c((ac) obj);
                return;
            case MESSAGE:
                hVar.a((ac) obj);
                return;
            case STRING:
                if (obj instanceof f) {
                    hVar.a((f) obj);
                    return;
                } else {
                    hVar.a((String) obj);
                    return;
                }
            case BYTES:
                if (obj instanceof f) {
                    hVar.a((f) obj);
                    return;
                } else {
                    hVar.b((byte[]) obj);
                    return;
                }
            case UINT32:
                hVar.c(((Integer) obj).intValue());
                return;
            case SFIXED32:
                hVar.f(((Integer) obj).intValue());
                return;
            case SFIXED64:
                hVar.e(((Long) obj).longValue());
                return;
            case SINT32:
                hVar.d(((Integer) obj).intValue());
                return;
            case SINT64:
                hVar.c(((Long) obj).longValue());
                return;
            case ENUM:
                if (obj instanceof t.a) {
                    hVar.g(((t.a) obj).a());
                    return;
                } else {
                    hVar.g(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void a(a<?> aVar, Object obj, h hVar) {
        ay.a k = aVar.k();
        int f = aVar.f();
        if (aVar.p()) {
            List<Object> list = (List) obj;
            if (aVar.q()) {
                hVar.a(f, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += a(k, obj2);
                }
                hVar.q(i);
                for (Object obj3 : list) {
                    a(hVar, k, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                a(hVar, k, f, obj4);
            }
        } else if (obj instanceof v) {
            a(hVar, k, f, ((v) obj).a());
        } else {
            a(hVar, k, f, obj);
        }
    }

    public int i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4694a.c(); i2++) {
            Map.Entry<FieldDescriptorType, Object> b2 = this.f4694a.b(i2);
            i += c(b2.getKey(), b2.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            i += c(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public int j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4694a.c(); i2++) {
            i += c(this.f4694a.b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f4694a.e()) {
            i += c(entry);
        }
        return i;
    }

    private int c(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.h() == ay.b.MESSAGE && !key.p() && !key.q()) {
            if (value instanceof v) {
                return h.b(entry.getKey().f(), (v) value);
            }
            return h.d(entry.getKey().f(), (ac) value);
        }
        return c(key, value);
    }

    static int a(ay.a aVar, int i, Object obj) {
        int h = h.h(i);
        if (aVar == ay.a.GROUP) {
            h *= 2;
        }
        return h + a(aVar, obj);
    }

    static int a(ay.a aVar, Object obj) {
        switch (aVar) {
            case DOUBLE:
                return h.b(((Double) obj).doubleValue());
            case FLOAT:
                return h.b(((Float) obj).floatValue());
            case INT64:
                return h.f(((Long) obj).longValue());
            case UINT64:
                return h.g(((Long) obj).longValue());
            case INT32:
                return h.i(((Integer) obj).intValue());
            case FIXED64:
                return h.i(((Long) obj).longValue());
            case FIXED32:
                return h.l(((Integer) obj).intValue());
            case BOOL:
                return h.b(((Boolean) obj).booleanValue());
            case GROUP:
                return h.d((ac) obj);
            case MESSAGE:
                if (obj instanceof v) {
                    return h.a((v) obj);
                }
                return h.b((ac) obj);
            case STRING:
                if (obj instanceof f) {
                    return h.b((f) obj);
                }
                return h.b((String) obj);
            case BYTES:
                if (obj instanceof f) {
                    return h.b((f) obj);
                }
                return h.c((byte[]) obj);
            case UINT32:
                return h.j(((Integer) obj).intValue());
            case SFIXED32:
                return h.m(((Integer) obj).intValue());
            case SFIXED64:
                return h.j(((Long) obj).longValue());
            case SINT32:
                return h.k(((Integer) obj).intValue());
            case SINT64:
                return h.h(((Long) obj).longValue());
            case ENUM:
                if (obj instanceof t.a) {
                    return h.n(((t.a) obj).a());
                }
                return h.n(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(a<?> aVar, Object obj) {
        ay.a k = aVar.k();
        int f = aVar.f();
        if (aVar.p()) {
            int i = 0;
            if (aVar.q()) {
                for (Object obj2 : (List) obj) {
                    i += a(k, obj2);
                }
                return h.h(f) + i + h.r(i);
            }
            for (Object obj3 : (List) obj) {
                i += a(k, f, obj3);
            }
            return i;
        }
        return a(k, f, obj);
    }
}

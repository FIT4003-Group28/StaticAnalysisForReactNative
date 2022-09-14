package com.google.protobuf;

import com.google.protobuf.ab;
import com.google.protobuf.ag;
import com.google.protobuf.at;
import com.google.protobuf.b;
import com.google.protobuf.j;
import com.google.protobuf.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: AbstractMessage.java */
/* loaded from: classes.dex */
public abstract class a extends com.google.protobuf.b implements ab {
    protected int memoizedSize = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AbstractMessage.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    @Deprecated
    protected static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    @Deprecated
    protected static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.google.protobuf.ad
    public boolean isInitialized() {
        return ag.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ab.a newBuilderForType(b bVar) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public List<String> findInitializationErrors() {
        return ag.b(this);
    }

    public String getInitializationErrorString() {
        return ag.a(findInitializationErrors());
    }

    public boolean hasOneof(j.C0086j c0086j) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public j.f getOneofFieldDescriptor(j.C0086j c0086j) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public final String toString() {
        return ap.a(this);
    }

    @Override // com.google.protobuf.ac
    public void writeTo(h hVar) {
        ag.a((ab) this, getAllFields(), hVar, false);
    }

    @Override // com.google.protobuf.ac
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSize = ag.a(this, getAllFields());
        return this.memoizedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return getDescriptorForType() == abVar.getDescriptorForType() && compareFields(getAllFields(), abVar.getAllFields()) && getUnknownFields().equals(abVar.getUnknownFields());
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i == 0) {
            int hashFields = (hashFields(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = hashFields;
            return hashFields;
        }
        return i;
    }

    private static f toByteString(Object obj) {
        if (obj instanceof byte[]) {
            return f.a((byte[]) obj);
        }
        return (f) obj;
    }

    private static boolean compareBytes(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return toByteString(obj).equals(toByteString(obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        ab abVar = (ab) it.next();
        j.a descriptorForType = abVar.getDescriptorForType();
        j.f a2 = descriptorForType.a("key");
        j.f a3 = descriptorForType.a("value");
        Object field = abVar.getField(a3);
        if (field instanceof j.e) {
            field = Integer.valueOf(((j.e) field).a());
        }
        hashMap.put(abVar.getField(a2), field);
        while (it.hasNext()) {
            ab abVar2 = (ab) it.next();
            Object field2 = abVar2.getField(a3);
            if (field2 instanceof j.e) {
                field2 = Integer.valueOf(((j.e) field2).a());
            }
            hashMap.put(abVar2.getField(a2), field2);
        }
        return hashMap;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return aa.a(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    static boolean compareFields(Map<j.f, Object> map, Map<j.f, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (j.f fVar : map.keySet()) {
            if (!map2.containsKey(fVar)) {
                return false;
            }
            Object obj = map.get(fVar);
            Object obj2 = map2.get(fVar);
            if (fVar.i() == j.f.b.BYTES) {
                if (fVar.p()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!compareBytes(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                    continue;
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (fVar.m()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static int hashMapField(Object obj) {
        return aa.a(convertMapEntryListToMap((List) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int hashFields(int i, Map<j.f, Object> map) {
        for (Map.Entry<j.f, Object> entry : map.entrySet()) {
            j.f key = entry.getKey();
            Object value = entry.getValue();
            int f = (i * 37) + key.f();
            if (key.m()) {
                i = (f * 53) + hashMapField(value);
            } else if (key.i() != j.f.b.ENUM) {
                i = (f * 53) + value.hashCode();
            } else if (key.p()) {
                i = (f * 53) + t.a((List<? extends t.a>) value);
            } else {
                i = (f * 53) + t.a((t.a) value);
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.b
    public as newUninitializedMessageException() {
        return AbstractC0077a.b(this);
    }

    /* compiled from: AbstractMessage.java */
    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0077a<BuilderType extends AbstractC0077a<BuilderType>> extends b.a implements ab.a {
        @Override // com.google.protobuf.b.a
        /* renamed from: a */
        public BuilderType d() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public boolean a(j.C0086j c0086j) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        public j.f b(j.C0086j c0086j) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: a */
        public BuilderType c(ab abVar) {
            if (abVar.getDescriptorForType() != getDescriptorForType()) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            for (Map.Entry<j.f, Object> entry : abVar.getAllFields().entrySet()) {
                j.f key = entry.getKey();
                if (key.p()) {
                    for (Object obj : (List) entry.getValue()) {
                        e(key, obj);
                    }
                } else if (key.g() == j.f.a.MESSAGE) {
                    ab abVar2 = (ab) getField(key);
                    if (abVar2 == abVar2.F()) {
                        f(key, entry.getValue());
                    } else {
                        f(key, abVar2.C().c(abVar2).c((ab) entry.getValue()).s());
                    }
                } else {
                    f(key, entry.getValue());
                }
            }
            a(abVar.getUnknownFields());
            return this;
        }

        @Override // com.google.protobuf.b.a, com.google.protobuf.ac.a
        /* renamed from: a */
        public BuilderType c(g gVar, p pVar) {
            int a2;
            at.a a3 = at.a(getUnknownFields());
            do {
                a2 = gVar.a();
                if (a2 == 0) {
                    break;
                }
            } while (ag.a(gVar, a3, pVar, getDescriptorForType(), new ag.a(this), a2));
            f(a3.t());
            return this;
        }

        public BuilderType a(at atVar) {
            f(at.a(getUnknownFields()).a(atVar).t());
            return this;
        }

        public String toString() {
            return ap.a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static as b(ab abVar) {
            return new as(ag.b(abVar));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.ab.a
        /* renamed from: a */
        public BuilderType c(f fVar, p pVar) {
            return (BuilderType) super.b(fVar, pVar);
        }
    }

    @Deprecated
    protected static int hashEnum(t.a aVar) {
        return aVar.a();
    }

    @Deprecated
    protected static int hashEnumList(List<? extends t.a> list) {
        int i = 1;
        for (t.a aVar : list) {
            i = (i * 31) + hashEnum(aVar);
        }
        return i;
    }
}

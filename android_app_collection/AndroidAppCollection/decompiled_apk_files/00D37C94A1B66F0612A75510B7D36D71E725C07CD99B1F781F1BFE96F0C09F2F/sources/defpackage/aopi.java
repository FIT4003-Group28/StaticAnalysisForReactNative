package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aopi  reason: default package */
/* loaded from: classes.dex */
public abstract class aopi extends aonk {
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    public aory unknownFields = aory.a;
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static aopg checkIsLite(aooq aooqVar) {
        return (aopg) aooqVar;
    }

    private static aopi checkMessageInitialized(aopi aopiVar) {
        if (aopiVar == null || aopiVar.isInitialized()) {
            return aopiVar;
        }
        throw aopiVar.newUninitializedMessageException().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopk emptyBooleanList() {
        return aons.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopl emptyDoubleList() {
        return aoon.b;
    }

    public static aopp emptyFloatList() {
        return aooy.b;
    }

    public static aopq emptyIntList() {
        return aopj.b;
    }

    public static aopt emptyLongList() {
        return aoqj.b;
    }

    public static aopu emptyProtobufList() {
        return aorf.b;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == aory.a) {
            this.unknownFields = aory.c();
        }
    }

    protected static aoou fieldInfo(Field field, int i, aoox aooxVar) {
        return fieldInfo(field, i, aooxVar, false);
    }

    protected static aoou fieldInfoForMap(Field field, int i, Object obj, aopo aopoVar) {
        if (field == null) {
            return null;
        }
        aopv.i(obj, "mapDefaultEntry");
        aoou.b(i);
        aopv.i(field, "field");
        return new aoou(field, i, aoox.MAP, null, null, 0, false, true, null, null, obj, aopoVar);
    }

    protected static aoou fieldInfoForOneofEnum(int i, Object obj, Class cls, aopo aopoVar) {
        if (obj == null) {
            return null;
        }
        return aoou.a(i, aoox.ENUM, (aora) obj, cls, false, aopoVar);
    }

    protected static aoou fieldInfoForOneofMessage(int i, aoox aooxVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return aoou.a(i, aooxVar, (aora) obj, cls, false, null);
    }

    protected static aoou fieldInfoForOneofPrimitive(int i, aoox aooxVar, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        return aoou.a(i, aooxVar, (aora) obj, cls, false, null);
    }

    protected static aoou fieldInfoForOneofString(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        return aoou.a(i, aoox.STRING, (aora) obj, String.class, z, null);
    }

    public static aoou fieldInfoForProto2Optional(Field field, int i, aoox aooxVar, Field field2, int i2, boolean z, aopo aopoVar) {
        if (field == null || field2 == null) {
            return null;
        }
        aoou.b(i);
        aopv.i(field, "field");
        aopv.i(aooxVar, "fieldType");
        aopv.i(field2, "presenceField");
        if (aoou.c(i2)) {
            return new aoou(field, i, aooxVar, null, field2, i2, false, z, null, null, null, aopoVar);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static aoou fieldInfoForProto2Required(Field field, int i, aoox aooxVar, Field field2, int i2, boolean z, aopo aopoVar) {
        if (field == null || field2 == null) {
            return null;
        }
        aoou.b(i);
        aopv.i(field, "field");
        aopv.i(aooxVar, "fieldType");
        aopv.i(field2, "presenceField");
        if (aoou.c(i2)) {
            return new aoou(field, i, aooxVar, null, field2, i2, true, z, null, null, null, aopoVar);
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("presenceMask must have exactly one bit set: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    protected static aoou fieldInfoForRepeatedMessage(Field field, int i, aoox aooxVar, Class cls) {
        if (field == null) {
            return null;
        }
        aoou.b(i);
        aopv.i(field, "field");
        aopv.i(aooxVar, "fieldType");
        aopv.i(cls, "messageClass");
        return new aoou(field, i, aooxVar, cls, null, 0, false, false, null, null, null, null);
    }

    protected static aoou fieldInfoWithEnumVerifier(Field field, int i, aoox aooxVar, aopo aopoVar) {
        if (field == null) {
            return null;
        }
        aoou.b(i);
        aopv.i(field, "field");
        return new aoou(field, i, aooxVar, null, null, 0, false, false, null, null, null, aopoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopi getDefaultInstance(Class cls) {
        aopi aopiVar = (aopi) defaultInstanceMap.get(cls);
        if (aopiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                aopiVar = (aopi) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (aopiVar == null) {
            aopiVar = ((aopi) aosg.h(cls)).mo50getDefaultInstanceForType();
            if (aopiVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, aopiVar);
        }
        return aopiVar;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 45 + String.valueOf(str).length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object[] newFieldInfoArray(int i) {
        return new aoou[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object newMessageInfo(aoqu aoquVar, String str, Object[] objArr) {
        return new aorg(aoquVar, str, objArr);
    }

    protected static aoqr newMessageInfoForMessageSet(aord aordVar, int[] iArr, Object[] objArr, Object obj) {
        return new aorv(aordVar, true, iArr, (aoou[]) objArr, obj);
    }

    protected static aora newOneofInfo(int i, Field field, Field field2) {
        if (field == null || field2 == null) {
            return null;
        }
        return new aora(field, field2);
    }

    public static aopg newRepeatedGeneratedExtension(aoqu aoquVar, aoqu aoquVar2, aopn aopnVar, int i, aosj aosjVar, boolean z, Class cls) {
        return new aopg(aoquVar, Collections.emptyList(), aoquVar2, new aopf(aopnVar, i, aosjVar, true, z));
    }

    public static aopg newSingularGeneratedExtension(aoqu aoquVar, Object obj, aoqu aoquVar2, aopn aopnVar, int i, aosj aosjVar, Class cls) {
        return new aopg(aoquVar, obj, aoquVar2, new aopf(aopnVar, i, aosjVar, false, false));
    }

    public static aopi parseDelimitedFrom(aopi aopiVar, InputStream inputStream) {
        aopi parsePartialDelimitedFrom = parsePartialDelimitedFrom(aopiVar, inputStream, aoos.a());
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    public static aopi parseFrom(aopi aopiVar, aoob aoobVar) {
        aopi parseFrom = parseFrom(aopiVar, aoobVar, aoos.a());
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    private static aopi parsePartialDelimitedFrom(aopi aopiVar, InputStream inputStream, aoos aoosVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            aoog M = aoog.M(new aoni(inputStream, aoog.K(read, inputStream)));
            aopi parsePartialFrom = parsePartialFrom(aopiVar, M, aoosVar);
            try {
                M.B(0);
                return parsePartialFrom;
            } catch (aopx e) {
                throw e;
            }
        } catch (aopx e2) {
            if (!e2.a) {
                throw e2;
            }
            throw new aopx(e2);
        } catch (IOException e3) {
            throw new aopx(e3);
        }
    }

    private static aopi parsePartialFrom(aopi aopiVar, aoob aoobVar, aoos aoosVar) {
        try {
            aoog l = aoobVar.l();
            aopi parsePartialFrom = parsePartialFrom(aopiVar, l, aoosVar);
            try {
                l.B(0);
                return parsePartialFrom;
            } catch (aopx e) {
                throw e;
            }
        } catch (aopx e2) {
            throw e2;
        }
    }

    protected static Field reflectField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void registerDefaultInstance(Class cls, aopi aopiVar) {
        defaultInstanceMap.put(cls, aopiVar);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(aoph.BUILD_MESSAGE_INFO);
    }

    public final aopa createBuilder() {
        return (aopa) dynamicMethod(aoph.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object dynamicMethod(aoph aophVar) {
        return dynamicMethod(aophVar, null, null);
    }

    protected abstract Object dynamicMethod(aoph aophVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aore.a.b(this).j(this, (aopi) obj);
    }

    @Override // defpackage.aoqv
    /* renamed from: getDefaultInstanceForType */
    public final aopi mo50getDefaultInstanceForType() {
        return (aopi) dynamicMethod(aoph.GET_DEFAULT_INSTANCE);
    }

    @Override // defpackage.aonk
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.aoqu
    public final aorb getParserForType() {
        return (aorb) dynamicMethod(aoph.GET_PARSER);
    }

    @Override // defpackage.aoqu
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i == -1) {
            int a = aore.a.b(this).a(this);
            this.memoizedSerializedSize = a;
            return a;
        }
        return i;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int b = aore.a.b(this).b(this);
        this.memoizedHashCode = b;
        return b;
    }

    @Override // defpackage.aoqv
    public final boolean isInitialized() {
        return isInitialized(this, Boolean.TRUE.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void makeImmutable() {
        aore.a.b(this).f(this);
    }

    protected void mergeLengthDelimitedField(int i, aoob aoobVar) {
        ensureUnknownFieldsInitialized();
        aory aoryVar = this.unknownFields;
        aoryVar.d();
        if (i != 0) {
            aoryVar.f(aosl.c(i, 2), aoobVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected final void mergeUnknownFields(aory aoryVar) {
        this.unknownFields = aory.b(this.unknownFields, aoryVar);
    }

    protected void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        aory aoryVar = this.unknownFields;
        aoryVar.d();
        if (i != 0) {
            aoryVar.f(aosl.c(i, 0), Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // defpackage.aonk
    public aoqy mutableCopy() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // defpackage.aoqu
    /* renamed from: newBuilderForType */
    public final aopa mo51newBuilderForType() {
        return (aopa) dynamicMethod(aoph.NEW_BUILDER);
    }

    protected boolean parseUnknownField(int i, aoog aoogVar) {
        if (aosl.b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i, aoogVar);
    }

    @Override // defpackage.aonk
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // defpackage.aoqu
    /* renamed from: toBuilder */
    public final aopa mo52toBuilder() {
        aopa aopaVar = (aopa) dynamicMethod(aoph.NEW_BUILDER);
        aopaVar.mergeFrom(this);
        return aopaVar;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        apfb.i(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.aoqu
    public void writeTo(aool aoolVar) {
        aorm b = aore.a.b(this);
        aoom aoomVar = aoolVar.f;
        if (aoomVar == null) {
            aoomVar = new aoom(aoolVar);
        }
        b.l(this, aoomVar);
    }

    protected static aoou fieldInfo(Field field, int i, aoox aooxVar, boolean z) {
        if (field == null) {
            return null;
        }
        aoou.b(i);
        aopv.i(field, "field");
        aopv.i(aooxVar, "fieldType");
        if (aooxVar == aoox.MESSAGE_LIST || aooxVar == aoox.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new aoou(field, i, aooxVar, null, null, 0, false, z, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean isInitialized(aopi aopiVar, boolean z) {
        byte byteValue = ((Byte) aopiVar.dynamicMethod(aoph.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean k = aore.a.b(aopiVar).k(aopiVar);
        if (z) {
            aopiVar.dynamicMethod(aoph.SET_MEMOIZED_IS_INITIALIZED, true != k ? null : aopiVar);
        }
        return k;
    }

    protected static aopk mutableCopy(aopk aopkVar) {
        int size = aopkVar.size();
        return aopkVar.d(size == 0 ? 10 : size + size);
    }

    protected static aoqr newMessageInfo(aord aordVar, int[] iArr, Object[] objArr, Object obj) {
        return new aorv(aordVar, false, iArr, (aoou[]) objArr, obj);
    }

    public final aopa createBuilder(aopi aopiVar) {
        return createBuilder().mergeFrom(aopiVar);
    }

    protected Object dynamicMethod(aoph aophVar, Object obj) {
        return dynamicMethod(aophVar, obj, null);
    }

    public static aopi parseFrom(aopi aopiVar, aoob aoobVar, aoos aoosVar) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, aoobVar, aoosVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    protected static aopl mutableCopy(aopl aoplVar) {
        int size = aoplVar.size();
        return aoplVar.d(size == 0 ? 10 : size + size);
    }

    public static aopi parseDelimitedFrom(aopi aopiVar, InputStream inputStream, aoos aoosVar) {
        aopi parsePartialDelimitedFrom = parsePartialDelimitedFrom(aopiVar, inputStream, aoosVar);
        checkMessageInitialized(parsePartialDelimitedFrom);
        return parsePartialDelimitedFrom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopi parseFrom(aopi aopiVar, aoog aoogVar) {
        return parseFrom(aopiVar, aoogVar, aoos.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopi parseFrom(aopi aopiVar, aoog aoogVar, aoos aoosVar) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, aoogVar, aoosVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aopp mutableCopy(aopp aoppVar) {
        int size = aoppVar.size();
        return aoppVar.g(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopi parseFrom(aopi aopiVar, InputStream inputStream) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, aoog.M(inputStream), aoos.a());
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    protected static aopi parsePartialFrom(aopi aopiVar, aoog aoogVar) {
        return parsePartialFrom(aopiVar, aoogVar, aoos.a());
    }

    protected static aoou fieldInfoForProto2Optional(Field field, long j, aoox aooxVar, Field field2) {
        return fieldInfoForProto2Optional(field, (int) (j >>> 32), aooxVar, field2, (int) j, false, null);
    }

    protected static aoou fieldInfoForProto2Required(Field field, long j, aoox aooxVar, Field field2) {
        return fieldInfoForProto2Required(field, (int) (j >>> 32), aooxVar, field2, (int) j, false, null);
    }

    public static aopi parsePartialFrom(aopi aopiVar, aoog aoogVar, aoos aoosVar) {
        aopi aopiVar2 = (aopi) aopiVar.dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
        try {
            aorm b = aore.a.b(aopiVar2);
            b.h(aopiVar2, aooh.p(aoogVar), aoosVar);
            b.f(aopiVar2);
            return aopiVar2;
        } catch (aopx e) {
            if (!e.a) {
                throw e;
            }
            throw new aopx(e);
        } catch (IOException e2) {
            if (e2.getCause() instanceof aopx) {
                throw ((aopx) e2.getCause());
            }
            throw new aopx(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof aopx) {
                throw ((aopx) e3.getCause());
            }
            throw e3;
        }
    }

    public static aopq mutableCopy(aopq aopqVar) {
        int size = aopqVar.size();
        return aopqVar.f(size == 0 ? 10 : size + size);
    }

    public static aopt mutableCopy(aopt aoptVar) {
        int size = aoptVar.size();
        return aoptVar.d(size == 0 ? 10 : size + size);
    }

    public static aopi parseFrom(aopi aopiVar, InputStream inputStream, aoos aoosVar) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, aoog.M(inputStream), aoosVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aopu mutableCopy(aopu aopuVar) {
        int size = aopuVar.size();
        return aopuVar.e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static aopi parseFrom(aopi aopiVar, ByteBuffer byteBuffer) {
        return parseFrom(aopiVar, byteBuffer, aoos.a());
    }

    public static aopi parseFrom(aopi aopiVar, ByteBuffer byteBuffer, aoos aoosVar) {
        aopi parseFrom = parseFrom(aopiVar, aoog.N(byteBuffer), aoosVar);
        checkMessageInitialized(parseFrom);
        return parseFrom;
    }

    public static aopi parseFrom(aopi aopiVar, byte[] bArr) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, bArr, 0, bArr.length, aoos.a());
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    public static aopi parseFrom(aopi aopiVar, byte[] bArr, aoos aoosVar) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, bArr, 0, bArr.length, aoosVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aopi parsePartialFrom(aopi aopiVar, byte[] bArr, int i, int i2, aoos aoosVar) {
        aopi aopiVar2 = (aopi) aopiVar.dynamicMethod(aoph.NEW_MUTABLE_INSTANCE);
        try {
            aorm b = aore.a.b(aopiVar2);
            b.i(aopiVar2, bArr, i, i + i2, new aonp(aoosVar));
            b.f(aopiVar2);
            if (aopiVar2.memoizedHashCode == 0) {
                return aopiVar2;
            }
            throw new RuntimeException();
        } catch (aopx e) {
            if (!e.a) {
                throw e;
            }
            throw new aopx(e);
        } catch (IOException e2) {
            if (e2.getCause() instanceof aopx) {
                throw ((aopx) e2.getCause());
            }
            throw new aopx(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw aopx.j();
        }
    }

    private static aopi parsePartialFrom(aopi aopiVar, byte[] bArr, aoos aoosVar) {
        aopi parsePartialFrom = parsePartialFrom(aopiVar, bArr, 0, bArr.length, aoosVar);
        checkMessageInitialized(parsePartialFrom);
        return parsePartialFrom;
    }
}

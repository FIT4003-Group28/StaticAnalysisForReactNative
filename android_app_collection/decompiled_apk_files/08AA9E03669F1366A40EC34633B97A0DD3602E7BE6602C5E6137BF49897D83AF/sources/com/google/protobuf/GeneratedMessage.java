package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.ab;
import com.google.protobuf.ag;
import com.google.protobuf.at;
import com.google.protobuf.j;
import com.google.protobuf.l;
import com.google.protobuf.r;
import com.google.protobuf.t;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class GeneratedMessage extends com.google.protobuf.a implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected at unknownFields;

    /* loaded from: classes.dex */
    protected interface b extends a.b {
    }

    /* loaded from: classes.dex */
    public interface e extends af {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        j.f b();
    }

    protected abstract g internalGetFieldAccessorTable();

    protected void makeExtensionsImmutable() {
    }

    protected abstract ab.a newBuilderForType(b bVar);

    protected GeneratedMessage() {
        this.unknownFields = at.b();
    }

    protected GeneratedMessage(a<?> aVar) {
        this.unknownFields = aVar.getUnknownFields();
    }

    @Override // com.google.protobuf.ac
    public ai<? extends GeneratedMessage> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    static void enableAlwaysUseFieldBuildersForTesting() {
        alwaysUseFieldBuilders = true;
    }

    @Override // com.google.protobuf.af
    public j.a getDescriptorForType() {
        return internalGetFieldAccessorTable().f4311a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<j.f, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List<j.f> f2 = internalGetFieldAccessorTable().f4311a.f();
        int i = 0;
        while (i < f2.size()) {
            j.f fVar = f2.get(i);
            j.C0086j w = fVar.w();
            if (w != null) {
                i += w.c() - 1;
                if (!hasOneof(w)) {
                    i++;
                } else {
                    fVar = getOneofFieldDescriptor(w);
                    if (!z && fVar.g() == j.f.a.STRING) {
                        treeMap.put(fVar, getFieldRaw(fVar));
                    } else {
                        treeMap.put(fVar, getField(fVar));
                    }
                    i++;
                }
            } else {
                if (fVar.p()) {
                    List list = (List) getField(fVar);
                    if (!list.isEmpty()) {
                        treeMap.put(fVar, list);
                    }
                } else {
                    if (!hasField(fVar)) {
                    }
                    if (!z) {
                    }
                    treeMap.put(fVar, getField(fVar));
                }
                i++;
            }
        }
        return treeMap;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ad
    public boolean isInitialized() {
        for (j.f fVar : getDescriptorForType().f()) {
            if (fVar.n() && !hasField(fVar)) {
                return false;
            }
            if (fVar.g() == j.f.a.MESSAGE) {
                if (fVar.p()) {
                    for (ab abVar : (List) getField(fVar)) {
                        if (!abVar.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (hasField(fVar) && !((ab) getField(fVar)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.af
    public Map<j.f, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    Map<j.f, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(j.C0086j c0086j) {
        return internalGetFieldAccessorTable().a(c0086j).a(this);
    }

    @Override // com.google.protobuf.a
    public j.f getOneofFieldDescriptor(j.C0086j c0086j) {
        return internalGetFieldAccessorTable().a(c0086j).b(this);
    }

    @Override // com.google.protobuf.af
    public boolean hasField(j.f fVar) {
        return internalGetFieldAccessorTable().a(fVar).c(this);
    }

    @Override // com.google.protobuf.af
    public Object getField(j.f fVar) {
        return internalGetFieldAccessorTable().a(fVar).a(this);
    }

    Object getFieldRaw(j.f fVar) {
        return internalGetFieldAccessorTable().a(fVar).b(this);
    }

    public int getRepeatedFieldCount(j.f fVar) {
        return internalGetFieldAccessorTable().a(fVar).d(this);
    }

    public Object getRepeatedField(j.f fVar, int i) {
        return internalGetFieldAccessorTable().a(fVar).a(this, i);
    }

    @Override // com.google.protobuf.af
    public at getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean parseUnknownField(com.google.protobuf.g gVar, at.a aVar, p pVar, int i) {
        return aVar.a(i, gVar);
    }

    protected static <M extends ab> M parseWithIOException(ai<M> aiVar, InputStream inputStream) {
        try {
            return aiVar.d(inputStream);
        } catch (u e2) {
            throw e2.b();
        }
    }

    protected static <M extends ab> M parseWithIOException(ai<M> aiVar, InputStream inputStream, p pVar) {
        try {
            return aiVar.f(inputStream, pVar);
        } catch (u e2) {
            throw e2.b();
        }
    }

    protected static <M extends ab> M parseWithIOException(ai<M> aiVar, com.google.protobuf.g gVar) {
        try {
            return aiVar.b(gVar);
        } catch (u e2) {
            throw e2.b();
        }
    }

    protected static <M extends ab> M parseWithIOException(ai<M> aiVar, com.google.protobuf.g gVar, p pVar) {
        try {
            return aiVar.b(gVar, pVar);
        } catch (u e2) {
            throw e2.b();
        }
    }

    protected static <M extends ab> M parseDelimitedWithIOException(ai<M> aiVar, InputStream inputStream) {
        try {
            return aiVar.c(inputStream);
        } catch (u e2) {
            throw e2.b();
        }
    }

    protected static <M extends ab> M parseDelimitedWithIOException(ai<M> aiVar, InputStream inputStream, p pVar) {
        try {
            return aiVar.e(inputStream, pVar);
        } catch (u e2) {
            throw e2.b();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public void writeTo(com.google.protobuf.h hVar) {
        ag.a((ab) this, getAllFieldsRaw(), hVar, false);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.ac
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSize = ag.a(this, getAllFieldsRaw());
        return this.memoizedSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.a
    public ab.a newBuilderForType(final a.b bVar) {
        return newBuilderForType(new b() { // from class: com.google.protobuf.GeneratedMessage.1
            @Override // com.google.protobuf.a.b
            public void a() {
                bVar.a();
            }
        });
    }

    /* loaded from: classes.dex */
    public static abstract class a<BuilderType extends a<BuilderType>> extends a.AbstractC0077a<BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private b f4307a;

        /* renamed from: b  reason: collision with root package name */
        private at f4308b;

        protected a() {
            this(null);
        }

        protected a(b bVar) {
            this.f4308b = at.b();
            this.f4307a = bVar;
        }

        @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a
        /* renamed from: e */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) F().C();
            buildertype.c(r());
            return buildertype;
        }

        @Override // com.google.protobuf.af
        public final at getUnknownFields() {
            return this.f4308b;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage> extends GeneratedMessage implements e<MessageType> {
        private static final long serialVersionUID = 1;
        private final q<j.f> extensions;

        protected ExtendableMessage() {
            this.extensions = q.a();
        }

        protected ExtendableMessage(d<MessageType, ?> dVar) {
            super(dVar);
            this.extensions = dVar.g();
        }

        private void verifyExtensionContainingType(l<MessageType, ?> lVar) {
            if (lVar.a().v() != getDescriptorForType()) {
                throw new IllegalArgumentException("Extension is for type \"" + lVar.a().v().c() + "\" which does not match message type \"" + getDescriptorForType().c() + "\".");
            }
        }

        public final <Type> boolean hasExtension(m<MessageType, Type> mVar) {
            l<MessageType, ?> checkNotLite = GeneratedMessage.checkNotLite(mVar);
            verifyExtensionContainingType(checkNotLite);
            return this.extensions.a((q<j.f>) checkNotLite.a());
        }

        public final <Type> int getExtensionCount(m<MessageType, List<Type>> mVar) {
            l<MessageType, ?> checkNotLite = GeneratedMessage.checkNotLite(mVar);
            verifyExtensionContainingType(checkNotLite);
            return this.extensions.d(checkNotLite.a());
        }

        public final <Type> Type getExtension(m<MessageType, Type> mVar) {
            l<MessageType, ?> checkNotLite = GeneratedMessage.checkNotLite(mVar);
            verifyExtensionContainingType(checkNotLite);
            j.f a2 = checkNotLite.a();
            Object b2 = this.extensions.b((q<j.f>) a2);
            if (b2 == null) {
                if (a2.p()) {
                    return (Type) Collections.emptyList();
                }
                if (a2.g() == j.f.a.MESSAGE) {
                    return (Type) checkNotLite.c();
                }
                return (Type) checkNotLite.a(a2.s());
            }
            return (Type) checkNotLite.a(b2);
        }

        public final <Type> Type getExtension(m<MessageType, List<Type>> mVar, int i) {
            l<MessageType, ?> checkNotLite = GeneratedMessage.checkNotLite(mVar);
            verifyExtensionContainingType(checkNotLite);
            return (Type) checkNotLite.b(this.extensions.a((q<j.f>) checkNotLite.a(), i));
        }

        public final <Type> boolean hasExtension(l<MessageType, Type> lVar) {
            return hasExtension((m) lVar);
        }

        public final <Type> boolean hasExtension(h<MessageType, Type> hVar) {
            return hasExtension((m) hVar);
        }

        public final <Type> int getExtensionCount(l<MessageType, List<Type>> lVar) {
            return getExtensionCount((m) lVar);
        }

        public final <Type> int getExtensionCount(h<MessageType, List<Type>> hVar) {
            return getExtensionCount((m) hVar);
        }

        public final <Type> Type getExtension(l<MessageType, Type> lVar) {
            return (Type) getExtension((m<MessageType, Object>) lVar);
        }

        public final <Type> Type getExtension(h<MessageType, Type> hVar) {
            return (Type) getExtension((m<MessageType, Object>) hVar);
        }

        public final <Type> Type getExtension(l<MessageType, List<Type>> lVar, int i) {
            return (Type) getExtension((m<MessageType, List<Object>>) lVar, i);
        }

        public final <Type> Type getExtension(h<MessageType, List<Type>> hVar, int i) {
            return (Type) getExtension((m<MessageType, List<Object>>) hVar, i);
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.h();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.a, com.google.protobuf.ad
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected boolean parseUnknownField(com.google.protobuf.g gVar, at.a aVar, p pVar, int i) {
            return ag.a(gVar, aVar, pVar, getDescriptorForType(), new ag.b(this.extensions), i);
        }

        @Override // com.google.protobuf.GeneratedMessage
        protected void makeExtensionsImmutable() {
            this.extensions.c();
        }

        /* loaded from: classes.dex */
        protected class a {

            /* renamed from: b  reason: collision with root package name */
            private final Iterator<Map.Entry<j.f, Object>> f4304b;

            /* renamed from: c  reason: collision with root package name */
            private Map.Entry<j.f, Object> f4305c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f4306d;

            private a(boolean z) {
                this.f4304b = ExtendableMessage.this.extensions.g();
                if (this.f4304b.hasNext()) {
                    this.f4305c = this.f4304b.next();
                }
                this.f4306d = z;
            }
        }

        protected ExtendableMessage<MessageType>.a newExtensionWriter() {
            return new a(false);
        }

        protected ExtendableMessage<MessageType>.a newMessageSetExtensionWriter() {
            return new a(true);
        }

        protected int extensionsSerializedSize() {
            return this.extensions.i();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.j();
        }

        protected Map<j.f, Object> getExtensionFields() {
            return this.extensions.f();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.af
        public Map<j.f, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Map<j.f, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.af
        public boolean hasField(j.f fVar) {
            if (fVar.u()) {
                verifyContainingType(fVar);
                return this.extensions.a((q<j.f>) fVar);
            }
            return super.hasField(fVar);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.af
        public Object getField(j.f fVar) {
            if (fVar.u()) {
                verifyContainingType(fVar);
                Object b2 = this.extensions.b((q<j.f>) fVar);
                if (b2 != null) {
                    return b2;
                }
                if (fVar.p()) {
                    return Collections.emptyList();
                }
                if (fVar.g() == j.f.a.MESSAGE) {
                    return k.a(fVar.y());
                }
                return fVar.s();
            }
            return super.getField(fVar);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public int getRepeatedFieldCount(j.f fVar) {
            if (fVar.u()) {
                verifyContainingType(fVar);
                return this.extensions.d(fVar);
            }
            return super.getRepeatedFieldCount(fVar);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Object getRepeatedField(j.f fVar, int i) {
            if (fVar.u()) {
                verifyContainingType(fVar);
                return this.extensions.a((q<j.f>) fVar, i);
            }
            return super.getRepeatedField(fVar, i);
        }

        private void verifyContainingType(j.f fVar) {
            if (fVar.v() != getDescriptorForType()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<MessageType extends ExtendableMessage, BuilderType extends d<MessageType, BuilderType>> extends a<BuilderType> implements e<MessageType> {

        /* renamed from: a  reason: collision with root package name */
        private q<j.f> f4310a = q.b();

        protected d() {
        }

        @Override // com.google.protobuf.GeneratedMessage.a, com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a
        /* renamed from: f */
        public BuilderType clone() {
            return (BuilderType) super.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public q<j.f> g() {
            this.f4310a.c();
            return this.f4310a;
        }
    }

    public static <ContainingType extends ab, Type> h<ContainingType, Type> newMessageScopedGeneratedExtension(final ab abVar, final int i, Class cls, ab abVar2) {
        return new h<>(new c() { // from class: com.google.protobuf.GeneratedMessage.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.protobuf.GeneratedMessage.c
            public j.f a() {
                return ab.this.getDescriptorForType().h().get(i);
            }
        }, cls, abVar2, l.a.IMMUTABLE);
    }

    public static <ContainingType extends ab, Type> h<ContainingType, Type> newFileScopedGeneratedExtension(Class cls, ab abVar) {
        return new h<>(null, cls, abVar, l.a.IMMUTABLE);
    }

    /* loaded from: classes.dex */
    private static abstract class c implements f {

        /* renamed from: a  reason: collision with root package name */
        private volatile j.f f4309a;

        protected abstract j.f a();

        private c() {
        }

        @Override // com.google.protobuf.GeneratedMessage.f
        public j.f b() {
            if (this.f4309a == null) {
                synchronized (this) {
                    if (this.f4309a == null) {
                        this.f4309a = a();
                    }
                }
            }
            return this.f4309a;
        }
    }

    public static <ContainingType extends ab, Type> h<ContainingType, Type> newMessageScopedGeneratedExtension(final ab abVar, final String str, Class cls, ab abVar2) {
        return new h<>(new c() { // from class: com.google.protobuf.GeneratedMessage.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.protobuf.GeneratedMessage.c
            protected j.f a() {
                return ab.this.getDescriptorForType().a(str);
            }
        }, cls, abVar2, l.a.MUTABLE);
    }

    public static <ContainingType extends ab, Type> h<ContainingType, Type> newFileScopedGeneratedExtension(final Class cls, ab abVar, final String str, final String str2) {
        return new h<>(new c() { // from class: com.google.protobuf.GeneratedMessage.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.protobuf.GeneratedMessage.c
            protected j.f a() {
                try {
                    return ((j.g) cls.getClassLoader().loadClass(str).getField("descriptor").get(null)).a(str2);
                } catch (Exception e2) {
                    throw new RuntimeException("Cannot load descriptors: " + str + " is not a valid descriptor class name", e2);
                }
            }
        }, cls, abVar, l.a.MUTABLE);
    }

    /* loaded from: classes.dex */
    public static class h<ContainingType extends ab, Type> extends l<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        private f f4316a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f4317b;

        /* renamed from: c  reason: collision with root package name */
        private final ab f4318c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f4319d;
        private final Method e;
        private final l.a f;

        h(f fVar, Class cls, ab abVar, l.a aVar) {
            if (ab.class.isAssignableFrom(cls) && !cls.isInstance(abVar)) {
                throw new IllegalArgumentException("Bad messageDefaultInstance for " + cls.getName());
            }
            this.f4316a = fVar;
            this.f4317b = cls;
            this.f4318c = abVar;
            if (ak.class.isAssignableFrom(cls)) {
                this.f4319d = GeneratedMessage.getMethodOrDie(cls, "valueOf", j.e.class);
                this.e = GeneratedMessage.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
            } else {
                this.f4319d = null;
                this.e = null;
            }
            this.f = aVar;
        }

        @Override // com.google.protobuf.l
        public j.f a() {
            if (this.f4316a == null) {
                throw new IllegalStateException("getDescriptor() called before internalInit()");
            }
            return this.f4316a.b();
        }

        @Override // com.google.protobuf.m
        /* renamed from: d */
        public ab c() {
            return this.f4318c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.l
        public Object a(Object obj) {
            j.f a2 = a();
            if (a2.p()) {
                if (a2.g() != j.f.a.MESSAGE && a2.g() != j.f.a.ENUM) {
                    return obj;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(b(obj2));
                }
                return arrayList;
            }
            return b(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.l
        public Object b(Object obj) {
            a();
            switch (r0.g()) {
                case MESSAGE:
                    return this.f4317b.isInstance(obj) ? obj : this.f4318c.C().c((ab) obj).s();
                case ENUM:
                    return GeneratedMessage.invokeOrDie(this.f4319d, null, (j.e) obj);
                default:
                    return obj;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected z internalGetMapField(int i) {
        throw new RuntimeException("No map fields found in " + getClass().getName());
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final j.a f4311a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f4312b;

        /* renamed from: c  reason: collision with root package name */
        private final b[] f4313c;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public interface a {
            Object a(GeneratedMessage generatedMessage);

            Object a(GeneratedMessage generatedMessage, int i);

            Object b(GeneratedMessage generatedMessage);

            boolean c(GeneratedMessage generatedMessage);

            int d(GeneratedMessage generatedMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(j.f fVar) {
            if (fVar.v() != this.f4311a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (fVar.u()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return this.f4312b[fVar.a()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a(j.C0086j c0086j) {
            if (c0086j.b() != this.f4311a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
            return this.f4313c[c0086j.a()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            private final j.a f4314a;

            /* renamed from: b  reason: collision with root package name */
            private final Method f4315b;

            public boolean a(GeneratedMessage generatedMessage) {
                return ((t.a) GeneratedMessage.invokeOrDie(this.f4315b, generatedMessage, new Object[0])).a() != 0;
            }

            public j.f b(GeneratedMessage generatedMessage) {
                int a2 = ((t.a) GeneratedMessage.invokeOrDie(this.f4315b, generatedMessage, new Object[0])).a();
                if (a2 > 0) {
                    return this.f4314a.b(a2);
                }
                return null;
            }
        }
    }

    protected Object writeReplace() {
        return new r.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType>, T> l<MessageType, T> checkNotLite(m<MessageType, T> mVar) {
        if (mVar.b()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (l) mVar;
    }

    protected static int computeStringSize(int i, Object obj) {
        if (obj instanceof String) {
            return com.google.protobuf.h.b(i, (String) obj);
        }
        return com.google.protobuf.h.c(i, (com.google.protobuf.f) obj);
    }

    protected static int computeStringSizeNoTag(Object obj) {
        if (obj instanceof String) {
            return com.google.protobuf.h.b((String) obj);
        }
        return com.google.protobuf.h.b((com.google.protobuf.f) obj);
    }

    protected static void writeString(com.google.protobuf.h hVar, int i, Object obj) {
        if (obj instanceof String) {
            hVar.a(i, (String) obj);
        } else {
            hVar.a(i, (com.google.protobuf.f) obj);
        }
    }

    protected static void writeStringNoTag(com.google.protobuf.h hVar, Object obj) {
        if (obj instanceof String) {
            hVar.a((String) obj);
        } else {
            hVar.a((com.google.protobuf.f) obj);
        }
    }
}

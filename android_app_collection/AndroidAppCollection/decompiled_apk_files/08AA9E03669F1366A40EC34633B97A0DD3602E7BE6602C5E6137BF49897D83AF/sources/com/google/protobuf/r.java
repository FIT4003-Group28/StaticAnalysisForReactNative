package com.google.protobuf;

import com.google.protobuf.ac;
import com.google.protobuf.ay;
import com.google.protobuf.b;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class r<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.b<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    protected au f4699a = au.a();

    /* renamed from: b  reason: collision with root package name */
    protected int f4700b = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends r<MessageType, BuilderType> implements d<MessageType, BuilderType> {

        /* renamed from: c  reason: collision with root package name */
        protected q<e> f4706c = q.a();
    }

    /* loaded from: classes.dex */
    public interface d extends ad {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public enum h {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public interface j {
        au a(au auVar, au auVar2);
    }

    protected abstract Object a(h hVar, Object obj, Object obj2);

    public final MessageType a() {
        return (MessageType) a(h.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType b() {
        return (BuilderType) a(h.NEW_BUILDER);
    }

    public String toString() {
        return ae.a(this, super.toString());
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            f fVar = new f();
            a(fVar, this);
            this.memoizedHashCode = fVar.f4711a;
        }
        return this.memoizedHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a().getClass().isInstance(obj)) {
            return false;
        }
        try {
            a(b.f4704a, (r) obj);
            return true;
        } catch (b.a unused) {
            return false;
        }
    }

    protected void c() {
        a(h.MAKE_IMMUTABLE);
        this.f4699a.b();
    }

    protected Object a(h hVar) {
        return a(hVar, (Object) null, (Object) null);
    }

    void a(j jVar, MessageType messagetype) {
        a(h.VISIT, jVar, messagetype);
        this.f4699a = jVar.a(this.f4699a, messagetype.f4699a);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends b.a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        protected MessageType f4701a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f4702b;

        /* renamed from: c  reason: collision with root package name */
        private final MessageType f4703c;

        protected void a() {
            if (this.f4702b) {
                MessageType messagetype = (MessageType) this.f4701a.a(h.NEW_MUTABLE_INSTANCE);
                messagetype.a(g.f4712a, this.f4701a);
                this.f4701a = messagetype;
                this.f4702b = false;
            }
        }

        @Override // com.google.protobuf.b.a
        /* renamed from: b */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) e().b();
            buildertype.a(c());
            return buildertype;
        }

        public MessageType c() {
            if (this.f4702b) {
                return this.f4701a;
            }
            this.f4701a.c();
            this.f4702b = true;
            return this.f4701a;
        }

        public BuilderType a(MessageType messagetype) {
            a();
            this.f4701a.a(g.f4712a, messagetype);
            return this;
        }

        public MessageType e() {
            return this.f4703c;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static final class e implements q.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final int f4707a;

        /* renamed from: b  reason: collision with root package name */
        final ay.a f4708b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f4709c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f4710d;

        @Override // com.google.protobuf.q.a
        public int f() {
            return this.f4707a;
        }

        @Override // com.google.protobuf.q.a
        public ay.a k() {
            return this.f4708b;
        }

        @Override // com.google.protobuf.q.a
        public ay.b h() {
            return this.f4708b.a();
        }

        @Override // com.google.protobuf.q.a
        public boolean p() {
            return this.f4709c;
        }

        @Override // com.google.protobuf.q.a
        public boolean q() {
            return this.f4710d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.q.a
        public ac.a a(ac.a aVar, ac acVar) {
            return ((a) aVar).a((a) ((r) acVar));
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.f4707a - eVar.f4707a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Method method, Object obj, Object... objArr) {
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

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    protected static final class i implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final String f4717a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f4718b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(ac acVar) {
            this.f4717a = acVar.getClass().getName();
            this.f4718b = acVar.toByteArray();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static class b implements j {

        /* renamed from: a  reason: collision with root package name */
        static final b f4704a = new b();

        /* renamed from: b  reason: collision with root package name */
        static final a f4705b = new a();

        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes.dex */
        static final class a extends RuntimeException {
            a() {
            }
        }

        private b() {
        }

        @Override // com.google.protobuf.r.j
        public au a(au auVar, au auVar2) {
            if (!auVar.equals(auVar2)) {
                throw f4705b;
            }
            return auVar;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    static class f implements j {

        /* renamed from: a  reason: collision with root package name */
        int f4711a = 0;

        f() {
        }

        @Override // com.google.protobuf.r.j
        public au a(au auVar, au auVar2) {
            this.f4711a = (this.f4711a * 53) + auVar.hashCode();
            return auVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class g implements j {

        /* renamed from: a  reason: collision with root package name */
        public static final g f4712a = new g();

        private g() {
        }

        @Override // com.google.protobuf.r.j
        public au a(au auVar, au auVar2) {
            return auVar2 == au.a() ? auVar : au.a(auVar, auVar2);
        }
    }
}

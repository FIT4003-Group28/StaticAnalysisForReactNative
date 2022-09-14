package c.e.a.b.d.g;

import c.e.a.b.d.g.b5;
import c.e.a.b.d.g.b5.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class b5<MessageType extends b5<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends m3<MessageType, BuilderType> {
    private static Map<Object, b5<?, ?>> zzd = new ConcurrentHashMap();
    protected t7 zzb = t7.d();
    private int zzc = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends b5<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends l3<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f4061b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f4062c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f4063d = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f4061b = messagetype;
            this.f4062c = (MessageType) messagetype.a(f.f4067d, null, null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            y6.a().a((y6) messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType b(byte[] bArr, int i, int i2, p4 p4Var) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            try {
                y6.a().a((y6) this.f4062c).a(this.f4062c, bArr, 0, i2 + 0, new q3(p4Var));
                return this;
            } catch (j5 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw j5.a();
            }
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f4063d) {
                f();
                this.f4063d = false;
            }
            a(this.f4062c, messagetype);
            return this;
        }

        @Override // c.e.a.b.d.g.m6
        public final /* synthetic */ k6 a() {
            return this.f4061b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.e.a.b.d.g.l3
        protected final /* synthetic */ l3 a(m3 m3Var) {
            return a((a<MessageType, BuilderType>) ((b5) m3Var));
        }

        @Override // c.e.a.b.d.g.l3
        public final /* synthetic */ l3 a(byte[] bArr, int i, int i2) {
            b(bArr, 0, i2, p4.a());
            return this;
        }

        @Override // c.e.a.b.d.g.l3
        public final /* synthetic */ l3 a(byte[] bArr, int i, int i2, p4 p4Var) {
            b(bArr, 0, i2, p4Var);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f4061b.a(f.f4068e, null, null);
            aVar.a((a) ((b5) w()));
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void f() {
            MessageType messagetype = (MessageType) this.f4062c.a(f.f4067d, null, null);
            a(messagetype, this.f4062c);
            this.f4062c = messagetype;
        }

        @Override // c.e.a.b.d.g.n6
        /* renamed from: g */
        public MessageType w() {
            if (this.f4063d) {
                return this.f4062c;
            }
            MessageType messagetype = this.f4062c;
            y6.a().a((y6) messagetype).c(messagetype);
            this.f4063d = true;
            return this.f4062c;
        }

        /* renamed from: h */
        public final MessageType i() {
            MessageType messagetype = (MessageType) w();
            if (messagetype.h()) {
                return messagetype;
            }
            throw new r7(messagetype);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends b5<MessageType, BuilderType> implements m6 {
        protected s4<e> zzc = s4.g();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final s4<e> n() {
            if (this.zzc.b()) {
                this.zzc = (s4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T extends b5<T, ?>> extends n3<T> {
        public c(T t) {
        }
    }

    /* loaded from: classes.dex */
    public static class d<ContainingType extends k6, Type> extends m4<ContainingType, Type> {
    }

    /* loaded from: classes.dex */
    static final class e implements u4<e> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // c.e.a.b.d.g.u4
        public final h8 j() {
            throw new NoSuchMethodError();
        }

        @Override // c.e.a.b.d.g.u4
        public final boolean k() {
            throw new NoSuchMethodError();
        }

        @Override // c.e.a.b.d.g.u4
        public final p8 l() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f4064a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f4065b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f4066c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f4067d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f4068e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f4069f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f4070g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f4071h = {f4064a, f4065b, f4066c, f4067d, f4068e, f4069f, f4070g};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        static {
            int[] iArr = {i, j};
            int[] iArr2 = {k, l};
        }

        public static int[] a() {
            return (int[]) f4071h.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends b5<?, ?>> T a(Class<T> cls) {
        b5<?, ?> b5Var = zzd.get(cls);
        if (b5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b5Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (b5Var == null) {
            b5Var = (T) ((b5) a8.a(cls)).a(f.f4069f, (Object) null, (Object) null);
            if (b5Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, b5Var);
        }
        return (T) b5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static h5 a(h5 h5Var) {
        int size = h5Var.size();
        return h5Var.c(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> k5<E> a(k5<E> k5Var) {
        int size = k5Var.size();
        return k5Var.a(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object a(k6 k6Var, String str, Object[] objArr) {
        return new z6(k6Var, str, objArr);
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
            if (!(cause instanceof Error)) {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((Error) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends b5<?, ?>> void a(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends b5<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(f.f4064a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = y6.a().a((y6) t).b(t);
        if (z) {
            t.a(f.f4065b, b2 ? t : null, null);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static i5 k() {
        return c5.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static h5 l() {
        return y5.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> k5<E> m() {
        return x6.k();
    }

    @Override // c.e.a.b.d.g.m6
    public final /* synthetic */ k6 a() {
        return (b5) a(f.f4069f, (Object) null, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    @Override // c.e.a.b.d.g.m3
    final void a(int i) {
        this.zzc = i;
    }

    @Override // c.e.a.b.d.g.k6
    public final void a(j4 j4Var) {
        y6.a().a((y6) this).a((b7) this, (o8) l4.a(j4Var));
    }

    @Override // c.e.a.b.d.g.k6
    public final int b() {
        if (this.zzc == -1) {
            this.zzc = y6.a().a((y6) this).d(this);
        }
        return this.zzc;
    }

    @Override // c.e.a.b.d.g.k6
    public final /* synthetic */ n6 c() {
        a aVar = (a) a(f.f4068e, (Object) null, (Object) null);
        aVar.a((a) this);
        return aVar;
    }

    @Override // c.e.a.b.d.g.k6
    public final /* synthetic */ n6 e() {
        return (a) a(f.f4068e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return y6.a().a((y6) this).a(this, (b5) obj);
    }

    @Override // c.e.a.b.d.g.m3
    final int g() {
        return this.zzc;
    }

    public final boolean h() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        this.zza = y6.a().a((y6) this).a(this);
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends b5<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType i() {
        return (BuilderType) a(f.f4068e, (Object) null, (Object) null);
    }

    public final BuilderType j() {
        BuilderType buildertype = (BuilderType) a(f.f4068e, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        return q6.a(this, super.toString());
    }
}
